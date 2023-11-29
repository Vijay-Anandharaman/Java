package in.workspace.main;

public class NumberSeriesPatternProgram_17
{
    public static void main(String args[])
    {
        for(int i=9;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i=2;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");            
            }
            System.out.println();
        }
    }
}
