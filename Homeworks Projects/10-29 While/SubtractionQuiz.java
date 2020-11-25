import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[] args)
    {
        double startTime = System.currentTimeMillis();
        int currNum = 0;

        Scanner leScan = new Scanner(System.in);

        for (int i=0; i<5; i++)
        {
           int num1 = (int)Math.round(Math.random() * 10);
           int num2 = (int)Math.round(Math.random() * 10);
        
           System.out.println("What is " + num1 + " - " + num2 + "?");
           
           if (leScan.nextInt() == (num1 - num2))
           {
               System.out.println("You are correct!");
               currNum++;
           }
           else
           {
                System.out.println("You are wrong! The answer is " + (num1 - num2) + "!");
           }
        }
        leScan.close();

        double endTime = System.currentTimeMillis();
        System.out.println("You got " + currNum + " correct in " + (endTime - startTime)/1000 +
        " seconds!");
    }
}
