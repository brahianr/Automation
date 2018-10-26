package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class NewtoursHomePage extends PageObject {
	
//	WebElementFacade userName;
//	WebElementFacade password;
	
	@FindBy(name="userName")
	WebElement user;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(name="login")
	WebElement loginButton;

	public void loginData(String username, String password) {
//		typeInto(userName,username);
//		typeInto(password,pass);
		user.sendKeys(username);
		pass.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
