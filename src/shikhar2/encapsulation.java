package shikhar2;

public class encapsulation {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	
	public void getfirstName(String s)
	{
		firstName=s;
	}
	public void getlastName(String q)
	{
		lastName=q;
	}
	public void getage(int a)
	{ 
	
	if(a>=0&&a<=100)
	age=a;
	
	else
	
    System.out.println("Enter a number between 0 to 100");
		
	
	}
	public void getname(double sa)
	{
		salary=sa;
	}
	public void ValidAge()
	{
		if(age>18 && age<60)
		{
			System.out.println("VALID AGE");
		}
		else
		{
			System.out.println("INVALID AGE");	
		}
			
	}
	public String getFullName()
	{
		String s="";
		s= s+firstName+" "+lastName;
		return s;
	}
	
}
