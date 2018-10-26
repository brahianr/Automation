package com.newtours.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.newtours.steps.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginNewtours {
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	LoginSteps user;
	
	@Test
	public void loginOnNewtours() {
		
		user.isOnNewtoursHomePage();
		user.loginWithValidData();
		user.shouldBeOnFlightPage();
	}

}
