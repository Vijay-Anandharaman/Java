package in.workspace.main;

import java.util.Scanner;

public class CountingNumberOfDigits
{
	public static void main(String[] args)
    {		
		int countNumber = numberOfDigits();
		System.out.print("Total number of digits : " + countNumber);
	}
	
	static int numberOfDigits()
	{
		Scanner numberOfDigit = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		
		int givenNumber = numberOfDigit.nextInt();
		
		int count = 0;
		
		while(givenNumber>0)
		{
			givenNumber = givenNumber/10;
			count = count + 1;
		}
		return count;
	}
}
