package com.alibaba.reto.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;
import com.alibaba.reto.exceptions.FailLoadHomePageExceptions;
import com.alibaba.reto.questions.AlibabaFailLoadPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {
	
	PageObject page;
	//WebDriver driver;
	
	public OpenTheBrowser(PageObject page) {
		//this.driver=hisbrowser;
		this.page=page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		//abre navegador en la pagina especificada
		actor.attemptsTo(Open.browserOn(page));
		//verifica que la pagina haya cargado correctamente
		actor.should(seeThat(AlibabaFailLoadPage.displayed(),hasItem("Alibaba.com")).orComplainWith(FailLoadHomePageExceptions.class,FailLoadHomePageExceptions.LOADPAGE_FAIL));
		
	}

	public static OpenTheBrowser on(PageObject page) {
		return Tasks.instrumented(OpenTheBrowser.class,page);
	}

}
