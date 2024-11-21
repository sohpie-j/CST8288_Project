package com.cst8288.lab2.indysimplelab2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author kajan
 */

public class DBConnection {

    private static DBConnection instance;
    private static final String URL = "jdbc:mysql://localhost:3308/indywinners"; // Update your database name
    private static final String USER = "root"; // Update your database username
    private static final String PASSWORD = "2131"; // Update your database password

    private DBConnection() {
        // private constructor to enforce singleton pattern
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
}