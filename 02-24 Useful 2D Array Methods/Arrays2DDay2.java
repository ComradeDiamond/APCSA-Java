import java.util.Arrays;

public class Arrays2DDay2 {
    public static void main(String[] args) {
        // These represent scores of Test0, Test1, Test2 and Test3
        int[] student0 = { 100, 85, 95, 96 };
        int[] student1 = { 99, 100, 100, 95 };
        int[] student2 = { 92, 100, 99, 100 };
        int[] student3 = { 100, 95, 97, 99 };
        int[] student4 = { 100, 100, 100, 70 };
        int[] student5 = { 100, 98, 99, 98 };
        int[] student6 = { 100, 95, 100, 93 };

        // Declare a 2D array grades and use initializer lists to
        // fill its rows with student0, student1, ..., student6
        int[][] grades = {student0, student1, student2, student3, student4, student5, student6};

        System.out.println("Row index of 70 is: " + getRowIndex(70, grades));
        System.out.println("Column index of 70 is: " + getColumnIndex(70, grades));
        System.out.println("The 4th row is: " + Arrays.toString(getRow(3, grades)));
        System.out.println("The 4th column is: " + Arrays.toString(getColumn(3, grades)));
    }
    // Write a static method getRowIndex(int value)
    public static int getRowIndex(int value, int[][] matrix)
    {
        for (int r = 0; r < matrix.length; r++)
        {
            for (int num : matrix[r])
            {
                if (num == value)
                {
                    return r;
                }
            }
        }

        return -1;
    }

    // Write a static method getColumnIndex(int value)
    public static int getColumnIndex(int value, int[][] matrix)
    {
        for (int c = 0; c < matrix[0].length; c++)
        {
            for (int r = 0; r < matrix.length; r++)
            {
                if (matrix[r][c] == value)
                {
                    return c;
                }
            }
        }

        return -1;
    }

    // Write a static method getRow(int rowIndex) that returns the array
    // at rowIndex
    public static int[] getRow(int rowIndex, int[][] matrix)
    {
        return matrix[rowIndex];
    }

    // Write a static method getColumn(int index) that returns an
    // array that represents the values at columnIndex
    public static int[] getColumn(int index, int[][] matrix)
    {
        int[] column = new int[matrix.length];
        int counter = 0;

        for (int r = 0; r < matrix.length; r++)
        {
            column[counter] = matrix[r][index];
            counter++;
        }

        return column;
    }
}