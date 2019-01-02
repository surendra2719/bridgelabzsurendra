package com.bridgelabz.algorithm;

import com.bridgelabz.utlity.utility;

public class Monthlypack {

	public static void main(String[] args)
	{
		System.out.println("enter principal,year,rate");
		double p=utility.getDouble();
		double y=utility.getDouble();
		double r=utility.getDouble();
		utility.monthlypack(p, y, r);
		// TODO Auto-generated method stub
		System.out.println("monthlypack is"+utility.monthlypack(p, y, r));

	}

}
