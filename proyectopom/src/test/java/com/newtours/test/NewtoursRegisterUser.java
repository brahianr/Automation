package com.newtours.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewtoursRegisterUser {

	static WebDriver driver;
	static AsingDriver as=new AsingDriver();	
	static ArrayList<ArrayRegisterUser> newuser;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ExcelNewUser excel=new ExcelNewUser();
		excel.ReadExcel();
		newuser = excel.getLista();
		driver=as.setDriver("chrome");	
	}

	@Before
	public void setUp() {
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("REGISTER")).click();
		NewtoursRegistaeUserPage ru=new NewtoursRegistaeUserPage(driver);
		ru.contactInfo(newuser.get(0).getFirstName(),newuser.get(0).getLastName(),newuser.get(0).getPhone(),newuser.get(0).getUserName());		
		ru.mailingInfo(newuser.get(0).getAddress1(),newuser.get(0).getAddress2(),newuser.get(0).getCity(),newuser.get(0).getState(),newuser.get(0).getPostalCode(),newuser.get(0).getCountry());
		ru.userInfo(newuser.get(0).getEmail(),newuser.get(0).getPassword(),newuser.get(0).getConfirmPassword());
		//ru.clickRegisterButton();
	}
	
	@Test
	public void testAdress2() {
		driver.findElement(By.linkText("REGISTER")).click();
		NewtoursRegistaeUserPage ru=new NewtoursRegistaeUserPage(driver);
		ru.contactInfo(newuser.get(1).getFirstName(),newuser.get(1).getLastName(),newuser.get(1).getPhone(),newuser.get(1).getUserName());		
		ru.mailingInfo(newuser.get(1).getAddress1(),newuser.get(1).getCity(),newuser.get(1).getState(),newuser.get(1).getPostalCode(),newuser.get(1).getCountry());
		ru.userInfo(newuser.get(1).getEmail(),newuser.get(1).getPassword(),newuser.get(1).getConfirmPassword());
		//ru.clickRegisterButton();
	}

}
