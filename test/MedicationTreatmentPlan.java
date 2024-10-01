import static org.junit.Assert.assertEquals;

import com.algonquin.cst8288.fall24.assignment1.patient.Outpatient;
import org.junit.Before;
import org.junit.Test;

public class MedicationTreatmentPlan {

    private MedicationTreatmentPlan medicationTreatmentPlan;
    private Outpatient outpatient;

    @Before
    public void setUp() {
        medicationTreatmentPlan = new MedicationTreatmentPlan();
        outpatient = new Outpatient("002", "Hyun bin", "Hyun.bin@example.com", "9876543210", "1999-09-23", "2000-10-10");
        outpatient.setLifeStage("ADULT");
        outpatient.setPlannedTreatment("Infection");
    }

    @Test
    public void testCreateTreatmentPlan() {
        String expectedPlan = """
                              Medication Treatment Plan:
                              - Doses per day: 3
                              - Duration: 14 days
                              - Medication: Antibiotics""";
        
        String actualPlan = medicationTreatmentPlan.createTreatmentPlan(outpatient);
        assertEquals(expectedPlan, actualPlan);
    }

    private String createTreatmentPlan(Outpatient outpatient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
