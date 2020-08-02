package pkg1;

public class Assignment6 
{
	public void method1()
	{
		System.out.println("Default method");
		this.method2(1);
	}
	
	public void method2(int a)
	{
		System.out.println("1 parametrized method");
		this.method3(1, 2);
	}
	public void method3(int a, int b)
	{
		System.out.println("2 parametrized method");
		this.method5(1, 2, 3, 4);
	}
	public void method4(int a, int b, int c)
	{
		System.out.println("3 parametrized method");
		this.method1();
	}
	public void method5(int a, int b, int c,int d)
	{
		System.out.println("4 parametrized method");
	}
	
	public static void main(String[] args) {
		Assignment6 obj=new Assignment6();
		obj.method4(1, 2, 3);
	}
}
