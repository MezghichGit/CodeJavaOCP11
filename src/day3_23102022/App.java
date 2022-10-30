package day3_23102022;

public class App {

	public static void main(String[] args) {
		//Oiseau o = new Oiseau();
		//System.out.println(o.age);
		
		Animal a = new Oiseau();
		System.out.println(a.age); //On n'a pas d'overriding au niveau des attributs
		//l'overriding ne concerne que les méthodes. (on parle du hidding)
		a.getAge();  // la méthode du fils sera invoquée (overriding)
		
		
		//((Animal) o).getAge();
		//o.getNom();
		
		//Animal a = new Animal();
		// a = o;
		 //o = a;

	}

}
