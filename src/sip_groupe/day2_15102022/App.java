package sip_groupe.day2_15102022;
public class App {

	public static void main(String[] args) {

		String ch1 = "OCA"; // pool
		String ch2 = new String("OCA"); // heap

		System.out.println(ch1 == ch2); // false
		System.out.println(ch1.equals(ch2)); // true
		String ch3 = "OCA";
		System.out.println(ch1 == ch3);

		/*
		 * Animal a1 = new Animal(); //heap Animal a2 = new Animal(); //heap
		 * 
		 * //System.out.println(a1); System.out.println(a2);
		 * System.out.println(a2.toString());
		 * 
		 * /*System.out.println(a1==a2); a1.id=10; a2.id=10;
		 * System.out.println(a1.equals(a2));
		 */

	}

}
