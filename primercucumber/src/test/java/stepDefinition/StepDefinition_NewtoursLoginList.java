package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition_NewtoursLoginList {
	
	WebDriver driver;
	private By username=By.name("userName");
	private By password=By.name("password");
	private By loginButton=By.name("login");
	
	@Given("se esta en la pagina de inicio de newtours")
	public void se_esta_en_la_pagina_de_inicio_de_newtours() {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^ingreso el username y el password$")
	public void ingreso_el_username_y_el_password(DataTable dataTable) {
		
		List<String> list= dataTable.asList(String.class);
		driver.findElement(username).sendKeys(list.get(0));
		driver.findElement(password).sendKeys(list.get(1));		
		
		System.out.println("nombre: "+list.get(0));
		System.out.println("pass: "+list.get(1));
	}
	

	@When("hace click en el boton sing-on")
	public void hace_click_en_el_boton_sing_on() {
		driver.findElement(loginButton).click();
	}

	@Then("se vera la pagina de registrar vuelos")
	public void se_vera_la_pagina_de_registrar_vuelos() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText().contains("Welcome back to"));

	}
	
	@When("se ingresa el usuario y la clave")
	public void se_ingresa_el_usuario_y_la_clave(DataTable dataTable) {
		
		List<Map<String,String>> data= dataTable.asMaps(String.class,String.class);
		driver.findElement(username).sendKeys(data.get(0).get("userName"));
		driver.findElement(password).sendKeys(data.get(0).get("password"));
		
		System.out.println("nombre: "+data.get(0).get("userName"));
		System.out.println("nombre: "+data.get(0).get("password"));
	}
	
	@When("usuario ingresa (.*) y (.*)")
	public void usuario_ingresa_y(String user, String pass) {
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);		

	}


}
