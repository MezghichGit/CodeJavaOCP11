package day9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class LesCollections {

	public static void main(String[] args) {
		//Collection cl;
		/*List<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		//list.remove(1);  // 1 represente l'indice de l'objet
		//list.remove(new Integer(2));
		list.remove(list.indexOf(2));
		System.out.println(list);*/
		
		// Exemple 1) HashSet
		/*Set<Integer> set = new HashSet<>();
		//List<Integer> set = new ArrayList<>();
		boolean b1 = set.add(66); // true
		boolean b2 = set.add(10); // true
		boolean b3 = set.add(66); // false
		boolean b4 = set.add(8); // true
		for (Integer integer: set) 
			System.out.print(integer + ","); // 66,8,10,*/
		
		// Exemple 2) TreeSet
		/*Set<Integer> set = new TreeSet<>();
				//List<Integer> set = new ArrayList<>();
				boolean b1 = set.add(66); // true
				boolean b2 = set.add(10); // true
				boolean b3 = set.add(66); // false
				boolean b4 = set.add(8); // true
				for (Integer integer: set) 
					System.out.print(integer + ","); // 8,10,66,*/
		
		//Exemple 3)TreeSet sur Etudiant
		/*
		Etudiant e1 = new Etudiant("Alain",22,18.5);
		Etudiant e2 = new Etudiant("Patrick",21,16.5);
		Etudiant e3 = new Etudiant("Mourad",20,19.5);
		
		Set<Etudiant> students = new TreeSet<>();
		students.add(e1);
		students.add(e2);
		students.add(e3);
		System.out.println(students);*/
		
		/*Queue<Integer> queue = new ArrayDeque<>(); // case of queue
		System.out.println(queue.offer(10)); // true
		System.out.println(queue.offer(4)); // true
		System.out.println(queue.peek()); // 10
		System.out.println(queue.poll()); // 10
		System.out.println(queue.poll()); // 4
		System.out.println(queue.peek()); // null*/
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		//stack.add(null); //exception
		
		//stack.push(10);  // stack devient une pile
		//stack.push(4);
		//stack.add(40);
		stack.add(null);
		/*System.out.println(stack.peek()); 
		System.out.println(stack.poll()); 
		System.out.println(stack.poll()); 
		System.out.println(stack.peek()); */ 
	}

}
