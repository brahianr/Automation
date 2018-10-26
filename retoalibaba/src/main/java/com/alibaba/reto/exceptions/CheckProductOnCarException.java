package com.alibaba.reto.exceptions;

public class CheckProductOnCarException extends AssertionError{
	
	//public static final String PRODUCT_NAME="Product no find on car";
	public static final String PRODUCT_NAME = "Product no find on car";
	
	public CheckProductOnCarException(String message,Throwable cause) {
		super(message,cause);
	}


}
