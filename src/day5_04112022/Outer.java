package day5_04112022;

public class Outer {

	public Outer() {
	}
	
	public void info()
	{
		 int max = 100;  // effectively final
		 
		 
		 class Inner {
			 public void display() {
				 int a = 10; // effectively
				// a=11;
				 class Test{
					 public void display() {
						 System.out.println(a);
					 }
				 }
				 System.out.println(max);
			 }
		}
		 //max = 101;
	}

	

}
