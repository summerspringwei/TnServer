package myinterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor before");
		String resultValue=arg0.invoke();
		System.out.println("MyInterceptor after");
		return null;
	}

}
