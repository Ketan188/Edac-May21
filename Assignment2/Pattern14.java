public class Pattern14
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}



/*
i      j
5      1 2 3 4 5
4      1 2 3 4
3      1 2 3 
4      1 2 
5      1
*/