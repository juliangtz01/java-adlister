import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class JDBCLec
{
    public static void main(String[] args)
    {
        try
        {
            // 1. Establish Driver and connection object
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");

            // 2. Create Statement instance
            Statement stmt = connection.createStatement();

            // .execute() : return boolean (used for delete)
            // .executeUpdate() : returns the number of rows affected (used for insert or update)
            // .executeQuery() : returns a ResultSet object (used for a select queries)

            // 3. Write SELECT query to execute, and set equal to a ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM albums");

            // While there are still records found on the next row, continue to move to the next row
            while(rs.next())
            {
                System.out.println("Here's an album:");
                System.out.println("  id: " + rs.getLong("id"));
                System.out.println("  artist: " + rs.getString("artist"));
                System.out.println("  name: " + rs.getString("name"));
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException("Sorry, could not connect to database!");
        }

    }
}
