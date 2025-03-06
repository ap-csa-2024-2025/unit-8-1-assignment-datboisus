import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
   int [][] mat = productTable (0,0);
   for (int[] row : main)
   {
    for (int elem :)
   }
  }


  public static int sumOfDiag(int[][] mat)
  {
    int sum = 0;
    for (int row = 0; row < mat.length; row++)
    {
      for (int col = 0; col < mat[row].length; col++)
      {
        if (row == col)
        {
          sum += mat[row][col];
        }
      }
    }
    
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    int [][] mat = new int [numRows][numCols];
    for (int r = 0; r < numRows; r++)
    {
      for (int col = 0; c < numCols; c++)
      {
        mat[r][c] = r * c;
      }
    }
    return mat;
  }
}
