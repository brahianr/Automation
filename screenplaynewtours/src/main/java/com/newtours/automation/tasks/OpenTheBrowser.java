package com.newtours.automation.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;

import com.newtours.automation.exceptions.FailLoadHomePageExceptions;
import com.newtours.automation.questions.NewtoursFailLoadPage;
import com.newtours.automation.questions.NewtoursResult;
import com.newtours.automation.userinterfaces.NewtoursHomePage;;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page=page;
	}

	@Override
	@Step("{0} open the browser on Newtours Home Page")
	public <T extends Actor> void performAs(T actor) {	
		//abre el navegador
		actor.attemptsTo(Open.browserOn(page));
		//verifica que la pagina cargue correctamente
		actor.should(seeThat(NewtoursFailLoadPage.displayed(),hasItem("SIGN-ON")).orComplainWith(FailLoadHomePageExceptions.class,FailLoadHomePageExceptions.LOADPAGE_FAIL ));
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class,page);
	}

}
