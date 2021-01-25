import java.util.Arrays;

public class TurnerSmart {

    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }

    public static int binarySearch(int[] array, int number)
    {
        Arrays.sort(array);
        int idx = Arrays.binarySearch(array, number);
        return idx;
    }

    public static void main(String[] args)
    {
        int[] x = {3, 2, 1, 3, 5, 6, 7, 9, 10, 12};
        System.out.println(binarySearch(x, 5));
    }
}
