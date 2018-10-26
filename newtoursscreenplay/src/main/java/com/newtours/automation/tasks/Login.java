package com.newtours.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.newtours.automation.models.LoginModel;
import com.newtours.automation.userinterfaces.NewtoursHomePage;;

public class Login implements Task {
	
//	private String username;
//	private String password;
	private LoginModel loginModel;
	
	public Login(LoginModel loginModel) {
		this.loginModel=loginModel;
	}
	
//	public Login(String username, String pass) {
//		this.username=username;
//		this.password=pass;
//	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(loginModel.getUserName()).into(NewtoursHomePage.USERNAME),
				Enter.theValue(loginModel.getPassword()).into(NewtoursHomePage.PASSWORD),
				Click.on(NewtoursHomePage.LOGIN_BUTTON));		
//		actor.attemptsTo(Enter.theValue(username).into(NewtoursHomePage.USERNAME),
//				Enter.theValue(password).into(NewtoursHomePage.PASSWORD),
//				Click.on(NewtoursHomePage.LOGIN_BUTTON));		
	}

//	public static Login with(String username, String pass) {
//		return instrumented(Login.class,username,pass);
//	}

	public static Login with(LoginModel loginModel) {
		return instrumented(Login.class,loginModel);
	}

}
