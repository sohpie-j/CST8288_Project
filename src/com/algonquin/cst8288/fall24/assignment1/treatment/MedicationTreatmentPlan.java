package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;


/**
 * 
 * Implement this
 */
public class MedicationTreatmentPlan implements TreatmentPlan {

	@Override
	public String createTreatmentPlan(Patient patient) {
	         
            String lifeStage = patient.getLifeStage();
            int dosesPerDay;

        // Determine doses per day based on life stage
        switch (lifeStage) {
            case "CHILD":
                dosesPerDay = 1;
                break;
            case "YOUTH":
                dosesPerDay = 2;
                break;
            case "ADULT":
            default:
                dosesPerDay = 3;
                break;
        }

        // Determine duration based on illness
        String illnessType = patient.getPlannedTreatment();
        int duration;
        String medicationType;

        switch (illnessType) {
            case "Acute":
                duration = 7;
                medicationType = "No Medication";
                break;
            case "Infection":
                duration = 14;
                medicationType = "Antibiotics";
                break;
            case "Chronic":
            default:
                duration = 180;
                medicationType = "Specialized Medication";
                break;
        }

        // Return the treatment plan details as a string
        return String.format("Medication Treatment Plan:\n- Doses per day: %d\n- Duration: %d days\n- Medication: %s", 
                             dosesPerDay, duration, medicationType);
    }            
}
