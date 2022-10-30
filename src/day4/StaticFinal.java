package day4;

public class StaticFinal {
	
	

	final int x = 10;
	final StringBuilder sb = new StringBuilder("OCP");
	final String nom = "OCP";
	public static void main(String[] args) {
		StaticFinal obj = new StaticFinal(); 
		//obj.nom="OC";
		obj.nom.concat("11");
		System.out.println(obj.nom.concat("11")); //String est immutable
		System.out.println(obj.nom);
		Calcul c = new Calcul();
		//obj.x = 20;
		//obj.sb = new StringBuilder("OC"); //StringBuilder est mutable
		obj.sb.append("11");
		System.out.println(obj.sb);

	}

}
