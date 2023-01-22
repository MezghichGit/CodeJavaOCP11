package day14_Exceptions;

public class App {

	public static void operation() {
		String ch = null;
		try {
		System.out.println(ch.length());
		}
		catch(NullPointerException e)  //Unchecked Exception
		{
			System.out.println("Oups :" +e.getMessage());
			//e.printStackTrace();
			return;
			//throw new ArithmeticException("Un test");
		}
		
		finally {
		System.out.println("Fin de la fonction operation");
		}
		
	}

	public static void main(String[] args) {
		
		operation();
		/*
		int x = 10;
		int y = 0;
		try {
		   System.out.println((x/y));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Oups "+e.getMessage());
			return;
		}

		finally {
		System.out.println("Fin du programme...");
		}*/

	}

}
