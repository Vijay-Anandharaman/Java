package in.workspace.main;

public class CopyingArray
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,20,30,40,50,60,70,80,90,100};
		
		int copyingNumbers[] = new int[numbers.length];
		
		for(int i=0;i<numbers.length;i++)
		{
			copyingNumbers[i] = numbers[i];
		}
		
		System.out.println("Elements of original array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Elements of new array : ");
		
		for(int i=0;i<copyingNumbers.length;i++)
		{
			System.out.print(copyingNumbers[i] + " ");
		}
	}
}
