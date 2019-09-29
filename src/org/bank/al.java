package org.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class al {
	public static void main(String args[]){
				
	List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
	System.out.println(li);	
		
//First  index value of 10 		
	int l= li.indexOf(10);
		System.out.println(l);
//Last index of 10	
		
	int l1= li.lastIndexOf(10);
		System.out.println(l1);
		
//LAst index of 50	
	int l2= li.lastIndexOf(50);
		System.out.println(l2);
		
//value present at 8th index
	Integer in = li.get(2);
	System.out.println(in);
	
//Get the each value of list by using normal for loop	  
		for(int i=0; i<=li.size(); i++ ){
			System.out.println(li.get(i));
		}
	}

}
