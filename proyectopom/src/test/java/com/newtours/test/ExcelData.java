package com.newtours.test;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelData {
	
	static ArrayList<ArrayLogin> login = new ArrayList<>();
	
	public ExcelData() {
		
	}

	public void ReadExcel() throws FilloException {

		// NewtoursLoginPage newtours = new NewtoursLoginPage();		
		// se crea una instancia de la clase fillo
		Fillo fillo = new Fillo();
		// se crea una conexion y se trae el archivo de excel
		Connection connection = fillo.getConnection("C:\\Users\\SBMEDADMIN\\Documents\\Datos.xls");
		// se crea la consulta a realizar
		String strQuery = "Select * from Login";
		// se ejecuta la consulta y se guada en un conjunto de archivo
		Recordset recordset = connection.executeQuery(strQuery);
		// mientras haya datos va a recorrer las filas
		// recordset.next();
		while (recordset.next()) {
			// newtours.loginNewtours(recordset.getField("userName"),
			// recordset.getField("password"));
			// navegar.probar(recordset.getField("userName"),
			// recordset.getField("password"));
			// ArrayLogin ar=new
			// ArrayLogin(recordset.getField("userName"),recordset.getField("password"));
			login.add(new ArrayLogin(recordset.getField("userName"), recordset.getField("password")));
			// list.setLlenar(recordset.getField("userName"),
			// recordset.getField("password"));
			// System.out.println(recordset.getField("userName")+" -- "+
			// recordset.getField("password"));
		}
		// ArrayList<String> p;
		// p=list.getUser();

//		for (int i = 0; i < login.size(); i++) {
//			System.out.println(login.get(i).toString());
//		}

		// cierra el conjunto de datos
		recordset.close();

		// cierra la conexion
		connection.close();
	}
	
	public ArrayList<ArrayLogin> getLista(){
		return login;
	}

}
