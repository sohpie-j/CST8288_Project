/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author kajan
 */
public interface EmployeeBuilder {
    EmployeeBuilder setId(String id);
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department);
    EmployeeBuilder setRole(String role);
    EmployeeBuilder setWorkingHoursPerWeek(int hours);
    EmployeeBuilder setSalary(double salary);
    Employee build();
}
