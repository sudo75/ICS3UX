import java.util.Scanner; 

public class ScannerInput {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        double num1, num2, result;
        String name;

        System.out.print("Who are you? ");
        name = input.nextLine();

        System.out.print("Input a number: ");
        num1 = input.nextDouble();

        System.out.print("Input another number: ");
        num2 = input.nextDouble();

        result = num1 + num2;

        System.out.println("Hello " + name + ". " + num1 + " + " + num2 + " = " + result);
    }
}
