/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;


/**
 *
 * @author KyungA Jang
 * @class EmployeeBuilder (Interface)
 * Implemented Builder pattern: handle the object more flexible
 * @
 *  setId(String id)
 *  setBane(String name)
 *  setDepartment(String department)
 *  setRole(String role)
 *  setWorkingHoursePerWeek(int hours)
 *  setSalary(double salary)
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
