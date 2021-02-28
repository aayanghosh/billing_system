package com.aayan.example;
import java.util.Scanner; 
public class billing {
	Scanner sc = new Scanner(System.in);
	String products[] = {"Iphone","TV","laptop"} ;
	double arr[] = {299.99,499.99,399.99};
	
	public void listproduct () {
		for(int i=0;i<3;i++) {
			System.out.println(i + " " + products[i] + " " + arr[i]);
		}
	}
	
    public double product () { 	
			System.out.println("\nplz enter the product number");
			int pn = sc.nextInt();
			
			
			return arr[pn]; 
    }
    
}


    	
    
    //this is the second class
    
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
