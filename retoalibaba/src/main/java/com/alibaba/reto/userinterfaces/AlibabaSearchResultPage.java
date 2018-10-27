package com.alibaba.reto.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlibabaSearchResultPage extends PageObject{
	
	//etiueta para seleecionar el nombre de todos los productos mostrados en la lista
	public static final Target SELECT_PRODUCT=Target.the("Select product").located(By.xpath("//div[contains(@class,'')]//a[contains(@data-domdot,'id:2678')]"));

}
