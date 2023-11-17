package in.workspace.main;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner armstrongNumber = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int givenNumber = armstrongNumber.nextInt();
		
		System.out.print("The armstrong number upto " + givenNumber +" are : ");
		
		for(int i=0;i<=givenNumber;i++)
		{
			if(isArmstrong(i))
			{
				System.out.print(i + ", ");
			}
		}
	}
	static boolean isArmstrong(int number)
	{
	   int lastDigit = 0, totalDigit = 0, sum =0, temporary = 0;
	   
	   temporary = number;
	   
	   while(temporary>0)
	   {
		   temporary = temporary/10;
		   totalDigit = totalDigit+1;
	   }
	   
	   temporary = number;
	   
	   while(temporary>0)
	   {
		   lastDigit = temporary%10;
		   sum += (Math.pow(lastDigit, totalDigit));
		   temporary = temporary/10;   
	   }
	   
	   if(number==sum)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
	}
}
