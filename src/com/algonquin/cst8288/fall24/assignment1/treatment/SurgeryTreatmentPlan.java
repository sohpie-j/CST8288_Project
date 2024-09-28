package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * 
 * This class is responsible for implementing the business logic related to generating a treatment plan. 
 * 
 * You can use any method you prefer, such as StringBuilder or standard String, to construct the plan. Think of
 * treatment plan is a doctor notes in a summary format. 
 * Later, you will attach the treatment plan to detailed prescription.
 * 
 * An example might look like this:
 * "The patient is diagnosed with xxx and requires surgery.
 *  The patient is xxx years old with a risk factor of xxx. It is required to perform a minor surgery
 *  in order to address the xxx issue."
 * 
 * */


public class SurgeryTreatmentPlan implements TreatmentPlan{

	@Override
	public String createTreatmentPlan(Patient patient) {
        long age = patient.getAge();
        String fastingRequirement;
        String followUpSchedule;

        // Determine fasting requirements and follow-up based on age
        if (age < 6) {
            fastingRequirement = "No Fasting Required";
            followUpSchedule = "Next Day";
        } else if (age <= 18) {
            fastingRequirement = "2 Hours Before Surgery";
            followUpSchedule = "In a Week";
        } else {
            fastingRequirement = "8 Hours Before Surgery";
            followUpSchedule = "In a Month";
        }

        // Return the treatment plan details as a string
        return String.format("Surgery Treatment Plan:\n- Fasting Requirement: %s\n- Follow-up Schedule: %s", 
                             fastingRequirement, followUpSchedule);
    }
}
