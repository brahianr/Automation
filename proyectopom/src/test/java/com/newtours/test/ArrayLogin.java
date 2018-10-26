package com.newtours.test;

import java.util.ArrayList;

public class ArrayLogin {
	
	
	private String userName;
	private String password;
	
	public ArrayLogin() {

	}
	
	public ArrayLogin(String user, String pass) {
		this.userName=user;
		this.password=pass;
	}	
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	

	@Override
	public String toString() {
		return "ArrayLogin [userName=" + getUserName() + ", password=" + getPassword() + "]";
	}
	
	
}
