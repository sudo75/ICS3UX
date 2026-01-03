import java.util.Scanner;
public class Unit4Assignment_Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = -1;
        double area;

        while (radius < 0) {
            System.out.print("Input circle radius: ");
            radius = input.nextInt();
        }

        area = computeAreaOfCircle(radius);

        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }

    public static double computeAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
