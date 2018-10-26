package com.newtours.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewtoursRegistaeUserPage {
	
	private WebDriver driver;
	private By firstName=By.name("firstName");
	private By lastName=By.name("lastName");
	private By phone=By.name("phone");
	private By userName=By.name("userName");
	private By address=By.name("address1");
	private By address2=By.name("address2");
	private By city=By.name("city");
	private By state=By.name("state");
	private By postalCode=By.name("postalCode");
	private By country=By.name("country");
	private By email=By.name("email");
	private By password=By.name("password");
	private By confirmPassword=By.name("confirmPassword");
	private By registerButton=By.name("register");
	
	public NewtoursRegistaeUserPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void contactInfo(String firstname,String lastname,String phone,String email) {
		writeFirstName(firstname);
		writeLastName(lastname);
		writePhone(phone);
		writeEmail(email);
	}
	
	public void mailingInfo(String address1,String city,String state,String postalCode,String country) {
		writeAddress(address1);
		writeCity(city);
		writeState(state);
		writePostalCode(postalCode);
		writeCountry(country);			
	}
	
	public void mailingInfo(String address1,String address2,String city,String state,String postalCode,String country) {
		writeAddress(address1);
		writeAddress2(address2);
		writeCity(city);
		writeState(state);
		writePostalCode(postalCode);
		writeCountry(country);			
	}
	
	
	public void userInfo(String email,String pass,String confirmpass) {
		writeUserName(email);
		writePassword(pass);
		writeConfirmPassword(confirmpass);
	}
	
	public void writeFirstName(String firstname) {
		driver.findElement(this.firstName).sendKeys(firstname);		
	}
	
	public void writeLastName(String lastname) {
		driver.findElement(this.lastName).sendKeys(lastname);		
	}
	
	public void writePhone(String phone) {
		driver.findElement(this.phone).sendKeys(phone);		
	}
	
	public void writeEmail(String email) {
		driver.findElement(this.userName).sendKeys(email);		
	}
	
	public void writeAddress(String address1) {
		driver.findElement(this.address).sendKeys(address1);		
	}
	
	public void writeAddress2(String address2) {
		driver.findElement(this.address2).sendKeys(address2);		
	}
	
	public void writeCity(String city) {
		driver.findElement(this.city).sendKeys(city);		
	}
	
	public void writeState(String state) {
		driver.findElement(this.state).sendKeys(state);		
	}
	
	public void writePostalCode(String postalCode) {
		driver.findElement(this.postalCode).sendKeys(postalCode);		
	}
	
	public void writeCountry(String country) {
		Select selectcountry=new Select(driver.findElement(this.country));
		selectcountry.selectByVisibleText(country);			
	}
	
	public void writeUserName(String username) {
		driver.findElement(this.email).sendKeys(username);
	}
	
	public void writePassword(String password) {
		driver.findElement(this.password).sendKeys(password);
	}
	
	public void writeConfirmPassword(String password) {
		driver.findElement(this.confirmPassword).sendKeys(password);
	}	
	
	public void clickRegisterButton() {
		
		driver.findElement(registerButton).click();
	}	

}
