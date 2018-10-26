package com.sophos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sophos.pages.LoginPage;

public class VerifyWordpressLogin {
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
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage login=new LoginPage(driver);
		login.loginToWordpress("ghghg", "43345345");
		login.clickLoginButton();
		driver.quit();
	}

}
