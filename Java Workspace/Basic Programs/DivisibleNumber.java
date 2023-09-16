package in.workspace.main;

import java.util.Scanner;

public class DivisibleNumber
{
	public static void main(String[] args)
    {		
        Scanner findNumber = new Scanner(System.in);

        System.out.print("Enter a first number : ");
        
        int firstNumber = findNumber.nextInt();
        
        System.out.print("Enter a second number : ");
        
        int secondNumber = findNumber.nextInt();
        
        System.out.println("List of number between " + firstNumber + " and " + secondNumber);

        System.out.println();
        
        int number =2;
        
        for(int index = firstNumber; index<=secondNumber; index++)
        {
        	if(index%number==0)
        	{
        		System.out.println("This number is a even number : " + index);
        	}
        	else
        	{
        		System.out.println("This number is a odd number : " + index);
        	}
        }
    }
}
