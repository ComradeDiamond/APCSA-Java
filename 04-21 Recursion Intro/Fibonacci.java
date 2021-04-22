public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("fibonacci(4) = " + fibonacci(4));
        System.out.println("fibonacci(7) = " + fibonacci(7));
        System.out.println("fibonacci(10) = " + fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2)
        {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}