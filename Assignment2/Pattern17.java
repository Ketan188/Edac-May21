public class Pattern17
{
	public static void main(String args[])
	{ 
	int a=1;
		for(int i=1;i<=5;i++)
		{ 
			for(int j=1;j<=i;j++)
			{ 
		     System.out.print(a+" ");
			     a++;
			}
			System.out.println();
		}
	}
}
/*
i       j
1       1
2       2 3
3       4 5 6
4       7 8 9 10
5       11 12 13 14
*/