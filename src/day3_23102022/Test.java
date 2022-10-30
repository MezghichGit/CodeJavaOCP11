package day3_23102022;

public class Test {

	public static void main(String[] args) {
		Personne p = new Personne();
		Etudiant e = new Etudiant();
		
		//p = e; //UpCasting OK
		//e = p;  // Downcasting KO
		
		e = (Etudiant)p;  // Downcasting + Cast explicite => Exception ClassCastException => KO
		
	
		

	}

}
