package semillero;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//import semillero.LeerExcel;
//import semillero.captura;

public class navegar {
	
	private static  WebDriver driver=null;
	private static String driverName="";
	private int numFoto=1;
	private String name;
	private String password;	
	//LeerExcel excel=new LeerExcel();
	
	public void asignarDriver(WebDriver driver,String driverName) {
		this.driver=driver;
		this.driverName=driverName;
	}
	
	public void asignarCampos(String name,String password) {
		//asigna el nombre de los elementos a buscar
		this.name=name;
		this.password=password;
	}
	
	public void probar(String user,String pass) throws IOException {
		
		captura foto=new captura();		
		
		
		driver.get("http://newtours.demoaut.com/");			
		driver.findElement(By.name(name)).sendKeys(user);
		driver.findElement(By.name(password)).sendKeys(pass);

		foto.takeScreenShotTest(driver, driverName+" Datos "+numFoto);    	 
		driver.findElement(By.name("login")).click();
		foto.takeScreenShotTest(driver, driverName+" Error "+numFoto);	
		numFoto++;
		//driver.quit();
		
	}

}
