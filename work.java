import java.sql.*;

public class Work {

    public static void main(String[] args) {
        // Define database connection details
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace 'your_database' with the actual database name
        String username = "root";
        String password = ",fabrice2003";

        // SQL query to create a table
        String sql_query = "CREATE TABLE IF NOT EXISTS example_table (" +
                           "id INT AUTO_INCREMENT PRIMARY KEY, " +
                           "name VARCHAR(100) NOT NULL, " +
                           "age INT NOT NULL)";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Check connection status
            if (con != null) {
                System.out.println("Connection established successfully!");
            }

            // Create a statement
            Statement st = con.createStatement();

            // Execute the SQL query
            st.executeUpdate(sql_query);
            System.out.println("The table has been created successfully.");

            // Close the statement and connection
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
