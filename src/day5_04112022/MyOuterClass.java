package day5_04112022;

public  class MyOuterClass {
	
	int age; // attribut d'instance
	public static class InnerStatic{
		String nom="amine";
		public void info() {  // méthode d'instance
			
			System.out.println("Inner call" + new MyOuterClass().age);
		}
	}
	
	public static void main(String args[])
	{
		InnerStatic in = new InnerStatic();
		in.info();
		//Inner.info();
		System.out.println(in.nom);
	}

}
