package Loop;

import java.util.Scanner;

public class Swap1 
{
	public static void main(String[] args) {
		System.out.println("Insert the value of a");
		Scanner obj= new Scanner(System.in);
		int a= obj.nextInt();
		System.out.println("Insert the value of b");
		int b= obj.nextInt();
		int c=b;
		b=a;
		a=c;  
		System.out.println("Print the value after swapping");
		System.out.println("The value of a= "+a);
		System.out.println("The value of b= "+b);
		obj.close();
	}
}
