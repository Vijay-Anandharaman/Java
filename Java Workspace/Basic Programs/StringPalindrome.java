package in.workspace.main;

public class StringPalindrome
{
	public static void main(String[] args)
    {			
		String s1 = "madam";
		
		String s2 = "";
		
		for(int i = s1.length()-1; i>=0;i--)
		{
			s2=s2+(s1.charAt(i));
		}
		
		System.out.println("The given string is : " + s1);
        
		if(s1.equals(s2))
		{
			System.out.println("Given string is palindrome : " + s2);
		}
		else
		{
			System.out.println("Given string is not palindrome : " + s2);
		}
	}
}
