/*Correctly round a double to the nearest whole number, then cast it to an int*/
import java.util.Scanner;

public class DoubleCast
{
    public static void main(String[] args)
    {
        Scanner scanMeh = new Scanner(System.in);
        System.out.print("Insert something for me to scan:  ");

        double inputNum = scanMeh.nextDouble();
        scanMeh.close();

        //Idk but if Math libraries are the same it will work
        int finNum = (int) Math.round(inputNum);
        System.out.print("Ye I rounded it: " + finNum);
    }
}