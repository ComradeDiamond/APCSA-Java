import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        String[] a = {"four", "scores", "and", "sixty", "five", "years", "in", "the", "past"};
        swapPairs(a);

        System.out.println(Arrays.toString(a));
    }
    
    public static void swapPairs(String[] array)
    {
        for (int i=0; i+1<array.length; i+= 2)
        {
            String temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
    }
}