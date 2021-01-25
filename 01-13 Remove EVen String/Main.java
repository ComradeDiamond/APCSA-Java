import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Sherry", "Cherry", "Meh"));
        removeEvenStr(arr);
        System.out.println(arr);
    }

    public static void removeEvenStr(ArrayList<String>arr)
    {
        int arrSize = arr.size();

        for (int i=arrSize - 1; i>=0; i--)
        {
            if (arr.get(i).length() % 2 == 0)
            {
                arr.remove(i);
            }
        }
    }
}