package com.bridgelabz.algorithm;
import com.bridgelabz.utlity.*;
public class Tempconver 
{
				public static void main(String[] args) 
				{
				try 
				{
					System.out.println("enter temp in c or f");
					int tem = utility.getInt();
					char t = utility.getString().charAt(0);
					if (t != 'f' && t != 'F' && t != 'c' && t != 'C') 
					{
						System.out.println("enter correct input");
						main(args);
						return;
					}
					tem = utility.TemperatureConversion(tem, t);
					System.out.println("coverted temp is " + tem);
				} 
				catch (Exception e) 
				{
					System.out.println("temperature in format 4545 c");
				}

			}
		}