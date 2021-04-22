public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println("sum1ToN(3) = " + sum1ToN(3));
        System.out.println("sum1ToN(10) = " + sum1ToN(10));
        System.out.println("sum1ToN(100) = " + sum1ToN(100));
    }

    public static int sum1ToN(int n) {
        if (n == 1)
        {
            return 1;
        }
        
        return n + sum1ToN(n - 1);
    }
}
