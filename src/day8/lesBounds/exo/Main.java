package day8.lesBounds.exo;

import java.util.ArrayList;
import java.util.List;
import day8.lesBounds.*;
public class Main {

	
	
	// Cas 1 : List de Object
	/*
	public static void addSound(List<Object>list)
	{
		list.add("Quak");
		list.add(true);
	}*/
	
	// Cas 2 : Unbounded are immutable
	/*public static void addSound(List<?>list)
	{
		list.add("Quak");
		list.add(true);
		
		// traitement sur des String : toUpperCase(pour les string Seulement)
	}*/
	// Cas 3 : upper bound are immutable
	/*public static void addSound(List<?extends Object>list)
	{
		//list.add("Quak");
		//list.add(true);
		//Object obj;
		//list.set(0, obj);
		
		//return new ArrayList(list);
		// traitement sur des String : toUpperCase(pour les string Seulement)
	}*/
	
	// Cas 4 : lower bound are immutable
		public static void addSound(List<?super String>list)
		{
			list.add("Quak");
			//list.add(new Object());
			//list.add(true);
			//Object obj;
			//list.set(0, obj);
			
			//return new ArrayList(list);
			// traitement sur des String : toUpperCase(pour les string Seulement)
		}
		
		
		public static void add(List<? super C> list)
		{
			list.add(new C());
			list.add(new D()); //dans D il y a un C
		}
	
		/*public static void add(List<? extends A> list)
		{
			list.add(new A());
			
			//traitement sur les méthodes de C
		}*/
	public static void main(String[] args) {
		
		List<B> lb = new ArrayList<>();
		List<A> la = new ArrayList<>();
		List<C> lc = new ArrayList<>();
		add(lb);
		add(la);
		add(lc);
		List<D>ld = new ArrayList<>();
		//add(ld);
		/*ArrayList<String> l1 = new ArrayList<>();
		ArrayList<Object> l2 = new ArrayList<>();
		addSound(l1);
		addSound(l2);*/
		
		/*List<String>names = new ArrayList<>();
		names.add("abc");*/
		
		//List<?>names = new ArrayList<>();
		//names.add("abc");  //Unbounded are immutable
	}

}
