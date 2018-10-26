package excelprueba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conectar {
	
	public static Connection getConnection() throws Exception {
	    String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	    String url = "jdbc:odbc:datos";
	    //String username = "username";
	    //String password = "pass";
	    Class.forName(driver);
	    return DriverManager.getConnection(url);
	  }

	  public static void main(String args[]) {
	    Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    try {
	      conn = getConnection();
	      stmt = conn.createStatement();
	      String excelQuery = "select * from Login";
	      rs = stmt.executeQuery(excelQuery);

	      while (rs.next()) {
	        System.out.println(rs.getString("userName") + " " + rs.getString("password"));
	      }
	    } catch (Exception e) {
	      System.err.println(e.getMessage()+" no se conecto");
	    } finally {
	      try {
	        rs.close();
	        stmt.close();
	        conn.close();

	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
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
