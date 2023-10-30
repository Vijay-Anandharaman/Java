package in.workspace.main;

public class NumberSeriesPatternProgram_4 {

	public static void main(String[] args) {
	
		int n = 9;
		
		for(int i=1;i<=9;i++)
		{
			int num = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+ " ");
				num = num+n-j;
			}
			System.out.println();
		}
	
	}
}