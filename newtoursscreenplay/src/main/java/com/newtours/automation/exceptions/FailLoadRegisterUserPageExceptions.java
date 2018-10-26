package com.newtours.automation.exceptions;

public class FailLoadRegisterUserPageExceptions extends AssertionError {
	public static final String LOADPAGE_FAIL="Page no can Load";
	
	public FailLoadRegisterUserPageExceptions(String message,Throwable cause) {
		super(message,cause);
	}
}
