package com.newtours.test;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelData {
	
	public ExcelData() throws FilloException {
		//ReadExcel();
	}
	
	public static void ReadExcel() throws FilloException{
		
		NavigationNewtours navegar=new NavigationNewtours();
		ArrayData list=new ArrayData();
		//int p=0;
		//se crea una instancia de la clase fillo
		Fillo fillo=new Fillo();
		//se crea una conexion y se trae el archivo de excel
		Connection connection=fillo.getConnection("C:\\Users\\SBMEDADMIN\\Documents\\Datos.xls");
		//se crea la consulta a realizar
		String strQuery="Select * from Login";
		//se ejecuta la consulta y se guada en un conjunto de archivo
		Recordset recordset=connection.executeQuery(strQuery);
		
		//navegar.asignarCampos(recordset.getField("userName"), recordset.getField("password"));
		//mientras haya datos va a recorrer las filas
		//recordset.next();
		while(recordset.next()){
			navegar.probar(recordset.getField("userName"), recordset.getField("password"));
			//list.setLlenar(recordset.getField("userName"), recordset.getField("password"));
		    //System.out.println(recordset.getField("userName")+" -- "+ recordset.getField("password"));
			//p++;
		}
		//ArrayList<String> p;
		//p=list.getUser();
		
		/*for(int i=0;i<list.getUser().size();i++) {
			System.out.println(list.user.get(i)+"----"+list.pass.get(i));
		}*/
		
		//cierra el conjunto de datos 
		recordset.close();
		
		//cierra la conexion
		connection.close();
	}
}
