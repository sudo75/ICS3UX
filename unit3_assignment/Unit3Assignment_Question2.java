/*
Eric Skaftason
Program 2 - prints 1, 2, 3... 29, 30 across the screen
2025-11-03
ICS-3UX
*/
public class Unit3Assignment_Question2 { // define a new class
    public static void main(String[] args) { // open main method 
        int number = 1; // declare and initialise a new integer and set its value to 1

        while (number <= 30) { // run the loop while number is less than or equal to 30
            System.out.print(number + " "); // print the number and add a space
            number++; // increment the number so the loop does not run forever -- it will only run for 30 iterations: 1, 2 ... 29, 30
        } // close the while loop

    } // close main method
} // close public class