package in.workspace.main;

public class FibonacciSeries
{
	public static void main(String[] args)
    {		
		int number1 = 0;
	    
	    int number2 = 1;
	    
	    System.out.print(number1 + " " + number2);
	
	    for(int i = 1;i<=5;i++) 
        {		    
			int result = number1+number2;
			
			System.out.print(" " +result);
			
			number1 = number2;
			
			number2 = result;	
	    }
	}
}
