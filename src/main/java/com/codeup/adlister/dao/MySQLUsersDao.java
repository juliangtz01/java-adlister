package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

// Create a class named MySQLUsersDao that implements Users
public class MySQLUsersDao implements Users
{
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public User findByUsername(String username)
    {
        try {
            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            rs.next();

            return new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
        }
        catch (SQLException e)
        {
            throw new RuntimeException("Error connecting to the database");
        }
    }
    // create a new user and return the newly created ID
    public Long insert(User user)
    {
        try
        {
            String insertSql = "INSERT INTO users (username, email, password) VALUES(?,?,?)";

            PreparedStatement stmt = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();

            rs.next();

            return rs.getLong(1);
        }
        catch (SQLException e)
        {
            throw new RuntimeException("Unable to capture data from the database");
        }

    }
}
