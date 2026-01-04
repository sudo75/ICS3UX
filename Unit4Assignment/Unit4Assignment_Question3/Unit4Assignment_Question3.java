import java.util.Scanner; // import Scanner class from java.util
public class Unit4Assignment_Question3 { // declare class
    public static void main(String[] args) { // declare main method
        int lenTop, lenBottom, height; // declare 3 ints
        double area; // declare double
        Scanner input = new Scanner(System.in); // declare and initialise input as a new Scanner obj
        
        do { // run the code in the loop once
            System.out.print("Input the length of the top side: "); // print a prompt for top side len
            lenTop = input.nextInt(); // get the next token from the terminal as an int and store the result in lenTop
        } while (lenTop <= 0); // run the code in the loop if lenTop is less than or equal to 0

        do { // run the code in the loop once
            System.out.print("Input the length of the bottom side: "); // print a prompt for bottom side len
            lenBottom = input.nextInt(); // get the next token from the terminal as an int and store the result in lenBottom
        } while (lenBottom <= 0); // run the code in the loop if lenBottom is less than or equal to 0

        do { // run the code in the loop once
            System.out.print("Input the height: "); // print a prompt for height
            height = input.nextInt(); // get the next token from the terminal as an int and store the result in height
        } while (height <= 0); // run the code in the loop if height is less than or equal to 0

        area = computeAreaOfTrapezoid(lenTop, lenBottom, height); // storing the result of computeAreaOfTrapezoid in area 

        System.out.println("The area of the trapezoid is " + area); // print area

    } // close main method
    
    public static double computeAreaOfTrapezoid(int lenTop, int lenBottom, int height) { // declare a method that takes 3 ints as args and returns a double
        return ((double) lenTop + (double) lenBottom) / 2.0 * (double) height; // return the area of the trapezoid
    } // close the method
} // close class
