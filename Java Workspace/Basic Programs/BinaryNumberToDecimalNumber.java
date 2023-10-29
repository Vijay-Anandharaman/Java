package in.workspace.main;

import java.util.Scanner;

public class BinaryNumberToDecimalNumber
{
	public static void main(String[] args)
    {		
		Scanner binaryToDecimal = new Scanner(System.in);
		
		System.out.print("Enter a binary number : ");

		int binaryNumber = binaryToDecimal.nextInt();
		
		double decimalNumber = 0;
		
		int index = 0;
		
		while(binaryNumber>0)
		{
		int reminderNumber = binaryNumber%10;
		
		decimalNumber = decimalNumber + (reminderNumber*Math.pow(2, index));
				
		binaryNumber = binaryNumber/10;	
		
		index++;
		}
		System.out.print("Binary number changes to decimal number : " + decimalNumber);	
	}
}
