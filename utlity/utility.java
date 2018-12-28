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
		
		public static void primeFactor(int number)
	{
			for(int i=1;i<=number;i++)
		{
				int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				while(number%i==0)
				{
					System.out.println(i);
				number=number/i;
			    }
			}
		}
     }
		
	public static void roots(double a, double b,double c)
	{
		double delta = ((b*b)-(4*a*c));
		double root1 = (-b+(Math.sqrt(delta))/(4*a));
		double root2 = (-b-(Math.sqrt(delta))/(4*a));
		System.out.println(" first root of equation is "+ root1);
		System.out.println(" second root of equation is "+ root2);
}
		
	public static double dist(double a, double b)
	{
		double distance =Math.sqrt(((Math.pow(a, 2))+(Math.pow(b, 2))));
		return distance;
	}
	public static double windchil(double t, double v)
	{
		double w=35.74+0.6215+(0.4275*t-35.75)*Math.pow(v,0.16);
		return w;
	}
	public static char[] Tochararray(String s2) {
		// TODO Auto-generated method stub
		return null;
	}
	public static char[] covertionOfStringToCharacterArray(String s1) 
	{
		char[] c1 = s1.toCharArray();
		return c1;
	}
}



