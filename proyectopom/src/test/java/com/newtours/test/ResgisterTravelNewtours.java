package com.newtours.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ResgisterTravelNewtours {
	
	WebDriver driver;
	private By passCount= By.name("passCount");
	private By fromPort= By.name("fromport");
	private By fromMonth=By.name("fromMonth");
	private By fromDay=By.name("fromDay");
	private By toPort= By.name("toPort");
	private By toMonth=By.name("toMonth");
	private By toDay=By.name("toDay");
	private By airLine=By.name("airline");
	private By findFlightButton=By.name("findFlight");
	private By outFlight=By.name("outFlight");
	
	//private By trip=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]");;
		
	public void selectPasajeros(int cant) {
		Select pasajero=new Select(driver.findElement(passCount));
		pasajero.selectByVisibleText(Integer.toString(cant));
	}
	
	public void departingFrom(String city) {
		Select dep=new Select(driver.findElement(fromPort));
		dep.selectByVisibleText(city);
	}
	
	public void startingMonth(String month) {
		Select starMonth=new Select(driver.findElement(fromMonth));
		starMonth.selectByVisibleText(month);		
	}
	
	public void startingDay(int day) {
		Select starDay=new Select(driver.findElement(fromDay));
		starDay.selectByVisibleText(Integer.toString(day));
	}
	
	public void arrivingCity(String city) {
		Select port=new Select(driver.findElement(toPort));
		port.selectByVisibleText(city);
	}
	
	public void returningMonth(String month) {
		Select retMonth=new Select(driver.findElement(toMonth));
		retMonth.selectByVisibleText(month);	
	}
	
	public void returningDay(int day) {		
		Select retDay=new Select(driver.findElement(toDay));
		retDay.selectByVisibleText(Integer.toString(day));
	}
	
	public void airLine(String line) {
		Select air=new Select(driver.findElement(airLine));
		air.selectByVisibleText(line);
	}
	
	public void outFlight(String flight) {
		//driver.findElement(this.outFlight)
	}
	
	public void clickFindFlightsButton() {
		
		driver.findElement(findFlightButton).click();
	}	
	

}
