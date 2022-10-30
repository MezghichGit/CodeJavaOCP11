package day4.instanceOf_operator;

public class Main {

	public static void main(String[] args) {
		
		Hippo hippo = new Hippo();
		Elephant elph = new Elephant();
		
		//boolean b1 = hippo instanceof Elephant; //erreur de compilation

		
		HeavyAnimal ha = new HeavyAnimal();
		//ha=null;
		boolean b2= hippo instanceof HeavyAnimal;
		System.out.println(b2);
		boolean b3= ha instanceof Hippo;
		System.out.println(b3);
		
		ha = new Mouton();
		boolean b4 = ha instanceof Animal;
		System.out.println(b4);
	}

}
