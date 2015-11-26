package ts.Common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class DB2Jdbc2 {
	private static final Log log = LogFactory.getLog(DB2Jdbc2.class);
	XMLDSReader reader = new XMLDSReader("datasource.xml", "jdbc_default");
	private ArrayList freeConnections = new ArrayList();//容器，空闲连接 
	private final String dirver = reader.getConfig().getDriver();

	private final String url = reader.getConfig().getUrl() + "";

	// "?useUnicode=true&characterEncoding=utf-8";
	private final String username = reader.getConfig().getUsername();

	private final String password = reader.getConfig().getPassword();

	private static DB2Jdbc2 db = null;
	private Connection conn = null;

	private PreparedStatement stmt = null;
	private Statement stmt1 = null;

	private ResultSet rs = null;


	public static DB2Jdbc2 db() {
		if (db == null) {
			db = new DB2Jdbc2();
		}
		return db;
	}

	private DB2Jdbc2() {
		try {
			Class.forName(this.dirver);
			System.out.println("Class.forName(this.dirver)");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnect() {
		try {
			if (conn == null || conn.isClosed()) {
				System.out.println(url);
				conn = DriverManager
						.getConnection(url, username, password);
				this.freeConnections.add(conn);//容器，空闲连接 
				System.out.println("成功的连接了数据库");
			}
		} catch (SQLException e) {
			closeConnect();
			e.printStackTrace();
		}
		return conn;
	}
	
	public ResultSet executeQuery(String sql) {
		log.info("sql====="+sql);
		try {
			stmt1 = getConnect().createStatement();
			this.rs = stmt1.executeQuery(sql);
			
		} catch (SQLException e) {
			closeConnect();
			e.printStackTrace();
		}
		return this.rs;
	}
	/**
	 * 查询sequence序列号
	 * @param sequenceName
	 * @return
	 */
	public int getSequence(String sequenceName){
		int sequence = 0;
		conn = getConnect();
		String sql = "SELECT  "+sequenceName+".NEXTVAL AS seq FROM  SYSIBM.SYSDUMMY1";
		log.info("sequence语句===="+sql);
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			 while(rs.next()){
				 sequence = rs.getInt("seq");
				 System.out.println(sequenceName + ": "+ sequence);
			 }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sequence;
	}
	
	
	public String getMaxXh(String dtime){
		String maxxh ="";
		conn = getConnect();
		String sql = "select max(bz) as bz from jkmx where dt="+dtime;
		log.info("sequence语句===="+sql);
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			 while(rs.next()){
				 maxxh = rs.getString("bz");
				 if(maxxh == null||maxxh==""){	 
					 maxxh = dtime + "04000";
				 }
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return maxxh;
	}
	public String getMenname(String menuid){
		String menname="";
		conn = getConnect();
		String sql = "select menname from Menu where menid="+menuid;
		log.info("sequence语句===="+sql);
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			 while(rs.next()){
				 menname = rs.getString("menname");
				 if(menname == null||menname==""){	 
					 menname = " ";
				 }
			 }
		} catch (SQLException e) {
			closeConnect();
			e.printStackTrace();
		}
		return menname;
	}
	public void closeConnect() {
		try {
			if (rs != null) {
				rs.close();
				System.out.println("1.关闭结果类ResultSet");
			}
			if (stmt != null) {
				stmt.close();
				System.out.println("2.关闭语句类Statement");
			}
			if (stmt1 != null) {
				stmt1.close();
				System.out.println("2.关闭语句类Statement1");
			}
			if (conn != null) {
				conn.close();
				System.out.println("3.关闭连接类Connection");
			}
			 Iterator allConns=this.freeConnections.iterator(); 
			  while(allConns.hasNext()) 
			  { 
			   Connection con=(Connection)allConns.next(); 
			   try 
			   { 
			    con.close(); 
			   } 
			   catch(SQLException e) 
			   { 
			    e.printStackTrace(); 
			   } 
			   
			  } 
			  this.freeConnections.clear(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void execute(String sql) {
		log.info("sql====="+sql);
		try {
			stmt1 = getConnect().createStatement();
			stmt1.execute(sql);
			
		} catch (SQLException e) {
			closeConnect();
			e.printStackTrace();
		} 
	}
	public static void main(String args[]){
		DB2Jdbc2 db = new DB2Jdbc2();
		
		db.execute("update ");
	}
}
