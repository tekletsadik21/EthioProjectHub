package com.amu.ethioprojecthub.repository;

import com.amu.ethioprojecthub.database.DatabaseManager;
import com.amu.ethioprojecthub.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRepository {
    private DatabaseManager databaseManager;

    public UserRepository() throws SQLException {
        databaseManager = new DatabaseManager();
    }

    public User getUserByEmail(String email) {
        User user = null;
        try (Connection connection = databaseManager.getConnection()){
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE email = ?") ;
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                user = new User(resultSet.getString("id"), resultSet.getString("username"),resultSet.getString("phoneNumber"),resultSet.getString("email"), resultSet.getString("password"));
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        try (Connection connection = databaseManager.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                User user = new User(resultSet.getString("id"),resultSet.getString("username"),resultSet.getString("phoneNumber") ,resultSet.getString("email"), resultSet.getString("password"));
                userList.add(user);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void addUser(User user) {
        try (Connection connection = databaseManager.getConnection()){
             PreparedStatement statement = connection.prepareStatement("INSERT INTO users (id, username, phoneNumber, email, password) VALUES (?, ?, ?, ?, ?)");
            statement.setString(1, UUID.randomUUID().toString());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPhoneNumber());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPassword());
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void updateUser(User user) {
        try (Connection connection = databaseManager.getConnection()){
             PreparedStatement statement = connection.prepareStatement("UPDATE users SET username = ?, email = ?,phoneNumber = ?, password = ? WHERE id = ?");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPhoneNumber());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String id) {
        try (Connection connection = databaseManager.getConnection()){
             PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
