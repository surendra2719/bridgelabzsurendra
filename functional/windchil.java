package com.bridgelabz.functional;

import com.bridgelabz.utlity.utility;

public class windchil {

	public static void main(String[] args) {
	System.out.println("enter the value of t and v");
	double t=utility.getDouble();
	double v=utility.getDouble();
	double w=utility.windchil(t, v);
	System.out.println("temparature ="+t);
    System.out.println("wind speed ="+v);
    System.out.println("wind chill ="+w); 
	}

}
