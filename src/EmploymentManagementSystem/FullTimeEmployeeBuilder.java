/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author KyungA Jang
 * @class FullTimeEmployeeBuilder 
 * inherited from EmployeeBuilder (Builder pattern)
 * @
 *  FullTimeEmployeeBuilder setId(String id)
 *  FullTimeEmployeeBuilder setBane(String name)
 *  FullTimeEmployeeBuilder setDepartment(String department)
 *  FullTimeEmployeeBuilder  setRole(String role)
 *  FullTimeEmployeeBuilder setWorkingHoursePerWeek(int hours)
 *  FullTimeEmployeeBuilder setSalary(double salary)
 */

public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private String id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public FullTimeEmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public FullTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public FullTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public FullTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public FullTimeEmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    @Override
    public FullTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public Employee build() {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
