package com.alibaba.reto.questions;

import java.util.List;
import com.alibaba.reto.userinterfaces.AlibabaProductPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AlibabaCheckProductOnCar implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(AlibabaProductPage.PRODUCT_NAME).viewedBy(actor).asList();
	}
	
	public static AlibabaCheckProductOnCar displayed() {
		return new AlibabaCheckProductOnCar();
	}
}
