package sip_groupe.day2_15102022;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class OCP {

	public static void main(String[] args) {

		
		
		String pattern ="#,###,000.0#";//OK, res = <005.21> <008.49> <1,234.0>
		//String pattern = "##.#"; // Non, res = <5,2> <8,5> <1234>
	    //String pattern = "0,000.0#"; //Non, res = <0 005,21> <0 008,49> <1 234,0>
		//String pattern =  "#,###.0"; // Non, res = <5,2> <8,5> <1 234,0>
		var message = DoubleStream.of(5.21, 8.49, 1234)
		.mapToObj(v -> new DecimalFormat(pattern).format(v))
		.collect(Collectors.joining("> <"));
		System.out.println("<"+message+">");
		/*
		double lightSpeed = 299792458.22;
		DecimalFormat df = new DecimalFormat(",##");
        System.out.println(df.format(lightSpeed)); //299,792,458*/

	}

}
