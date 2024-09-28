package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;


/**
 * 
 * Implement this
 * 
 */
public class PrintablePrescriptionService implements PrescriptionService {

    @Override
    public String generatePrescription(Patient patient) {
        // Generate a plain text prescription
        return "Prescription\n"
            + "---------------\n"
            + "Patient Name: " + patient.getName() + "\n"
            + "Date of Birth: " + patient.getDateOfBirth() + "\n"
            + "Life Stage: " + patient.getLifeStage() + "\n"
            + "Planned Treatment: " + patient.getPlannedTreatment() + "\n"
            + "Prescription Details: " + patient.getPrescription().getDetails() + "\n";
    }
}
