package com.bridgelabz.utlity;
import java.util.Scanner;
import java.util.Arrays;
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

	public static void BinarySearch()
	{
		System.out.println("enter number of elements to enter");
		int n = utility.getInt();
		System.out.println("enter array elements ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) 
		{
			array[i] = utility.getInt();
		}
		int firstIndex = 0;
		int lastIndex = n-1;
		int middle = 0;
		System.out.println("enter search element");
		int search = utility.getInt();
		while(firstIndex<=lastIndex)
		{
			middle = (firstIndex+lastIndex)/2;
			if(array[middle] == search)
			{
				System.out.println(search +"is found at "+(middle+1)+"position");
				break;
			}
			else if (search>array[middle]) 
			{
				firstIndex = middle+1;
			}
			else 
				{
					lastIndex = middle-1;
				}
		}
		System.out.println(search+" search element is founs at "+(middle+1));
		
	}	
	public static String getNextLine()
	{
		String s1= sc.nextLine();
		return s1;
	}

public static void Binarysearchofstring()
{
	System.out.println("enter string");
	 String first  = utility.getNextLine();
	 String [] sort1=first.split("");
	 Arrays.sort(sort1);
	 for(String k:sort1)
	 System.out.println(k);
	 System.out.println("enter  string to sort");
	 String search= utility.getString();
	 int firstindex=0;
	 int lastindex=sort1.length-1;
	 long starttime=System.nanoTime();
	 long stoptime=0;
	 while(firstindex<=lastindex)
	 {
		 int mid=(firstindex+lastindex)/2;
		 if(search.compareTo(sort1[mid])==0)
				 {
			       stoptime=System.nanoTime();
			       System.out.println("search element found at"+(mid+1));
			       break;
				 }
		 if(search.compareTo(sort1[mid])>0)
				 {
			       firstindex=mid+1;
			       
				 }
		 else
		 {
			 lastindex=mid-1;
		 }
	 }
		 System.out.println(" time taken for searcing of string "+(stoptime-starttime));
		 
}
public static void insertionSortOfInteger() 
{
	System.out.println("enter number of elements");
	int n = utility.getInt();
	int[] array = new int[n];
	System.out.println("array elements");
	for (int i = 0; i < array.length; i++) 
	{
		 array[i] = utility.getInt();
		
	}
	long startTime = System.nanoTime();
	long StopTime = 0;
	for(int j=1;j<=array.length-1;j++)
	{
	   int value = array[j];
	   int index = j;
	   while(index>0 && array[index-1]>value)
	   {
		   array[index] = array[index-1];
		   index--;
	   }
	   array[index]=value;
	}
	StopTime = System.nanoTime();
	for (int i = 0; i < array.length; i++) 
	{
		 System.out.println(array[i]); 
		
	}
	System.out.println("time taken for insertion sort of integer "+(StopTime-startTime));
	
	
}	

public static void insertionSortOfString() 
{
	System.out.println("enter string ");
	String enteredString = utility.getNextLine();
	String[] arrayString = enteredString.split(" ");
	Arrays.sort(arrayString);
	long startTime = System.nanoTime();
	long StopTime = 0;
	for(int i = 1;i<=arrayString.length-1;i++)
	{
		String first = arrayString[i];
		int index = i;
		while((index>0) && (arrayString[index-1].compareTo(arrayString[index])>0))
		{
			arrayString[index] = arrayString[index-1];
			index-=1;
		}
		arrayString[index] = first;
	}
	StopTime = System.nanoTime();
	for(int j=0 ; j<= arrayString.length-1 ;j++)
	{
		System.out.println(arrayString[j]);
	}
	
	System.out.println("time taken for insertion sort of String "+(StopTime-startTime));
}
}



