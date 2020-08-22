package Loop;

import java.util.Scanner;

public class Swap2 
{			
		public static void main(String[] args) {
			System.out.println("Insert the value of a");
			Scanner obj= new Scanner(System.in);
			int a= obj.nextInt();
			System.out.println("Insert the value of b");
			int b= obj.nextInt();
			a= a+b;  
			b= a-b;  
			a= a-b;  
			System.out.println("Print the value after swapping");
			System.out.println("The value of a= "+a);
			System.out.println("The value of b= "+b);
			obj.close();
		}
}
