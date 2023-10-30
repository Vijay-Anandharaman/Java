package in.workspace.main;

public class NumberSeriesPatternProgram_1 
{	
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int z=2;z<=i;z++)
			{
				System.out.print(z);
			}
			System.out.println();
		}

		int f = 3;

		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=f;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int l= 2;l<=f;l++)
			{
				System.out.print(l);
			}
			f--;
			System.out.println();
		}
	}
}
