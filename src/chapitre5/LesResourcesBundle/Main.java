package chapitre5.LesResourcesBundle;

	import java.text.MessageFormat;
import java.util.*;
	public class Main {
		public static void main(String[] args) {
			
			/*
			System.out.println(System.getProperty("file.separator"));
			System.out.println(System.getProperty("java.home"));
			System.out.println(System.getProperty("user.dir"));*/
			
			
			
			//Locale us = new Locale("en");
			//ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
			
			/*Set<String> keys = rb.keySet();
			System.out.println(keys);
			
			keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);*/
			
			//System.out.println(rb.getString("open2"));
			
			/*Properties props = new Properties();
			rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
			System.out.println(props);
			
			System.out.println(props.getProperty("open"));
			System.out.println(props.getProperty("open2")); // null
			System.out.println(props.getProperty("open2","Aucun")); // Aucun*/
			
			/*Properties p =
		            new Properties(System.getProperties());
			System.out.println(p);*/
			
			Locale us = new Locale("en", "US");
			printProperties(us);
			
			/*Locale us = new Locale("en", "US");
			Locale france = new Locale("fr", "FR");
			
			
			System.out.println();
			printProperties(france);*/
			
			ResourceBundle rb = ResourceBundle.getBundle("Formation");
			String val = rb.getString("formation");
			System.out.println(MessageFormat.format(val, "11","OCA"));
			
			
			}
		public static void printProperties(Locale locale) {
			//System.out.println(System.getProperty("open"));
			ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
			System.out.println(rb.getString("hello"));
			//System.out.println(rb.getString("open"));
			}
		}


