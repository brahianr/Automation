package com.sophos.certificacion.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidarLoginNewTours {
	
	private static WebDriver casemiro;
	Captura foto=new Captura();	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		casemiro = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		casemiro.quit();
	}

	@Test
	public void test() {
		
		casemiro.get("http://newtours.demoaut.com/");		
		casemiro.findElement(By.name("userName")).sendKeys("Sophos");
		casemiro.findElement(By.name("password")).sendKeys("Sophos");
		foto.takeScreenShotTest(casemiro, "Datos malos");    	 
		casemiro.findElement(By.name("login")).click();
		foto.takeScreenShotTest(casemiro, "Error malos");	
		
	}

}
