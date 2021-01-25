import java.util.Scanner;
public class Sentinel {
    public static void main(String[] args)
    {
        int cummL = 0;
        boolean thingy = true;
        Scanner leScan = new Scanner(System.in);

        while (thingy)
        {
            System.out.print("Enter an integer (the sentinel ends if it is 0): ");
            int scanInt = leScan.nextInt();

            if (scanInt == 0)
            {
                thingy = false;
                leScan.close();
                System.out.println("The total is " + cummL + "!");
            }
            else
            {
                cummL += scanInt;
            }
        }
    }
}
