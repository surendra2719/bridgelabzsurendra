package com.bridgelabz.functional;

import com.bridgelabz.utlity.utility;

public class Distanceprogram {
	public static void main(String[] args) {
		System.out.println(" enter the value of a ");
		double a=utility.getDouble();
		System.out.println(" enter the value of b ");
		double b=utility.getDouble();
		double distance = utility.dist(a, b);
		System.out.println("distance between  point(a,b) and origin is" +distance  );
	
	}

}
