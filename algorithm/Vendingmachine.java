package com.bridgelabz.algorithm;


import com.bridgelabz.utlity.utility;

public class Vendingmachine {

	
				
				static int I, TOTAL;
			
				static int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };
				
				
				static void notes(int value) 
				{
					if (value / NOTES[I] != 0) 
					{
						TOTAL += (value / NOTES[I]);
						System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
						value = value % NOTES[I];
					}
					I++;
					if (value == 0) 
					{
						System.out.println("total notes :" + TOTAL);
						return;
					}
					notes(value);
				}
				public static void main(String[] args) 
				{
					try 
					{
						System.out.println("enter amoumt");
						int value = utility.getInt();
						notes(value);
						} 
					catch (Exception e) 
					{
						System.out.println("enter value in integer");
					}
				}
			}
