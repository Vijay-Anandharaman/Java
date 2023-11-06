package in.workspace.main;

public class CopyingOddIndexNumbersToAnotherArray 
{
	public static void main(String[] args)
    {		
        int numbers[] = {10,20,30,40,50,60,70,80,90,100};
		
		int copyingOddIndexNumbers[] =  new int[numbers.length/2];
		
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
				copyingOddIndexNumbers[index] = numbers[i];
				index++;
			}
		}

		System.out.println();
		
		System.out.print("Copying odd index numbers in another array : ");
		
		for(int i=0;i<copyingOddIndexNumbers.length;i++)
		{
			System.out.print(copyingOddIndexNumbers[i] + " ");
		}
	}
}
