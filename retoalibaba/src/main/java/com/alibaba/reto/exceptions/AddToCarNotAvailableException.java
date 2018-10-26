package com.alibaba.reto.exceptions;

public class AddToCarNotAvailableException extends AssertionError {
	
	public static final String ADDTOCAR_BUTTOn="Add to car button not avilable";
	
	public AddToCarNotAvailableException(String message,Throwable cause) {
		super(message,cause);
	}

}
