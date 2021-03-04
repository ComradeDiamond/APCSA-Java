import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // 1) Take the dimensions of the 2D array and create an array off that
        Scanner scanz = new Scanner(System.in);
        
        System.out.print("Insert the number of rows: ");
        int row = scanz.nextInt();

        scanz.nextLine(); //throwaway new line

        System.out.print("Insert the number of columns: ");
        int column = scanz.nextInt();

        scanz.close();

        double[][] matrix = new double[row][column];
        
        // 2) Fill the 2D array with Math.random()
        for (int i = 0; i < matrix.length; i++)
        {
            for (int c = 0; c < matrix[i].length; c++)
            {
                matrix[i][c] = Math.random();
            }
        }

        System.out.println("-------------------------");

        // 3) Prints the array
        System.out.println("The array: ");
        System.out.println(Arrays.deepToString(matrix)); //Calls deepToString recursively

        System.out.println("-------------------------");

        // 4) Prints the sum of each row
        System.out.println("Sum of each row: ");

        for (int i = 0; i < matrix.length; i++)
        {
            double sum = 0;
            for (double num : matrix[i])
            {
                sum += num;
            }

            //idk bc we don't start counting at 0
            System.out.println("Row " + (i + 1) + " : " + sum);
        }
        
        System.out.println("-------------------------");
        
        // 5) Prints the sum of each column
        System.out.println("Sum of each column: ");

        for (int columnNum = 0; columnNum < matrix[0].length; columnNum++)
        {
            double sum = 0;
            for (int i = 0; i < matrix.length; i++)
            {
                sum += matrix[i][columnNum];
            }

            System.out.println("Row " + (columnNum + 1) + " : " + sum);
        }
    }
}