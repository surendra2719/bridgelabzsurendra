package com.bridgelabz.algorithm;
import com.bridgelabz.utlity.*;
public class Dayofweek {
	public static void main(String[] args) 
	{
		int d, m, y;
		System.out.println("enter date in day month year");
		d = utility.getInt();
		m = utility.getInt();
		y = utility.getInt();
		System.out.println("day is "+utility.dayOfWeek(d, m, y));
	}
}
	


