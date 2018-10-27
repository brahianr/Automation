package com.alibaba.reto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import com.alibaba.reto.userinterfaces.AlibabaProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCar implements Task {
	
	//private ProductName product;
	private WebDriver driver;
	
	public AddToCar(WebDriver driver) {
		this.driver=driver;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//usado para que la pagina espere un tiempo para la correcta carga de todos sus elementos 
		//en este caso para el boton añadir al carro
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//añade el producto al carro
		actor.attemptsTo(Click.on(AlibabaProductPage.ADDTOCAR_BUTTON));
		//abre la el carrito
		actor.attemptsTo(Click.on(AlibabaProductPage.CHECKCAR_BUTTON));
		String oldTab=driver.getWindowHandle();
		//alamacena las ventanas abiertas
		ArrayList<String> newTab= new ArrayList<>(driver.getWindowHandles());
        //quita la ventana actual de la lista
		newTab.remove(oldTab);
		//abre la segunda ventana que se abrio
		driver.switchTo().window(newTab.get(1));
	}

	public static AddToCar theProduct(WebDriver driver) {
		return instrumented(AddToCar.class,driver);
	}

}
