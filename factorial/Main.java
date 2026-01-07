import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("--- Input command ---");

            String command = input.nextLine();

            switch (command) {
                case "fact":
                    promptFactorial(input);
                    break;
                case "pow":
                    promptPow(input);
                    break;
                case "newcir":
                    promptNewCircle(input);
                    break;
                case "cir":
                    promptCircle(input);
                    break;
            
                default:
                    break;
            }
            input.nextLine(); // clear input buffer
        }
        
    }

    public static void promptFactorial(Scanner input) {
        System.out.print("Input int n to compute n!: ");
        int n = input.nextInt();

        int nfact = Factorial.computeFactorial(n);
        System.out.println(n + "! = " + nfact);
    }

    public static void promptPow(Scanner input) {
        System.out.print("Input base to compute: ");
        int base = input.nextInt();

        System.out.print("Input exp to compute: ");
        int exp = input.nextInt();

        int result = Utils.pow(base, exp);
        System.out.println(base + "^" + exp + " = " + result);
    }

    public static void promptCircle(Scanner input) {
        System.out.print("Input radius (double): ");
        double radius = input.nextDouble();

        System.out.println("Radius: " + Circle.computeArea(radius));

    }

    public static void promptNewCircle(Scanner input) {
        System.out.print("Input radius (double): ");
        double radius = input.nextDouble();

        input.nextLine(); // clear input buffer until and including \n

        System.out.print("Input label (String) or Enter to use default label: ");
        String label = input.nextLine();

        Circle circle = label.isEmpty() ? new Circle(radius) : new Circle(radius, label);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Label: " + circle.getLabel());
        System.out.println("Area: " + circle.computeArea());
    }
}
