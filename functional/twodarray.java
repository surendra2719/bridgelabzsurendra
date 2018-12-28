package com.bridgelabz.functional;
import java.util.Scanner;
import java.util.*;
public class twodarray 
{

	public static void main(String[] args) 
	{
		
      Scanner scan = new Scanner(System.in);
      System.out.println("enter number of rows");
      int rows=scan.nextInt();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of columns");
      int columns=sc.nextInt();
       String arr[][] =new String[rows][columns];
       System.out.println("enter the elements");
       int j=0;
       for(int i=0;i<rows;i++)
		{
			for(j=0;j<columns;j++) 
			{
				arr[i][j]=sc.next();
			}
			
		}
			for(int i=0;i<rows;i++)
			{
				for( j=0;j<columns;j++) 
				{
					System.out.print(arr[i][j]+" ");
				}
			
				System.out.println();
			
			
      
      
      
	}

	}
}
