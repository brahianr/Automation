package com.newtours.automation.questions;

import java.util.List;

import com.newtours.automation.userinterfaces.NewtoursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NewtoursResult implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		//return NewtoursHomePage.RESULT_TEXT.resolveFor(actor).getText();
		return Text.of(NewtoursHomePage.SINGOFF_BUTTON).viewedBy(actor).asList();
	}
	
	public static NewtoursResult displayed() {
		return new NewtoursResult();
	}

}
