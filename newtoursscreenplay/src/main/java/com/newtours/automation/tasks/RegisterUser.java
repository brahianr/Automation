package com.newtours.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.newtours.automation.models.RegisterUserModel;
import com.newtours.automation.userinterfaces.NewtoursRegisterUserPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterUser implements Task{
	
	private RegisterUserModel registerUserModel;
	
	public RegisterUser(RegisterUserModel registerUserModel) {
		this.registerUserModel=registerUserModel;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(registerUserModel.getFirstName()).into(NewtoursRegisterUserPage.FIRSTNAME),
				Enter.theValue(registerUserModel.getLastName()).into(NewtoursRegisterUserPage.LASTNAME),
				Enter.theValue(registerUserModel.getPhone()).into(NewtoursRegisterUserPage.PHONE),
				Enter.theValue(registerUserModel.getEmail()).into(NewtoursRegisterUserPage.EMAIL),
				Enter.theValue(registerUserModel.getAddress1()).into(NewtoursRegisterUserPage.ADDRESS1),
				Enter.theValue(registerUserModel.getAddress2()).into(NewtoursRegisterUserPage.ADDRESS2),
				Enter.theValue(registerUserModel.getCity()).into(NewtoursRegisterUserPage.CITY),
				Enter.theValue(registerUserModel.getState()).into(NewtoursRegisterUserPage.STATE),
				Enter.theValue(registerUserModel.getPostalCode()).into(NewtoursRegisterUserPage.POSTALCODE),
				SelectFromOptions.byVisibleText(registerUserModel.getCountry().toUpperCase()).from(NewtoursRegisterUserPage.COUNTRY),
				Enter.theValue(registerUserModel.getUserName()).into(NewtoursRegisterUserPage.USERNAME),
				Enter.theValue(registerUserModel.getPassword()).into(NewtoursRegisterUserPage.PASSWORD),
				Enter.theValue(registerUserModel.getConfirmPassword()).into(NewtoursRegisterUserPage.CONFIRM_PASSWORD),
				Click.on(NewtoursRegisterUserPage.SUBMIT_BUTTON));			
	}

	public static RegisterUser with(RegisterUserModel registerUserModel) {
		return instrumented(RegisterUser.class,registerUserModel);
	}

}
