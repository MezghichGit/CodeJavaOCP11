package day6.jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

	public static void main(String[] args)  throws SQLException{
		String req = "select * from etudiant";
		String req2 = "select nom from etudiant";
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp11","root","");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(req))
		{
			
			rs.next();
			System.out.println(rs.getInt(1));
			
			ResultSet rs2 = stmt.executeQuery(req2);
			System.out.println(rs.getInt(1));  // rs closed => Exception
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		/*
		try(
		   MyRessource rs = new MyRessource();
				//MyRes r = new MyRes()
			) //try-with-ressource
		{
			rs.precessing();
		}
		//exécution du bloc finally implicite de fermeture de ressource
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Fin du programme");
		}*/		
		//finally{close();}  //appel implicite
		
		//try {}
		//catch(Exception e) {}
		//finally {}

	}

}
