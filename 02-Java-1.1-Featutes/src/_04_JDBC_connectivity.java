import java.sql.*;

public class _04_JDBC_connectivity {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // Database URL
        String user = "username"; // Database username
        String password = "password"; // Database password

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println("User: " + rs.getString("name"));
            }

            // Close the connection
            conn.close();
        } catch (SQLException e) {
            System.out.println("Driver nor found!");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
