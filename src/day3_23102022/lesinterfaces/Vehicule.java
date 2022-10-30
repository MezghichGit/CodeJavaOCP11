package day3_23102022.lesinterfaces;

@FunctionalInterface
public abstract interface Vehicule {

	abstract void demarrer(); //	public abstract void demarrer();
	 
	 // a prtir de la version 8
	 
	 default void stop() {  // par defaut c'est public
		 System.out.println("sarreter");
	 }
	 
	 static void getVitesseMax() { // par defaut c'est public
		 System.out.println("900 KM/H");
	 }
}
