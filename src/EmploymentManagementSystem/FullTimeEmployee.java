/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author kajan
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        System.out.println(name + " (Full-Time) has clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " (Full-Time) has clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " (Full-Time) worked " + workingHoursPerWeek + " hours this week.");
    }
}
