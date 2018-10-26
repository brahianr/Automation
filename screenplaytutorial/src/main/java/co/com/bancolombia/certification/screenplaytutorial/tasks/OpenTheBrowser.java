package co.com.bancolombia.certification.screenplaytutorial.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static  net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.screenplaytutorial.userinterfaces.GoogleHomePage;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page=page;
	}

	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}

	public static OpenTheBrowser on(PageObject page) {
		//return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class, page);//se tiene q mapear con el constructor el atributo  q llega de open the browser debe ser igaul al ctor
	}

}
