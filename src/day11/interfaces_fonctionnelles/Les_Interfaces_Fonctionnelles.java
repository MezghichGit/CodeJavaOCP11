package day11.interfaces_fonctionnelles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Les_Interfaces_Fonctionnelles {

	public static void main(String[] args) {
		// 1-Supplier
		/*
		Supplier<LocalDate> s1 = LocalDate::now;
		
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		System.out.println(s1);
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		System.out.println(d1);
		System.out.println(d2); 
		
		Supplier<List<String>>formationsSIP = ()->Arrays.asList("OCA","OCP","DEVOPS");

		System.out.println(formationsSIP.get());
		System.out.println(formationsSIP);
		
		*/
		
		// 2- Consumer & BiConsumer
		/*
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		c2.accept("Annie");
		Arrays.asList("OCA","OCP","Agile","DEVOPS").forEach(c2);
		List<String>ls = new ArrayList<>();
		ls.add("OCA");
		
		//List<String>ls2 = List.of(null);*/
		/*
		BiConsumer<String,String> nomComplet = 
				(String nom, String prenom)->System.out.println(prenom+" "+nom);
				
				nomComplet.accept("MEZGHICH", "Mohamed Amine");*/
		
		//Also called special void compatibility rule in the JLS
		/*
		BiConsumer<String,String> nomComplet2 = String::concat;
		nomComplet2.accept("Mohamed Amine ", "MEZGHICH");
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		System.out.println(map);
		
		Predicate<String> filter = (String ch)->true;
		
		BiConsumer<String,String> a=(String m,String n)-> {
			 System.out.println(m.concat(n));
		};

		a.accept("aaa","bbbbb");*/
		
		// 3-Predicate & BiPredicate
		
		//BiPredicate<String, String> filter = (text, keyword) -> text.contains(keyword);
		BiPredicate<String, String> filter = String::contains;
		
		String chaine="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		String keyword = "dummy";
		//filter.test(chaine, keyword);
		System.out.println(filter.test(chaine, keyword));
		Predicate ex4 = (Object obj)->true; 
	}

}
