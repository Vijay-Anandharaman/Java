package in.workspace.main;

public class ArrayLeftShiftTwice
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Before left shifting array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		int temporaryValues1 = numbers[0];

		int temporaryValues2 = numbers[1];
				
		int i = 0;
		
		while(i<numbers.length-2)
		{
			numbers[i] = numbers[i+2];
			i++;
		}
		
		numbers[i] = temporaryValues1;

		i=i+1;

		numbers[i] = temporaryValues2;
		
		System.out.println("After left shifting twice array : ");
		
		for(int k=0;k<numbers.length;k++)
		{
			System.out.print(numbers[k] + " ");
		}
	}
}
