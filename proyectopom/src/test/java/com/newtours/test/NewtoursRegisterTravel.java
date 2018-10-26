package com.newtours.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class NewtoursRegisterTravel {

	WebDriver driver;
	AsingDriver as=new AsingDriver();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver=as.setDriver("chrome");
		//driver=as.getDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		NewtoursLoginPage nl=new NewtoursLoginPage(driver,"chrome");
		nl.loginNewtours("brahianr","1234");
		ResgisterTravelNewtours rt=new ResgisterTravelNewtours();
		rt.selectPasajeros(2);
		rt.departingFrom("London");
		rt.startingMonth("July");
		rt.startingDay(12);
		rt.arrivingCity("Paris");
		rt.returningMonth("December");
		rt.returningDay(18);
		rt.airLine("Pangea Airlines");		
	}

}
