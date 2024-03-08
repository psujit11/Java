import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/myDatabase";
        String user = "root";
        String password = "";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student_profile");

            // Display the data in a tabular form
            System.out.println("ID\tUsername\tPassword");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password1 = rs.getString("password");
                System.out.println(id + "\t" + username + "\t" + password1);
            }

            // Close the resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
