package com.bridgelabz.functional;
import com.bridgelabz.utlity.utility;
public class twodarray 
{

	public static void main(String[] args) 
	{
		
    
      System.out.println("enter number of rows");
      int rows=utility.getInt();
      System.out.println("enter number of columns");
      int columns=utility.getInt();
       String arr[][] =new String[rows][columns];
       System.out.println("enter the elements");
       int j=0;
       for(int i=0;i<rows;i++)
		{
			for(j=0;j<columns;j++) 
			{
				arr[i][j]=utility.getString();
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
