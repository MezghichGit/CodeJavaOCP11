package day3_23102022;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		a = new Oiseau(); //Upcast Ko
		//a = o; // UpCasting OK
		
		//o = a;        // Cas 1 du DownCasting => KO erreur de compilation
		o = (Oiseau)a;  // Cas 2 du DownCasting : DownCast + CastExplicite vers le fils  => KO erreur de compilation

		System.out.println("Suite du programme...");
	}

}
