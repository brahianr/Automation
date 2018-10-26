package com.newtours.automation.exceptions;

public class FailLoadHomePageExceptions extends AssertionError {
	
	public static final String LOADPAGE_FAIL="Page no can Load";
	
	public FailLoadHomePageExceptions(String message,Throwable cause) {
		super(message,cause);
	}
}
