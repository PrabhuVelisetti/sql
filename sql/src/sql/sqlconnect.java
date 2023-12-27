package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlconnect {

    public static void main(String[] args) {

        // JDBC URL, username, and password of SQL Server
      
       // String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=bank";
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;encrypt=false;user=king;password=5420";
       
          String username = "king";
         String password = "5420";

        try {
            // Register JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");

                // Perform database operations here...

                // Close the connection when done
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database");
            e.printStackTrace();
        }
    }
}