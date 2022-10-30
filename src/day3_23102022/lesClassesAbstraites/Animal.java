package day3_23102022.lesClassesAbstraites;

public abstract class Animal {

	public Animal() {
		System.out.println("Animal");
	}
	String espece;
	int age;

	public void manger() {
		System.out.println("J'ai faim, je veux manger");
	}
	
	public void dormir() {
		System.out.println("Je veux bien dormir");
	}
	
	public abstract void seDeplacer();
}
