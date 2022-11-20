package day8.lesgenerics;

public class Animal {
	String nom;

	@Override
	public String toString() {
		return "Animal [nom=" + nom + "]";
	}

	public Animal(String nom) {
		super();
		this.nom = nom;
	}
	

}
