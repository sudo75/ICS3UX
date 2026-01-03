import java.util.Scanner;
public class SumOfSequence {
    public static void main(String[] args) {
        double x;
        int n = -1;

        int exponent;

        double iterationTotal;
        double sum = 0.0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Input x: ");
        x = input.nextDouble();

        do {
            System.out.print("Input n: ");
            n = input.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                iterationTotal = 1.0;
            } else {
                exponent = 2 * i + 1;
                iterationTotal = Math.pow(x, exponent);
            }

            sum += iterationTotal;
        }

        System.out.println("Sum: " + sum);
    }
}
