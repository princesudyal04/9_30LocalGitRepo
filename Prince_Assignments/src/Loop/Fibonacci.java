package Loop;

public class Fibonacci 
{
public static void main(String[] args) 
{
int a1=0;
int a2=1;
System.out.println("Fibonacci series is:");
System.out.println(a1);
System.out.println(a2);
for (int i=1; i<=10;i++)
{
	int a3=a1+a2;
	a1=a2;
	a2=a3;
	System.out.println(a3);
}	
}
		
}
