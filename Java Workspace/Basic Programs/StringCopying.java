package in.workspace.main;

public class StringCopying
{
	public static void main(String[] args)
    {
		
		String v1 = "Vijay";

		String v2 = "";
		
		for(int i = 0; i<v1.length();i++)
		{
			v2=v2+v1.charAt(i);
		}
	
		System.out.println("The given string is : " + v1);

		System.out.println("The copied string is : " + v2);
	}
}
