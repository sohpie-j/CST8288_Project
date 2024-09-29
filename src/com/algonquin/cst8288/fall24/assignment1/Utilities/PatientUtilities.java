/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.fall24.assignment1.Utilities;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author KyungA Jang
 * @class PatientUtilities
 */
public class PatientUtilities {
	
    /*
    * Calculate patient age based on their date of birth (in "yyyy-MM-dd" format)
    * @param String dateOfBirth
    * @return
    * @throw
    */
    public static long caculatePatientAge(String dateOfBirth) {
        LocalDate dob = LocalDate.parse(dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        
        if(dateOfBirth != null){
            return Period.between(dob, currentDate).getYears();
        } else {
            throw new IllegalArgumentException("Date of birth is not set.");
        }
    }

    /*
    * Determine life stage based on the patient's age
    * @method: determineLifeStage
    * @return: Stage
    */
    public static String determineLifeStage(long age) {
        if (age <= 6) {
            return "CHILD";
        } else if (age <= 18) {
            return "YOUTH";
        } else {
            return "ADULT";
        }
    }

    /*
    * Determine the dose count based on the patient's life stage
    * @method: determineDoeseCount
    * @param: String lifeStage
    * @return: DoseCount
    * @throw
    */
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
