package Loop;

import java.util.Scanner;

public class TablePrint 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Please insert the number for table print");
		int number=obj.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int a=number*i;
			System.out.println(number+" * "+i+" = "+a);
		}
	}
}
