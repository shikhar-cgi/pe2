package shikhar2;

public class membervariable {
	
	private String membername;
	private int memberage;
	private double salary;
	
	public void getname( String s )
	{
	 	membername=s;
	}
	public void getage( int a )
	{
	 	memberage=a;
	}
	
	public void getsalary( int sa )
	{
	 	salary=sa;
	}
	public void display()
	{
		System.out.println("Name :" + membername);
		System.out.println("age :" + memberage);
		System.out.println("salary :" + salary);
	}
	}


