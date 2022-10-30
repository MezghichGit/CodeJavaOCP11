package sip_groupe.day2_15102022;

import java.util.ArrayList;

public class UseFormation {

	public static void main(String[] args) {
		ArrayList<String> chapters = new ArrayList<>();
		chapters.add("Advanced class design");
		chapters.add("Concurrency");
		chapters.add("Functionnal Progreamming");
		
		//System.out.println(chapters);
		
		//String ch = new String("OCP");
		 Formation f = new Formation("OCP", chapters);
		 System.out.println(f.getChapitres());
		 ArrayList<String> data = f.getChapitres();
		 data.clear();
		 System.out.println(f.getChapitres());
		 
		 chapters.clear();
		 System.out.println(chapters);
		 System.out.println(data);
		 System.out.println(f.getChapitres());

	}

}
