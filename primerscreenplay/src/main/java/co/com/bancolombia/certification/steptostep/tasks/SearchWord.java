package co.com.bancolombia.certification.steptostep.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.steptostep.models.SearchExpression;
import co.com.bancolombia.certification.steptostep.userinterfaces.CompuTrabajoSearchPage;;

public class SearchWord implements Task {
	
	private SearchExpression searchExpression;
	
	public SearchWord(SearchExpression searchExpression ) {
		this.searchExpression=searchExpression;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("Proyecto").into(CompuTrabajoSearchPage.SOURCE_SEARCH_TEXT_AREA));
		actor.attemptsTo(Click.on(CompuTrabajoSearchPage.SEARCH_BUTTON));
	}

	public static SearchWord the(SearchExpression searchExpression) {
		return instrumented(SearchWord.class,searchExpression);
	}
}
