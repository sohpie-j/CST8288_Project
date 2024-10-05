/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/*
 * @author KyungA Jang
 * @class PartTimeEmployee
 * inheriated from Employee (Interface)
 * abstract method to be implemented by subclasses for individuals
 * different implementation depends on the full time and part time employee.
 */

public class PartTimeEmployee extends Employee {

    //Contructor
    public PartTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    //Clocked in
    @Override
    public void clockIn() {
        System.out.println(name + " (Part-Time) has clocked in.");
    }

    //Clocked out
    @Override
    public void clockOut() {
        System.out.println(name + " (Part-Time) has clocked out.");
    }

    //Tracking working hours
    @Override
    public void trackWorkHours() {
        System.out.println(name + " (Part-Time) worked " + workingHoursPerWeek + " hours this week.");
    }
}
