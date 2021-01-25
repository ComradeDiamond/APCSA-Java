import java.util.Scanner;

public class PerfSquare
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);

        System.out.println("Gimee a number to see if it's a perfect square");

        int num = leScan.nextInt();
        leScan.close();

        if ((Math.sqrt(num) % 1) != 0)
        {
            System.out.println(num + " is not a square root");
        }
        else
        {
            System.out.println(num + " is a square root");
        }
    }
}