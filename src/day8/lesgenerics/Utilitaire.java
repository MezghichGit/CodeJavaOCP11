package day8.lesgenerics;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Utilitaire {

	public static <T> void display(T t) {
		System.out.println(t);
	}

	public static <T> void transform(T t) {

		// System.out.println(t);
		// processing
	}

	public static void main(String[] args) {
		/*
		 * display(new String("OCP")); display(new Animal("Chien")); display(new
		 * Voiture("BMW"));
		 */
		
		BiConsumer<String,String>consumer = (s1,s2)->System.out.println(s1+s2);
		consumer.accept("oca-", "ocp");
		BiFunction<String, StringBuilder, Integer> app;

		app = (String ch1, StringBuilder ch2) -> ch1.length() + ch2.length();
		String s1 = "OCP";
		StringBuilder sb = new StringBuilder("OCA");
		System.out.println(app.apply(s1, sb));
		int x = 1;  //10 : base binaire
		System.out.println(x<<1);
	}

}
