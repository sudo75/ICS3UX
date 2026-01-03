import java.text.DecimalFormat; // import DecimalFormat class from java.text

public class Unit3Assignment_Question5 { // declare public class
    public static void main(String[] args) { // declare main method
        final double INTEREST_RATE = 0.0875; // declare and initialise the interest rate as a constant double value
        final double YEARS = 10; // declare and initialise the number of years as a constant double value

        final DecimalFormat df = new DecimalFormat("#,##0.00"); // instantiate a new decimal format object to formate numbers with 2 decimal places and thousand separators

        double initialBalance, interest, balance; // declare 3 doubles

        initialBalance = 2000.0; // initialise initialBalance to 2000.0

        for (int i = 0; i < YEARS; i++) { // run a loop while i is less than years, increment i each time, i is initially 0
            interest = initialBalance * INTEREST_RATE; // calculate interest by multiplying the initial balance by the interest rate
            balance = initialBalance + interest; // calculate the balance by adding the year's initial balance to the interest

            // Print the year, initial balance, interest, and final balance
            System.out.println("Year " + (i + 1) + " - Initial balance: $" + df.format(initialBalance) + ", Interest: $" + df.format(interest) + ", Final: $" + df.format(balance));

            initialBalance = balance; // set the initialBalance equal to the current balance so the next iteration runs correctly
        } // close the for loop
    } // close the main method
} // close the class
