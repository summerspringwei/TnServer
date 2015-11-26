package ts.Common.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.hibernate.bean.ColumnviewId;
import com.hibernate.bean.TablesviewId;

import net.sf.json.JSONArray;

public class Common {
	public static String objectToJsonStr(Object obj){
		//JSONValue jsonValue = JSONmapper.toJSON(obj);
		//String jsonStr = jsonValue.render(false);
		JSONArray object = JSONArray.fromObject(obj);
		System.out.println("jsoStr=========="+object);
		return object.toString();
	}
	 /**
	   * @author yantingbin
	   * 判断时间差
	   * @return
	   */
	  
	  public static boolean getmtrq(String syc,String now,long rxz){
		  //获取当前日期
		  Date date1,date2;
		  String nextDate_2="";
		  boolean df = true;
			try {
				date1 = new SimpleDateFormat("yyMMddHHmm").parse(now);
				date2 = new SimpleDateFormat("yyMMddHHmm").parse(syc);
				 SimpleDateFormat sf = new SimpleDateFormat("yyMMddHHmm");
				  long time =date1.getTime()-date2.getTime();//秒
				  if(time<rxz){
					  df = false;
				  }
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			  //nextDate_2 = sf.format(data).toString();
		
		return df;
	  }
	  /**
	   * @author yantingbin
	   * 获取当前时间
	   * @return
	   */
	  public static String getdqrq(){
		  //获取当前日期
		  Date dt = new Date();
		  SimpleDateFormat sf = new SimpleDateFormat("yyMMddHHmmss");
		  String asd = sf.format(dt);
			  //nextDate_2 = sf.format(data).toString();
		  return asd;
	  }
	  
	  /**
	   * 查询数据库表
	   * @param rs
	   * @param idlist
	   * @return
	   */
	  public static List<TablesviewId> Alltables(ResultSet rs,List<TablesviewId> idlist){
		  try {
			while(rs.next()){
				TablesviewId id = new TablesviewId();
				  try {
					id.setTabname(rs.getString("tabname"));
					id.setRemarks(rs.getString("remarks"));
					id.setTableid(rs.getShort("tableid"));
					idlist.add(id);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return idlist;
	  }
	  /**
	   * 查询特定数据库表的所有列
	   * @param rs
	   * @param idlist
	   * @return
	   */
	  public static List<ColumnviewId> Columns(ResultSet rs,List<ColumnviewId> idlist){
		  try {
			while(rs.next()){
				ColumnviewId id = new ColumnviewId();
				  try {
					id.setName(rs.getString("name"));
					id.setTbname(rs.getString("tbname"));
					id.setRemarks(rs.getString("remarks"));
					id.setColtype(rs.getString("coltype"));
					id.setNulls(rs.getString("nulls"));
					id.setLength(rs.getShort("length"));
					id.setScale(rs.getShort("scale"));
					id.setKeyseq(rs.getShort("keyseq"));
					idlist.add(id);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return idlist;
	  }
}
