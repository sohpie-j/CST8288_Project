/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.fall24.assignment1.Utilities;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author kajan
 */
public class PatientUtilities {
        // Calculate patient age based on their date of birth (in "yyyy-MM-dd" format)
    public static long calulatePatientAge(String dateOfBirth) {
        LocalDate dob = LocalDate.parse(dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    // Determine life stage based on the patient's age
    public static String determineLifeStage(long age) {
        if (age <= 6) {
            return "CHILD";
        } else if (age <= 18) {
            return "YOUTH";
        } else {
            return "ADULT";
        }
    }

    // Determine the dose count based on the patient's life stage
    public static int determineDoseCount(String lifeStage) {
        switch (lifeStage) {
            case "CHILD" -> {
                return 1;
            }
            case "YOUTH" -> {
                return 2;
            }
            case "ADULT" -> {
                return 3;
            }
            default -> throw new IllegalArgumentException("Unknown life stage: " + lifeStage);
        }
    }
    
}
