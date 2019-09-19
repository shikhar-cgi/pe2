package shikhar2;

import java.util.Scanner;

public class factorial 
{	
	
public static long fact(int a)
{
	long sum=1;
	for(long i=a;i>0;i--)
	{
		sum=sum*i;
	}
	return sum;
}
public static void main(String [] args)
{   long a=0;
	Scanner myObj = new Scanner(System.in);
		int n=1;
		while(n<21)
		{
		a=fact(n);
		System.out.println("Factorial of " + n + " is :" + a);
		n++;
		}

		System.out.println("Factorial of " + n + " is out of range " );
		
		}
}
