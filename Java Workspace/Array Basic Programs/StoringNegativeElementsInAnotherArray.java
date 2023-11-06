package in.workspace.main;

public class StoringNegativeElementsInAnotherArray
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,-20,30,-40,50,-60,70,-80,90,-100};
		
		int countValue = 0;
		
		int count = 0;
		
        System.out.print("Elements in given array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
				
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]<0)
			{
				countValue++;
			}
		}
		
		int negativeElements[] = new int[countValue];
				
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]<0)
			{
				negativeElements[count] = numbers[i];
				count++;
			}
			if(count==countValue)
			{
				break;
			}
		}
		
		System.out.println();
		
		System.out.print("Negative elements storing in another array : ");
		
		for(int i=0;i<negativeElements.length;i++)
		{
			System.out.print(negativeElements[i] + " ");
		}
    }
}
