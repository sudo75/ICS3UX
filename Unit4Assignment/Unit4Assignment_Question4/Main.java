import java.text.DecimalFormat; // import DecimalFormat class from java.text
import java.util.*; // import all classes from the java.util package
public class Main{ // declare main class

	public static void main (String [] args){ // declare main method
		
		Scanner input = new Scanner(System.in); // instantiate new Scanner obj with System.in as the input source
        DecimalFormat df = new DecimalFormat("#,##0.00"); // create new DecimalFormat obj to format for money
		
		//variables to store the number of hamburgers, salads, chicken nuggets
		//and sodas the user enters
		int numHamburgers, numSalads, numNuggets, numSodas; // declare 4 ints
		
		//'total' stores the total amount of money spent on food
		double total = 0.0; // declare and init total double

        final double HST_PRICE_FACTOR = 1.13; // make a constant double - HST factor
		
		
		Food hamburger = new Food(2.35, 8, 32, 12); // create new Food obj passing in 4 args for hamburger data
		Food salad = new Food(2.00, 1.5, 5, 3); // create new Food obj passing in 4 args for salad data
		Food nuggets = new Food(4.95, 18, 16, 15); // create new Food obj passing in 4 args for nuggets data
		Food soda = new Food(1.85, 0, 56, 0); // create new Food obj passing in 4 args for soda data
		
		//Write the code below to prompt user for each type of food and output nutritional value
		
        int orderNumber = 1; // declare new int and init to 1

        while (true) { // run the loop indefinately until break statement
            System.out.println("Order #" + orderNumber + '\n'); // prin the order number

            System.out.print("Number of hamburgers (or \"-1\" to cancel order): "); // print a prompt for num of hamburgers or -1 to cancel order
            numHamburgers = input.nextInt(); // get num of hamburgers by getting the next token as an int  
            if (numHamburgers == -1) break;
            System.out.println("Each hamburger has " + hamburger.toString() + '\n'); // print nutrition info for a hamburger
            
            System.out.print("Number of salads: "); // prompt for num of salads
            numSalads = input.nextInt(); // get num of salads by getting the next token as an int
            System.out.println("Each salad has " + salad.toString() + '\n'); // print nutrition info for a salad

            System.out.print("Number of nuggets: "); // prompt for num of orders of nuggets
            numNuggets = input.nextInt(); // get num of nugget orders by getting the next token as an int
            System.out.println("Each order of nuggets has " + nuggets.toString() + '\n'); // print nutrition info for an order of nuggets

            System.out.print("Number of sodas: "); // prompt for num of sodas
            numSodas = input.nextInt(); // get num of sodas by getting the next token as an int
            System.out.println("Each soda has " + soda.toString() + '\n'); // print nutrition info for a soda


            double orderTotal = (hamburger.getPrice() + salad.getPrice() + nuggets.getPrice() + soda.getPrice()) * HST_PRICE_FACTOR; // calcuate the order total
            total += orderTotal; // add this order total to the running grand total

            // Increment order number for next order
            orderNumber++;
        }

        System.out.println("\nYour order with tax comes to $" + df.format(total)); // print the total for all orders
	
	} // close main method
} // close class