package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * @author KyungA Jang
 * @clss PrintablePrescriptionService
 * Implement PrintptionService * 
 * 
 */
public class PrintablePrescriptionService implements PrescriptionService {

    /*
     * @class generatePrescription
     * @param Patient
     * @return txtContent - Patient Prescription
     *
    */
    @Override
    public String generatePrescription(Patient patient) {
        // Generate a plain text prescription
        String txtContent = """
           Prescription
           ---------------
           Patient Name: """ + patient.getName() + "\n"
         + "Date of Birth: " + patient.getDateOfBirth() + "\n"
         + "Age: " + patient.getAge() + "\n"
         + "Life Stage: " + patient.getLifeStage() + "\n"
         + "Planned Treatment: " + patient.getPlannedTreatment() + "\n"
         + "Prescription Details: " + patient.getPrescription().getDetails() + "\n";
        
        return txtContent;
    }
}
