package in.workspace.main;

public class CountOfUniqueNumbersInGivenArray
{
	public static void main(String[] args)
    {		
		int numbers[] = {10,20,30,10,20,30,10,10,30,40,50};
		
		int frequencyNumbers[] = new int[numbers.length];

        int uniqueNumbers = 0;
		
		System.out.print("Elements in given array : ");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		for(int i=0;i<numbers.length;i++)
		{
			int number = numbers[i];
			
			int count = 1;
			
			for(int j=i+1;j<numbers.length;j++)
			{
				if(number==numbers[j])
				{
					count++;
					frequencyNumbers[j]=-1;
				}
			}
			
			if(frequencyNumbers[i]!=-1)
			{
				frequencyNumbers[i]=count;
			}
		}
		
		for(int i=0;i<frequencyNumbers.length;i++)
		{
			if(frequencyNumbers[i]==1)
			{
				uniqueNumbers++;
			}
		}
		
		System.out.println();
		
		System.out.println("Count of unique numbers appeared in given array : " + uniqueNumbers);
	}
}
