package service;

public class UserInfoService {

	public boolean login(String username, String password){
		if(username==null || password==null){
			return false;
		}
		else if(username.equals("xcw")&&password.equals("123")){
			System.out.println("login ok!");
			return true;
		}
		else{
			System.out.println("login failed!");
			return false;
		}
	}
}
