package controller;

import service.UserInfoService;

public class Login {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		UserInfoService usRef=new UserInfoService();
		if(usRef.login(username, password)){
			return "toOKJSP";
		}
		else{
			return "toNOJSP";
		}
	}
}
