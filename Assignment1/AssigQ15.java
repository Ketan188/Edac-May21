
import java.util.*;
public class AssigQ15
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers;");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int temp;
		 System.out.println("i:" +i);
		 System.out.println("j:" +j);
		
		temp=i;
		i=j;
		j=temp;
		System.out.println("Number after Swapping" +i);
		System.println(+j);
	}
}