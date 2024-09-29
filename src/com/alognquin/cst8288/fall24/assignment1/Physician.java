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
import java.io.IOException;

/**
 * @author KyungA Jang
 * @clss Physician ()
 * @throw IOException
 * 
 */

public class Physician {
	
    //main()
    public static void main(String[] args) throws IOException {
    	
        /*
         * @description: Creation of the first patient (Inpatient with patient's information)
        */
        Patient audreyhepburn = new Inpatient("001", "Audrey Hepburn", "audrey.hepburn@example.com", "1234567890", "2011-11-11", "Room 111");
        
        /*
         * @description: Creation of the prescription details for audrey hepburn
        */
        Prescription audreyPrescription = new Prescription("Surgery: Appendectomy, Follow-up in 1 month");

        /*
         * @description: 
         * Set planned treatment and prescription details.
        */
        audreyhepburn.setPrescription(audreyPrescription);
        audreyhepburn.setPlannedTreatment("Appendectomy");

        /*
         * @description: Inject SurgeryTreatmentPlan and OnlinePrescriptionService for audrey hepburn
        */
        PatientManagement patientManagement1 = new PatientManagement(new SurgeryTreatmentPlan(), new OnlinePrescriptionService());
        patientManagement1.createTreatmentPlan(audreyhepburn);
        patientManagement1.generatePrescription(audreyhepburn, "audrey_hepburn_prescription.html");
        
        /*
         * @description: Generate Hyunbin's printable prescription
        */
        PatientManagement patientManagementPrint1 = new PatientManagement(new SurgeryTreatmentPlan(), new PrintablePrescriptionService());
        patientManagementPrint1.generatePrescription(audreyhepburn, "audrey_hepburn_prescription.txt");

        /*
         * @description: Create the second patient (Outpatient with MedicationTreatmentPlan)
        */
        Patient Hyunbin = new Outpatient("002", "Hyun Bin", "hyun.bin@example.com", "9876543210", "1999-09-23", "2000-10-10");

        /*
         * @description: Set the prescription details for Jane Smith
        */
        Prescription HyunbinPrescription = new Prescription("Medication: Amoxicillin, Dosage: 2 times/day for 7 days");
        Hyunbin.setPrescription(HyunbinPrescription);
        Hyunbin.setPlannedTreatment("Appendectomy");

        /*
         * @descrption: Inject MedicationTreatmentPlan and OnlinePrescriptionService for Hyun Bin
        */
        PatientManagement patientManagement2 = new PatientManagement(new MedicationTreatmentPlan(), new OnlinePrescriptionService());
        patientManagement2.createTreatmentPlan(Hyunbin);
        patientManagement2.generatePrescription(Hyunbin, "Hyun_bin_prescription.html");

        /*
         * @descrption: Generate Jane's printable prescription
         */
        PatientManagement patientManagementPrint2 = new PatientManagement(new MedicationTreatmentPlan(), new PrintablePrescriptionService());
        patientManagementPrint2.generatePrescription(Hyunbin, "Hyun_bin_prescription.txt");
    
    }   
}


