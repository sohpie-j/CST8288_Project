package com.algonquin.cst8288.fall24.assignment1.prescription;

import java.util.Date;

/*
* @author:KyungA Jang
* @description: Calculate the details of the prescription according to the business rules.
*               The information to include should cover daily doses, duration, disease type,
*               surgery date, etc.
* @class: Prescription()
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
 
        // Constructor
	public Prescription() {
		
	}

    /**
     * Prescription(string details)
     * @param details
     */
    public Prescription(String details) {
        this.details = details;  // Set the details field
    }

    /*
    * getDetails()
    * @description: Getter method for details
    * @return: detail
    */
    public String getDetails() {
        return details;
    }

    /*
    * getDetails(String details)
    * @description: Setter method for details
    * @param: detail
    */
    public void setDetails(String details) {
        this.details = details;
    }

}
