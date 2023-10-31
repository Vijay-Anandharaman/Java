package in.workspace.main;

import java.util.Scanner;

public class AdditionOfFirst_N_NumbersUsingRecursion 
{
	public static void main(String[] args)
    {
        Scanner additionOfFirst_N_Numbers = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int givenNumber = additionOfFirst_N_Numbers.nextInt();
		
		int total = 0;
		
		additionNumber(givenNumber, 1, total);
	}
	
	public static void additionNumber(int givenNumber, int index, int total)
	{
		total = total + index;
		
		index++;
		
		if(index<=givenNumber)
		{
			additionNumber(givenNumber, index, total);
		}
		else
		{
			System.out.println("Addition of First N Number is : " + total);
		}
	}
}
