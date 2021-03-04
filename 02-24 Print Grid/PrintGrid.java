import java.util.Arrays;

public class PrintGrid
{
  public static void main(String[] args)
  {
    String[][] grid = {{"A","B","C","D","E"},
                        {"F","G","H","I","J"},
                        {"K","L","M","N","O"},
                        {"P","Q","R","S","T"}};

    //For loop
    for (int r = 0; r < grid.length; r++)
    {
        for (int c = 0; c < grid[0].length; c++)
        {
            System.out.print(grid[r][c] + " ");
        }
        System.out.println();
    }
    
    //Enhanced for loop
    for (String[] arr : grid)
    {
        for (String str : arr)
        {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    //Print row major order
    for (int r = 0; r < grid.length; r++)
    {
        for (int c = 0; c < grid[0].length; c++)
        {
            System.out.print(grid[r][c] + " ");
        }
    }

    System.out.println();

    //Print column major order
    for (int c = 0; c < grid[0].length; c++)
    {
        for (int r = 0; r < grid.length; r++)
        {
            System.out.print(grid[r][c] + " ");
        }
    }

    System.out.println();
  }
}