package in.workspace.main;

import java.util.Scanner;

public class SwappingTwoNumber
{
	public static void main(String[] args)
    {		
		Scanner swappingTwoNumber = new Scanner(System.in);
		
		System.out.println("Enter two numbers to swap the A and B number");
		
		System.out.print("Enter A number : ");
		
		int a = swappingTwoNumber.nextInt();
		
		System.out.print("Enter B number : ");
		
		int b = swappingTwoNumber.nextInt();
		
		int temporary;
		
		temporary = a;
		
		a = b;
		
		b = temporary;
		
		System.out.println("After swapping the two numbers A = " + a + "; B = " + b);
	}
}
