package day12;
import java.util.*;
import java.util.stream.Stream;
public class IntermediateOperations {

	public static void main(String[] args) {
		/*List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");*/
		/*
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("","Mama Gorilla", "Baby Gorilla");
		
		Stream<List<String>> animals = Stream.of(zero, one, two);
		
		//Stream<String> animals = Stream.of();
		
		animals.flatMap(x->x.stream()).filter(x->x.length()>1).forEach(System.out::println);
		//animals.flatMap(l -> l.stream()).forEach(System.out::println);
		*/
		   // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4","1", "2.3");
  
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);

	}

}
