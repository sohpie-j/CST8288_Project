package com.cst8288.lab2.indysimplelab2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The {@code AuthorDTO} class represents data about an author or winner, including
 * details such as the year of winning, driver's name, average speed, and country.
 * 
 * <p>This class acts as a Data Transfer Object (DTO) for transferring data
 * between layers of the application.</p>
 * 
 * @author kajan
 * @version 1.0
 */
public class AuthorDTO {

    private int year;
    private String driver;
    private double averageSpeed;
    private String country;

    /**
     * Default constructor for {@code AuthorDTO}.
     * <p>Initializes an empty instance of {@code AuthorDTO} with default values.</p>
     */
    public AuthorDTO(){

    }
    
    /**
    * Constructs an {@code AuthorDTO} object with the specified details.
    * 
    * @param i The year of the win.
    * @param winner_A The name of the driver.
    * @param d The average speed of the driver.
    * @param usa The country of the driver.
    */
    
    public AuthorDTO(int i, String winner_A, double d, String usa) {
        this.year = i;
        this.driver = winner_A;
        this.averageSpeed = d;
        this.country = usa;
    }

        // Getters and Setters

    /**
     * Gets the year of the win.
     * 
     * @return The year of the win.
     */
    public int getYear() { return year; }
    
    /**
     * Sets the year of the win.
     * 
     * @param year The year of the win.
     */
    public void setYear(int year) { this.year = year; }

    /**
     * Gets the name of the driver.
     * 
     * @return The name of the driver.
     */
    public String getDriver() { return driver; }
    
    /**
     * Sets the name of the driver.
     * 
     * @param driver The name of the driver.
     */
    public void setDriver(String driver) { this.driver = driver; }

    /**
     * Gets the average speed of the driver.
     * 
     * @return The average speed of the driver.
     */
    public double getAverageSpeed() { return averageSpeed; }
    
    /**
     * Sets the average speed of the driver.
     * 
     * @param averageSpeed The average speed of the driver.
     */
    public void setAverageSpeed(double averageSpeed) { this.averageSpeed = averageSpeed; }

    /**
     * Gets the country of the driver.
     * 
     * @return The country of the driver.
     */    
    public String getCountry() { return country; }

    /**
     * Sets the country of the driver.
     * 
     * @param country The country of the driver.
     */    
    public void setCountry(String country) { this.country = country; }
    
    /**
     * Returns a string representation of the {@code AuthorDTO} object.
     * 
     * @return A string containing the year, driver, average speed, and country.
     */
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