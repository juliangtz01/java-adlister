package com.codeup.adlister.dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class PrepareStatements
{
    public static void main(String[] args) {
        Config config = new Config();
//        try {
//            // make db connection
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
//            // create SQL string to make query
//            String sql = "SELECT * FROM albums WHERE id = ?";
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setLong(1,6);
//            ResultSet rs = stmt.executeQuery();
//            rs.next();
//            System.out.println("Album name: " + rs.getString("name"));
//            System.out.println("Album artist: " + rs.getString("artist"));
//        } catch (SQLException e) {
//            throw new RuntimeException("Sorry, could not connect");
//        }

        try {
            // make db connection
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
            // Create SQL string to make query
            String insertSql = "INSERT INTO albums (artist, name, release_date, sales, genre) VALUES (?,?,?,?,?)";
            //Instantiate PreparedStatement and pass the SQL string to be used
            PreparedStatement statement = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
            // Set the value of the question marks.
            statement.setString(1, "Lil Wayne");
            statement.setString(2,"The Carter III");
            statement.setInt(3, 2008);
            statement.setDouble(4, 3.97);
            statement.setString(5,"rap");
            // Execute the prepared statement
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            // Move to the first result
            rs.next();
            // Print new ID
            System.out.println(rs.getLong(1));
        } catch (SQLException e) {
            throw new RuntimeException("Sorry, could not connect");
        }
    }
}
