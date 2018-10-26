package com.newtours.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.newtours.steps.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginNewtours {
	
	@Managed(driver="Chrome")
	WebDriver driver;
	
	@Steps
	LoginSteps user;
	
	@Test
	public void loginOnNewtours() {
		
		//Given
		user.isOnNewtoursHomePage();
		//When
		user.loginWithValidData();
		//And
		user.clickButtonLogin();
		//Then
		user.shouldBeOnFlightPage();
	}
	
//	@Test
//	public void loginInvalidOnNewtours() {
//		
//		//Given
//		user.isOnNewtoursHomePage();
//		//When
//		user.loginWithInvalidData();
//		//And
//		user.clickButtonLogin();
//		//Then
//		user.shouldBeOnPageLogin();
//	}
//	
//	@Test
//	@Pending
//	public void probarPendiente() {
//		
//	}

}
