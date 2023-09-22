package in.workspace.main;

public class ArrayFirstAndSecondMaximumNumber
{
	public static void main(String[] args)
    {
		int number[] = {12, 16, 10, 12, 24, 12, 29, 5, 12, 12, 100};
		
		int maximum = 0;

		int secondMaximum = 0;
		
		for(int temporary : number)
		{
			if(temporary>secondMaximum)
			{
				secondMaximum = temporary;
			}	
				if(temporary>maximum)
				{
				    secondMaximum = maximum;
				    maximum = temporary;
				}
				
		}
		System.out.println("The first maximum number is : " + maximum); 
        System.out.println("The second maximum number is : " + secondMaximum);
	}
}
