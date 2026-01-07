public class Circle {
    private double radius;
    private String label = "default_value";
    private final double PI = Math.PI;

    Circle(double radius, String label) {
        this.radius = radius;
        this.label = label;
    }

    Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double computeArea(double radius) {
        
        // return radius * radius * PI; // cannot use instance vars in a static method
        return radius * radius * Math.PI;
    }

    public double computeArea() {
        return radius * this.radius * PI;
    }
}
