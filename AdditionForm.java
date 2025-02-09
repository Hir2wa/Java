import javax.swing.*;
import java.awt.event.*;

public class AdditionForm {
    public static void main(String[] args) {
        // Step 1: Creating a window using JFrame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allow the window to close
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Step 2: Creating components (Labels, TextFields, Buttons)
        JLabel lblnum1 = new JLabel("First Number:");
        JLabel lblnum2 = new JLabel("Second Number:");
        JLabel lblResult = new JLabel("Result:");
        JTextField textnum1 = new JTextField();
        JTextField textnum2 = new JTextField();
        JLabel resultDisplay = new JLabel(); // Label to display the result
        
        // Buttons for operations
        JButton btnAdd = new JButton("Add");
        JButton btnSubtract = new JButton("Subtract");
        JButton btnMultiply = new JButton("Multiply");
        JButton btnDivide = new JButton("Divide");

        // Step 3: Positioning components
        lblnum1.setBounds(100, 50, 150, 30);
        textnum1.setBounds(270, 50, 150, 30);
        lblnum2.setBounds(100, 100, 150, 30);
        textnum2.setBounds(270, 100, 150, 30);
        lblResult.setBounds(100, 150, 150, 30);
        resultDisplay.setBounds(270, 150, 150, 30);
        
        // Set bounds for operation buttons
        btnAdd.setBounds(100, 200, 100, 30);
        btnSubtract.setBounds(220, 200, 100, 30);
        btnMultiply.setBounds(100, 250, 100, 30);
        btnDivide.setBounds(220, 250, 100, 30);

        // Step 4: Adding components to the frame
        frame.setLayout(null);
        frame.add(lblnum1);
        frame.add(textnum1);
        frame.add(lblnum2);
        frame.add(textnum2);
        frame.add(lblResult);
        frame.add(resultDisplay);
        frame.add(btnAdd);
        frame.add(btnSubtract);
        frame.add(btnMultiply);
        frame.add(btnDivide);
        frame.setVisible(true);

        // Step 5: Adding functionality to the buttons
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("+", textnum1, textnum2, resultDisplay);
            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("-", textnum1, textnum2, resultDisplay);
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("*", textnum1, textnum2, resultDisplay);
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("/", textnum1, textnum2, resultDisplay);
            }
        });
    }

    // Method to perform the operation based on the operator
    public static void performOperation(String operator, JTextField textnum1, JTextField textnum2, JLabel resultDisplay) {
        try {
            double num1 = Double.parseDouble(textnum1.getText());
            double num2 = Double.parseDouble(textnum2.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultDisplay.setText("Error: Div by 0");
                        return;
                    }
                    break;
            }
            resultDisplay.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultDisplay.setText("Invalid input");
        }
    }
}
