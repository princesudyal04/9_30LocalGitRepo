package DoubleLoop;

public class Double6 
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=5;
		for(int i=1; i<=5;i++)
		{
			for (int j=1; j<=b; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=a; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			b--;
			a=a+2;
		}
	}
}
