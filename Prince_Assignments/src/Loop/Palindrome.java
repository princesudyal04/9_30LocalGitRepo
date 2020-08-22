package Loop;

import java.util.Scanner;

public class Palindrome 
{
public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Please insert the number to check:");
	int number=obj.nextInt();
	int oldNumber=number;
	int sum=0;
	
	while(number>0)
	{
		int reminder=number%10;
		sum=sum*10+reminder;
		number =number/10;
	}
	if (oldNumber==sum)
	{
		System.out.println("The Inserted number is palindrome");
	}
	else
	{
		System.out.println("Inserted number is not a palindrome");
	}
}
}
