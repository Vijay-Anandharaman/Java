package in.workspace.main;

public class NumberSeriesPatternProgram_9
{
    public static void main(String args[])
    {
        for(int i=8;i>=1;i--)
        {
            for(int j=8;j>=i;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
