import java.util.Scanner;

public class TempConvert {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double temp1;
        double temp2;
        char scale;

    
        System.out.print("Input f or c: ");
        scale = input.nextLine().charAt(0);
        
        

        System.out.print("Input temperature in " + scale + ": ");
        temp1 = input.nextDouble();

        if (scale == 'f') { // input f
            temp2 = (temp1 - 32.0) * 5.0 / 9.0;
        } else { // input c
            temp2 = temp1 * 9.0 / 5.0 + 32.0;
        }

        System.out.println("Temperature: " + temp2);

    }

}