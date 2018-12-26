package com.bridgelabz.functional;
import com.bridgelabz.utlity.*;
public class Harmonicnumber 
{
public static void main(String[] args)
{
	System.out.println("enter the nth number");
	int n = utility.getInt();
	float sum =0;
	for(int i=1;i<=n;i++)
	{
		sum= sum+(float)1/i;
	}
	System.out.println("nth harmonic number is"+ sum);
	
}
}
