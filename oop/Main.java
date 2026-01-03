public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3, "Thomas");

        System.out.println("hi");

        double area1 = c1.getArea();
        double area2 = c2.getArea();
        double area3 = Circle.getArea(3);

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
    }
}
