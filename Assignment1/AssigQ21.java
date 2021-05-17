import java.util.Scanner;
public class AssigQ21
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int deci=sc.nextInt();
		int temp;
		String hex="";
		char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(deci>0)
		{
			temp=deci%16;
			hex=hexchars[temp]+hex;
			deci=deci/16;
		}
		System.out.println(hex);
	}
}