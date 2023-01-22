package day14_Exceptions.TryWithRessource;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException  {
		
		try(var ressource  = new MyRessource())
		{
			ressource.info();
		}
		//finally implicite
		/*catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Fin du programme");
		}*/

	}

}
