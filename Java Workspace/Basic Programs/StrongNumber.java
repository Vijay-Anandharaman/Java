package in.workspace.main;

import java.util.Scanner;

public class StrongNumber 
{
	public static void main(String[] args) 
    {
		Scanner strongNumber = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = strongNumber.nextInt();
		
		int duplicateNumber = number;
		
		int factorialNumber = 1;
		
		int sum = 0;
		
		while(number>0)
		{
			int reminderNumber = number%10;
			
			while(reminderNumber>0)
			{
				factorialNumber = factorialNumber * reminderNumber;
				reminderNumber--;
			}
			
			sum = sum + factorialNumber;

			factorialNumber = 1;

			number = number/10;		
		}
		
		if(sum==duplicateNumber)
		{
			System.out.print("Given number and total factorial number is equal : " + sum);
		}
		else
		{
			System.out.print("Given number and total factorial number is not equal : " + sum);
		}
	}
}
