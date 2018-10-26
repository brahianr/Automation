package com.alibaba.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.alibaba.reto.userinterfaces.AlibabaComponentsHomePage;;

public class Search implements Task{
	
	private String product;
	
	public Search(String product) {
		this.product=product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(product).into(AlibabaComponentsHomePage.SEARCH_BAR),
				         Click.on(AlibabaComponentsHomePage.SEARCH_BUTTON));
		
	}

	public static Search product(String product) {
		return instrumented(Search.class, product);
	}

}
