package co.com.bancolombia.certification.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class CompuTrabajoSearchPage {
	
	public static final Target SOURCE_SEARCH_TEXT_AREA = Target.the("Source search text area").located(By.id("sq"));
	public static final Target SEARCH_BUTTON = Target.the("search button").located(By.id("search"));

}
