/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import EmploymentManagementSystem.Employee;
import EmploymentManagementSystem.FullTimeEmployeeBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kajan
 */
public class EmployeeDirectorTest {
    
    private FullTimeEmployeeBuilder builder;
    
    public EmployeeDirectorTest() {
    }
    
    @BeforeAll
    public void setUp() {
        builder = new FullTimeEmployeeBuilder();
    }
    
    @Test
    public void testBuildFullTimeEmployee() {
        Employee employee = builder.setId("104")
                                   .setName("Diana")
                                   .setDepartment("Finance")
                                   .setRole("CFO")
                                   .setWorkingHoursPerWeek(40)
                                   .setSalary(150000)
                                   .build();

        assertEquals("Diana", employee.name);
        assertEquals("Finance", employee.department);
        assertEquals(150000, employee.salary, 0.01);
    }
}
