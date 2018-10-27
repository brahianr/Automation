package com.alibaba.reto.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlibabaComponentsHomePage extends PageObject {
	
	public static final Target LOGO_BUTTOM= Target.the("Logo Alibaba").located(By.linkText("Alibaba.com"));	
	public static final Target SEARCH_BAR=Target.the("SearchText").located(By.name("SearchText"));
	public static final Target SEARCH_BUTTON=Target.the("Search button").located(By.xpath("*//i[@class=\"ui-searchbar-button-icon\"]"));

}
