package com.bridgelabz.utlity;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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
public static void bubbleSortOfInteger() 
{
	System.out.println("enter number of intergers");
	int n = utility.getInt();
	int[] array = new int[n];
	System.out.println("enter integers");
	for(int i=0 ;i<=array.length-1; i++)
	{
		array[i] = utility.getInt();
		
	}
	long startTime = System.nanoTime();
	long StopTime = 0;
	for(int j=0;j<=array.length-1;j++)
	{
		for(int k=0;k<=array.length-2;k++)
		{
			if(array[k]>array[k+1])
			{
				int temp = array[k];
				array[k] = array[k+1];
				array[k+1] = temp;
			}
		}
	}
	StopTime = System.nanoTime();
	for(int index = 0;index<=array.length-1;index++)
	{
		System.out.println(array[index]);
	}
	System.out.println("time taken for bubble sort of integer "+(StopTime-startTime));
	
}
public static void bubbleSortOfString()
{
	System.out.println("enter string");
	String EnteredString = utility.getNextLine();
	String[] array = EnteredString.split(" ");
	long startTime = System.nanoTime();
	long StopTime = 0;
			for(int j=0;j<=array.length-1;j++)
			{
				for(int k=0;k<=array.length-2;k++)
				{
					if(array[k].compareTo(array[k+1])>0)
					{
						String temp = array[k];
						array[k] = array[k+1];
						array[k+1] = temp;
					}
				}
			}
			StopTime = System.nanoTime();
			for(int index = 0;index<=array.length-1;index++)
			{
				System.out.println(array[index]);
			}	
			System.out.println("time taken for bubble sort of String "+(StopTime-startTime));
}

public static int dayOfWeek(int d, int m, int y) 
{
	int y0 = y - (14 - m) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;  
	int m0 = m + 12 * ((14 - m) / 12) - 2;
	int d0 = (d + x + (31 * m0) / 12) % 7;
	return d0;
}
public static double temparatureconverter()
{  	
	System.out.println("enter 1 to convert celcius to fahrenheit");
	
	System.out.println("enter 2 to covert fahrenheit to celcius");
	int choice=utility.getInt();

	if(choice==1)
	{
		System.out.println("enter the temparature in celcius");
		double temparature=utility.getDouble();
		double converted=(9/5.0*(temparature)+32);
		System.out.println("converted temparature in fahrenheit "+converted);
	}
	else if(choice==2)
	{
		System.out.println("enter the temparature in fahrenheit");
		double temparature=utility.getDouble();
		double converted=5/9.0*(temparature-32);
		System.out.println("converted temparature in celcius "+converted);
}
	else
	{
	System.out.println("entered input is wrong please try again ");	
	}
	return choice;
}
public static double monthlypack(double p, double y ,double r)
{
	double r0=r/(12*100);
	double n=12*y;
	double payment=p*r0/(1-Math.pow(1+r, -n));
	return payment;
}

// TODO Auto-generated method stub
public	static int swapNibbles(int x) 
	{ 
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	} 
	// Driver code 
     public static void toBinary()
     {
    	 System.out.println("enter the value of decimal");
         int number=utility.getInt();
        
         int temp=number;
         int rem;
         String result="";
         int decimal=0;
         while(number>=1)
         {
        	 rem=number%2;
        	 result=rem+result;
        	 number=number/2;
         }
         System.out.println(" binary value of "+temp+" is "+result);
         int index=0;
         for(int i=result.length()-1;i>=0;i--)
         {
        	char output=result.charAt(index);
        	index++;
        	int convertedNumber=Character.getNumericValue(output);
        	decimal=(int)(convertedNumber*(Math.pow(2, i)+decimal));
        	
         }
         if(temp==decimal)
         {
        	 System.out.println("decimal and binary numbers are equal");
         }
         else
         {
        	 System.out.println("decimal and binary numbers are not equal");
         }
     }
     public static double squarertnon(double c)
     {
    	 double t=c;
    	 double epsilon =1e-15;
    	 while(Math.abs((t-c/t))>epsilon*t)
    	 {
    		 t=((c/t+t)/2);
    	}
return t;
     }
     public static void binarysearchstringinfile()throws FileNotFoundException
     {
     File file = new File("/home/bridgeit/eclipse-workspace/Functional programs/src/com/bridgelabz/surendra royal");
     Scanner scan=new Scanner(file);
     String name=utility.getNextLine();
     String[]array=name.split(" ");
     Arrays.sort(array);
     for(String k :array)
     {
     System.out.println(k);
     
     
}
System.out.println("enter an search value");
String searchvalue=utility.getString();
int firstindex=0;
int lastindex=0;
while(firstindex<=lastindex)
{
	int middlevalue=((firstindex+lastindex)/2);

if(searchvalue.compareTo(array[middlevalue])==0)
{
	System.out.println("value found at"+middlevalue);
	break;
}
else if(searchvalue.compareTo(array[middlevalue])>0)
		{
	        firstindex=middlevalue+1;
		}
else
{
    lastindex=middlevalue-1;
}
}
     }
    
}