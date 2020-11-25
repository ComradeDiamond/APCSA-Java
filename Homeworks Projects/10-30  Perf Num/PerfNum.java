import java.util.Scanner;
public class PerfNum
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);
        int divisors = 0;

        System.out.println("Insert a number to see if it is perfect!");
        int inputNum = leScan.nextInt();
        leScan.close();

        for (var i=1; i<inputNum; i++) 
        {
            if (inputNum % i == 0)
            {
                divisors += i;
            }
        }

        String out = divisors == inputNum ? inputNum + " is a perfect number!" : 
        inputNum + " is not a perfect number!";
        
        System.out.println(out);
    }
}