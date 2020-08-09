package pkg1;

public class childClass extends parentClass
{
	public childClass() 
	{
		super(1,2);
		System.out.println("Child Default constructor");
	}
	
	public childClass(int a) 
	{
		this(1,2,3);
		System.out.println("child 1 parameterized constructor");
	}
	public childClass(int a,int b) 
	{
		this(1);
		System.out.println("child 2 parameterized constructor");
	}
	public childClass(int a,int b,int c) 
	{
		this(1,2,3,4);
		System.out.println("child 3 parameterized constructor");
	}
	public childClass(int a,int b,int c,int d) 
	{
		this();
		System.out.println("child 4 parameterized constructor");
	}
	
	
	public static void main(String[] args) 
	{
		childClass obj= new childClass(1,2);
	}
	
	
	
}
