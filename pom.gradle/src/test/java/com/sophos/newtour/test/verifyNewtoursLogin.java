package com.sophos.newtour.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sophos.newtours.pages.LoginPage;

public class verifyNewtoursLogin {
	
	private static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		LoginPage login=new LoginPage(driver);
		login.typeUserName("sdsd");
		login.typrPassword("3434");
		//login.loginToNewtours("Sophos", "1234");
		login.clickLoginButton();
		driver.quit();
	}

}
