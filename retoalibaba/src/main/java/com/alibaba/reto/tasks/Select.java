package com.alibaba.reto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.alibaba.reto.userinterfaces.AlibabaProductPage;
import com.alibaba.reto.utils.ProductName;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Select implements Task{
	private Target target;
	private WebDriver driver;
	private int num;
	private int quantity;
	public static String name;
	ProductName product;
	
	public Select(Target target,int num,int quantity,WebDriver driver) {
		this.target=target;
		this.num=num;
		this.quantity=quantity;
		this.driver=driver;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		//guarda la pagina actual
		String oldTab=driver.getWindowHandle();
		//llena la lista con los productos en pantalla
		List<WebElementFacade> producto = target.resolveAllFor(actor); 
		
		//almacenasr nombre de producto seleccionado para la futura comparacion
		name=producto.get(num).getText();
		
		//selecciona el producto que este en la posicion que se mande
		actor.attemptsTo(Click.on(producto.get(num)));

		//alamacena las ventanas abiertas
		ArrayList<String> newTab= new ArrayList<>(driver.getWindowHandles());
		//quita la ventana actual de la lista
		newTab.remove(oldTab);
		//abre la segunda ventana que se abrio
		driver.switchTo().window(newTab.get(0));
		
		//presiona el boton aumentar cantidad el numero de veces que se diga 
		for (int i=0;i<quantity;i++) {
			actor.attemptsTo(Click.on(AlibabaProductPage.QUANTITY_BUTTON));
		}		

	}
	
	public static Select product(Target target,int num,int quantity,WebDriver driver) {
		return instrumented(Select.class,target,num,quantity,driver);
	}

}
