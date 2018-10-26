package com.sophos.certificacion.test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class Captura {
	
    public void takeScreenShotTest(WebDriver driver, String imageName) {
        //Directorio donde quedaran las imagenes guardadas
        File directory = new File("C:\\imagenes");
   
        try {
           if (directory.isDirectory()) {
              //Toma la captura de imagen
              File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
              //Mueve el archivo a la carga especificada con el respectivo nombre
              FileUtils.copyFile(imagen, new File(directory.getAbsolutePath()   + "\\" + imageName + ".png"));
           } else {
              //Se lanza la excepcion cuando no encuentre el directorio
              throw new IOException("ERROR : La ruta especificada no es un directorio!");
           }
        } catch (IOException e) {
           //Impresion de Excepciones
           e.printStackTrace();
        }
     }

}
