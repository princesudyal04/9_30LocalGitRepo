package pkg1;

public class ClassB extends classA
{
	public void a1()
	{
		System.out.println("Child Default method");
	}
	public void a2(int a)
	{
		System.out.println("Child 1 parametrized method");
	}
	public void a3(int a,int b)
	{
		
		System.out.println("Child 2 parametrized method");
	}
	public void a4(int a,int b, int c)
	{
		super.m5(1, 2, 3,4);
		this.a1();
		this.a2(1);
		this.a3(1, 2);
		this.a5(1, 2, 3, 4);
		System.out.println("Child 3 parametrized method");
	}
	public void a5(int a,int b,int c,int d)
	{
		System.out.println("Child 4 parametrized method");
	}
	
	public static void main(String[] args) 
	{
		ClassB obj=new ClassB();
		obj.a4(1, 2, 3);
	}
}
