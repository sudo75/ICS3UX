/*
Eric Skaftason
Program 4 - prints average height, tallest height and shortest height of a class given student data
2025-11-07
ICS-3UX
*/

import java.util.Scanner; // import the Scanner class from java.util
import java.text.DecimalFormat; // import DecimalFormat class from java.text
public class Unit3Assignment_Question4 { // define a public class
    public static void main(String[] args) { // define main method
        int students = -1; // declare a new integer students and initialise
        double height, sumHeight = 0.0, avgHeight, minHeight = -1.0, maxHeight = -1.0; // declare 4 doubles, instantiate 3
        Scanner input = new Scanner(System.in); // instantiate new scanner object 
        DecimalFormat df = new DecimalFormat("0.00"); // round to 2 decimal places

        do { // run the loop at least once
            System.out.print("Input number of students: "); // print "Input number of students: " without newline
            students = input.nextInt(); // initialise students as the next integer value from the console
            input.nextLine(); // clear the input buffer to remove the \n char using nextLine method
        } while (students <= 0); // run loop while # of students is less than or equal to 0

        for (int i = 0; i < students; i++) { // for loop that runs while i is less than students, increments each iteration, i is initially 0
            System.out.print("Input height of student #" + (i + 1) + ": "); // prints a prompt for the use to input the height of student i
            height = input.nextDouble(); // gets height value from the console as a double
            input.nextLine(); // clear the input buffer

            while (height <= 0) { // run loop if height is less than or equal to 0
                System.out.println("Invalid input"); // print "Invalid input"
                
                System.out.print("Input height of student #" + (i + 1) + ": "); // prints a prompt for the use to input the height of student i
                height = input.nextDouble(); // gets height value from the console as a double
                input.nextLine(); // clear the input buffer
            } // close loop

            sumHeight += height; // add the height to the sum counter variable


            // Both if statements should run because a value can be the least and greatest at the same time

            if (minHeight == -1.0 || height < minHeight) { // if minHeight equals -1.0 (the initial value) or the new height value is less than it
                minHeight = height; // set minHeight equal to the current iteration's inputted height
            } // close if statement

            if (maxHeight == - 1.0 || height > maxHeight) { // if maxHeight equals -1.0 (the initial value) or the new height value is greater than it
                maxHeight = height; // set maxHeight equal to the current iteration's inputted height
            } // close if statement
        } // close for loop

        avgHeight = sumHeight / students; // calculate average height by dividing the sum by the number of students

        // Print number of students, shortest student height, tallest student, and average height, each on a seperate line
        System.out.println(
            "\nShortest student: " + df.format(minHeight) + 
            "\nTallest student: " + df.format(maxHeight) + 
            "\nAverage student: " + df.format(avgHeight)
        );
        
    } // close main method
} // close public class