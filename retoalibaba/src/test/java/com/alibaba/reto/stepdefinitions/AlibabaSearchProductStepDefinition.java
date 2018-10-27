package com.alibaba.reto.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.alibaba.reto.exceptions.CheckProductOnCarException;
import com.alibaba.reto.questions.AlibabaCheckProductOnCar;
import com.alibaba.reto.tasks.AddToCar;
import com.alibaba.reto.tasks.OpenTheBrowser;
import com.alibaba.reto.tasks.Search;
import com.alibaba.reto.tasks.Select;
import com.alibaba.reto.userinterfaces.AlibabaSearchResultPage;
import com.alibaba.reto.userinterfaces.AlibabaHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

public class AlibabaSearchProductStepDefinition {
	
	@Managed(driver="chrome",options="--start-maximized",clearCookies=ClearCookiesPolicy.BeforeEachTest)
	private WebDriver hisbrowser;	
	
	private Actor edison=Actor.named("Edison");
	
	private AlibabaHomePage alibabaHomePage;
	private Select select;
	
	@Before
	public void setUp() {
		edison.can(BrowseTheWeb.with(hisbrowser));
		
	}
	
	@Given("^that edison add to car a product$")
	public void thatEdisonAddToCarAProduct() throws Exception {
		//se abre el navegador en la pagina especificada "alibaba.com"
		edison.wasAbleTo(OpenTheBrowser.on(alibabaHomePage));
	}
	
	@When("^he search a product (.*)$")
	public void heSearchAProductPc(String product) throws Exception {
		//se busca el producto
		edison.attemptsTo(Search.product(product));
	}
	
	@When("^he select the product (.*) (.*)$")
	public void heSelectTheProduct(int numero,int quantity) throws Exception {	
		//se selecciona el producto que este en la posicion que se envia por parametro y se elige la cantida a comprar
		edison.attemptsTo(Select.product(AlibabaSearchResultPage.SELECT_PRODUCT,numero,quantity,hisbrowser));
	}


	@When("^he add to car the product$")
	public void heAddToCarTheProduct() throws Exception {
		//se añade el producto al carro
		edison.attemptsTo(AddToCar.theProduct(hisbrowser));
	}

	@Then("^he should see the product on the car$")
	public void heShouldSeeTheProductOnTheCar() throws Exception {
		//se verifica que el producto seleccionado sea el mismo que esta en el carrito
		edison.should(seeThat(AlibabaCheckProductOnCar.displayed(),hasItem(select.name)).orComplainWith(CheckProductOnCarException.class,CheckProductOnCarException.PRODUCT_NAME));
		
	}

}
