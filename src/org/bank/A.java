package org.bank;

public class A {

	public static void main(String args[]){
		 String s1 = "Greens Technology";
		 int length = s1.length();
		 System.out.println(length);
		 
		 String s2 ="Selenium Automationtool";
		char charat=s2.charAt(3);
		 System.out.println(charat);
		 
		 boolean startwith= s2.startsWith("e");
		 System.out.println(startwith);
		 
		 boolean endswith= s2.endsWith("ol");
		 System.out.println(endswith);
		 
		 //Compare
		 String s3="Greens";
		 String s4= "greens";
		 boolean equals= s4.equals(s3);
		 System.out.println(equals);
		 boolean equalsignorecase= s4.equalsIgnoreCase(s3);
		 System.out.println(equalsignorecase);
		 
	boolean empty= s1.isEmpty();
	System.out.println(empty); 
	
	String trim = s2.trim();
	System.out.println(trim);
	
	int indexof = s2.indexOf("A");
	System.out.println(indexof);
	
	int lastindexof = s2.lastIndexOf("o");
	System.out.println(lastindexof);
	
	//substring
	String substring = s2.substring(2,4);
	System.out.println(substring);
	
	String [] split = s2.split("  ");
for(int i=0; i<split.length; i++){
	System.out.println(split[i]);
}
	//Enhance for
for(String x:split){
	System.out.println(x);
}


	}
	
}
