package chapitre5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//1-Creating
		/*LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);*/
		//Date date = new Date();
		//System.out.println(date);
		/*
		LocalDate ld1 = LocalDate.of(2000, Month.APRIL, 10);
		LocalDate ld = LocalDate.of(2000, 4, 10);
		LocalTime lt = LocalTime.of(10,15);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		ZoneId zone = ZoneId.of("US/Eastern");
		System.out.println(ldt);
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zone);
		System.out.println(zdt);*/
		//2-Manipulating
		//System.out.println(ld.plusDays(2));
		//ld = ld.plusDays(2);
		//System.out.println(ld);
		
		//3-Formatting
		
		DateTimeFormatter ff = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		DateTimeFormatter fl = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		DateTimeFormatter fm = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter fs = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		/*
		//System.out.println(ldt);
		System.out.println(zdt.format(ff));
		System.out.println(fl.format(zdt));
		System.out.println(fm.format(zdt));
		System.out.println(fs.format(zdt));
		
		System.out.println(fm.format(ldt));
		System.out.println(fs.format(ldt));
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy--MMMM- hh:mm");
		System.out.println(myFormat.format(ldt));
		System.out.println(ZoneId.systemDefault()); */
	}

}
