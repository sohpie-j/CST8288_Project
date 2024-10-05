/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author KyungA Jang
 * @class PartTimeEmployeeBuilder 
 * inherited from EmployeeBuilder (Builder pattern)
 * @
 *  PartTimeEmployeeBuilder setId(String id)
 *  PartTimeEmployeeBuilder setBane(String name)
 *  PartTimeEmployeeBuilder setDepartment(String department)
 *  PartTimeEmployeeBuilder  setRole(String role)
 *  PartTimeEmployeeBuilder setWorkingHoursePerWeek(int hours)
 *  PartTimeEmployeeBuilder setSalary(double salary)
 */

public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private String id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public PartTimeEmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public PartTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PartTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public PartTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public PartTimeEmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    @Override
    public PartTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public Employee build() {
        return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
