import java.sql.*;

public class getWorkers {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/javaclass";
    
        String user = "postgres";  
        String password = "2003";
        // Define database connection details
        // String url = "jdbc:mysql://localhost:3306/exampledb"; // Replace 'exampledb' with your database name
        // String username = "root";
        // String password = ""; // Default password for XAMPP's MySQL root user is empty

        // SQL query to fetch data
        String select_query = "SELECT * FROM taxpayer";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Check connection status
            if (con != null) {
                System.out.println("Connection established successfully!");
            }

            // Create a statement
            Statement st = con.createStatement();

            // Execute the SQL query and get the ResultSet
            ResultSet rs = st.executeQuery(select_query);

            // Process the ResultSet
            System.out.println("ID\tName\t\tAge");
            System.out.println("---------------------------");
            while (rs.next()) {
                // Retrieve data by column name or index
                int id = rs.getInt("ID"); // By column name
                String name = rs.getString("Name");
                int age = rs.getInt(3); // By column index (1-based)

                // Print the data
                System.out.println(id + "\t" + name + "\t\t" + age);
            }

            // Close the ResultSet, statement, and connection
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

