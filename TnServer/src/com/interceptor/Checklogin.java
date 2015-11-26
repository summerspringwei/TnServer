package com.interceptor;

import java.util.Map;

//import com.hibernate.bean.Usertb;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Checklogin  extends AbstractInterceptor{
	 public String intercept(ActionInvocation invocation) throws Exception {  
	  
	        /*// 取得请求相关的ActionContext实例  
	        ActionContext ctx = invocation.getInvocationContext();  
	        Map session = ctx.getSession();  
	        Usertb user = (Usertb) session.get("usertb");  
	        // 如果没有登陆，即用户名不存在，都返回重新登陆  
	        System.out.println("user:"+user);
	        if (user != null) {  
	            System.out.println("test");  */
	            return invocation.invoke();  
	       /* }  
	        System.out.println("你还没有登录"); 
	        return "error";     //返回一个叫login的result结果
*/	 }
}
