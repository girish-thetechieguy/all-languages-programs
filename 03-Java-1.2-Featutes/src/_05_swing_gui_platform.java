import javax.swing.*;
import java.awt.*;

public class _05_swing_gui_platform {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2 Platform Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel with a GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
