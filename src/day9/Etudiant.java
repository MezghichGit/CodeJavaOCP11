package day9;

public class Etudiant implements Comparable<Etudiant>{
	
	String nom;
	int age;
	double moy;
	public Etudiant(String nom, int age, double moy) {
		super();
		this.nom = nom;
		this.age = age;
		this.moy = moy;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", moy=" + moy + "]";
	}
	@Override
	public int compareTo(Etudiant o) {
		Etudiant temp = o;
		//return this.age-temp.age;  //ordre croissant sur l'age
		return (int)(temp.moy - this.moy); //ordre decroissant par moyenne
	}

}
