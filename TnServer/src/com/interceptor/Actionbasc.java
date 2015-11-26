package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;



	public class Actionbasc extends ActionSupport implements
    ServletRequestAware,ServletResponseAware {
/**
*
*/
private static final long serialVersionUID = 1L;
private HttpServletRequest request;
private HttpServletResponse response;


public void setServletRequest(HttpServletRequest request) {
this.request=request;
}

public void setServletResponse(HttpServletResponse response) {
this.response=response;
}

public HttpServletRequest getRequest() {
	return request;
}



public HttpServletResponse getResponse() {
	return response;
}














}
