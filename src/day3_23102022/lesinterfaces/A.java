package day3_23102022.lesinterfaces;

public interface A {
	/*public default void affichage() {
		System.out.println("A");
	}*/
	 public static final int x = 10;
	 static void affichage() {}
	
	 default void affichage2() {}
	
	 default void affichage3() {}
	 void info();
}
