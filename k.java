package com.aayan.example;
import java.text.DecimalFormat;
import java.util.*;
public class k {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		billing user = new billing();
		user.listproduct();
		total += user.product();	
		System.out.println("\nDo you want to buy anything else ?");
	String s = sc.nextLine();

	while(s.equals("yes")) {
		total += user.product();
		System.out.println("\nDo you want to buy anything else ?");
		 s = sc.nextLine();
		
	}
	DecimalFormat numberFormat = new DecimalFormat("#.00");
	System.out.println("\nhere is you total "+numberFormat.format(total));
	sc.close();
	}
}