package Loop;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Please insert a number: ");
	int number=obj.nextInt();
	int half=number/2;
	int check=0;
	 for(int i=2; i<=half;i++)
	 {
		 if(number%i==0)
		 {
			 System.out.println("Inserted number is not a prime number");
			 check=1;
			 break;
		 }
	 }
		 if(check==0)
		 {
			 System.out.println("Inserted number is a prime number");
		 }	
	}
}
