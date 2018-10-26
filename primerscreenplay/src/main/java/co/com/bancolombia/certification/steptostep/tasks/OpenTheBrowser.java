package co.com.bancolombia.certification.steptostep.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.steptostep.userinterfaces.CompuTrabajoHomePage;;

public class OpenTheBrowser implements Task  {
	
	//private PageObject page;
	
	private PageObject page=new CompuTrabajoHomePage();
	
	public OpenTheBrowser(PageObject page) {
		this.page=page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
	}
	
	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class,page);
	}

}
