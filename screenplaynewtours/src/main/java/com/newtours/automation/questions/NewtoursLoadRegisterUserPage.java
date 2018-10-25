package com.newtours.automation.questions;

import java.util.List;

import com.newtours.automation.userinterfaces.NewtoursRegisterUserPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NewtoursLoadRegisterUserPage implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(NewtoursRegisterUserPage.SUBMIT_BUTTON).viewedBy(actor).asList();
	}
	
	public static NewtoursLoadRegisterUserPage displayed() {
		return new NewtoursLoadRegisterUserPage();
	}

}
