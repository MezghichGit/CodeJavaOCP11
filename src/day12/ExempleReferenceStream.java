package day12;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ExempleReferenceStream {

	public static void main(String[] args) {
		
		System.out.println("Sequetiel Stream");
		/*Stream<String> namesv1 = Arrays.asList("amine","ali","salah","mokhtar","aa","aa").stream();
		Optional<String>optv1 = namesv1.findAny();
		optv1.ifPresent(System.out::println);*/
		//DoubleStream salairesv1 = DoubleStream.of(3000,4000,2500.5,1800);
		//double res1 = salairesv1.sum();
		Stream<Integer> s1 = Arrays.asList(12,14,15,18,3).stream();
		Integer res = s1.peek(System.out::println).reduce(0, (x,y)->x+y);
		System.out.println(res);
		
		
		System.out.println("Parallel Stream");
		//DoubleStream salairesv2 = DoubleStream.of(3000,4000,2500.5,1800);
		//DoubleStream salairesv3 = salairesv2.parallel();
		//double res2 = salairesv3.sum();
		/*Stream<String> namesv2 = Arrays.asList("amine","ali","salah","mokhtar","aa","aa").parallelStream();
		Optional<String>optv2 = namesv2.findAny();
		optv2.ifPresent(System.out::println);*/
		Stream<Integer> s2 = Arrays.asList(12,14,15,18,3).parallelStream();
		Integer res2 = s2.peek(System.out::println).reduce(0, (x,y)->x+y, (u,v)->(u+v));
		System.out.println(res2);
	}

}
