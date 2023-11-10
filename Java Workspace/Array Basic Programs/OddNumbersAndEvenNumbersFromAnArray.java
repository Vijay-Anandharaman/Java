package in.workspace.main;

public class OddNumbersAndEvenNumbersFromAnArray
{	
	public static void main(String args[])
	{
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("Odd numbers in given array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2!=0)
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Even numbers in given array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			System.out.print(numbers[i] + " ");
		}
	}
}
