package Loop;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Please insert the number to calculate the factorial");
		int number=obj.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
			System.out.println("After "+i+" evaluation: "+fact);
		}
		System.out.println("The final result of the Factorial number is: "+fact);
	}
	
	
}
