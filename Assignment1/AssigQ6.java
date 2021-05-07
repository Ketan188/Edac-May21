import java.util.*;

public class AssigQ6

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
System.out.println("Enter the first no:");
int i=sc.nextInt();
System.out.println("Enter the second no:");
int j=sc.nextInt();
int a=i*j;
int b=i/j;
int c=i+j;
int d=i-j;
int e=i%j;
System.out.println("Multiplication:" +a);		
System.out.println("Divide:" +b);
System.out.println("Addition:" +c);
System.out.println("Subtraction:" +d);
System.out.println("Remainder:" +e);
	}
}