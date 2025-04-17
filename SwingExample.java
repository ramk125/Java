import javax.swing.*;  

public class SwingExample {  
    public static void main(String[] args) {  
        // Create the frame
        JFrame f = new JFrame("My First Swing App");  
        
        // Create the button
        JButton b = new JButton("Click Me!");  
        b.setBounds(130, 100, 100, 40);  
        
        // Add button to frame
        f.add(b);  
        
        // Set frame properties
        f.setSize(400, 500);  
        f.setLayout(null);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close properly
        f.setVisible(true);  
    }  
}  
