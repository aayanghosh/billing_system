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


    	
    
    
    