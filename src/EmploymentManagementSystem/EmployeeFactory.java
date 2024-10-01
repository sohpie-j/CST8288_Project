/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author kajan
 */
public class EmployeeFactory {
    public static Employee createEmployee(String employeeType, String id, String name, String department, String role, int hours, double salary) {
        switch (employeeType.toLowerCase()) {
            case "fulltime" -> {
                return new FullTimeEmployee(id, name, department, role, hours, salary);
            }
            case "parttime" -> {
                return new PartTimeEmployee(id, name, department, role, hours, salary);
            }
            default -> throw new IllegalArgumentException("Invalid employee type: " + employeeType);
        }
    }
}

