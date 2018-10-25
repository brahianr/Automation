package com.newtours.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.newtours.automation.models.LoginModel;
import com.newtours.automation.userinterfaces.NewtoursHomePage;;

public class Login implements Task {
	
	private LoginModel loginModel;
	
	public Login(LoginModel loginModel) {
		this.loginModel=loginModel;
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		//se asignan los valores que se reciben de la lista
		actor.attemptsTo(Enter.theValue(loginModel.getUserName()).into(NewtoursHomePage.USERNAME),
				Enter.theValue(loginModel.getPassword()).into(NewtoursHomePage.PASSWORD),
				Click.on(NewtoursHomePage.LOGIN_BUTTON));	
	}

	public static Login with(LoginModel loginModel) {
		return instrumented(Login.class,loginModel);
	}

}
