import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        final int randInt = rand.nextInt(10) + 1; // returns a value from 0-9 + 1 or 1-10
        int inputInt = -1;

        System.out.println("Guess a number between 1 and 10.");
        
        // randInt is a sentinel value
        while (inputInt != randInt) {
            inputInt = input.nextInt();

            if (inputInt > randInt) {
                System.out.println("Too high");
            } else if (inputInt < randInt) {
                System.out.println("Too low");
            }
        }

        System.out.println("correct!");
    }
}