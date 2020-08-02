package pkg1;

public class Assignment3 {

	int a=10,b=2;
	
	public int sum() 
	{
		int c=a+b;
		return c;
	}
	public int sub()
	{
		int d=a-b;
		return d;
	}
	public int mult()
	{
		int e=a*b;
		return e;
	}
	public void div()
	{
		int result=a/b;
		System.out.println("The final result of expression is: "+result);
	}
	
	public static void main(String[] args) {
		Assignment3 obj=new Assignment3();
		System.out.println("The second assignment expression is: ((((10+2)+2)-2)*2)/2)");
		int firstSum=obj.sum();
		obj.a=firstSum;
		System.out.println("The first sum is: "+obj.a);
		int secondSum=obj.sum();
		obj.a=secondSum;
		System.out.println("The second sum is: "+obj.a);
		int subtract=obj.sub();
		obj.a=subtract;
		System.out.println("The result after subtraction is: "+obj.a);
		int multiply=obj.mult();
		obj.a=multiply;
		System.out.println("The result after multiplication is: "+obj.a);
		obj.div();
	}
	
	
}
