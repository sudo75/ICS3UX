public class Factorial {
    public static int computeFactorial(int n) {
        if (n < 1) System.err.println("Cannot accept integers less than 1");
        if (n == 1) return 1;

        // if n > 1
        return n * computeFactorial(n - 1);
    }
}
