package com.jlu.model;

public class User{
	
	private String userName;
	private String userId;
	private String email;
	private String password;
	
	public User(String id, String name, String password) {
		this.userName = name;
		this.userId = id;
		this.password = password;
	}
	
	public void setUserName(String name) {
		this.userName = name;
	}

	public void setUserId(String id) {
		this.userId = id;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String printUser() {
		return "User Name :" + this.userName + " User Id : " + this.userId + " User Password : " + this.password;
	}
}
