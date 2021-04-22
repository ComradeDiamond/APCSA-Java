public class Exponent {
    public static void main(String[] args)
    {
        System.out.println("exponent(3, 3) = " + exponent(3, 3));
    }

    public static int exponent(int base, int power)
    {
        if (power == 0)
        {
            return 1;
        }

        return exponent(base, power - 1) * base;
    }
}
