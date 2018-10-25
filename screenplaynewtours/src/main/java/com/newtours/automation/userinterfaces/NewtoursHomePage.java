package com.newtours.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://newtours.demoaut.com/")
public class NewtoursHomePage extends PageObject{
	
	public static final Target USERNAME= Target.the("username field").located(By.name("userName"));
	public static final Target PASSWORD= Target.the("Password field").located(By.name("password"));
	public static final Target LOGIN_BUTTON= Target.the("Password field").located(By.name("login"));	
	public static final Target SINGON_BUTTON= Target.the("Button sing-on").located(By.linkText("SIGN-ON"));
	public static final Target SINGOFF_BUTTON= Target.the("Button sing-off").located(By.linkText("SIGN-OFF"));
	public static final Target REGISTER_BUTTON= Target.the("Button register").located(By.linkText("REGISTER"));
	

}
