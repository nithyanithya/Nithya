package org.bank;

import java.util.Scanner;

public class C {
	
	public static void main(String args[]){
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter mob no");
		int phnno =s.nextInt();
		
				if(phnno<=10){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	
	String s1= "Welcome to java class";
	
	boolean empty= s1.isEmpty();
	System.out.println(empty); 
	
	boolean startwith= s1.startsWith("class");
	 System.out.println(startwith);
	 
	
	}

	
	
	
	

}
