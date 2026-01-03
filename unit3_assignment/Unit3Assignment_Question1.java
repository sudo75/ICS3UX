/*
Eric Skaftason
Program 1 - classifies athletes into weight categories
2025-11-03
ICS-3UX
*/

import java.util.Scanner; // import the Scanner class from java.util package

public class Unit3Assignment_Question1 { // create a new public class
    public static void main(String[] args) { // define the main method of the class
        Scanner input = new Scanner(System.in); // instantiate a new scanner object
        double weight; // declare a new double weight

        System.out.print("Input athlete weight: "); // prints a promt for the user to input weight
        weight = input.nextDouble(); // initialise weight setting it to the next double on the command line

        if (weight > 80.0) { // if weight is greater than 80 run the code within the braces
            System.out.println("You are heavyweight"); // print "You are heavyweight" and add a new line
        } else if (weight >= 60.0) { // if weight is greater or equal to 60 (and not greater than 80 because it is an else if statement)
            System.out.println("You are medium weight"); // print "You are medium weightght" and add a new line
        } else if (weight < 60.0 && weight > 0.0) { // if weight is less than 60 and greater than 0 (and does not fit the above criteria)
            System.out.println("You are light weight"); // print "You are light weight" and add a new line
        } else { // catch all other cases
            System.out.println("Invalid weight"); // print "Invalid weight" and add a new line
        } // close else statement
        
    } // close main method
} // close public class