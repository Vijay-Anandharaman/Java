package in.workspace.main;

public class AdditionOfOddIndexElementsInGivenArray
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,20,30,40,50,60,70,80,90,100};
		
		int oddIndexNumbers[] = new int[numbers.length/2];
		
		int additionOfOddIndexNumbers = 0;
		
		int index = 0;
		
		System.out.print("Elements in given array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		for(int i=0;i<numbers.length;i++)
		{
			if(i%2!=0)
			{
				oddIndexNumbers[index] = numbers[i];
				index++;
			}
		}
		
		System.out.println();
		
		System.out.print("Odd index elements in given array : ");
		
		for(int i=0;i<oddIndexNumbers.length;i++)
		{
			System.out.print(oddIndexNumbers[i] + " ");

			additionOfOddIndexNumbers = additionOfOddIndexNumbers + oddIndexNumbers[i];
		}
		
		System.out.println();
		
		System.out.print("Addition of odd index elements in given array : " + additionOfOddIndexNumbers);
	}
}
