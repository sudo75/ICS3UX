import java.util.Scanner; // import Scanner class from java.util
public class Unit4Assignment_Question2 { // create public class
    public static void main(String[] args) { // create main method
        Scanner input = new Scanner(System.in); // instantiate new Scanner obj
        int radius = -1; // declare and init int to -1
        double area; // declare double

        while (radius < 0) { // while radius is less than 0 run the code in the loop
            System.out.print("Input circle radius: "); // print a prompt for the user to input the radius
            radius = input.nextInt(); // set radius to the next token parsed as an int
        } // close loop

        area = computeAreaOfCircle(radius); // set area to the returned result from computeAreaOfCircle method passing radius as an arg

        System.out.println("The area of a circle with radius " + radius + " is " + area); // print the area of the circle
    } // close main method

    public static double computeAreaOfCircle(double radius) { // declare public static computeAreaOfCircle method and return type double
        return Math.PI * radius * radius; // return pi*radius^2
    } // close method
} // close class
