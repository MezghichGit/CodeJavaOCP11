package day4.Override_ToString_Equals_HashCode;

public class Test {

	public static void main(String[] args) {
		Animal a = new Animal();
		// part 1) La méthode toString();
		
		//System.out.println(a.toString());
		//System.out.println(a);
		
		//part 2) La méthod equals
		
		String s1 = new String("lion");
		String s2 = new String("lion");
		System.out.println(s1.equals(s2)); // true
		
		StringBuilder sb1 = new StringBuilder("lion");
		StringBuilder sb2 = new StringBuilder("lion");
		System.out.println(sb1.equals(sb2)); // false
		
		Animal a1 = new Animal();
		a1.id = 10;
		a1.nom = "toto";
		a1.age=2;
		Animal a2 = new Animal();
		a2.id = 10;
		a2.nom = "toto";
		a2.age=2;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2)); //true
		System.out.println(a1 == a2 ); //false
		
		String ch1 = "OCA";  //Pool
		String ch2 = new String("OCA"); //Heap
		System.out.println(ch1.equals(ch2));
		System.out.println(ch1.hashCode());
		System.out.println(ch2.hashCode());

	}

}
