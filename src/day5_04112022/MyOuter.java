package day5_04112022;

import javax.swing.JButton;

public class MyOuter {
	JButton b = new JButton("Click");
	
	
	public interface Inner{ 
	//public abstract class Inner{  // inner class
		public abstract void info1();
		public abstract void info2();
	}
	
	public class Inner2{  // inner class
	
		public  void affichage() {}
	}
	
	public void myMethod() {
		
		Inner inner = new Inner(){  //local anonymos inner class
			public void info1() {}
			public void info2() {}
		};
	}

}
