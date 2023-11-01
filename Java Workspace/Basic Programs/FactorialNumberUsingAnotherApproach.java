package in.workspace.main;

import java.util.Scanner;

public class FactorialNumberUsingAnotherApproach 
{
	public static void main(String[] args) 
    {		
		Scanner factorial = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = factorial.nextInt();
		
		int index = number;
		
		int factorialNumber = 1;
		
		while(index>0)
		{
			while(number>0)
			{
				factorialNumber = factorialNumber * number;
				number = number - 1;
			}

			System.out.println("The factorial of " + index + "! is " + factorialNumber);

			factorialNumber = 1;

			index = index - 1;

			number = index;
		}
	}
}
