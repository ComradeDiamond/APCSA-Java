import java.util.Scanner;

public class ArrayIntro
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);

        System.out.print("Enter the number of numbers to average: ");
        int[] numbers = new int[leScan.nextInt()];

        System.out.println("Enter the numbers: ");
        double sum = 0.0;

        for (int i=0; i<numbers.length; i++)
        {
            numbers[i] = leScan.nextInt();
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("average: " + average);

        int aboveAvg = 0;
        for (int i=0; i<numbers.length; i++)
        {
           if (numbers[i] > average)
           {
               aboveAvg++;
           } 
        }

        System.out.println("The number of items above average: " + aboveAvg);
        leScan.close();
    }
}