package com.spring.logic;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ts.Common.util.Common;
import ts.Common.util.Constants;
import ts.Common.util.DB2Jdbc2;

import com.hibernate.daoEXP.ColumnviewDAOEXP;
import com.hibernate.daoEXP.TablesviewDAOEXP;
import com.interceptor.Actionbasc;
import com.hibernate.bean.Tablesview;
import com.hibernate.bean.TablesviewId;
public class Sjwh extends Actionbasc{
	private ColumnviewDAOEXP columnviewDAO;
	private TablesviewDAOEXP tablesviewDAO;
	
	public ColumnviewDAOEXP getColumnviewDAO() {
		return columnviewDAO;
	}
	public void setColumnviewDAO(ColumnviewDAOEXP columnviewDAO) {
		this.columnviewDAO = columnviewDAO;
	}
	public TablesviewDAOEXP getTablesviewDAO() {
		return tablesviewDAO;
	}
	public void setTablesviewDAO(TablesviewDAOEXP tablesviewDAO) {
		this.tablesviewDAO = tablesviewDAO;
	}
	/**
	 * 初始化表信息
	 */
	public void wh(){
		List<TablesviewId> tw= new ArrayList();
		DB2Jdbc2 db = DB2Jdbc2.db();
		ResultSet rs = db.executeQuery("select tabname,remarks,tableid "+Constants.tables);
		tw = Common.Alltables(rs, tw);
		getResponse().setCharacterEncoding("utf-8");
		try {
			getResponse().getWriter().write(Common.objectToJsonStr(tw));
			getResponse().getWriter().flush();
			getResponse().getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void bdelete(){
		List<TablesviewId> tw= new ArrayList();
		String ad = getRequest().getParameter("bid");
		DB2Jdbc2 db = DB2Jdbc2.db();
		ResultSet rs = db.executeQuery(Constants.Serachb+ad);
		String tbname = "";
		try {
			if(rs.next()){
				tbname = rs.getString(1);
			}
			db.execute("drop table "+tbname);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		rs = db.executeQuery("select tabname,remarks,tableid "+Constants.tables);
		tw = Common.Alltables(rs, tw);
		db.closeConnect();
		getResponse().setCharacterEncoding("utf-8");
		try {
			getResponse().getWriter().write(Common.objectToJsonStr(tw));
			getResponse().getWriter().flush();
			getResponse().getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 修改表结构的初始化
	 */
	public void xgcsh(){
		String bid = getRequest().getParameter("bid");
		DB2Jdbc2 db = DB2Jdbc2.db();
		db.executeQuery("select NAME,tbname,remarks,coltype,NULLS,length,scale,keyseq "+Constants.sysibm+bid+")");
		db.closeConnect();
	}
}
