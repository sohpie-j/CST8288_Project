package com.alognquin.cst8288.fall24.assignment1;

import com.algonquin.cst8288.fall24.assignment1.management.PatientManagement;
import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import com.algonquin.cst8288.fall24.assignment1.patient.Outpatient;
import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.OnlinePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrintablePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.treatment.MedicationTreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrescriptionService;
import java.io.IOException;

public class Physician {
	
    public static void main(String[] args) throws IOException {
    	
    	
    	/**
    	 * 
    	 * Create two instances of the 'Patient' class and apply 'MedicationTreatment.java' and 
    	 * 'SurgeryTreatment.java' to generate and populate the treatment plans for each patient. 
    	 * Then, use 'PatientManagement.java' to generate both treatment plans. Once the treatment 
    	 * plan is generated. Use PrescriptionService.java to generate prescriptions
    	 * in different format (.txt or .html) 
    	 *
    	 * 
    	 */
        // Create the first patient (Inpatient with SurgeryTreatmentPlan)
        Patient audreyhepburn = new Inpatient("001", "audrey hepburn", "audrey.hepburn@example.com", "1234567890", "2011-11-11", "Room 111");
        
        // Set the prescription details for John Doe
        Prescription johnPrescription = new Prescription("Surgery: Appendectomy, Follow-up in 1 month");
        audreyhepburn.setPrescription(johnPrescription);

        // Inject SurgeryTreatmentPlan and OnlinePrescriptionService for John Doe
        PatientManagement patientManagement1 = new PatientManagement(new SurgeryTreatmentPlan(), new OnlinePrescriptionService());
        patientManagement1.createTreatmentPlan(audreyhepburn);
        patientManagement1.generatePrescription(audreyhepburn, "audrey_hepburn_prescription.html");
        
        // Generate John's printable prescription
        PatientManagement patientManagementPrint1 = new PatientManagement(new SurgeryTreatmentPlan(), new PrintablePrescriptionService());
        patientManagementPrint1.generatePrescription(audreyhepburn, "audrey_hepburn_prescription.txt");

        // Create the second patient (Outpatient with MedicationTreatmentPlan)
        Patient Hyunbin = new Outpatient("002", "Hyun bin", "Hyun.bin@example.com", "9876543210", "1999-09-23", "2000-10-10");

        // Set the prescription details for Jane Smith
        Prescription janePrescription = new Prescription("Medication: Amoxicillin, Dosage: 2 times/day for 7 days");
        Hyunbin.setPrescription(janePrescription);

        // Inject MedicationTreatmentPlan and OnlinePrescriptionService for Jane Smith
        PatientManagement patientManagement2 = new PatientManagement(new MedicationTreatmentPlan(), new OnlinePrescriptionService());
        patientManagement2.createTreatmentPlan(Hyunbin);
        patientManagement2.generatePrescription(Hyunbin, "Hyun_bin_prescription.html");

        // Generate Jane's printable prescription
        PatientManagement patientManagementPrint2 = new PatientManagement(new MedicationTreatmentPlan(), new PrintablePrescriptionService());
        patientManagementPrint2.generatePrescription(Hyunbin, "Hyun_bin_prescription.txt");
    
    }

   
}


