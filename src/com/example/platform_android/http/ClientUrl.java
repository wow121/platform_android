package com.example.platform_android.http;

public class ClientUrl {
	public static String host="http://121.40.86.242";
	
	
	public static String GetHost(){
		return host;
	}
	
	public static String GetUserController(){
		return "/user";
	}
	
	public static String GetUserLoginUrl(String name,String password){
		return GetHost()+GetUserController()+"/login?name="+name+"&password="+password;
	}
	
}
