package com.alibaba.reto.questions;

import java.util.List;

import com.alibaba.reto.userinterfaces.AlibabaComponentsHomePage;
import com.alibaba.reto.userinterfaces.AlibabaProductPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AlibabaCanNotAddToCar implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(AlibabaProductPage.ADDTOCAR_BUTTON).viewedBy(actor).asList();
	}
	
	public static AlibabaCanNotAddToCar displayed() {
		return new AlibabaCanNotAddToCar();
	}

}
