package com.alibaba.reto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.alibaba.reto.userinterfaces.AlibabaProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCar implements Task {
	
	//private ProductName product;
	private WebDriver driver;
	public String checkName;
	
	public AddToCar(WebDriver driver) {
		this.driver=driver;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(7000);
			driver.findElement(By.xpath("id('J-btn-shopping-cart')/i[@class='ui2-icon ui2-icon-cart']"));
		} catch (InterruptedException e) {
			//System.out.println("No se encontro");
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(AlibabaProductPage.ADDTOCAR_BUTTON));
		
		actor.attemptsTo(Click.on(AlibabaProductPage.CHECKCAR_BUTTON));
		String oldTab=driver.getWindowHandle();
		//alamacena las ventanas abiertas
		ArrayList<String> newTab= new ArrayList<>(driver.getWindowHandles());
        //quita la ventana actual de la lista
		newTab.remove(oldTab);
		//abre la segunda ventana que se abrio
		driver.switchTo().window(newTab.get(1));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static AddToCar theProduct(WebDriver driver) {
		return instrumented(AddToCar.class,driver);
	}

}
