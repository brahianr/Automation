package com.sophos.certificacion.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba2 {
	
	private static WebDriver casemiro;
	Captura foto=new Captura();	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		casemiro = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		casemiro.get("http://newtours.demoaut.com/");		
		casemiro.findElement(By.name("userName")).sendKeys("brahianr");
		casemiro.findElement(By.name("password")).sendKeys("1234");
		foto.takeScreenShotTest(casemiro, "Datos buenos");    	 
		casemiro.findElement(By.name("login")).click();
		foto.takeScreenShotTest(casemiro, "login correcto");	
		//fail("Not yet implemented");
	}

}
