import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads
{
    private Connection connection;

    public MySQLAdsDao(Config config)
    {
        try {
//        Config config = new Config();

            DriverManager.registerDriver(new Driver());

            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }
        catch(SQLException e)
        {
//            e.printStackTrace();
            throw new RuntimeException("Sorry, could not connect to database!");
        }
    }

    public List<Ad> all()
    {
        List<Ad> ads = new ArrayList<>();
        try
        {
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

            while(rs.next())
            {
                Ad adToAdd = new Ad(rs.getLong("id"),rs.getLong("user_id"),rs.getString("title"),rs.getString("description"));

                ads.add(adToAdd);
            }

            return ads;
        }
        catch (SQLException e)
        {
//            e.printStackTrace();
            throw new RuntimeException("Sorry, could not connect to database!");
        }
    }

    public Long insert(Ad ad)
    {
        Long id = 0L;
        try
        {
            Statement stmt = connection.createStatement();

            String insertQuery = "INSERT INTO ads(user_id, title, description) VALUES ('"+ad.getUserId()+"','"+ad.getTitle()+"','"+ad.getDescription()+"');";

            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.getGeneratedKeys();

            if(rs.next())
                id = rs.getLong(1);
            return id;

        }
        catch (SQLException e)
        {
//            e.printStackTrace();
            throw new RuntimeException("Sorry, could not connect to the database!");
        }
    }
}
