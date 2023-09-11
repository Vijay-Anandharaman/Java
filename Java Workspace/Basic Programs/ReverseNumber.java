package in.workspace.main;

public class ReverseNumber
{
	public static void main(String[] args)
    {
        long sum;
          
        long givenNumber = 8344777989l;
          
        sum = givenNumber;
        
        long reverse = 0;
        
        System.out.println("The given number is " + givenNumber);
        
        while(givenNumber>0)        	
        {
        	reverse = (reverse*10) + givenNumber%10;
        	
        	givenNumber = givenNumber/10;
        	
        }

        System.out.println("The given number changed to reverse " + reverse);         
     }
}
