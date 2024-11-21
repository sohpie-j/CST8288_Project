//package com.cst8288.lab2.indysimplelab2;
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//// Step 3: Implement AuthorDAO interface
//public class AuthorDAOImpl implements AuthorDAO {
//    private static final String SELECT_WINNERS = "SELECT * FROM INDYWINNERS ORDER BY year DESC LIMIT ? OFFSET ?";
//
//    @Override
//    public List<AuthorDTO> getWinners(int offset, int limit) {
//        List<AuthorDTO> winners = new ArrayList<>();
//        try (Connection connection = DBConnection.getInstance().getConnection();
//             PreparedStatement statement = connection.prepareStatement(SELECT_WINNERS)) {
//
//            statement.setInt(1, limit);
//            statement.setInt(2, offset);
//            ResultSet rs = statement.executeQuery();
//
//            while (rs.next()) {
//                AuthorDTO winner = new AuthorDTO();
//                winner.setYear(rs.getInt("YEAR"));
//                winner.setDriver(rs.getString("DRIVER"));
//                winner.setAverageSpeed(rs.getDouble("AVERAGESPEED"));
//                winner.setCountry(rs.getString("COUNTRY"));
//                winners.add(winner);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return winners;
//    }
//
//    @Override
//    public boolean addWinner(AuthorDTO winner) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}

package com.cst8288.lab2.indysimplelab2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {
    private static final String SELECT_WINNERS = "SELECT * FROM INDYWINNERS ORDER BY YEAR DESC LIMIT ? OFFSET ?";
    private static final String INSERT_WINNER = "INSERT INTO INDYWINNERS (YEAR, DRIVER, AVERAGESPEED, COUNTRY) VALUES (?, ?, ?, ?)";

    @Override
    public List<AuthorDTO> getWinners(int offset, int limit) {
        List<AuthorDTO> winners = new ArrayList<>();

        try (Connection connection = DBConnection.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(SELECT_WINNERS)) {

            statement.setInt(1, limit);
            statement.setInt(2, offset);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                AuthorDTO winner = new AuthorDTO();
                winner.setYear(rs.getInt("YEAR"));
                winner.setDriver(rs.getString("DRIVER"));
                winner.setAverageSpeed(rs.getDouble("AVERAGESPEED"));
                winner.setCountry(rs.getString("COUNTRY"));
                winners.add(winner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return winners;
    }

    @Override
    public boolean addWinner(AuthorDTO winner) {
        if (winner.getDriver() == null || winner.getDriver().isEmpty()) {
            System.err.println("Driver name cannot be null or empty.");
            return false;
        }

        String insertSQL = "INSERT INTO indyWinners (year, driver, averageSpeed, country) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(insertSQL)) {

            // Set auto-commit to false for manual transaction control
            connection.setAutoCommit(false);

            // Setting the values for the INSERT statement
            statement.setInt(1, winner.getYear());
            statement.setString(2, winner.getDriver());
            statement.setDouble(3, winner.getAverageSpeed());
            statement.setString(4, winner.getCountry());
           
            System.out.println("AuthorDTO{" +
                "year=" + winner.getYear() +
                ", driver='" + winner.getDriver() + '\'' +
                ", averageSpeed=" + winner.getAverageSpeed() +
                ", country='" + winner.getCountry() + '\'' +
                '}');

            // Execute the update and check if a row was inserted
         int rowsAffected = statement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Insert successful: " + rowsAffected + " row(s) affected.");
            return true;
        } else {
            System.err.println("No rows were affected by the insert operation.");
        }

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                // Rollback in case of an exception
                DBConnection.getInstance().getConnection().rollback();
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
        return false; // Return false if the insertion fails
    }

}
