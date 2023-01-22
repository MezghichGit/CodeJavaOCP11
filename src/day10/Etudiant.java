package day10;

import java.util.Comparator;

public class Etudiant implements Comparable<Etudiant>, Comparator<Etudiant>{
	int age;
	String nom;
	double moy;
	@Override
	public String toString() {
		return "Etudiant [age=" + age + ", nom=" + nom + ", moy=" + moy + "]";
	}
	public Etudiant(int age, String nom, double moy) {
		super();
		this.age = age;
		this.nom = nom;
		this.moy = moy;
	}
	@Override
	public int compareTo(Etudiant o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
