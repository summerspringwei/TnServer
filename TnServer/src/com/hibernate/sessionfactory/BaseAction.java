package com.hibernate.sessionfactory;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;

public class BaseAction {
	/**
	 * 以map的形式获得session
	 * @return
	 */
	public Map getSession(){
		Map mp = ActionContext.getContext().getSession();
		return mp;
	}
	/**
	 * 设置session
	 * @param key
	 * @param o
	 */
	public void setSession(String key,Object o){
		//
		Map mp = ActionContext.getContext().getSession();
		Object obj = mp.get(key);
		if(obj==null){
			mp.put(key, o);
		}else {
			mp.remove(key);
			mp.put(key, o);
		}
		ActionContext.getContext().setSession(mp);
	}
}
