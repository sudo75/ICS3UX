import java.text.DecimalFormat;
import java.util.*;
public class Main{

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
		
		//variables to store the number of hamburgers, salads, chicken nuggets
		//and sodas the user enters
		int numHamburgers, numSalads, numNuggets, numSodas;
		
		//'total' stores the total amount of money spent on food
		double total = 0.0;

        final double HST_PRICE_FACTOR = 1.13;
		
		
		Food hamburger = new Food(2.35, 8, 32, 12);
		Food salad = new Food(2.00, 1.5, 5, 3);
		Food nuggets = new Food(4.95, 18, 16, 15);
		Food soda = new Food(1.85, 0, 56, 0);
		
		//Write the code below to prompt user for each type of food and output nutritional value
		
        int orderNumber = 1;

        while (true) {
            System.out.println("Order #" + orderNumber + '\n');

            System.out.print("Number of hamburgers (or \"-1\" to cancel order): ");
            numHamburgers = input.nextInt();
            if (numHamburgers == -1) break;
            System.out.println("Each hamburger has " + hamburger.toString() + '\n');
            
            System.out.print("Number of salads: ");
            numSalads = input.nextInt();
            System.out.println("Each salad has " + salad.toString() + '\n');

            System.out.print("Number of nuggets: ");
            numNuggets = input.nextInt();
            System.out.println("Each order of nuggets has " + nuggets.toString() + '\n');

            System.out.print("Number of sodas: ");
            numSodas = input.nextInt();
            System.out.println("Each soda has " + soda.toString() + '\n');


            double orderTotal = (hamburger.getPrice() + salad.getPrice() + nuggets.getPrice() + soda.getPrice()) * HST_PRICE_FACTOR;
            total += orderTotal;

            // Increment order number for next order
            orderNumber++;
        }

        System.out.println("\nYour order with tax comes to $" + df.format(total));
	
	}
}