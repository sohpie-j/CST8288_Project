/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author kajan
 */
public abstract class Employee {
    public String id;
    public String name;
    public String department;
    public String role;
    public int workingHoursPerWeek;
    public double salary;

    public Employee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();
}
