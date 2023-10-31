package in.workspace.main;

import java.util.Scanner;

public class DecimalNumberToBinaryNumber
{
	public static void main(String[] args)
    {		
		Scanner decimalNumberToBinaryNumber = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int decimalNumber = decimalNumberToBinaryNumber.nextInt();
		
		String binaryNumber = "";
		
		while(decimalNumber>0)
		{
			int reminderNumber = decimalNumber % 2;
			
			binaryNumber = reminderNumber + binaryNumber;
			
			decimalNumber = decimalNumber/2;
		}
		System.out.print("Given decimal number changes to binary number : " + binaryNumber);
	}
}
