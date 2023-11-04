package in.workspace.main;

import java.util.Scanner;

public class NumberSeriesPatternProgram_5
{
	public static void main(String[] args)
    {		
		Scanner numberSeriesPattern = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = numberSeriesPattern.nextInt();	
		
		System.out.println();
		
		for(int row=1;row<=number;row++)
		{
			int totalValue = number*row;
			
			if(row%2==1)
			{
				for(int column=number;column>=1;column--)
				{
					System.out.print(totalValue-(number-1) + " ");
					totalValue++;
				}
			}
			
			else
			{
				for(int column=0;column<=number-1;column++)
				{
					System.out.print(totalValue-column + " ");
				}
			}
			System.out.println();
		}
	}
}
