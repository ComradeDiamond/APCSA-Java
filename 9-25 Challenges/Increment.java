//Challenge 3
import java.util.Scanner;

public class Increment
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);
        System.out.print("Insert a 5 digit number to increment: ");

        int num = leScan.nextInt();
        //Array num = num.toString().split("");
        leScan.close();

        //Puts the stuff in the back in the front
        int tempNum;
        for (int i=0; i<5; i++)
        {
            tempNum = ((num % 10) + 1)%10;
            num = (num/10) + (tempNum * 10000);
        }

        System.out.print("Reversed number: " + num);
    }
}