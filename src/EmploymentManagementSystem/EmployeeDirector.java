/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author kajan
 */
public class EmployeeDirector {

    private final EmployeeBuilder builder;

    // Constructor accepting the EmployeeBuilder
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    // Method to construct an employee with provided details
    public Employee constructEmployee(String id, String name, String department, String role, int hours, double salary) {
        return builder
                .setId(id)                      // Set the employee's ID
                .setName(name)                   // Set the employee's name
                .setDepartment(department)       // Set the employee's department
                .setRole(role)                   // Set the employee's role
                .setWorkingHoursPerWeek(hours)   // Set the employee's working hours per week
                .setSalary(salary)               // Set the employee's salary
                .build();                        // Build and return the employee
    }
    
}
