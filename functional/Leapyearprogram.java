package com.bridgelabz.functional;
import  com.bridgelabz.utlity.*;

public class Leapyearprogram
{
	public static void main(String[]args)
{
System.out.println("enter the year to check it is leapyear or not ");
String s1=utility.getString();
	int year=Integer.parseInt(s1);
if(s1.length()>=4)
{
	if(year%4==0)
	
		
	System.out.println(year +"is a leap year");
	
	
	else
	
		System.out.println(year +"is a not leap year");	
		
}
	else
		System.out.println("enter year format in yyyy format");
}


}
