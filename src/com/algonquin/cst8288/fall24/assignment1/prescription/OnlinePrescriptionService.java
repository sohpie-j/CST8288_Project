package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * @author KyungA Jang
 * @clss OnlinePrescriptionService
 * Implement PrintptionService * 
 * 
 */
public class OnlinePrescriptionService implements PrescriptionService{

    /*
     * @class generatePrescription
     * @param Patient
     * @return htmlContent - Patient Prescription
     *
    */
    @Override
    public String generatePrescription(Patient patient) {
        
        /*
        * @description: Checking for null values and providing default information if necesssary
        */
        String treatment = patient.getPlannedTreatment() != null ? patient.getPlannedTreatment() : "No planned treatment.";
        String prescriptionDetails = patient.getPrescription() != null ? patient.getPrescription().getDetails() : "No prescription details available.";
        
        /*
         * @desciption: Generate an HTML prescription as a string
        */
        String htmlContent = "<html><body>"
            + "<h1>Prescription</h1>"
            + "<p><strong>Patient Name:</strong> " + patient.getName() + "</p>"
            + "<p><strong>Date of Birth:</strong> " + patient.getDateOfBirth() + "</p>"
            + "<p><strong>Age:</strong> " + patient.getAge() + "</p>"
            + "<p><strong>Life Stage:</strong> " + patient.getLifeStage() + "</p>"
            + "<p><strong>Planned Treatment:</strong> " + treatment + "</p>"
            + "<p><strong>Prescription Details:</strong> " + prescriptionDetails + "</p>"
            + "</body></html>";
        
        return htmlContent;
    }
}
