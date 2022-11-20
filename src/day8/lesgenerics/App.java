package day8.lesgenerics;

public class App {

	public static void main(String[] args) {
		Transporter<Voiture> t1 = new Transporter<>();
		t1.contenu = new Voiture("BMW");
		Transporter<Animal> t2 = new Transporter<>();
		t2.contenu = new Animal("toto");

	}

}
