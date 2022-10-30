package day3_23102022;

public class Oiseau extends Animal {

	int age = 2;
	public Oiseau() {
		
		//super(); // appel au constructeur par défaut parent (ici c'est Animal())
		super(); // appel au constructeur avec paramètre
		System.out.println("Oiseau");
	}
	
	public void info()
	{
		//System.out.println("Age de Oiseau = "+this.age+" Age de Animal = "+super.age);
		this.getAge(); //2
		super.getAge(); //1
	}

	@Override
	public void getAge()
	{
		System.out.println("Age de Oiseau = "+this.age +" Age de Animal = "+super.age);
	}
	
	public static void affichage()
	{
		//System.out.println(super.taille);
	}
}
