
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Student {
    public static void main(String[] args) {
       
        String url = "jdbc:postgresql://localhost:5432/postgres";
    
        String user = "postgres";  
        String password = "2003";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
