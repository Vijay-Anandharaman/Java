package in.workspace.main;

import java.util.Scanner;

public class OddNumberOrEvenNumber 
{
	public static void main(String[] args)
    {
		Scanner findOddOrEvenNumber = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = findOddOrEvenNumber.nextInt();
		
		findOddOrEvenNumber(number);	
	}
	
	private static void findOddOrEvenNumber(int number)
	{
		if(number%2==0)
			System.out.print("Given number is even number : " + number);
		else
			System.out.print("Given number is odd number : " + number);
	}
}
