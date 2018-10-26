package com.newtours.test;

import com.codoid.products.exception.FilloException;

public class BrowserSelect {

	public void asingDriver() throws FilloException {
		
		ReturnDriver ret=new ReturnDriver();	
		//ret.getDriver(driver);
		
		ret.getDriver("chrome");
		//ret.getDriver("firefox");
		//ret.getDriver("explorer");
		

	}
}
