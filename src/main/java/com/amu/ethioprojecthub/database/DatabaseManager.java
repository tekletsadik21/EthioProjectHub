package com.amu.ethioprojecthub.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private Connection conn;
    private static final String DATABASE_NAME = "ethio_project_hub.db";
    private static final String USER_TABLE_NAME = "users";
    private static final String PROJECT_TABLE_NAME = "projects";



    public static void createTables() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_NAME);
                Statement stmt = conn.createStatement()
        ) {
            // Create User table
            String createUserTable = "CREATE TABLE IF NOT EXISTS " + USER_TABLE_NAME + " ("
                    + "id TEXT PRIMARY KEY,"
                    + "username TEXT NOT NULL,"
                    + "email TEXT NOT NULL,"
                    + "photoUrl TEXT,"
                    + "bio TEXT,"
                    + "department TEXT,"
                    + "phoneNumber TEXT,"
                    + "password TEXT NOT NULL"
                    + ")";
            stmt.execute(createUserTable);

            // Create Project table
            String createProjectTable = "CREATE TABLE IF NOT EXISTS " + PROJECT_TABLE_NAME + " ("
                    + "id TEXT PRIMARY KEY,"
                    + "projectName TEXT NOT NULL,"
                    + "description TEXT NOT NULL,"
                    + "ownerId TEXT ,"
                    + "mediaFile TEXT"
                    + ")";
            stmt.execute(createProjectTable);
        } catch (SQLException e) {
            System.out.println("Error creating tables: " + e.getMessage());
        }
    }

    public Connection getConnection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_NAME);
        conn.setAutoCommit(true);
        return conn;
    }
}
