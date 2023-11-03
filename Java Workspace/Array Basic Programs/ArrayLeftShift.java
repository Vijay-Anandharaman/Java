package in.workspace.main;

public class ArrayLeftShift
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,20,30,40,50};
		
		System.out.println("Before left shifting array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		int temporaryValues = numbers[0];
				
		int i = 0;
		
		while(i<numbers.length-1)
		{
			numbers[i] = numbers[i+1];
			i++;
		}
		
		numbers[i] = temporaryValues;
		
		System.out.println("After left shifting array : ");
		
		for(int k=0;k<numbers.length;k++)
		{
			System.out.print(numbers[k] + " ");
		}
	}
}
