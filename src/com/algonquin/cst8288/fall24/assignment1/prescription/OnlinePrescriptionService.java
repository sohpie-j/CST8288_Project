package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * 
 * Implement this
 * 
 */
public class OnlinePrescriptionService implements PrescriptionService{

    @Override
    public String generatePrescription(Patient patient) {
        // Generate an HTML prescription as a string
        return "<html><body>"
            + "<h1>Prescription</h1>"
            + "<p><strong>Patient Name:</strong> " + patient.getName() + "</p>"
            + "<p><strong>Date of Birth:</strong> " + patient.getDateOfBirth() + "</p>"
            + "<p><strong>Life Stage:</strong> " + patient.getLifeStage() + "</p>"
            + "<p><strong>Planned Treatment:</strong> " + patient.getPlannedTreatment() + "</p>"
            + "<p><strong>Prescription Details:</strong> " + patient.getPrescription().getDetails() + "</p>"
            + "</body></html>";
    }
}
