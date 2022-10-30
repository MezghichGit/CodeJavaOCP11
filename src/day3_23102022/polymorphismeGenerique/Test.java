package day3_23102022.polymorphismeGenerique;

public class Test {

	public static void infoAnimal(Animal a) // méthode polymorphe
	{
		
	}
	public static void main(String[] args) {
		
		Animal tab[]=new Animal[2];  // tab est une structure polymorphe
		
		tab[0]= new Oiseau();
		tab[1]= new Poisson();
		
		Oiseau o = new Oiseau();
		Poisson p = new Poisson();
		infoAnimal(o);
		infoAnimal(p);

	}

}
