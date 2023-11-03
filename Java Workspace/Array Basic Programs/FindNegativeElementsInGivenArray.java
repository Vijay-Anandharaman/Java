package in.workspace.main;

public class FindNegativeElementsInGivenArray
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,-20,30,-40,50,-60,70,-80,90,-100};
		
		System.out.print("Negative elements in given array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]<0)
			{
				System.out.print(numbers[i] + " ");
			}
		}
    }
}
