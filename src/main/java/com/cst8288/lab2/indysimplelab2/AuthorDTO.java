package com.cst8288.lab2.indysimplelab2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kajan
 */
// Step 1: Create the AuthorDTO class
public class AuthorDTO {

    private int year;
    private String driver;
    private double averageSpeed;
    private String country;

    /**
     *
     */
    public AuthorDTO(){

    }
    public AuthorDTO(int i, String winner_A, double d, String usa) {
        this.year = i;
        this.driver = winner_A;
        this.averageSpeed = d;
        this.country = usa;
    }

    // Getters and Setters
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getDriver() { return driver; }
    public void setDriver(String driver) { this.driver = driver; }

    public double getAverageSpeed() { return averageSpeed; }
    public void setAverageSpeed(double averageSpeed) { this.averageSpeed = averageSpeed; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    
        // Override toString method for better debugging and logging
    @Override
    public String toString() {
        return "AuthorDTO{" +
                "year=" + year +
                ", driver='" + driver + '\'' +
                ", averageSpeed=" + averageSpeed +
                ", country='" + country + '\'' +
                '}';
    }
}