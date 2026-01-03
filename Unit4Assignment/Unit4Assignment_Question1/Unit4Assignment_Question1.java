import java.util.Scanner; // import Scanner class from java.util package

public class Unit4Assignment_Question1 { // open class
    public static void main(String[] args) { // open main method
        Scanner input = new Scanner(System.in); // instantiate new Scanner object
        int sideLen = -1; // declare int and initialise to -1
        int area; // declare int

        while (sideLen <= 0) { // while sideLen is less than 0, run code within the loop 
            System.out.print("Input the side length of a square: "); // print prompt
            sideLen = input.nextInt(); // set sideLen equal to the next token, parsed as an int from System.in 
        } // close while loop

        area = computeAreaOfSquare(sideLen); // get value returned from computeAreaOfSquare method, passing sideLen as an arg, and set it to area (initialise it)

        System.out.println("Area of square with side length " + sideLen + ": " + area); // print the area of the square
    } // close main method
    
    public static int computeAreaOfSquare(int sideLen) { // decleare public static method computeAreaOfSquare with sideLen int param
        return sideLen * sideLen; // return the area by squaring sideLen
    } // close method
} // close class
