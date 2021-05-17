import java.util.Scanner;
public class AssigQ20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		char octalchar[]={'0','1','2','3','4','5','6','7'};
		String octal="";
		while(n>0)
		{
			temp=n%8;
			octal=octalchar[temp]+octal;
			n=n/8;
		}
		System.out.println(octal);
	}
}
