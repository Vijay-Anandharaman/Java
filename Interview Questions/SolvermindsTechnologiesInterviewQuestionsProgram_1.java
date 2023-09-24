package in.workspace.main;

public class SolvermindsTechnologiesInterviewQuestionsProgram_1
{
	int num = 100;
	
	public void prog(int num)
	{
		this.num = num*10;
	}
	
	public void printNum()
	{
		System.out.println(num);
	}

	public static void main(String[] args)
    {
		SolvermindsTechnologiesInterviewQuestionsProgram_1 obj = new SolvermindsTechnologiesInterviewQuestionsProgram_1();
		obj.prog(2);	
		obj.printNum();
	}
}
