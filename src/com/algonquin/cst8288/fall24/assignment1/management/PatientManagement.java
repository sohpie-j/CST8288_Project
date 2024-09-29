package com.algonquin.cst8288.fall24.assignment1.management;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.Utilities.PatientUtilities;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;
import java.io.IOException;
/**
 * The patient management class  used by Physicians to perform multiple tasks.
 * 
 */
/**
 * @author KyungA Jang
 * @clss PatientManagement
 * The patient management class  used by Physicians to perform multiple tasks. 
 */
public class PatientManagement {

    private final TreatmentPlan treatmentPlan;
    private final PrescriptionService prescriptionService;

    // Constructor to inject dependencies
    public PatientManagement(TreatmentPlan treatmentPlan, PrescriptionService prescriptionService) {
        this.treatmentPlan = treatmentPlan;
        this.prescriptionService = prescriptionService;
    }
    
    /* Create treatment plan based on injected treatment plan type
     *  
     * @param Patient patient
     * @throws java.io.IOException
     */
    public void createTreatmentPlan(Patient patient) throws IOException {
        
        // Using injected TreatmentPlan dependency
        PatientUtilities patientutilities = new PatientUtilities();
        TreatmentPlan treatment = new SurgeryTreatmentPlan();
        
	patient.setAge(patientutilities.caculatePatientAge(patient.getDateOfBirth()));
	patient.setLifeStage(patientutilities.determineLifeStage(patient.getAge()));
	treatment.createTreatmentPlan(patient);
    }

    /**
     * Generate prescription based on injected PrescriptionService
     * 
     * @param patient
     * @exception IllegalArgumentException
     * @return
     */

    public String generatePrescription(Patient patient) {
	    if (patient.getName() == null) {
	        throw new IllegalArgumentException("Patient name cannot be null");
	    }
	    if (patient.getPrescription() == null || patient.getPrescription().getDetails() == null) {
	        throw new IllegalArgumentException("Prescription details are missing for patient: " + patient.getName());
    }

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
    
    /**
     * Generate prescription based on injected PrescriptionService
     * 
     * @param patient, filename
     * @throw IOException
     */
    public void generatePrescription(Patient patient, String filename) throws IOException {
        if (patient.getPrescription() == null || patient.getPrescription().getDetails() == null) {
            throw new IllegalArgumentException("Prescription details are missing for patient: " + patient.getName());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(prescriptionService.generatePrescription(patient));
        }
    }
}