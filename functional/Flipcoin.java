package com.bridgelabz.functional;
import com.bridgelabz.utlity.*;
public class Flipcoin 
{

	public static void main(String[] args) 
	{
	   float tails=0;
       float heads=0;
       System.out.println("enter the number of times to flip the coin");
       int flip = utility.getInt();
       for(int i=1;i<=flip;i++)
       {
    	   System.out.println(utility.getRandomvalue());
    	   if(utility.getRandomvalue()>0.5)
    	   {
    		   heads++;
    	   }
    	   else
    	   {
    		   tails++;
    		   
    	   }
       }
    	   System.out.println("the percent of heads is "+(heads/flip)*100 + "%");
    	   System.out.println("the percent of tails is "+(tails/flip)*100 + "%");
          System.out.println(heads);
          System.out.println(tails);
          
       
	}

}
