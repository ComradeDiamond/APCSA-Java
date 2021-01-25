//Challenge 2
import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);
        System.out.println("Insert a 3 digit number to reverse!");

        int num = leScan.nextInt();
        leScan.close();

        int digit1 = num % 10;
        int digit3 = num / 100;
        int digit2 = ((num - digit3*100) - digit1)/10;

        System.out.println("The reverse is: " + digit1 + digit2 + digit3);
    }
}