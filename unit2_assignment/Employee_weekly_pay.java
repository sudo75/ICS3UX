/*
Eric Skaftason
Calculates employee weekly pay based on hours plus overtime
2025-10-27
ICS-3UX
*/

import javax.swing.JOptionPane; // import JOptionPane from the javax.swing package
import java.text.DecimalFormat; // import DecimalFormat class from the java.text package

public class Employee_weekly_pay { // define a public class called Employee_weekly_pay
    public static void main(String[] args) { // define the main method of the class Employee_weekly_pay
        double regularHours, overtimeHours, hourlyWage, totalPay; // declare four doubles - regularHours, overtimeHours, hourlyWage, totalPay 
        String strRegularHours, strOvertimeHours, strHourlyWage, message; // declare four strings used to store input

        final double OVERTIME_PAY_FACTOR = 1.5; // declare and initialise a constant double OVERTIME_PAY_FACTOR
        
        DecimalFormat df = new DecimalFormat("#,##0.00"); // instantiate a new DecimalFormat object with formatting requiring 2 decimal places, and comma separators if the quantity is greater or equal to 1000

        strRegularHours = JOptionPane.showInputDialog(null, "Number of regular hours:"); // create an input dialogue with a message "Number of regular hours:" and store its input in strRegularHours
        regularHours = Double.parseDouble(strRegularHours); // use the double class's parseDouble static method to get a double value from the string strRegularHours, assigning the result to RegularHours double

        strOvertimeHours = JOptionPane.showInputDialog(null, "Number of overtime hours:"); // create an input dialogue with a message "Number of overtime hours:" and store its input in strOvertimeHours
        overtimeHours = Double.parseDouble(strOvertimeHours); // parse strOvertimeHours as a double and set its value to overtimeHours

        strHourlyWage = JOptionPane.showInputDialog(null, "Hourly wage:"); // create an input dialogue with a message "Hourly wage:" and store its input in strHourlyWage
        hourlyWage = Double.parseDouble(strHourlyWage); // parse strHourlyWage as a double and set its value to hourlyWage


        totalPay = hourlyWage * (regularHours + overtimeHours * OVERTIME_PAY_FACTOR); // initialise total pay, setting its value to the full weekly pay, including regular hours and overtime hours
        message = "Total weekly pay: $" + df.format(totalPay); // format totalPay with optional thousand separators and 2 decimal places, creating a string to display later

        JOptionPane.showMessageDialog(null, message); // display the message string initialised before in a message dialogue

    } // close body of main method
} // close body of Employee_weekly_pay class
