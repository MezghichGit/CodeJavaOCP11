package day14_Exceptions.TryWithRessource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException {
		//Connection con=null;
		//Statement stmt = null;
		/*try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdocp","root","");	
			System.out.println(con);
			stmt = con.createStatement();
		}
		
		catch(SQLException ex){
			System.out.println(ex.getMessage());	
		}
		finally {
			if(stmt!=null)
				stmt.close();
		   
			if(con!=null)
				con.close();
		}*/
		
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdocp","root","");
				Statement stmt = con.createStatement();
				)
		{
			
		}
		//implicite finally{stmt.close(); con.close();}
		
		// execute un bloc finally implicite pour la fermeture des ressources

	}

}
