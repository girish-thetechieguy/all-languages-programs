import javax.swing.*;
import java.awt.*;

public class _05_2d_api extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 50, 100, 100); // Draw a blue square

        g2d.setColor(Color.RED);
        g2d.drawString("Hello, Java 2D!", 60, 180); // Draw text
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D Example");
        _05_2d_api panel = new _05_2d_api();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
