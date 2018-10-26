package com.newtours.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codoid.products.exception.FilloException;

public class NavigationNewtours {
	
	private static  WebDriver driver=null;
	private static String driverName="";
	//private int numFoto=1;
	private String username="userName";
	private String password="password";	
	ArrayData list=new ArrayData();
	
	
	public void asignarDriver(WebDriver driver,String driverName) throws FilloException{
		this.driver=driver;
		this.driverName=driverName;		
		leere();
		
	}
	
	public void leere() throws FilloException {
		ExcelData excel=new ExcelData();
		excel.ReadExcel();
		
	}
	
	/*public void asignarCampos(String name,String password){
		//asigna el nombre de los elementos a buscar
		
		this.username=name;
		this.password=password;
		
	}*/
	
	public void probar(String name,String pass) {
		
		//captura foto=new captura();				
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");		
		//for(int i=0;i<list.getUser().size();i++) {
			driver.findElement(By.name(username)).sendKeys(name);
			//driver.findElement(By.name(username)).sendKeys(list.user.get(i));
		
			driver.findElement(By.name(password)).sendKeys(pass);
			//driver.findElement(By.name(password)).sendKeys(list.pass.get(i));

			//foto.takeScreenShotTest(driver, driverName+" Datos "+numFoto);    	 
			driver.findElement(By.name("login")).click();
			//foto.takeScreenShotTest(driver, driverName+" Error "+numFoto);	
			//numFoto++;
			//driver.quit();
		//}
	
		
	}

}
