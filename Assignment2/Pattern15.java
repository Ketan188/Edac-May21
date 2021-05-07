public class Pattern15
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
i        j
1        5 4 3 2 1
2        5 4 3 2
3        5 4 3
4        5 4 
5        5
*/