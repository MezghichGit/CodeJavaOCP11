package day4;

public class Animal {
	private int age;
	String name;  //visibilité = package private
	protected double poids;
	public int taille;
	
	public void info()
	{
		System.out.println("Age = "+this.age + " Name ="+ this.name);
		System.out.println("Poids = "+this.poids+" Taille = "+this.taille);
	}

}
