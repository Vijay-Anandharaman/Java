package in.workspace.main;

public class BiggestNumberInGivenArray
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,22,30,4,50,120,17,80,90,15};
		
		int biggestNumber = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(biggestNumber<numbers[i])
			{
				biggestNumber = numbers[i];
			}
		}		
		System.out.println("Biggest number in given array : " + biggestNumber);
    }
}
