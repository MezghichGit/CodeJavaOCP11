package day12;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
public class ApiStream {

	public static void main(String[] args) {
		//LocalDate ld = LocalDate.of(2022, 12, 11);
		//UnaryOperator<String> op;
		
		// 1) Création de Stream
		//Stream<Integer> numbers = Stream.of(10,20,30);
		
		//Stream<Integer> numbers2 = Arrays.asList(10,20,30).stream();
		
		//Stream<Integer> numbers3 = Stream.empty();
		
		//Stream<Integer> numbers = Stream.iterate(10, x->x+2);
		//Stream<Double> numbers = Stream.generate(Math::random);
		//Stream<Integer> numbers = Stream.of(10,4,8,9,1,5);// 1 4 5 8 9 10
		//numbers.limit(3).sorted().forEach(System.out::println);
		
		//long nbr = numbers.sorted((a,b)->b-a).filter(x->(x>4)).peek(System.out::println).count();
		//System.out.println(nbr);
		//numbers.sorted((a,b)->b-a).forEach(System.out::println);
		// 2) Opérations intermédiaires
		
		// 3) Opérations terminales
		/*
		numbers.forEach(System.out::println);
		long nbr = numbers2.count();
		System.out.println(nbr);
		System.out.println(numbers3.count());*/
		
		//Stream<String> names = Arrays.asList("amine","mokhtar","emna","naoufel","salim").stream();
		//names.filter(s->s.contains("o"))
		//.map(x->x.toUpperCase())
		//.peek(System.out::println)
		//.map(x->x.length());
		//Stream<Integer> a = names.map(x->x.length());
		//a.forEach(System.out::println);
		
		//String result = names.reduce("",(x,y)->x+y+" ");
		//String result = names.reduce("",String::concat);
		/*Stream<String> names = Stream.empty();
		Optional<String> result = names.reduce(String::concat);*/
		//result.ifPresent(System.out::println);
		//System.out.println(result);
		
		//Correction exercice:
		/*Stream<String> names = Arrays.asList("amin","ali","aabb","salah","abc","aabb","amin").stream();
	    //names.filter(x->x.length()==4).sorted().forEach(System.out::println);
		//Set<String> res = names.filter(x->x.length()==4).sorted().collect(Collectors.toCollection(TreeSet::new));
		Set<String> res = names.filter(x->x.length()==4).distinct().sorted().collect(Collectors.toSet());
		System.out.println(res);*/
		
		//Stream<String> names = Arrays.asList("w","o","l","f").stream();  //sequentiel stream
		Stream<String> names = Arrays.asList("a","w","o","l","f","f","a","w","o","l","f","f").parallelStream();
		String res = names.reduce("", String::concat,String::concat);
		System.out.println(res);
		/*
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.parallelStream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);*/
		
        System.out.println("Normal...");
        
		IntStream range = IntStream.rangeClosed(1, 10); //[1,2,..,10]
        range.forEach(System.out::println);

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);

    }


	}
	

