package day4;

import static day4.part1_rappel.Utilitaires.PI;
import static day4.part1_rappel.Utilitaires.somme;
public class App {

	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(somme(10,20));
		Animal a = new Animal();
		//System.out.println(a.age);
		System.out.println(a.name);
		System.out.println(a.poids);
		System.out.println(a.taille);

	}

}
