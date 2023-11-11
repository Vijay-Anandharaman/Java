package in.workspace.main;

public class ArrayRightShift
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,20,30,40,50};
		
		System.out.print("Before right shifting array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		int i = numbers.length-1;
		
		int temporaryValues = numbers[i];
				
		while(i>0)
		{
			numbers[i] = numbers[i-1];
			i--;
		}
		
		numbers[i] = temporaryValues;
		
		System.out.print("After right shifting array : ");
		
		for(int k=0;k<numbers.length;k++)
		{
			System.out.print(numbers[k] + " ");
		}
	}
}
