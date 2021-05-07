import java.util.*;

public class AssigQ11

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
System.out.println("Enter the value of Rdius;");
float r =sc.nextFloat();
double  i = 3.14*r*r;
double j= 2*3.14*r;
System.out.println("The Area of circle is:" +i);
System.out.println("The perimeter of circle is:" +j);
	}
}