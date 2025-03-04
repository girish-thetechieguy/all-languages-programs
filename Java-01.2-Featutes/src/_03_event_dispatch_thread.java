/**
 * WHY: Event Dispatch Thread, which ensures that GUI updates happen on a single thread.
  */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class _03_event_dispatch_thread {
    public static void main(String[] args) {
        // Ensuring GUI creation is done on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("EDT Example");
            JButton button = new JButton("Click Me");

            button.addActionListener(e -> System.out.println("Button clicked!"));
            frame.add(button);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

