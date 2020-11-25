//Challenge 1
import java.util.Scanner;

public class Averager 
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);
        System.out.println("Hello Justin!");
        System.out.println("Insert 3 Numbers to Average:");

        double num = leScan.nextDouble();
        num += leScan.nextDouble();
        num += leScan.nextDouble();

        leScan.close();
        
        double average = num/3;
        System.out.print("The average is: " + average);
    }
}