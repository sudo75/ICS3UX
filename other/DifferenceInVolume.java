import java.util.Scanner;
import java.text.DecimalFormat;

public class DifferenceInVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius, height, volumeCone, volumeCylinder, volumeDifference;
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Get user input
        System.out.print("Input radius: ");
        radius = input.nextDouble();

        System.out.print("Input height: ");
        height = input.nextDouble();

        // Compute volumes
        volumeCone = 1.0 / 3.0 * Math.PI * radius * radius * height;
        volumeCylinder = Math.PI * radius * radius * height;

        // Compute difference in volume
        volumeDifference = volumeCylinder - volumeCone;

        System.out.println("The difference in volume of the cylinder and cone is: " + df.format(volumeDifference) + ".");
    }
}
