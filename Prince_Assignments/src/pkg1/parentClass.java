package pkg1;

public class parentClass 
{

	public parentClass() 
{
		this(1,2,3);
	System.out.println("Parent Default constructor");
}
	
	public parentClass(int a) 
{
		this(1,2,3,4);
		System.out.println("Parent 1 parameterized constructor");
}	
	
	public parentClass(int a,int b) 
{
		this(1);
		System.out.println("Parent 2 parameterized constructor");
}	
	public parentClass(int a, int b, int c) 
{
		System.out.println("Parent 3 parameterized constructor");
}	
	public parentClass(int a, int b, int c, int d) 
{
		this();
		System.out.println("Parent 4 parameterized constructor");
}	
	
}
