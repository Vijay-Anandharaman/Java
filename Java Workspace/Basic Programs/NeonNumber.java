package in.workspace.main;

import java.util.Scanner;

public class NeonNumber 
{
	public static void main(String[] args)
    {		
		Scanner neonNumber = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = neonNumber.nextInt();
		
		int squareNumber = number * number;
		
		int totalNumber = 0;
		
		int reminderNumber = 0;
		
		while(squareNumber>0)
		{
			reminderNumber = squareNumber%10;

			totalNumber = totalNumber + reminderNumber;

			squareNumber = squareNumber/10;
		}
		
		if(totalNumber == number)
		{
			System.out.println("Given number and given number square root addition number is equal : " + totalNumber );
		}
		else
		{
			System.out.println("Given number and given number square root addition number is not equal : " + totalNumber );
		}
	}			
}
