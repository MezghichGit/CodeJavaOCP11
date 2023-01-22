package chapitre5;

import java.util.Locale;

public class ManipulationLocale {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale l = new Locale("en","US");
		Locale.setDefault(l);
		System.out.println(Locale.getDefault());
		
		Locale gr = Locale.GERMANY;
		System.out.println(gr);
		/*Locale l = new Locale("en");
		Locale.setDefault(l);
		
		System.out.println(Locale.getDefault());*/
		
		Locale l2 = new Locale.Builder().setLanguage("fr").setRegion("CA").build();
		System.out.println(l2);

	}

}
