package day12;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitivesStream {

	public static void main(String[] args) {
		/*
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.mapToInt(x -> x).sum()); 
		
		IntStream s = IntStream.of(1,2,3);
		System.out.println(s.sum()); */
		/*
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream = objStream.mapToInt(s -> s.length());*/
		/*
		Stream<String> names = Stream.generate(()->"meow");
		//boolean res = names.allMatch(String::isEmpty); //true
		boolean res = names.anyMatch(String::isEmpty);
		System.out.println(res);*/
		
		System.out.println(Stream.iterate(1, x->++x).limit(5).map(x->x+"").collect(Collectors.joining()));

	}

}
