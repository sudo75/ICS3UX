import javax.swing.JOptionPane;

public class SquarePyramidSA {
    public static void main(String[] args) {

        int baseLength, slantHeight, surfaceArea;
        String strBaseLength, strSlantHeight;

        strBaseLength = JOptionPane.showInputDialog(null, "Input base length as an integer: ");
        baseLength = Integer.parseInt(strBaseLength);

        strSlantHeight = JOptionPane.showInputDialog(null, "Input slant height as an integer: ");
        slantHeight = Integer.parseInt(strSlantHeight);

        // I used the same formula, simplified, so that it would work with ints - 2 * (baseLength * slantHeight), 4 * (0.5 * baseLength * slantHeight)
        // Alternatively, a double could be used, so that baseLength * slantHeight could be multiplied by 0.5
        surfaceArea = 2 * (baseLength * slantHeight) + baseLength * baseLength;

        JOptionPane.showMessageDialog(null, "Surface area of square pyramid: " + surfaceArea + " square units.");
    }
}
