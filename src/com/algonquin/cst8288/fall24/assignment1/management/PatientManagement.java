package com.algonquin.cst8288.fall24.assignment1.management;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.Utilities.PatientUtilities;
import com.algonquin.cst8288.fall24.assignment1.prescription.OnlinePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;
import java.io.IOException;
/**
 * The patient management class  used by Physicians to perform multiple tasks.
 * 
 */

public class PatientManagement {

	
    private final TreatmentPlan treatmentPlan;
    private final PrescriptionService prescriptionService;

    // Constructor to inject dependencies
    public PatientManagement(TreatmentPlan treatmentPlan, PrescriptionService prescriptionService) {
        this.treatmentPlan = treatmentPlan;
        this.prescriptionService = prescriptionService;
    }
    /**
     * Create treatment plan
     * 
     * @param patient
     * @throws java.io.IOException
     */
    // Create treatment plan based on injected treatment plan type
    public void createTreatmentPlan(Patient patient) throws IOException {
        // Using injected TreatmentPlan dependency
        PatientUtilities patientutilities = new PatientUtilities();
        TreatmentPlan treatment = new SurgeryTreatmentPlan();
        
	patient.setAge(patientutilities.calulatePatientAge(patient.getDateOfBirth()));
	patient.setLifeStage(patientutilities.determineLifeStage(patient.getAge()));
	treatment.createTreatmentPlan(patient);
        //patient.setPlannedTreatment(plan);
    }

    // Generate prescription based on injected PrescriptionService
    /**
     * Create prescription
     * 
     * @param patient
     * @return
     */
//    public void generatePrescription(Patient patient, String filename) throws IOException {
//        @SuppressWarnings("LocalVariableHidesMemberVariable")
//	PrescriptionService prescriptionService = new OnlinePrescriptionService();
//	BufferedWriter bwriter;
//	bwriter = new BufferedWriter(new FileWriter(filename));	
//	bwriter.write(prescriptionService.generatePrescription(patient, filename));
//	bwriter.close();
//    }
    public String generatePrescription(Patient patient) {
    if (patient.getName() == null) {
        throw new IllegalArgumentException("Patient name cannot be null");
    }
    if (patient.getPrescription() == null || patient.getPrescription().getDetails() == null) {
        throw new IllegalArgumentException("Prescription details are missing for patient: " + patient.getName());
    }

    // Generate the prescription
    return """
           Prescription
           ---------------
           Patient Name: """ + patient.getName() + "\n"
         + "Date of Birth: " + patient.getDateOfBirth() + "\n"
         + "Life Stage: " + patient.getLifeStage() + "\n"
         + "Planned Treatment: " + patient.getPlannedTreatment() + "\n"
         + "Prescription Details: " + patient.getPrescription().getDetails() + "\n";
    }
    
    public void generatePrescription(Patient patient, String filename) throws IOException {
        if (patient.getPrescription() == null || patient.getPrescription().getDetails() == null) {
            throw new IllegalArgumentException("Prescription details are missing for patient: " + patient.getName());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(prescriptionService.generatePrescription(patient));
        }
    }

    private long calulatePatientAge() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String determineLifeStage(long age) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



