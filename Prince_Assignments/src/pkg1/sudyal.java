package pkg1;

import java.util.Scanner;

public class sudyal 
{
 public int sum(int a,int b)
 {
	 int c=a+b;
	 return c;
 }
 public int sub(int a,int b)
 {
	 int d=a-b;
	 return d;
 }
 public int mul(int a,int b)
 {
	 int e=a*b;
	 return e;
 }
 public void div(int a,int b)
 {
	 int e=a/b;
	 System.out.println("The Final result of expression is: "+e);
 }
	
	public static void main(String[] args) 
	{
		sudyal ob=new sudyal();
		Scanner obj= new Scanner(System.in);
		System.out.println("Expression: (((((x1+x2)-x3)*x4)+x5)/x6)");
		System.out.println("Enter the values of x1,x2,x3,x4,x5 and x6 ");
		int x1= obj.nextInt();
		int x2= obj.nextInt();
		int x3= obj.nextInt();
		int x4= obj.nextInt();
		int x5= obj.nextInt();
		int x6= obj.nextInt();
		int add=ob.sum(x1, x2); System.out.println("The result after 1st add: "+add);
		int subt=ob.sub(add, x3); System.out.println("The result after subtract: "+subt);
		int mult=ob.mul(subt, x4); System.out.println("The result after multiplication: "+mult);
		int add2=ob.sum(mult, x5); System.out.println("The result after 2nd add: "+add2);
		ob.div(add2, x6);
	}
}
