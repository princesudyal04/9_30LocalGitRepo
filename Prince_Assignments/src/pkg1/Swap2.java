package pkg1;

import java.util.Scanner;

public class Swap2 
{			
		public static void main(String[] args) {
			System.out.println("Insert the value of a");
			Scanner s= new Scanner(System.in);
			int a= s.nextInt();
			System.out.println("Insert the value of b");
			int b= s.nextInt();
			a= a+b;  
			b= a-b;  
			a= a-b;  
			System.out.println("Print the value after swapping");
			System.out.println("The value of a= "+a);
			System.out.println("The value of b= "+b);
			s.close();
		}
}
