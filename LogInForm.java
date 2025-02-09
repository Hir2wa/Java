import javax.swing.*;
import java.awt.event.*;

public class LogInForm {
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        JTextField textUsername = new JTextField();
        JPasswordField textPassword = new JPasswordField();
        JLabel lblMessage = new JLabel();
        
        JButton btnLogin = new JButton("Login");
        JButton btnClear = new JButton("Clear");

     
        lblUsername.setBounds(50, 50, 100, 30);
        textUsername.setBounds(150, 50, 150, 30);
        lblPassword.setBounds(50, 100, 100, 30);
        textPassword.setBounds(150, 100, 150, 30);
        lblMessage.setBounds(50, 150, 250, 30); 
        btnClear.setBounds(200, 200, 100, 30);

        frame.setLayout(null);
        frame.add(lblUsername);
        frame.add(textUsername);
        frame.add(lblPassword);
        frame.add(textPassword);
        frame.add(lblMessage);
        frame.add(btnLogin);
        frame.add(btnClear);
        frame.setVisible(true);


        
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textUsername.getText();
                String password = new String(textPassword.getPassword());

               
                if (username.equals("admin") && password.equals("password123")) {
                    lblMessage.setText("Welcome To Java!");
                } else {
                    lblMessage.setText("Invalid Username or Password");
                }
            }
        });

      
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUsername.setText(""); 
                textPassword.setText(""); 
                lblMessage.setText(""); 
            }
        });
    }
}
