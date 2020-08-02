package pkg1;

public class Assignment2 {
	
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int mult(int a, int b)
	{
		int c=a*b;
		return c;	
	}
	
	public void div(int a, int b)
	{
		int result=a/b;
		System.out.println("The final result of the expression is: "+result);
	}
	

	public static void main(String[] args) {
		Assignment2 obj=new Assignment2();
		System.out.println("The second assignment expression is: ((((10-2)+2)-2)*2)/2)");
		int sub1=obj.sub(10, 2);
		System.out.println("The result of first subtraction is: "+sub1);
		int subAdd=obj.sum(sub1, 2);
		System.out.println("The result of first sub and add is: "+subAdd);
        int sub2=obj.sub(subAdd, 2);
        System.out.println("The result after second subtraction is: "+sub2);
        int subMult=obj.mult(sub2, 2);
        System.out.println("The result after multiplication is: "+subMult);
        obj.div(subMult, 2);
	}
}
