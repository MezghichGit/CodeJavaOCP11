package day14_Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchExemple {

	public static void main(String[] args) {
		/*try {
			int tab[] = {1,2,3};
			System.out.println(tab[2]);
			String ch = null;
			System.out.println(ch.length());
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException  e)
		{
			System.out.println("Problème : " + e.getMessage());
		}*/
		
		try {
			System.out.println("RAS");
			//throw new SQLException();
		}
		//catch(SQLException e)
		catch(IllegalArgumentException e)
		{
			System.out.println("OK");
		}

	}

}
