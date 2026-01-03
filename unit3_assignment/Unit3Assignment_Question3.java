/*
Eric Skaftason
Program 3 - prints out the sum of the first 100 multiples of 5
2025-11-07
ICS-3UX
*/

public class Unit3Assignment_Question3 { // define new public class
    public static void main(String[] args) { // define main method
        int multiple = 1, sum = 0, multipleValue; // declare 3 ints, initialise multiple & sum
        final int MULTIPLE_OF = 5, MAX_MULTIPLE = 100; // declare and initialise 2 constant integers

        while (multiple <= MAX_MULTIPLE) { // run the loop while multiple is less than or equal to MAX_MULTIPLE (100) so it runs 100 times
            multipleValue = multiple * MULTIPLE_OF; // set multipleValue equal to multiple * MULTIPLE_OF (e.g. multipleValue = 12 * 5 = 60 -- so the twelfth iteration = 60)

            if (multiple == 1) { // on the first iteration run the code within the if statement
                System.out.print(multipleValue); // print the multipleValue
            } else { // run the code within the else block if multiple does not equal 1 -- do not add a + sign on first iteration
                System.out.print(" + " + multipleValue); // print the " + " and multipleValue
            } // close else statement
            
            sum += multiple * MULTIPLE_OF; // add the current multiple (multiple * MULTIPLE_OF) to the current sum value
            
            multiple++; // increment multiple
        }

        System.out.println(" = " + sum); // print an equals sign and the sum of all multiples
    } // close main method
} // close class