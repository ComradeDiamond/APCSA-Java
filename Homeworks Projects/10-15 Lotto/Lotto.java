import java.util.Scanner;

public class Lotto
{
    public static void main(String[] args)
    {
        //Select number
        int matchNum = (int) Math.round(Math.random() * 99);

        //Scanner
        Scanner leScan = new Scanner(System.in);
        System.out.println("Insert a lotto number!");

        int intNum = leScan.nextInt();
        leScan.close();

        /* If any any digits match, one digit will return 0 during subtraction*/
        int finalRes = matchNum - intNum;
        //Reversible number or smth idk I hate math
        int reversibleStuff = ((matchNum % 10)* 10 + matchNum / 10) - intNum;

        if (finalRes == 0)
        {
            System.out.println("You won $10!");
        }
        else
        {
            if (reversibleStuff == 0)
            {
                System.out.println("You won $3!");
            }
            else if (reversibleStuff % 10 == 0 || reversibleStuff / 10 == 0 || finalRes % 10 == 0 || finalRes/10 == 0)
            {
                System.out.println("You won $1!");
            }
            else
            {
                System.out.print("you won nothing lmao");
            }
        }
    }
}