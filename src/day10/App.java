package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		//Map<String,String>names = new HashMap<>();
		//Map<String,String>names = new LinkedHashMap<>();
		Map<String,String>names = new TreeMap<>();
		names.put("mohamed", "mrad");
		names.put("mokhtar", null);
		names.put("marouen", "achbari");
		//names.put(null, "achbari");
		//names.put(null, "aa");
		//names.put("mohamed", null);
		//System.out.println(names.remove("mohamed"));
		Set<String> keys = names.keySet();
		System.out.println(keys);
		Collection<String> values = names.values();
		System.out.println(values);
		
		
		
		System.out.println(names);
		
		//Set<String>obj = new LinkedHashSet<>();
		Set<String>obj = new HashSet<>();
		obj.add("Peter");
		obj.add("alain");
		obj.add("person");
		System.out.println(obj);

	}

}
