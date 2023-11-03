package in.workspace.main;

import java.util.Scanner;

public class GivenNumberAvailableInArrayOrNot
{
	public static void main(String[] args) 
	{
		int number[] = {100,25,50,75,60,1,5,90,55,40,5,50,75,60,75};
		
		Scanner numberAvailableInArrayOrNot = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int givenNumber = numberAvailableInArrayOrNot.nextInt();
		
		findGivenNumberAvailableInArrayOrNot(number, givenNumber);		
	}
	
	public static void findGivenNumberAvailableInArrayOrNot(int number[], int givenNumber)
	{
		int count = 0;
			
		for(int i = 0;i<number.length;i++)
		{
			if(givenNumber==number[i])
			{
				count = count + 1;
			}
		}
			
		if(count==0)
		{
			System.out.print("Given number is not available in array.");
		}
		else
		{
			if(count==1)
			{
				System.out.print("Given number is available in array for " + count + " time.");
			}
			else
			{
				System.out.print("Given number is available in array for " + count + " times.");
			}	
		}
	}
}
