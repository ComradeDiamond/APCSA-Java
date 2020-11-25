//Dec to Hex
import java.util.Scanner;
public class Hex
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);
        System.out.print("Insert a decimal number to yeet into hex: ");
        
        int decimal = leScan.nextInt();
        leScan.close();

        int highMatch = base16Match(decimal, 0);
        String decHexString[] = decStringDivide(highMatch, decimal, "").split("/");

        String hexString = decStringConvert(decHexString, 0, "");
        System.out.println(hexString);

    }

    public static int base16Match(int decimal, int i)
    {
        return Math.pow(16, i) > decimal ? i-1 : base16Match(decimal, ++i);
    }

    //Ehhhh want to do array but ehhhhh that creates some problems with Java
    //This is why strict type is cancer
    //(base16Match result, decimal, "") :: -> decHexString split by "/"
    public static String decStringDivide(int i, int decimal, String decimalString)
    {
        int pow = (int)Math.pow(16, i);
        int resInt = decimal / pow;
        String decString = decimalString + resInt + "/";
        int toDivide = decimal - (pow * resInt);

        return toDivide > 15 ? decStringDivide(--i, toDivide, decString) : decString + toDivide;
    }

    // decHexString array, 0, "" :: -> hexString
    public static String decStringConvert(String[] decHexString, int i, String hexString)
    {
        String newStr = hexString + decToHexTable(Integer.parseInt(decHexString[i]));

        return i == decHexString.length - 1 ? newStr : 
            decStringConvert(decHexString, ++i, newStr);
    }

    public static String decToHexTable(int decimal)
    {
        if (decimal < 10 && decimal > 0)
        {
            return decimal + "";
        }
        
        switch (decimal)
        {
            case 0:
            return "";

            case 10:
            return "A";

            case 11:
            return "B";

            case 12:
            return "C";

            case 13:
            return "D";

            case 14:
            return "E";

            case 15:
            return "F";

            default:
            return "What the heck happened wtf";
        }
    }
}