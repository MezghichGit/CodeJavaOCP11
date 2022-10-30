package day4.Override_ToString_Equals_HashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ExempleHashSet_TreeSet {

	public static void main(String[] args) {
		
		Map<Integer,String> annuaire = new HashMap<>();
		annuaire.put(98787521, "Amine");
		annuaire.put(51363634, "Amine");
		annuaire.put(20255555, "Ali");
		
		System.out.println(annuaire);
		
		
		List<Integer> tab = new ArrayList<>();
		tab.add(20);
		tab.add(3);
		tab.add(14);
		tab.add(3);
		/*
		Set<Integer> tab = new HashSet<>();
		tab.add(20);
		tab.add(3);
		tab.add(14);
		System.out.println(tab.add(3));*/
		
		System.out.println(tab);

	}

}
