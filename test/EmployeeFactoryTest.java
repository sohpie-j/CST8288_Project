/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import EmploymentManagementSystem.Employee;
import EmploymentManagementSystem.EmployeeFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kajan
 */
public class EmployeeFactoryTest {
    
    public EmployeeFactoryTest() {
    }
    
    @Test
    public void testCreateFullTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("fulltime", "105", "Edward", "IT", "CTO", 40, 120000);
        assertNotNull(employee);
        assertEquals("Edward", employee.name);
    }

    @Test
    public void testCreatePartTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("parttime", "106", "Fiona", "Sales", "Consultant", 20, 50000);
        assertNotNull(employee);
        assertEquals("Fiona", employee.name);
    }
}
