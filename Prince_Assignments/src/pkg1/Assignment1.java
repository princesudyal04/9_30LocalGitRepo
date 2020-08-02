package pkg1;

public class Assignment1 {

	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	
	public int div(int a, int b)
	{
		int c=a/b;
		return c;
	}
	
	public void mult(int a, int b)
	{
		int result=a*b;
		System.out.println("The final result of the expression is: "+result);
	}
	public static void main(String[] args) {
		Assignment1 obj=new Assignment1();
		System.out.println("The assignment one is: ((((10+2)+2)-2)*2/2)");
		int sum1=obj.sum(10, 2);
		System.out.println("The sum of first numbers is: "+sum1 );
		int totalSum=obj.sum(sum1, 2);
		System.out.println("The total sum of expression is: "+totalSum);
		int SumSub=obj.sub(totalSum, 2);
		System.out.println("The total sum and sub of the expression is : "+SumSub);
		int division=obj.div(2, 2);
		System.out.println("The division result of two numbers is: "+division);
		obj.mult(SumSub, division);
		
	}
}
