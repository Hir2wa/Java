import java.sql.*;

public class Workers {

    public static void main(String[] args) {
        // Define database connection details
        String url = "jdbc:mysql://localhost:3306/exampledb"; // Replace 'exampledb' with your database name
        String username = "root";
        String password = ""; // Default password for XAMPP's MySQL root user is empty

        // SQL query to insert data
        String insert_query = "INSERT INTO Employee (Name, Age) VALUES (?, ?)";

        try( Connection con = DriverManager.getConnection(url, username, password)) {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
           

            // Check connection status
            if (con != null) {
                System.out.println("Connection established successfully!");
            }

            // Prepare a statement
            PreparedStatement ps = con.prepareStatement(insert_query);

            // Insert data (replace these with actual values)
            ps.setString(1, "Fabrice");
            ps.setInt(2, 25);
            ps.executeUpdate();

            ps.setString(1, "Alain");
            ps.setInt(2, 30);
            ps.executeUpdate();

            ps.setString(1, "Hirwa");
            ps.setInt(2, 28);
            ps.executeUpdate();

            System.out.println("Records inserted successfully!");

            // Close the PreparedStatement and connection
            ps.close();
       

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
