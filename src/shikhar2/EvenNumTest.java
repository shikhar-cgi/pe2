package shikhar2;

import java.util.Scanner;

public class EvenNumTest {
	
	public static boolean isEven(int a)
	{
		if(a%2==0)
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
    	 Scanner myObj = new Scanner(System.in);
 		int n=myObj.nextInt();
 		System.out.println(isEven(n));
     }
	
}


