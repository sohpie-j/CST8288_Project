import static org.junit.Assert.assertTrue;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.OnlinePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;
import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import org.junit.Before;
import org.junit.Test;

public class OnlinePrescriptionServiceTest {

    private OnlinePrescriptionService onlinePrescriptionService;
    private Patient patient;

    @Before
    public void setUp() {
        onlinePrescriptionService = new OnlinePrescriptionService();
        patient = new Inpatient("001", "audrey hepburn", "audrey.hepburn@example.com", "1234567890", "2011-11-11", "Room 111");
        patient.setPrescription(new Prescription("Surgery: Appendectomy"));
    }

    @Test
    public void testGeneratePrescription() {
        String prescription = onlinePrescriptionService.generatePrescription(patient);
        
        assertTrue(prescription.contains("<h1>Prescription</h1>"));
        assertTrue(prescription.contains("<p><strong>Patient Name:</strong> John Doe</p>"));
        assertTrue(prescription.contains("<p><strong>Prescription Details:</strong> Surgery: Appendectomy</p>"));
    }
}
