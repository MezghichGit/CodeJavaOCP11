package sip_groupe.day2_15102022;

public class Main {

	public static void main(String[] args) {
		/*
		String ch1 = "OCP";  // String est un type immutable
		System.out.println(ch1.concat("-Spring"));
		System.out.println(ch1);
		
		//le type StringBuilder est un type mutable
		StringBuilder sb = new StringBuilder("OCP");
		sb.append("-Spring");
		System.out.println(sb);*/
		/*StringBuilder sb3 = new StringBuilder(8);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		sb3.append("abcdabcdef");
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());*/
		/*
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("SpringSpringabcda");
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		
		/*String ch1 = "OCP";
		System.out.println(ch1.length());
		StringBuilder sb = new StringBuilder("OCP");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		//////////////
		// Step 1) chaine de départ
		String depart = "Formation OCA";
		// Step 2) Création de StringBuilder à partir d'un String
		StringBuilder sb = new StringBuilder(depart);
		sb.reverse();
		sb.append("-Spring");
		sb.replace(0, 4,"AAAA");
		// Step 3) Récupération d'un String à partir d'un StringBuilder 
		depart = sb.toString();
		System.out.println(depart);

	}

}
