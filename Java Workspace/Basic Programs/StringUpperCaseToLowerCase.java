package in.workspace.main;

public class StringUpperCaseToLowerCase
{
	public static void main(String[] args)
    {
		String name1 = "VIJAY";
		
		String name2 = "";
		
		for(int i = 0; i<name1.length();i++)
		{
			name2 = name2 + (char) (name1.charAt(i) + 32);
		}
		System.out.print(name2);	
	}
}
