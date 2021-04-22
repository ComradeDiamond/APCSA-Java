public class Factorial {
    public static void main(String[] args) {
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("factorial(10) = " + factorial(10));
        System.out.println("factorial(100) = " + factorial(100));
    }

    public static double factorial(int n) {
        
        if (n == 1)
        {
            return 1;
        }

        return factorial(n - 1) * n;
    }
}
