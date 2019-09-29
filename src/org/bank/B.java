package org.bank;

import java.util.Scanner;

public class B {
	public static void main(String args[]){
		
		String s= "nisha";
		String s1= "Nisha";
		boolean equalsIgnoreCase= s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
	
	Scanner s2 = new Scanner(System.in);

	System.out.println("enter email");	
	String email=s2.next();	
	
	if(email.contains("@")){
		System.out.println("@ is there");
	}
	else{
		System.out.println("@ is not there");
	}
	
	String s3= "Welcome to java class";
	boolean empty= s3.isEmpty();
	System.out.println(empty); 
	boolean startwith= s3.startsWith("wel");
	 System.out.println(startwith);

	boolean endswith= s3.endsWith("class");
	 System.out.println(endswith);
	 
	}
	
}
