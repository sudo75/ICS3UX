import java.text.DecimalFormat;
public class Balance {
    public static void main(String[] args) {
        final double RATE = 0.0625;
        double initBalance = 2000.0;
        double finalBalance, interest;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        int year = 0;
        while (year < 5) {
            interest = initBalance * RATE;
            finalBalance = initBalance + interest;

            System.out.println("Year " + (year + 1) + " - Initial balance: $" + df.format(initBalance) + ", interest: $" + df.format(interest) + ", final balance: $" + df.format(finalBalance));

            initBalance = finalBalance;

            year++;
        }
    }
}
