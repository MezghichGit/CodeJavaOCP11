package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(22,"amine",19.5);
		Etudiant e2 = new Etudiant(21,"mokhtar",19.5);
		Etudiant e3 = new Etudiant(25,"ali",10.5);
		
		List<Etudiant>students = new ArrayList<>();
		students.add(e1);
		students.add(e2);
		students.add(e3);
		//Collections.sort(students);
		//System.out.println(students);
		
		//Anonymos inner class
		Comparator<Etudiant> cmpAge = new Comparator<Etudiant>() {
			
			public int compare(Etudiant e1, Etudiant e2)
			{
				return e2.age-e1.age;
			}
		};
		
		
		Comparator<Etudiant>cmpMoy =(Etudiant a, Etudiant b)->
		{return (int)(b.moy-a.moy);};
		Collections.sort(students,cmpAge);
		System.out.println(students);
		
		Collections.sort(students,cmpMoy);
		System.out.println(students);
	}

}
