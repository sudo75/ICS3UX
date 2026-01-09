public class Circle {
    public static void main(String[] args) {
        System.out.println(Perimeter_of_Circle(3));
        System.out.println(Perimeter_of_Circle(1));
    }

    public static double Perimeter_of_Circle(int radius) {
        double perimeter = radius * 2.0 * Math.PI;
        return perimeter;
    }
}
