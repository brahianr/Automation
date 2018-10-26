package com.alibaba.reto.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlibabaProductPage extends PageObject{
	
	public static final Target QUANTITY_BUTTON=Target.the("Quantity product").locatedBy("//a[@class='btn-quantity quantity-up']");public static final Target ADDTOCAR_BUTTON= Target.the("Add to car button").located(By.xpath("id('J-btn-shopping-cart')/i[@class='ui2-icon ui2-icon-cart']"));
//	public static final Target ADDTOCAR_BUTTON= Target.the("Add to car button").located(By.xpath("//div[@class='ma-sub-operate']//a[@id='J-btn-shopping-cart']//i"));
//	public static final Target ADDTOCAR_BUTTON= Target.the("Add to car button").located(By.id("J-btn-shopping-cart"));
//	public static final Target ADDTOCAR_BUTTON= Target.the("Add to car button").located(By.xpath("//i[@class='ui2-icon ui2-icon-cart']"));
	public static final Target CHECKCAR_BUTTON=Target.the("Check car button").located(By.xpath("//div[@class='header-cart-text']"));
	public static final Target PRODUCT_NAME=Target.the("Name product").locatedBy("//div[@class='name']/a");
}
