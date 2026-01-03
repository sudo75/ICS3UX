public class Circle {
    // int radius; - this would be package private

    private double radius; // only accessible to this class
    private String name;

    Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    Circle(int radius) {
        this.radius = radius;
    }

    Circle(String name) {
        this.name = name;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.141592;
    }

    public String getName() {
        return this.name;
    }

    static public double getArea(double radius) {
        return radius * radius * 3.141592;
    }
    
}
