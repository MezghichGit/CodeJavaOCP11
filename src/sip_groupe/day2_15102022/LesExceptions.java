package sip_groupe.day2_15102022;

import java.text.MessageFormat;

public class LesExceptions {
	
	public static void info() throws ArithmeticException,NullPointerException
	{}
	
	public static void info2() throws Exception
	{}

	public static void main(String[] args) {
		MessageFormat msg;
		info();
		try {
			info2();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int x = 10;
		int y = 0;
		String ch =null;
		try {

		System.out.println(x/y);
		System.out.println(ch.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Erreur : "+ e.getMessage());
			//return;
		}
		catch(Exception e)
		{
			System.out.println("Oups : " + e.getMessage());
			//return;
			throw new NullPointerException();
		}
		finally {
		System.out.println("Suite du programme...");
		}
		

	}

}
