<%@ page language="java" import="java.util.*,org.apache.struts2.ServletActionContext" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% String iebz = (ServletActionContext.getRequest().getHeader("USER-AGENT").toLowerCase()); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=300px">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
<%  
if(iebz.indexOf("msie") > 0){ %>
#divhead{
position:fixed;
}
#username{
	position:relative;
	margin:208px 290px;
	width:138px;
}
#password{
	position:relative;
	top:-205px;
	margin:0 290px;
	width:138px;
}
<% }else {%>
#username{
	position:relative;
	margin:208px 465px;
	width:138px;
}
#password{
	position:relative;
	top:-205px;
	width:138px;
	margin:0 465px;
}
<% } %>
</style>
  </head>
  
 <%  System.out.println(iebz);
if(iebz.indexOf("msie") > 0){ %>
<body  style="text-align:center;"bgcolor="#1c82e7">
	<div id="divhead" align="center" style="margin:0 180px;background:url(Images/dljm.jpg); background-repeat:no-repeat;width:850px; height:540px;">
	<% } else {%>
	<body style="text-align:center;width:1350px"  bgcolor="#1c82e7">
	<div align="center" style="background:url(Images/dljm.jpg); background-repeat:no-repeat;width:61%; height:540px;margin:0 auto;">
	<%} %>
		<input type="text" name="username" id="username" />
<input type="password" name="pwd" id="password" />
	</div>
  </body>
</html>
