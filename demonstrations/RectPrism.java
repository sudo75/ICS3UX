import java.util.Scanner;
public class RectPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length, width, height, surfaceArea;

        System.out.print("Length: ");
        length = Float.parseFloat(input.nextLine());

        System.out.print("Width: ");
        width = Float.parseFloat(input.nextLine());

        System.out.print("Height: ");
        height = Float.parseFloat(input.nextLine());

        surfaceArea = 2 * (length * width + length * height + width * height);

        System.out.println("Surface area = " + surfaceArea);
    }
}
