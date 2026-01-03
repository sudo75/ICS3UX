import java.util.Scanner;
public class Unit4Assignment_Question3 {
    public static void main(String[] args) {
        int lenTop, lenBottom, height;
        double area;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Input the length of the top side: ");
            lenTop = input.nextInt();
        } while (lenTop <= 0);

        do {
            System.out.print("Input the length of the bottom side: ");
            lenBottom = input.nextInt();
        } while (lenBottom <= 0);

        do {
            System.out.print("Input the height: ");
            height = input.nextInt();
        } while (height <= 0);

        area = computeAreaOfTrapezoid(lenTop, lenBottom, height);

        System.out.println("The area of the trapezoid is " + area);

    }
    
    public static double computeAreaOfTrapezoid(int lenTop, int lenBottom, int height) {
        return ((double) lenTop + (double) lenBottom) / 2.0 * (double) height;
    }
}
