package pkg1;

public class Assignment4
{

	public Assignment4() 
	{
		this(1,2,3,4);
		System.out.println("Default contstructor");
	}
	
	public Assignment4(int a) 
	{
		this();
		System.out.println("1 Parametrized contstructor");
	}
	
	public Assignment4(int a, int b) 
	{
		this(1);
		System.out.println("2 Parametrized contstructor");
	}
	
	public Assignment4(int a, int b, int c) 
	{
		this(12,13);
		System.out.println("3 Parametrized contstructor");
	}
	
	public Assignment4(int a, int b, int c, int d) 
	{
		System.out.println("4 Parametrized contstructor");
	}
	
	
	public static void main(String[] args) {
		Assignment4 obj=new Assignment4(1,2,3);
	}
}
