package shikhar2;

import java.util.Scanner;

public class students {
	
	public static int max(int a[])
	{
		int ma=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>ma)
		{
			ma=a[i];
		}
	}
	return ma;
	}
	public static double avg(int a[])
	{
		int sum=0,n=a.length;
		double av;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		av=sum/n;
		return av;
	}
	public static int min(int a[])
	{
		int mi=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<mi)
			{
				mi=a[i];
			}
		}
		return mi;
	}
	  
	 public static void main(String [] args)
     {
    	 Scanner myObj = new Scanner(System.in);
    	int maximum,minimum,n=0;
    	double avg;
 		System.out.println("Enter number of Student");
 		try
 		{
 		 n=myObj.nextInt();}
 		catch (Exception e)
 		{ 
 			System.out.println("Invalid number");
 		}
 		 int a[]=new int [n];
    	for(int i=0;i<n;i++)
    	{
    		System.out.println("Enter the grade of Student" + i + ":");
    		try {
    	          a[i]=myObj.nextInt();
    	      }
    		catch (Exception e)
    		{ 
    			System.out.println("Invalid Number");
    		}
    	}
 	    maximum=max(a);
 	    minimum=min(a);
 	    avg=avg(a);
 	   System.out.println("Maximum number is" + maximum);
 	  System.out.println("minimum number is" +  minimum);
 	 System.out.println("average is" +  avg);
 	    
     }

}
