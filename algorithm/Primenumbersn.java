package com.bridgelabz.algorithm;
import com.bridgelabz.utlity.utility;
import java.*;
public class Primenumbersn 

{ 
	public static void main(String[] args)
	{   int p;
		System.out.println(" enter n value ");
		int n=utility.getInt();
	     for(int i=1;i<=n;i++)
	     {
	    	 p=0;
	    	 for(int j=2;j<i;j++)
	    	 {
	    		 if(i%j==0)
	    		 {
	    			 p++;
	    		 
	    		 break;
	    		 }
	    	 }
	    	 if(p==0)
	    	 {
	    		 System.out.println(i+" ");
	    	 }
	     }
		

	}
}



