/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author KyungA Jang
 * @class Employee (Abstract)
 * Definition of Employee ID, name, department, role, working hour a week
 * and salary.
 */
public abstract class Employee {
    public String id;
    public String name;
    public String department;
    public String role;
    public int workingHoursPerWeek;
    public double salary;

    /*
    * contructuor: initialize the employee information
    */
    public Employee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    /*
    * abstract method to be implemented by subclasses for individuals
    * different implementation depends on the full time and part time employee.
    */
    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();
    
    /*
    * Common method for showing details
    */
    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Role: " + role);
    }
}
