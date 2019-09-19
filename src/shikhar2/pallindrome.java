package shikhar2;

import java.util.Scanner;


public class pallindrome {
	public static int reverse(int a)
	{
		int n=a;
		int sum=0;
		while(n>0)
		{
			sum=sum*10+(n%10);
			n=n/10;
		}
		return sum;
	}
	public static void main(String [] args)
	{
	 Scanner myobj=new Scanner(System.in);	
     
	 int n=myobj.nextInt();
	 
	 System.out.print(reverse(n));
		
	}

}
