import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //Constructs the 2D String array - 2 rows and 4 columns

        //horizontal row, vertical column
        String[][] str2D = new String[2][4];

        //Fill out with random word
        Scanner input = new Scanner(System.in);

        //2D array traversing: you'll need to access the 1D array first to get the elements
        for (int row = 0; row < str2D.length; row++)
        {
            for (int column = 0; column < str2D[row].length; column++)
            {
                str2D[row][column] = input.nextLine();
            }
        }

        input.close();

        //Arrays.toString() will NOT work on 2D arrays because it returns the reference
        System.out.println(Arrays.toString(str2D));

        //You need to manually traverse it
        for (String[] column : str2D)
        {
            for (String item : column)
            {
                System.out.println(item + " ");
            }
        }
    }
}