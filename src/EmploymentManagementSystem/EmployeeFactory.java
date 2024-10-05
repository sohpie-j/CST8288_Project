/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;


/**
 *
 * @author KyungA Jang
 * @class EmployeeFactory
 * Implemented Factory pattern: return suitable objects regarding to the input value.
 * Create employee of full time or part time employee depends on the input value.
 *
 */

public class EmployeeFactory {
    
    public static Employee createEmployee(String employeeType, String id, String name, String department, String role, int hours, double salary) {
        
        /*
        * switch loop for creating new full time or par time employee up to employeeType value
        */
        switch (employeeType.toLowerCase()) {
            case "fulltime" -> {
                return new FullTimeEmployee(id, name, department, role, hours, salary);
            }
            case "parttime" -> {
                return new PartTimeEmployee(id, name, department, role, hours, salary);
            }
            
            //Junit Test throw
            default -> throw new IllegalArgumentException("Invalid employee type: " + employeeType);
        }
    }
}

