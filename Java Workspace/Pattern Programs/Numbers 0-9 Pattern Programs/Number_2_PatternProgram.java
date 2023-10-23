package in.workspace.main;

import java.util.Scanner;

public class Number_2_PatternProgram 
{
	public static void main(String[] args)
    {		
		Scanner pattern = new Scanner(System.in);

		System.out.print("Enter the number : ");

		int n = pattern.nextInt();

		System.out.println();

		if(n%2==0)
		{
			n=n+1;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n-1 || i+j==n-1 || i==0 || (j==0&&i<n/4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}								
		    }
			System.out.println("");			
		}
	}
}
