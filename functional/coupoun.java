package com.bridgelabz.functional;

import java.util.ArrayList;
import java.util.Random;

import com.bridgelabz.utlity.utility;

public class coupoun {

	public static void main(String[] args) {
		System.out.println("enter distict coupoun number ");
		int n= utility.getInt();
	ArrayList<Integer> a1=new ArrayList();
		
			int count=0;
			for(int i=1;i<=n;i++)
			{
				Random random = new Random();
				int coup=random.nextInt(n);
				System.out.println(coup);
				count++;
				if(!a1.contains(coup))
					{
					   a1.add(coup);  
						}
				else
					i--;
				
			}
	
	     System.out.println("enter distinct random numbers");
	     for(Integer k:a1)
         System.out.println(k);	 
	     System.out.println("total of all distict number is"+count);
	    	 
	}
}
	

