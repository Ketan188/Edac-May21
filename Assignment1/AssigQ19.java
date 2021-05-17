import java.util.*;
public class AssigQ19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int index=0;
		int arr[]=new int[10];
		int n=sc.nextInt();
        while(n>0)
		{
		arr[index]=n%2;
		n=n/2;
		index++;
		}
		for(int i=index-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
}
}