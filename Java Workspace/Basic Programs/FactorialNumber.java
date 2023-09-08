package in.workspace.main;

import java.util.Scanner;

public class FactorialNumber
{
	public static void main(String[] args)
    { 
		    Scanner factorialNumber = new Scanner(System.in);
		    
		    System.out.println("Enter a number : ");
		    
		    int number = factorialNumber.nextInt();
		    
		    int factorial = 1;
		    
		    for(int i = 1;i<=number;i++)
		    {
		    	factorial = factorial*i;
		    }
		    System.out.println(factorial);
	}

}
