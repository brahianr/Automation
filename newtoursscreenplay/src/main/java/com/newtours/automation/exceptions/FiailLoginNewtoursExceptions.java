package com.newtours.automation.exceptions;

public class FiailLoginNewtoursExceptions extends AssertionError  {

	public static final String LOGIN_FAIL="Login Failed";
	
	public FiailLoginNewtoursExceptions(String message,Throwable cause) {
		super(message,cause);
	}
}
