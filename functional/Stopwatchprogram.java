package com.bridgelabz.functional;
import com.bridgelabz.utlity.utility;

public class Stopwatchprogram {

	long startTime;
	long stopTime;
	
	public void start()
	{
		 startTime = System.currentTimeMillis();
		
	}
	public void stop() 
	{
		 stopTime =System.currentTimeMillis();
	
		
	}
	public static void main(String[] args) 
	{
		Stopwatchprogram stopWatch = new Stopwatchprogram();
		
		
		System.out.println("enter 0 to start");
		int j = utility.getInt();
		if (j==0) 
		{
			stopWatch.start();
			System.out.println(stopWatch.startTime);
			
		}
		
		System.out.println("enter 1 to stop");
		int i = utility.getInt();
		if (i==1)
		{
			stopWatch.stop();
			System.out.println(stopWatch.stopTime);
			
		}
		System.out.println("seconds= "+((stopWatch.stopTime)-(stopWatch.startTime))/1000);
		
		
	}
	
	
}

