package chapitre5;

import java.util.*;

public class ZooOpen {
	public static void main(String[] args) {
		Locale us = new Locale("en", "US");
		//Locale france = new Locale("fr", "FR");
		
		printProperties(us);
		
		//System.out.println();
		//printProperties(france);
	}

	public static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		//Locale us = new Locale("en", "US");
		
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
		//System.out.println(rb.getString("close"));
		//System.out.println(rb.getString("author"));
		
		
		//ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		
		//Set<String> keys = rb.keySet();
		//keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
		
		/*
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		
		System.out.println(props.getProperty("hello2"));
		System.out.println(props.getProperty("hello2", "Autre valeur"));*/
		/*
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
		System.out.println(rb.getString("close"));
		System.out.println(rb.getString("author"));*/
	}
}