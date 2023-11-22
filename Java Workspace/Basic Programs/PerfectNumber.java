package in.workspace.main;

import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] args)
    {		
		Scanner perfectNumber = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = perfectNumber.nextInt();
		
		int sum = 0;
		
		for(int index=1;index<=number/2;index++)
		{
			if(number%index==0)
			{
				sum = sum + index;
			}
		}
		
		if(number==sum)
		{
			System.out.println("Given number and total addition of divisible by given number is equal. So, given number is strong number : " + sum);
		}
		else
		{
			System.out.print("Given number and total addition of divisible by given number is not equal. So, given number is not strong number : " + sum);
		}
	}
}
