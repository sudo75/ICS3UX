import java.util.Scanner;
public class SumSqrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int int1, int2, sum = 0;

        System.out.print("Please enter your first number: ");
        int1 = input.nextInt();
        input.nextLine();

        System.out.print("Please enter your second number: ");
        int2 = input.nextInt();
        input.nextLine();

        int i = int1;
        while (i <= int2) {
            if (i % 2 == 0) {
                sum += i * i;
            }
            i++;
        }

        System.out.println("The sum of all even numbers between " + int1 + " and " + int2 + " is " + sum);
    }
}
