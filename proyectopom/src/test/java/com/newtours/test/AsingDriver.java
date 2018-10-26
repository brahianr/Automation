package com.newtours.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AsingDriver {
	
    private static WebDriver driver;
	
	public WebDriver setDriver(String browser) {
		
		switch(browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();	
			//return new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();	 
			//return new FirefoxDriver();	
			break;

		case "explorer":
			System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			//return new InternetExplorerDriver();		
			break;
		default:		
	}
		//return driver;
		return driver;
	
  }
	
	//public WebDriver getDriver() {
		//return this.driver;
	//}

}
