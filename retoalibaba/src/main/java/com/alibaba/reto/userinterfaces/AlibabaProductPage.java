package com.alibaba.reto.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlibabaProductPage extends PageObject{
	
	//boton aumentar la catidad de productos
	public static final Target QUANTITY_BUTTON=Target.the("Quantity product").locatedBy("//a[@class='btn-quantity quantity-up']");
	//boton añadir al carro
	public static final Target ADDTOCAR_BUTTON= Target.the("Add to car button").located(By.id("J-btn-shopping-cart"));;
	//boton carrito
	public static final Target CHECKCAR_BUTTON=Target.the("Check car button").located(By.xpath("//div[@class='header-cart-text']"));
	//nombre de producto en el carrito
	public static final Target PRODUCT_NAME=Target.the("Name product").locatedBy("//div[@class='name']/a/span");
}
