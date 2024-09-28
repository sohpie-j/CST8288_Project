/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import EmploymentManagementSystem.Employee;
import EmploymentManagementSystem.EmployeeManager;
import EmploymentManagementSystem.FullTimeEmployee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kajan
 */
public class EmployeeManagerTest {

    private EmployeeManager manager;
    
    public EmployeeManagerTest() {
    }
    
    @BeforeAll
    public void setUp() {
        manager = EmployeeManager.getInstance();
    }
    
   @Test
    public void testSingletonBehavior() {
        EmployeeManager anotherManager = EmployeeManager.getInstance();
        assertSame(manager, anotherManager);  // They should be the same instance
    }

    @Test
    public void testAddAndRetrieveEmployee() {
        Employee employee = new FullTimeEmployee("103", "Charles", "HR", "HR Manager", 40, 70000);
        manager.addEmployee(employee);

        Employee retrievedEmployee = manager.getEmployee("103");
        assertNotNull(retrievedEmployee);
        assertEquals("Charles", retrievedEmployee.name);
    }
}
