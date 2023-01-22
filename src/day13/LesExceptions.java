package day13;

import java.io.IOException;
import java.util.List;

public class LesExceptions {
	
	public static void info() throws IOException  // Checked Exception
	{
		System.out.println("Rien de grave");
		throw new IOException("Si une io exception");
	}
	
	public static void affichage() throws NullPointerException  // Unchecked Exception
	{}

	public static void main(String[] args) throws IOException{  // we declare the exception
		try {  // we handle the exception
		info();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		affichage();
		
		//var list = List.of("amine","ali","salah");
		//list.removeIf(String::isEmpty);
		/*
		int x = 10;
		int y = 0;
		try {
		   //System.out.println("x/y = "+(x/y));
			throw new IllegalArgumentException("Valeur invalide");
		}
	
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
			//return;
		}
		
		catch(Exception ex)
		{
			System.out.println("Problème : "+ ex.getMessage());
			//return;
		}
		
		finally {
		System.out.println("Suite du programme...");
		}*/
	}

}
