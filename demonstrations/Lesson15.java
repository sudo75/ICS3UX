import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lesson15 {
    public static void main (String[] args) {

        String input1 = JOptionPane.showInputDialog(null, "Input integer 1:");
        String input2 = JOptionPane.showInputDialog(null, "Input integer 2:");

        DecimalFormat df = new DecimalFormat("#,##0");

        int result = Integer.parseInt(input1) + Integer.parseInt(input2);

        JOptionPane.showMessageDialog(null, df.format(result));
    }
}
