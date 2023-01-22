package day11.StreamObject;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.Comparator;
public class ExempleStream {

	public static void main(String[] args) {
		// Exemple 1
		 /*Comparator<Integer> comp = (a,b)->a-b;
		 Stream<Integer> numbers = Stream.of(10,12,4);
		 
		 Optional<Integer>res = numbers.min(comp);*/
		 
		 
		// System.out.println(numbers.count()); //count : operation terminal
		// numbers.forEach(System.out::println); // forEach : operation terminal
		/*
		List<String> formations = Arrays.asList("OCA 8", "OCP 8", "OCP 11", "Spring", "Angular");

		Stream<String> courses = formations.stream(); // creation de stream à partir d'une liste
		Predicate<String> critere = s -> s.contains("P");

		long nbre = courses.filter(critere).peek(System.out::println).count(); // affichage du contenu du stream
		System.out.println(nbre);*/
		
		// Stream<Double> randoms = Stream.generate(Math::random);
		// randoms.limit(10).forEach(System.out::println);
		 
		 Stream<Integer> col = Stream.iterate(10, x->x*2);
		 //col.limit(10).forEach(System.out::println);
		 System.out.println(col);
	}

}
