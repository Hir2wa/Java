import java.sql.*;
import java.util.Scanner;

public class recWorker {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/javaclass";
    
        String user = "postgres";  
        String password = "2003";
        // // Define database connection details
        // String url = "jdbc:mysql://localhost:3306/exampledb"; // Replace 'exampledb' with your database name
        // String username = "root";
        // String password = ""; // Default password for XAMPP's MySQL root user is empty

        // SQL query to insert data
        String insert_query = "INSERT INTO taxpayer (Name, Age) VALUES (?, ?)";

        // Set up Scanner for user input
        Scanner input = new Scanner(System.in);

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Check connection status
            if (con != null) {
                System.out.println("Connection established successfully!");
            }

            // Prepare a statement
            PreparedStatement ps = con.prepareStatement(insert_query);

            // Loop to record multiple employees
            while (true) {
                System.out.println("Enter employee name:");
                String name = input.nextLine();

                System.out.println("Enter employee age:");
                int age = input.nextInt();
                input.nextLine(); // Consume the newline character

                // Set values and execute the query
                ps.setString(1, name);
                ps.setInt(2, age);
                ps.executeUpdate();
                System.out.println("Employee record inserted successfully!");

                // Ask user if they want to add another employee
                System.out.println("Do you want to add another employee? (yes/no):");
                String choice = input.nextLine();

                if (!choice.equalsIgnoreCase("yes")) {
                    break;
                }
            }

            // Close the PreparedStatement and connection
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            input.close(); // Close the scanner
        }
    }
}

