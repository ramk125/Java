import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Custom label inheriting from JLabel
class InheritedLabel extends JLabel {
    public InheritedLabel(String text) {
        super(text);
        setFont(new Font("Verdana", Font.BOLD, 28));
        setForeground(new Color(255, 153, 102));
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}

// Custom button inheriting from JButton
class InheritedButton extends JButton {
    public InheritedButton(String text) {
        super(text);
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.BOLD, 18));

        // Adding unique behavior
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button clicked!");
            }
        });
    }
}

// Main JFrame that brings everything together
public class Swing3 extends JFrame {
    public Swing3() {
        setTitle("Swing Inheritance Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add custom label
        InheritedLabel titleLabel = new InheritedLabel("USING SWING COMPONENTS TO DEMONSTRATE INHERITANCE");
        add(titleLabel, BorderLayout.NORTH);

        // Add a button panel with custom buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new InheritedButton("Click Me"));
        buttonPanel.add(new InheritedButton("Another Button"));
        add(buttonPanel, BorderLayout.CENTER);

        // Make window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingInheritanceDemo();
    }
}
