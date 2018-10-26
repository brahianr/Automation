package com.newtours.test;

import java.util.ArrayList;

public class ArrayData {
	
	public ArrayList<String> user=new ArrayList<String>();
	public ArrayList<String> pass=new ArrayList<String>();
	
	public void setLlenar(String name, String password) {
		this.user.add(name);
		this.pass.add(password);
		//return data;
	}
	
	/*public void setArrayPass(String password) {
		this.pass.add(password);
		//return data;
	}*/
	
	public ArrayList<String> getUser() {
		return user;
	}
	
	public ArrayList<String> getPassword() {
		return user;
	}
	
	

}
