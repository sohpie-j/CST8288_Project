import static org.junit.Assert.assertTrue;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrintablePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;
import com.algonquin.cst8288.fall24.assignment1.patient.Outpatient;
import org.junit.Before;
import org.junit.Test;

public class PrintablePrescriptionServiceTest {

    private PrintablePrescriptionService printablePrescriptionService;
    private Patient patient;

    @Before
    public void setUp() {
        printablePrescriptionService = new PrintablePrescriptionService();
        patient = new Outpatient("002", "Hyun bin", "Hyun.bin@example.com", "9876543210", "1999-09-23", "2000-10-10");
        patient.setPrescription(new Prescription("Medication: Amoxicillin"));
    }

    @Test
    public void testGeneratePrescription() {
        String prescription = printablePrescriptionService.generatePrescription(patient);
        
        assertTrue(prescription.contains("Prescription"));
        assertTrue(prescription.contains("Patient Name: Jane Smith"));
        assertTrue(prescription.contains("Prescription Details: Medication: Amoxicillin"));
    }
}
