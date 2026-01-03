import javax.swing.*; // package includes JFrame and JPanel
import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        JFrame gui = new JFrame();
        gui.setSize(300, 200);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = gui.getContentPane(); // panels/elements can be added to the content pane


        gui.setTitle("Java GUI");
        
        JPanel centrePanel = new JPanel();
        centrePanel.setBackground(Color.blue);
        pane.add(centrePanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(64, 64, 64));
        pane.add(bottomPanel, BorderLayout.SOUTH);
        
        
        gui.setVisible(true);

    }    
}
