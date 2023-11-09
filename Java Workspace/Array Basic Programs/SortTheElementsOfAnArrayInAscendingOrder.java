package in.workspace.main;

public class SortTheElementsOfAnArrayInAscendingOrder
{
	public static void main(String[] args)
    {		
		int numbers[] = {2,5,1,3,4};
		
		int temporaryValues = 0;
		
		System.out.print("Elements in given array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]>numbers[j])
				{
					temporaryValues = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temporaryValues;
				}
			}
		}
		
		System.out.println();
		
		System.out.print("Elements of an array in ascending order : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
	}
}
