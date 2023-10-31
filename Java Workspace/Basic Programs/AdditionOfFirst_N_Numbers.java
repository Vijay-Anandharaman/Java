package in.workspace.main;

import java.util.Scanner;

public class AdditionOfFirst_N_Numbers
{
	int sum = 0;
	
	public static void main(String[] args) 
    {
		
		AdditionOfFirst_N_Numbers sumNumber = new AdditionOfFirst_N_Numbers();
		
		sumNumber.findSumNumber();
		
		System.out.println("Addition of First N Number is : " + sumNumber.sum);
	}

	public void findSumNumber()
	{
		Scanner additionOfFirst_N_Numbers = new Scanner(System.in);
		
		System.out.print("Enter a number : ");

		int givenNumber = additionOfFirst_N_Numbers.nextInt();
		
		for(int i = 0;i<=givenNumber;i++)
		{
		   sum = sum + i;
		}
	}
}
