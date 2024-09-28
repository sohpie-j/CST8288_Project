import static org.junit.Assert.assertEquals;

import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;
import org.junit.Before;
import org.junit.Test;

public class SurgeryTreatmentPlanTest {

    private SurgeryTreatmentPlan surgeryTreatmentPlan;
    private Inpatient inpatient;

    @Before
    public void setUp() {
        surgeryTreatmentPlan = new SurgeryTreatmentPlan();
        inpatient = new Inpatient("001", "audrey hepburn", "audrey.hepburn@example.com", "1234567890", "2011-11-11", "Room 111");
        inpatient.setAge(25); // Adult
    }

    @Test
    public void testCreateTreatmentPlan() {
        String expectedPlan = "Surgery Treatment Plan:\n" +
                "- Fasting Requirement: 8 Hours Before Surgery\n" +
                "- Follow-up Schedule: In a Month";

        String actualPlan = surgeryTreatmentPlan.createTreatmentPlan(inpatient);
        assertEquals(expectedPlan, actualPlan);
    }
}
