package in.workspace.main;

public class NumberSeriesPatternProgram_18
{
    public static void main(String args[])
    {
        int value = 1, minCol = 0, maxCol = 3, minRow = 0, maxRow = 3;
        
        int[][] spiral = new int[4][4];

        while(value<=16)
        {
            for(int col=minCol;col<=maxCol;col++)
            {
                spiral[minRow][col] = value;
                value++;
            }
            for(int row=minRow+1;row<=maxRow;row++)
            {
                spiral[row][maxCol] = value;
                value++;
            }
            for(int col=maxCol-1;col>=minCol;col--)
            {
                spiral[maxRow][col] = value;
                value++;
            }
            for(int row=maxRow-1;row>=minRow+1;row--)
            {
                spiral[row][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxRow--;
            maxCol--;
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(spiral[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
