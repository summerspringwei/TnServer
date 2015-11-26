package com.spring.logic;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.hibernate.bean.Usertb;
import com.hibernate.daoEXP.UsertbDAOEXP;
import com.opensymphony.xwork2.ActionSupport;


public class Register extends ActionSupport implements
    ServletRequestAware,ServletResponseAware {
/**
*
*/
private static final long serialVersionUID = 1L;
private UsertbDAOEXP usertbDAO;
private HttpServletRequest request;
private HttpServletResponse response;

public UsertbDAOEXP getUsertbDAO() {
	return usertbDAO;
}

public void setUsertbDAO(UsertbDAOEXP usertbDAO) {
	this.usertbDAO = usertbDAO;
}

public void setServletRequest(HttpServletRequest request) {
this.request=request;
}

public void setServletResponse(HttpServletResponse response) {
this.response=response;
}
	public void on() throws IOException{
		String username=request.getParameter("username");
		String pswd =request.getParameter("pswd");
		String dhhm=request.getParameter("dhhm");
		String sex=request.getParameter("sex");
		String mail=request.getParameter("mail");
		Usertb usertb =new Usertb();
		usertb.setUsername(username);
		usertb.setPwd(pswd);
		usertb.setMailad(mail);
		usertb.setDhhm(dhhm);
		usertbDAO.save(usertb);
		List<Usertb> list=usertbDAO.findByUsername(username);
		String username1=list.get(0).getUsername();
		
		if(!username.equals(""))
		{
			response.setCharacterEncoding("utf-8");
			response.getWriter().write("01");
			response.getWriter().flush();
			response.getWriter().close();
			System.out.println("ע��ɹ�");
			
		}		
	  }
}

