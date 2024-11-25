package com.cst8288.lab2.indysimplelab2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The {@code DBConnection} class manages the database connection
 * using the Singleton design pattern to ensure a single instance
 * of the database connection is used throughout the application.
 * 
 * <p>This class provides a thread-safe way to retrieve a connection
 * to the database and simplifies database access by encapsulating
 * connection details.</p>
 * 
 * <p>Make sure to update the {@code URL}, {@code USER}, and {@code PASSWORD}
 * fields to match your database configuration.</p>
 * 
 * @author kajan
 * @version 1.0
 */
public class DBConnection {

    private static DBConnection instance;
    private static final String URL = "jdbc:mysql://localhost:3308/indywinners"; // Update your database name
    private static final String USER = "root"; // Update your database username
    private static final String PASSWORD = "2131"; // Update your database password

    /**
     * Private constructor to enforce the Singleton design pattern.
     */
    private DBConnection() {
        // private constructor to enforce singleton pattern
    }

    /**
     * Returns the singleton instance of the {@code DBConnection} class.
     * 
     * <p>If the instance does not exist, it is created. Otherwise, the
     * existing instance is returned. This ensures a single instance
     * throughout the application's lifecycle.</p>
     * 
     * @return The singleton instance of {@code DBConnection}.
     */    
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    /**
     * Provides a connection to the database.
     * 
     * <p>This method uses the {@link DriverManager} to establish a connection
     * to the database using the configured {@code URL}, {@code USER}, and
     * {@code PASSWORD}.</p>
     * 
     * @return A {@link Connection} object representing the database connection.
     * @throws RuntimeException if a {@link SQLException} occurs while
     * connecting to the database.
     */    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
}