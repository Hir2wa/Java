import javax.swing.*;
import java.awt.event.*;

public class Registraction{
    public static void main(String[] args) {
      
        JFrame jframe = new JFrame("Employee Form");
        jframe.setSize(800, 800);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jframe.setLocationRelativeTo(null); 

    
        JLabel lblForm1 = new JLabel("Employee Id");
        JLabel lblForm2 = new JLabel("First Name");
        JLabel lblForm3 = new JLabel("Last Name");
        JLabel lblForm4 = new JLabel("Age");
        JLabel lblForm5 = new JLabel("Gender");
        JLabel lblForm6 = new JLabel("Salary");
        JLabel lblForm7 = new JLabel("Department");
        JLabel lblForm8 = new JLabel("Hobbies");

        // TextFields
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field5 = new JTextField(); // Salary field

        // Radio Buttons for Gender
        JRadioButton radio1 = new JRadioButton("Female");
        JRadioButton radio2 = new JRadioButton("Male");
      
        // Department ComboBox
        String[] departmentList = {"IT", "Finance", "Accounting", "HR"};
        JComboBox<String> comboBox = new JComboBox<>(departmentList);

        // Checkboxes for Hobbies
        JCheckBox chk1 = new JCheckBox("Football");
        JCheckBox chk2 = new JCheckBox("Volley Ball");
        JCheckBox chk3 = new JCheckBox("Cricket");
        JCheckBox chk4 = new JCheckBox("Swimming");
        JCheckBox chk5 = new JCheckBox("I Accept Terms and Conditions");

        // Save Button
        JButton btnSave = new JButton("Save");

        // Group radio buttons (ensure only one gender is selected)
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radio1);
        genderGroup.add(radio2);

        // Setting bounds for the components
        lblForm1.setBounds(100, 55, 150, 30);
        field1.setBounds(260, 50, 150, 30);

        lblForm2.setBounds(100, 105, 150, 30);
        field2.setBounds(260, 100, 150, 30);

        lblForm3.setBounds(100, 155, 150, 30);
        field3.setBounds(260, 150, 150, 30);

        lblForm4.setBounds(100, 205, 150, 30);
        field4.setBounds(260, 200, 150, 30);

        lblForm5.setBounds(100, 255, 150, 30);
        radio1.setBounds(260, 250, 70, 30);
        radio2.setBounds(340, 250, 70, 30);

        lblForm6.setBounds(100, 305, 150, 30);
        field5.setBounds(260, 300, 150, 30);

        lblForm7.setBounds(100, 355, 150, 30);
        comboBox.setBounds(260, 350, 150, 30);

        lblForm8.setBounds(100, 405, 150, 30);
        chk1.setBounds(260, 400, 100, 30);
        chk2.setBounds(360, 400, 100, 30);
        chk3.setBounds(260, 450, 100, 30);
        chk4.setBounds(360, 450, 100, 30);
        chk5.setBounds(260, 500, 200, 30);

        btnSave.setBounds(260, 550, 100, 30);

    
        jframe.setLayout(null);
        jframe.add(lblForm1);
        jframe.add(field1);
        jframe.add(lblForm2);
        jframe.add(field2);
        jframe.add(lblForm3);
        jframe.add(field3);
        jframe.add(lblForm4);
        jframe.add(field4);
        jframe.add(lblForm5);
        jframe.add(radio1);
        jframe.add(radio2);
        jframe.add(lblForm6);
        jframe.add(field5);
        jframe.add(lblForm7);
        jframe.add(comboBox);
        jframe.add(lblForm8);
        jframe.add(chk1);
        jframe.add(chk2);
        jframe.add(chk3);
        jframe.add(chk4);
        jframe.add(chk5);
        jframe.add(btnSave);

    
        jframe.setVisible(true);

     btnSave.addActionListener(comboBox);
      
    }
}
