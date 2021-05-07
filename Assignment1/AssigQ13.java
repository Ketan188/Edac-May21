import java.util.*;

public class AssigQ13

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
System.out.println("Enter the width:");
float w=sc.nextFloat();
System.out.println("Enter the length:");
float l=sc.nextFloat();
double a=w*l;
double p=2*(w+l);
System.out.println("The area of rectangle:" +a);
System.out.println("The perimeter of rectangle:" +p);


	}
}