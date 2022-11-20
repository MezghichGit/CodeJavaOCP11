package day8.lesgenerics;

import java.util.ArrayList;

public class Container<T> {
	
	//T [] contenus;
	ArrayList<T> contenus = new ArrayList<>();
	
	public void add(T t)
	{
		this.contenus.add(t);
	}
	
	public void displayData()
	{
		System.out.println(this.contenus);
	}
	

}
