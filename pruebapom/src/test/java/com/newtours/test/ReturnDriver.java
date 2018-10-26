package com.newtours.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.codoid.products.exception.FilloException;

public class ReturnDriver {
	
	public void getDriver(String navegador) throws FilloException{
		
		NavigationNewtours navegar=new NavigationNewtours();
		//ExcelData excel=new ExcelData();
		//excel.ReadExcel();
	
		switch(navegador) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
			WebDriver casemiro = new ChromeDriver();				
			navegar.asignarDriver(casemiro,navegador);
			//navegar.probar();
			//excel.ReadExcel();
			break;				

		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
			WebDriver firefox = new FirefoxDriver();	
			navegar.asignarDriver(firefox,navegador);
			//navegar.probar();
			//excel.readXLSXFile();
			//navega.probar(firefox);   	 
			break;

		case "explorer":
			System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer.exe");
			WebDriver inter = new InternetExplorerDriver();
			navegar.asignarDriver(inter,navegador);
			//navegar.probar();
			//excel.readXLSXFile();
			//navega.probar(inter);
			break;
		default:
			
			break;
	
	}		
	
}

}
