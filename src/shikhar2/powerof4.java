package shikhar2;

import java.util.Scanner;

public class powerof4 {
	
	public static boolean power(long a)
	{
		int c=0;
	while(a%4==0)
	{
		a=a/4;
		c++;
	}
	if(a==1 && c>0)
	{   
		return true;
	}
	else
	{
		return false;
	}
	}
	public static void main(String [] args)
	{
	 Scanner myobj=new Scanner(System.in);	
     
	 long n=myobj.nextLong();
	 
	System.out.println(power(n));

}
}