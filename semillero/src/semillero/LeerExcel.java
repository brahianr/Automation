package semillero;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

//import com.sophos.certificacion.test.navegar;


public class LeerExcel {
	
	/*public static void main(String args[]) throws IOException {
		readXLSXFile();
	}
	*/
	
	
	public static void readXLSXFile() throws IOException
    {
		navegar navega=new navegar();
		String name="",pass="";
		int i=1,l=0;
				
		String path="C:\\Users\\SBMEDADMIN\\Documents\\Datos.xls";
		try {
		        File f = new File( path );
		        Workbook wb = WorkbookFactory.create(f);
		        Sheet mySheet=wb.getSheet("Login");		        	        
		        
		        Iterator<Row> rowIter = mySheet.rowIterator();
		        for ( Iterator<Row> rowIterator = mySheet.rowIterator() ;rowIterator.hasNext(); )
		        {
		            for (  Iterator<Cell> cellIterator = ((Row)rowIterator.next()).cellIterator() ; cellIterator.hasNext() ;  ) 
		            {		            	
		            	if(i==1) {
		            		//lee primera colunma
		            		name=( (Cell)cellIterator.next() ).toString();		            		
		            		i=2;
		            	}else {
		            		//lee segunda columna
		            		pass=( (Cell)cellIterator.next() ).toString();
		            		i=1;
		            	}      	       	
		                
		            }
		            if(l==0) {
		            	//pasa el nombre de los campos a buscar
		            	navega.asignarCampos(name, pass);
		            	l++;
		            }else {
		            	//pasa los valores con los q vamos hacer la prueba 
		            	navega.probar(name, pass);	
		            }
		                        
		            
		            System.out.println( " **************************************************************** ");
		        }
		    } catch ( Exception e )
		    {
		        System.out.println( "exception" );
		        e.printStackTrace();
		    }
    }

}
