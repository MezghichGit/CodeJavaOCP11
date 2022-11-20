package day8.lesBounds;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

import day8.lesgenerics.Animal;
import day8.lesgenerics.Container;

public class App {

	/*public static void display(List<?>list) //Unbounded
	{
		
	}*/
	
	/*public static void display(List<? extends A>list) //Uppder bound
	{
		
	}*/
	public static void display(List<? super B>list) //Lower bound
	{
		
	}
	
	public static void affichage(Container<? extends A> v)
	{
		
	}
	public static void main(String[] args) {
		Integer x;
		display(new ArrayList<B>());
		//display(new ArrayList<C>());
		display(new ArrayList<A>());
		
		affichage(new Container<A>());
		affichage(new Container<B>());
		//affichage(new Container<Animal>());
		


	}

}
