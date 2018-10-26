package com.sophos.certificacion.test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/

import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Excelsql {
	
	public static void main(String args[]) throws FilloException {
		
		//se crea una instancia de la clase fillo
		Fillo fillo=new Fillo();
		//se crea una conexion y se trae el archivo de excel
		Connection connection=fillo.getConnection("C:\\Users\\SBMEDADMIN\\Documents\\Datos.xls");
		//se crea la consulta a realizar
		String strQuery="Select * from Login";
		//se ejecuta la consulta y se guada en un conjunto de archivo
		Recordset recordset=connection.executeQuery(strQuery);
		
		//mientras haya datos va a recorrer las filas
		while(recordset.next()){
		System.out.println(recordset.getField("userName")+" -- "+ recordset.getField("password"));
		}
		
		//cierra el conjunto de datos 
		recordset.close();
		
		//cierra la conexion
		connection.close();
	}

	
	/*public static void main(String args[]) {
		
		Connection conexion=null;
		Statement sql=null;
		ResultSet rs=null;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			try {
				conexion=DriverManager.getConnection("jdbc:odbc:datos");
				System.out.println("Conexion establecida");
				sql=conexion.createStatement();
				rs=sql.executeQuery("select * from Login");
				System.out.println("Consulta ejecutada");
				
				boolean r=rs.next();
				
				while(r) {
					System.out.println(rs.getString("userName")+" - "+ rs.getString("password"));
					r=rs.next();
					
				}
				conexion.close();
				System.out.println("Conexion cerrada");
			}
			catch(SQLException e) {
				System.out.println("Error al ejecutr la consulta");
			}
		}
		catch(Exception e){
			System.out.println("Error en el controlador");
		}
	}*/

}
