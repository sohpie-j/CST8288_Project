package com.algonquin.cst8288.fall24.assignment1.prescription;

import java.util.Date;

/**
 * 
 * Calculate the details of the prescription according to the business rules.
 * The information to include should cover daily doses, duration, disease type,
 * surgery date, etc.
 * 
 */


public class Prescription {
	
	long dailyDosageCount;
	long duration;
	String diseaseType;
	Date surgeryDate;
	String riskFactor;
	boolean isFastingRequired;
	Date followUpDate;
        
        private String details;
	// Add any other required attributes

	public Prescription() {
		
	}
    // Constructor

    /**
     *
     * @param details
     */
    public Prescription(String details) {
        this.details = details;  // Set the details field
    }

    // Getter method for details
    public String getDetails() {
        return details;
    }

    // Setter method for details
    public void setDetails(String details) {
        this.details = details;
    }

}
