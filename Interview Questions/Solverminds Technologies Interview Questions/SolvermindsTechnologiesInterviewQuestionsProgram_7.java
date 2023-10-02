package in.workspace.main;

class Prog1
{
     static String s = "CCC";

     static
     {
	   s = s + "AAA";
     }

     {
	   s = "CCCAAA";
     }
}

public class SolvermindsTechnologiesInterviewQuestionsProgram_7 extends Prog1
{
	    static
    	{
		   s = s+"AAACCC";
	    }
	
	    {
		   System.out.println(s);
	    }
	    
	    public static void main(String[] ab)
	    {
	    	SolvermindsTechnologiesInterviewQuestionsProgram_7 obj = new SolvermindsTechnologiesInterviewQuestionsProgram_7();
	    }
}
