package com.alibaba.reto.questions;

import java.util.List;

import com.alibaba.reto.userinterfaces.AlibabaComponentsHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AlibabaFailLoadPage implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(AlibabaComponentsHomePage.LOGO_BUTTOM).viewedBy(actor).asList();
	}
	
	public static AlibabaFailLoadPage displayed() {
		return new AlibabaFailLoadPage();
	}

}
