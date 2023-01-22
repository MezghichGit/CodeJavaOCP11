package day10;
import java.util.*;
import java.util.function.BiFunction;
public class ExempleAvecMerge {

	public static void main(String[] args) {
		BiFunction<String,String,String>mapper = 
				(String v1,String v2)->{
					//return v1.length()>v2.length()?v1:v2;
					return v1.concat(v2);
					};
		
		Map<String,String> favorites = new HashMap<>();
		favorites.put("amine","java");
		favorites.put("salah","c++");
		favorites.put("ali","javascript");
		System.out.println(favorites.merge("amine","spring",mapper));
		
		System.out.println(favorites);
		
		Map<String,? extends Number> numbers = new HashMap<String,Double>();
		numbers = new HashMap<String,Long>();
		
		List<String>l = new ArrayList<String>();
		
		TreeSet<String> col = new TreeSet<>();
		col.add("one"); //
		col.add("One");//
		col.add("ONE");
		col.add("OnE");//
		System.out.println(col.ceiling("On"));

	}

}
