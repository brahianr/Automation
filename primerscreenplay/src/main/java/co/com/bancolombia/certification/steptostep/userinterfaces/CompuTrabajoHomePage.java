package co.com.bancolombia.certification.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.computrabajo.com.co")
public class CompuTrabajoHomePage extends PageObject {
	
	public static final Target COMPUTRABAJO_LOGO= Target.the("Computabajo logo").located(By.id("smartbanner")); 

}
