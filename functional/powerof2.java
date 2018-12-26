package com.bridgelabz.functional;

import com.bridgelabz.utlity.utility;

public class powerof2 {

	public static void main(String[] args) 
	{
	System.out.println("enter the power");
	int power = utility.getInt();
	if(power==0)
	{
		System.out.println(1);
		
	}
	for(int i=1;i<=power;i++)
	{
	System.out.println((int)Math.pow(2,i));	
	}
	}

}
