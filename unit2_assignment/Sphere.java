/*
Eric Skaftason
Shpere.java - calculate diameter, circumference, surface area, and volume of a sphere given, given its radius
2025-10-27
ICS-3UX
*/

import java.text.DecimalFormat; // Import DecimalFormat from java.text package
import javax.swing.JOptionPane; // Import JOptionPane from javax.swing package

public class Sphere { // create a new public class named Sphere 
    public static void main(String[] args) { // define the main method of the class Sphere
        
        double radius, diameter, circumference, surfaceArea, volume; // declare 5 doubles - radius, diameter, circumference, surfaceArea, volume
        String strRadius, message; // declare 2 strings - strRadius, message
        
        DecimalFormat df = new DecimalFormat("#,##0.00"); // create a new Decimal format object names df by instantiating DecimalFormat
        
        strRadius = JOptionPane.showInputDialog(null,"Enter radius:"); // create a new input dialogue and store the value in a string called strRadius
        radius = Double.parseDouble(strRadius); // parse the string and store the derrived double in radius

        /*
        Math.PI constant used instead of declaring a new double and setting it to be pi for clarity
        used: Math.PI instead of:
        final double PI = 3.141...;
        */

        // Calculate diameter
        diameter = radius * 2.0;

        // Calculate circumference
        circumference = Math.PI * diameter;

        // Surface area
        surfaceArea = 4.0 * Math.PI * radius * radius;

        // Volume
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0); // pow method of Math class - arg 1: base, arg 2: exponent, used instead of: radius * radius * radius


        // Concatenate strings and formatted doubles to create an output string called message
        message = "Sphere radius: " + df.format(radius) + "\nDiameter: " + df.format(diameter) + ",\ncircumference: " + df.format(circumference) + ",\nsurface area: " + df.format(surfaceArea) + ",\nvolume: " + df.format(volume);

        JOptionPane.showMessageDialog(null, message); // null because no parent pane, displays message
    } // close main method
} // close body of class