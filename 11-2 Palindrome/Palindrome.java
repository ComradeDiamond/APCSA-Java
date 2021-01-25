import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);
        System.out.println("Enter your possible palindrome: ");

        //I think there's a better way to do this but Java's being really dumb with regex
        String str0 = leScan.nextLine();
        String str1 = str0.toLowerCase().replace(" ", "").replace(".", "");
        str1 = str1.replace("!", "").replace("?", "");
        String str2 = "";

        leScan.close();

        for (int i=str1.length() -1; i>=0; i--)
        {
            str2 += str1.charAt(i);
        }

        String res = str1.equals(str2) ? "Yes, " + str0 + " is a palindrome" : "No, " + str0 + 
        " is not a palindrome";
        System.out.println(res);
    }
}