import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args)
    {
        Scanner leScan = new Scanner(System.in);
        int magicNum = (int)Math.round(Math.random() * 99 + 1);

        game(leScan, magicNum);
    }

    public static void game(Scanner leScan, int target)
    {
        System.out.print("Pick a magical number from 1 to 100: ");
        int num = leScan.nextInt();

        if (num == target)
        {
            leScan.close();
            System.out.println("ayyy! You guessed it!");
        }
        else
        {
            if (num > target)
            {
                System.out.println("The guess was too high!");
            }
            else
            {
                System.out.println("The guess was too low!");
            }

            game(leScan, target);
        }
    }
}
