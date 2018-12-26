package com.bridgelabz.functional;
import com.bridgelabz.utlity.*;
public class Replacestring 
{
	public static void main(String[] args)
	{
	System.out.println("enter user name");
	String s1= utility.getString();
	String stringTemplate="Hello <<username>>,How are you";
	if(s1.length()>=3)
	{
		
		String s2= stringTemplate.replace("<<username>>",s1);
		System.out.println(s2);
		
	}
	else
	{
	 System.out.println("enter more than three characters");
	 
	}
	
	}
}
