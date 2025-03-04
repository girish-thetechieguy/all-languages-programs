// Note: Its a rich GUI toolkit that provides a more sophisticated set of components than AWT.



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> System.out.println("Button clicked!"));
        panel.add(button);
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
