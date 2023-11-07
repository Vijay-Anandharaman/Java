package in.workspace.main;

public class SmallestNumberInGivenArray
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,22,30,4,50,120,12,80,90,15};
		
		int smallestNumber = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(smallestNumber>numbers[i])
			{
				smallestNumber = numbers[i];
			}
		}		
		System.out.println("Smallest number in given array : " + smallestNumber);
    }
}
