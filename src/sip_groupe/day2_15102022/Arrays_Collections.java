package sip_groupe.day2_15102022;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arrays_Collections {

	public static void main(String[] args) {
		/*
		int tab[]= new int[3];
		tab[0]=2;
		tab[1]=3;
		tab[2]=-1;
		
		int [] tab2 = {10,3,14};
		
		for(int i=0; i<tab2.length; i++)
		{
			System.out.println(tab2[i]);
		}
		System.out.println("###");
		//Arrays.sort(tab2);
		for(int e : tab2)
		{
			System.out.print(e+"\t");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(tab2, 10));*/
		
		/*for(int e : tab2)
		{
			System.out.println(e);
		}*/
		/*
		List<String> names = new ArrayList<>();
		names.add("Emna");
		names.add("Achraf");
		names.add("Dhia");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		Collection<String> noms;*/
		LocalDate date = LocalDate.now();
		LocalDate dateAnniversaire = LocalDate.of(2000, Month.APRIL, 20);
		//System.out.println(date);
		//System.out.println(dateAnniversaire);
		//System.out.println(dateAnniversaire.plusDays(2));
		//System.out.println(dateAnniversaire);
		System.out.println(date);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f.format(date));
		System.out.println(date.format(f));
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		DateTimeFormatter fdt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(datetime.format(fdt));
		
		
		
		
		
	}

}
