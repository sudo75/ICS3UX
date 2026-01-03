/*
Eric Skaftason
Input weight and height, in imperial, and name; output weight and height in metric, and name
2025-10-27
ICS-3UX
*/

import javax.swing.JOptionPane; // import the JOptionPane class from javax.swing
import java.text.DecimalFormat; // import the DecimalFormat class from java.text

public class Imperal_to_metric { // new Imperal_to_metric class
    public static void main(String[] args) { // define the main method for the class
        double weightImp, heightImp; // declare 2 new doubles - weightImp, heightImp
        double weightMet, heightMet; // declare 2 new doubles on a new line (for clarity) - weightMet, heightMet
        String name, strWeightImp, strHeightImp, message; // declare 4 strings - name, strWeightImp, strHeightImp, message

        final double LB_TO_KG_FACTOR = 0.45359237; // constant double - factor to multiply lbs by to get kgs
        final double FT_TO_M_FACTOR = 0.3048; // constant double - factor to multiply ft by to get m

        DecimalFormat df = new DecimalFormat("#,##0.00"); // instantiate a new DecimalFormat object

        name = JOptionPane.showInputDialog(null, "Name:"); // create input dialogue and store the input in the name variable

        strWeightImp = JOptionPane.showInputDialog(null, "Weight in pounds:"); // create input dialogue and store the input in the strWeightImp variable
        weightImp = Double.parseDouble(strWeightImp); // use the parseDouble static method of the Double class to parse the string, returning a double, assigning the result to weightImp
        weightMet = weightImp * LB_TO_KG_FACTOR; // get weight in kgs by mutliplying weight in lbs by the constant factor LB_TO_KG_FACTOR

        strHeightImp = JOptionPane.showInputDialog(null, "Height in feet:"); // create input dialogue and store the input in the strHeightImp variable
        heightImp = Double.parseDouble(strHeightImp); // parse the string as a double and set the value to heightImp value
        heightMet = heightImp * FT_TO_M_FACTOR; // get height m by mutliplying height in ft by the constant factor FT_TO_M_FACTOR

        message = "Hello " + name + "! Your weight is " + df.format(weightMet) + "kg; your height is " + df.format(heightMet) + "m."; // output a message with decimal formatting
        JOptionPane.showMessageDialog(null, message); // display the message
    } // close the body of the main method
} // closing bracket for the Imperal_to_metric class