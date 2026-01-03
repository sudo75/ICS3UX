/*
Eric Skaftason
Surface_Area_Cube.java - outputs the surface area of a cube given a sidelength
2025-10-27
ICS-3UX
*/

import java.util.Scanner; // imports the scanner class from the java.util package

public class Surface_Area_Cube { // declares the public class Surface_Area_Cube
    public static void main(String [] args) { // declares the main method

        Scanner input = new Scanner(System.in); // instantiate a scanner object named input to get user input

        int edgeLen; // declares an int edgeLen
        int surfaceArea; // declares an int surfaceArea


        System.out.print("Input edge length of cube: "); // Prints "Input edge length of cube: "
        edgeLen = input.nextInt(); // gets user input and sets it to the int edgeLen

        surfaceArea = edgeLen * edgeLen * 6; // multiplies edgeLen by edgeLen by 6, storing the result in int surfaceArea

        System.out.println("The surface area of a cube with a side length of " + edgeLen + " unit is: " + surfaceArea + " square units."); // Prints the result as a statement

    } // closes the body of the main method
} // closes the body of the Surface_Area_Cube class