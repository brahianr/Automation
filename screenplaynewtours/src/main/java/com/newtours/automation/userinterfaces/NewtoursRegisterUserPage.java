package com.newtours.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewtoursRegisterUserPage {
	
	public static final Target FIRSTNAME= Target.the("First name field").located(By.name("firstName"));
	public static final Target LASTNAME= Target.the("Last name field").located(By.name("lastName"));
	public static final Target PHONE= Target.the("phone field").located(By.name("phone"));
	public static final Target EMAIL= Target.the("Email field").located(By.name("userName"));
	public static final Target ADDRESS1= Target.the("Address 1 field").located(By.name("address1"));
	public static final Target ADDRESS2= Target.the("Address 2 field").located(By.name("address2"));
	public static final Target CITY= Target.the("City field").located(By.name("city"));
	public static final Target STATE= Target.the("State field").located(By.name("state"));
	public static final Target POSTALCODE= Target.the("Postal code field").located(By.name("postalCode"));
	public static final Target COUNTRY= Target.the("Country field").located(By.name("country"));
	public static final Target USERNAME= Target.the("Username field").located(By.name("email"));
	public static final Target PASSWORD= Target.the("Password field").located(By.name("password"));
	public static final Target CONFIRM_PASSWORD= Target.the("Passwor confirm field").located(By.name("confirmPassword"));
	public static final Target SUBMIT_BUTTON= Target.the("Submit button").located(By.name("register"));

}
