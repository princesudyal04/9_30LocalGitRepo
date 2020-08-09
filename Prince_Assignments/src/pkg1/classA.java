package pkg1;

public class classA 
{

	public void m1()
	{
		System.out.println("Parent Default method");
	}
	public void m2(int a)
	{
		System.out.println("Parent 1 parametrized method");
	}
	public void m3(int a, int b)
	{
		System.out.println("Parent 2 parametrized method");
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("Parent 3 parametrized method");
	}
	public void m5(int a,int b,int c,int d)
	{
		this.m2(1);
		this.m1();
		this.m3(1, 2);
		this.m4(1, 2, 3);
		System.out.println("Parent 4 parametrized method");	
	}
	
}
