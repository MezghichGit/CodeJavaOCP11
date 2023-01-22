package day14_Exceptions;

public class Main {

	public static void exemple1() throws ArithmeticException //unchecked
	{}
	
	public static void exemple2() throws Exception // checked
	{}
	
	
	public static void main(String[] args)  {
		exemple1();
		try {
			exemple2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
