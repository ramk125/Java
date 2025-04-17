import javax.swing.*;

public class SwingExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing!"); // Create a window
        JButton button = new JButton("Click Me");  // Create a button

        frame.add(button);  // Add button to window
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Show the window
    }
}
