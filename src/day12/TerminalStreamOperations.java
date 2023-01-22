package day12;

import java.util.Arrays;
import java.util.stream.Stream;

public class TerminalStreamOperations {

	public static void main(String[] args) {
		//Stream finie
		/*
		Stream<Integer>stream = Arrays.asList(10,7,5,8).stream();
		//boolean res = stream.allMatch(x->(x%2==0));
		//boolean res = stream.anyMatch(x->(x%2==0));
		boolean res = stream.noneMatch(x->(x%2==0));
		System.out.println(res);*/
		
		//Stream infine
		Stream<String>stream = Stream.generate(()->"OCP");
		boolean res = stream.peek(System.out::println).allMatch(x->x.startsWith("a"));
		//stream.forEach(System.out::println);
		System.out.println("Fin du programme...");

	}

}
