package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//Part 1 : Rappel sur OCA(List, ArrayList, Tableau)
		/*
		List<Integer>list = new ArrayList<>();
		list.add(10); // Autoboxing, Boxing implice
		list.add(new Integer(14));
		int x = list.get(1); //Unboxing
		int tab[] = new int[2]; // primitive type
		String ch = "OCP 11";
		String names[] = {"amine","ali"};
		////////
		System.out.println(list.size());
		System.out.println(tab.length);
		System.out.println(names.length); //property(attribut public)
		System.out.println(ch.length()); // method
		*/
		
		//Part 2 : Passage de List vers Tableau et Vise versa
		/*String names[] = {"Nacer","Mokhtar"};
		List<String> list = Arrays.asList(names);
		
		//list.add("amine");   //UnsupportedOperationException
		list.set(0, "amine");
		System.out.println(list);
		for(String name: names)
		{
			System.out.print(name+"\t");
		}*/
		/*
		List<String> names = new ArrayList<>();
		names.add("amine");
		names.add("ali");
		
		//String tab[] = names.toArray(new String[names.size()]);
		Object tab[] = names.toArray();
		//System.out.println(tab.length);
		//System.out.println(tab.length);
		for(Object s : tab)
		{
			String temp = (String) s;
			System.out.println(temp.toUpperCase());
		}
		
		
		names.add("mokhtar");
		System.out.println(names);
		*/
		
		//Part 3 : sort et binarySearch(recherche dichotomique)
		/*
		int moy[] = {9,4,14,19,7};
		Arrays.sort(moy);
		for(int e : moy)
		{
			System.out.print(e+"\t");
		}
		System.out.println();
		List<Integer> list = Arrays.asList(9,4,14,19,7);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);*/
		// Remarque : il faut que le tableau soit trié
		/*
		int tab[]= {4,8,20,30};
		//int tab[]= {30,8,3,20,4}; //cas de tableau non trié : Surprise
		System.out.println(Arrays.binarySearch(tab, 40));
		List<Integer> list = Arrays.asList(4,8,20,30);
		System.out.println(Collections.binarySearch( list, 40));
		*/
		
		//Diamond operator
		// avant java 5
		///List list = new ArrayList();
		// a partir de la version 5
		////List <String>list = new ArrayList<String>();
		// a partir de la version 7
		List <String>list = new ArrayList<>();
		list.add("amine");
		list.add("true");
		list.add("10");
		System.out.println(list);
		for(Object obj : list)
		{
			String ch = (String)obj;
		}
	}
	

}
