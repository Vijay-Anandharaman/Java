package in.workspace.main;

import java.util.Scanner;

public class FactorialNumberUsingRecursion
{
    public static void main(String[] args)
    {		
        Scanner factorialNumberUsingRecursion = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        
        int number = factorialNumberUsingRecursion.nextInt();
        
        int factorial = 1;
        
	 	int count = 1;
        
        int factorialNumber = factorialNumber(count, number, factorial);
        
        System.out.print("Given number factorial is : " + factorialNumber);	
    }
	
    public static int factorialNumber(int count, int number, int factorial)
	{
        factorial = factorial * count;
		
		count++;
		
		if(count<=number)
			return factorialNumber(count, number, factorial);
		else
			return factorial;
	}
}
