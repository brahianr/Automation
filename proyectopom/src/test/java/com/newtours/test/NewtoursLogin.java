package com.newtours.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class NewtoursLogin {
	
	static WebDriver driver;
	static AsingDriver as=new AsingDriver();	
	static ArrayList<ArrayLogin> login;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ExcelData excel=new ExcelData();
		excel.ReadExcel();
		login = excel.getLista();
		driver=as.setDriver("chrome");	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testChromeMalo(){				
		NewtoursLoginPage newlog=new NewtoursLoginPage(driver,"Chrome");	
		newlog.loginNewtours(login.get(0).getUserName(), login.get(0).getPassword());
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText().contains("Welcome back to"));
	}
	
	@Test
	public void testChromeBueno(){	
		NewtoursLoginPage newlog=new NewtoursLoginPage(driver,"Chrome");	
		newlog.loginNewtours(login.get(1).getUserName(), login.get(1).getPassword());
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText().contains("Use our Flight"));
		
	}
	
	/*@Test
	public void testIe() {		
		driver=as.setDriver("explorer");
		//driver=as.getDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		NewtoursLoginPage nl=new NewtoursLoginPage(driver);
		nl.loginNewtours("brb","23123","Datos explorer");
		//nl.writeUserName("fdf");
		//nl.writePassword("123");
		//Screenshooter.takeScreenShotTest(driver, "Datos explorer");
		//nl.clickLoginButton();
		//Screenshooter.takeScreenShotTest(driver, "Error explorer");
	}
    
	
	@Test
	public void testFirefox() {		
		driver=as.setDriver("firefox");
		//driver=as.getDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		NewtoursLoginPage nl=new NewtoursLoginPage(driver);
		nl.loginNewtours("brb","23123","Datos firefox");
		/*nl.writeUserName("fdf");
		nl.writePassword("123");
		Screenshooter.takeScreenShotTest(driver, "Datos firefox");
		nl.clickLoginButton();
		Screenshooter.takeScreenShotTest(driver, "Error firefox");
	}
	*/

}
