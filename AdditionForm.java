import javax.swing.*;
import java.awt.event.*;


public class AdditionForm {
    public static void main(String[] args) {
        // Step 1: Creating a window using JFrame
        JFrame frame = new JFrame("Simple Addition Form");
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allow the window to close

        // Step 2: Creating components (Labels, TextFields, Buttons)
        JLabel lblnum1 = new JLabel("First Number:");
        JLabel lblnum2 = new JLabel("Second Number:");
        JLabel lblResult = new JLabel("Result:");
        JTextField textnum1 = new JTextField();
        JTextField textnum2 = new JTextField();
        JLabel resultDisplay = new JLabel(); // Label to display the result
        JButton btn = new JButton("Add");

        // Step 3: Positioning components
        lblnum1.setBounds(100, 50, 150, 30);
        textnum1.setBounds(270, 50, 150, 30);
        lblnum2.setBounds(100, 100, 150, 30);
        textnum2.setBounds(270, 100, 150, 30);
        lblResult.setBounds(100, 150, 150, 30);
        resultDisplay.setBounds(270, 150, 150, 30);
        btn.setBounds(100, 200, 100, 30);

        // Step 4: Adding components to the frame
        frame.setLayout(null); 
        frame.add(lblnum1);
        frame.add(textnum1);
        frame.add(lblnum2);
        frame.add(textnum2);
        frame.add(lblResult);
        frame.add(resultDisplay);
        frame.add(btn);
        frame.setVisible(true);
        // Step 5: Adding functionality to the button
        
     

    }
}
