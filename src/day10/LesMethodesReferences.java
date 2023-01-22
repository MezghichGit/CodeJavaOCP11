package day10;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LesMethodesReferences {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("salah");
		names.add("ali");
		names.add("mourad");

		System.out.println(names);
		// Collections.sort(names);
		// System.out.println(names);

		// m�thode de r�f�rence via lambda
		/*
		 * Consumer<List<String>> consumer = (List<String>list)->Collections.sort(list);
		 */

		// m�thode de r�f�rence via m�thode static
		Consumer<List<String>> consumer = Collections::sort; // static method
		consumer.accept(names);
		System.out.println(names);

		// Deuxi�m exemple

		Consumer<String> consumerAffichage = s -> System.out.println(s);

		names.forEach(s -> System.out.println(s));
		names.forEach(consumerAffichage);
		System.out.println("*********");
		names.forEach(System.out::println);

		// Exemple avec m�thode de r�f�rence � base de constructeur

		Supplier<StringBuilder> sb = () -> new StringBuilder("OCP");
		StringBuilder temp = sb.get();
		System.out.println(temp);

		Supplier<StringBuilder> s = StringBuilder::new; // constructor
		/******/

		// 1)Implementation par Lambda
		BiFunction<String, String, String> bf = (String prenom, String nom) -> {
			return prenom + " " + nom;
		};

		// 2)Implementation m�thode r�f�rence via m�thode d'instance sur une r�f�rence sp�cifique
		String prenom ="Amine ";
		String nom = "Mezghich";
		Function<String, String> bf2 = prenom::concat;
		
		System.out.println(bf2.apply(nom));
		System.out.println(bf2.apply("SS"));
		
		//4) M�thode de r�f�rence sur des instances � fixer au runtime
		
		Predicate<String>filter = (String ch)->{return ch.isEmpty();};
		Predicate<String>filter2 = String :: isEmpty;
		
		String alpha = "OCP";
		
		System.out.println(filter2.test(alpha));
		
		UnaryOperator<Integer>op = x-> x+2;
	}

}
