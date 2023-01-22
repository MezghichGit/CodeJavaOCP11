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

		// méthode de référence via lambda
		/*
		 * Consumer<List<String>> consumer = (List<String>list)->Collections.sort(list);
		 */

		// méthode de référence via méthode static
		Consumer<List<String>> consumer = Collections::sort; // static method
		consumer.accept(names);
		System.out.println(names);

		// Deuxièm exemple

		Consumer<String> consumerAffichage = s -> System.out.println(s);

		names.forEach(s -> System.out.println(s));
		names.forEach(consumerAffichage);
		System.out.println("*********");
		names.forEach(System.out::println);

		// Exemple avec méthode de référence à base de constructeur

		Supplier<StringBuilder> sb = () -> new StringBuilder("OCP");
		StringBuilder temp = sb.get();
		System.out.println(temp);

		Supplier<StringBuilder> s = StringBuilder::new; // constructor
		/******/

		// 1)Implementation par Lambda
		BiFunction<String, String, String> bf = (String prenom, String nom) -> {
			return prenom + " " + nom;
		};

		// 2)Implementation méthode référence via méthode d'instance sur une référence spécifique
		String prenom ="Amine ";
		String nom = "Mezghich";
		Function<String, String> bf2 = prenom::concat;
		
		System.out.println(bf2.apply(nom));
		System.out.println(bf2.apply("SS"));
		
		//4) Méthode de référence sur des instances à fixer au runtime
		
		Predicate<String>filter = (String ch)->{return ch.isEmpty();};
		Predicate<String>filter2 = String :: isEmpty;
		
		String alpha = "OCP";
		
		System.out.println(filter2.test(alpha));
		
		UnaryOperator<Integer>op = x-> x+2;
	}

}
