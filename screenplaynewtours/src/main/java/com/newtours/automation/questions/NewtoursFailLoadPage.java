package com.newtours.automation.questions;

import java.util.List;

import com.newtours.automation.userinterfaces.NewtoursHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NewtoursFailLoadPage implements Question<List<String>>   {

	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(NewtoursHomePage.SINGON_BUTTON).viewedBy(actor).asList();
	}
	
	public static NewtoursFailLoadPage displayed() {
		return new NewtoursFailLoadPage();
	}


}
