import java.util.Scanner;

import javax.swing.JOptionPane;

public class SimpleGUIAddition {
    public static void main(String[] args) {
        
        int num1,num2,sum;
        String number1,number2;
        Scanner input = new Scanner(System.in);
      //  JOptionPane.showMessageDialog(null, "Enter First Number");
          number1= JOptionPane.showInputDialog("Enter The  First Number");
          number2= JOptionPane.showInputDialog("Enter The Second Number");
        
          num1 = Integer.parseInt(number1);
          num2= Integer.parseInt(number2);
          sum= num1 + num2;
          JOptionPane.showMessageDialog(null, "The Sum =" +sum , "Result",JOptionPane.ERROR_MESSAGE);
        
    }
}
