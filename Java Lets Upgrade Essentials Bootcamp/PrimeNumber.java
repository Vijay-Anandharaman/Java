package in.practice.main;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
        Scanner primeNumber = new Scanner(System.in);

        System.out.print("Enter a first number : ");
        
        int firstNumber = primeNumber.nextInt();
        
        System.out.println();
        
        System.out.print("Enter a second number : ");
        
        int secondNumber = primeNumber.nextInt();
        
        System.out.println();
        
        System.out.println("List of prime number between " + firstNumber + " and " + secondNumber);
        
        for(int index = firstNumber; index<=secondNumber; index++)
        {
        	if(isPrimeNumber(index))
        	{
        		System.out.println("This number is a prime number : " + index);
        	}
        	else
        	{
        		System.out.println("This number is not a prime number : " + index);
        	}
        }
    }
	
	public static boolean isPrimeNumber(int number)
	{
		if(number<=1)
		{
		   return false;	
		}
		for(int index = 2; index<=Math.sqrt(number); index++)
		{
			if(number%index==0)
			{
				return false;
			}
		}
		return true;
	}
}
