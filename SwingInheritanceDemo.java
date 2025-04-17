import javax.swing.*;
import java.awt.*;

// Custom button class inheriting from JButton
class CustomButton extends JButton {
    public CustomButton(String text) {
        super(text);
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.BOLD, 16));
    }
}

public class SwingInheritanceDemo extends JFrame {
    public SwingInheritanceDemo() {
        // Set frame properties
        setTitle("Swing Inheritance Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create and add buttons
        CustomButton button1 = new CustomButton("Custom Button 1");
        CustomButton button2 = new CustomButton("Custom Button 2");
        
        add(button1);
        add(button2);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the Swing GUI
        new SwingInheritanceDemo();
    }
}
