public class Main {
    public static void main(String[] args)
    {
        //What will the value of x be when the loop finishes?
        int x = 0;

        for (int i=0; i<10; i++)
        {
            if (x%2 == 0 && x%3 == 0)
            {
                x++;
            }
        }

        System.out.println(x);
    }
}
