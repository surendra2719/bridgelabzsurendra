package com.bridgelabz.functional;

import com.bridgelabz.utlity.utility;

public class stringpermutation {


	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	private static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
		}
	}

	// generate all permutations of a String in Java
	public static void main(String[] args)
	
	{    System.out.println("enter the strind value");
		String s = utility.getString();
		permutations(s.toCharArray(), 0);
	}
}