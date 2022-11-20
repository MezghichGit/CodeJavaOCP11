package day8.lesgenerics;

public class Main {

	public static void main(String[] args) {
		Container<Animal> animals = new Container<>();
		Animal a1 = new Animal("Chien");
		Animal a2 = new Animal("Poisson");
		animals.add(a1);
		animals.add(a2);
		animals.displayData();
		Container<Voiture> voitures = new Container<>();
		
		Voiture v1 = new Voiture("Mercedes");
		Voiture v2 = new Voiture("BMW");
		voitures.add(v1);
		voitures.add(v2);
		voitures.displayData();
		
				
	}

}
