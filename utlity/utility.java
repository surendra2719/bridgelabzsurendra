package com.bridgelabz.utlity;
import java.util.Scanner;
import java.util.Random;
public class utility 
{
	static Scanner sc = new Scanner(System.in);
		public static int getInt()
		{
		int integerValue = sc.nextInt();
		return integerValue;
		}
		public static double getDouble()
		{
		double doubleValue = sc.nextDouble();
		return doubleValue;
		}
		public static String getString()
		{
		String stringValue = sc.nextLine();
		return stringValue;
		}
		public static double getRandomvalue()
		{
		Random random = new Random();
		double Random = random.nextDouble();
		return Random;
		}
}

