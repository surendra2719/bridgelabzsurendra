package com.bridgelabz.algorithm;
import com.bridgelabz.utlity.utility;
public class Squarerootnon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
        System.out.println(" enter the value to find square root ");
        double c=utility.getDouble();
        System.out.println(" square root ofnumber is "+utility.squarertnon(c));
        
	}
catch(Exception e)
		{
	       System.out.println(" entered an integer value is  "+e.getMessage());
		}
}
}