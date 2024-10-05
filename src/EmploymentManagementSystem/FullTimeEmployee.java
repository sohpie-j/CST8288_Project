/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmploymentManagementSystem;

/*
 * @author KyungA Jang
 * @class FullTImeEmployee
 * inheriated from Employee (Interface)
 * abstract method to be implemented by subclasses for individuals
 * different implementation depends on the full time and part time employee.
 */

public class FullTimeEmployee extends Employee {

    //Contructor
    public FullTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    //Clocked In
    @Override
    public void clockIn() {
        System.out.println(name + " (Full-Time) has clocked in.");
    }
    
    //Clocked out
    @Override
    public void clockOut() {
        System.out.println(name + " (Full-Time) has clocked out.");
    }

    //Wroking hour
    @Override
    public void trackWorkHours() {
        System.out.println(name + " (Full-Time) worked " + workingHoursPerWeek + " hours this week.");
    }
}
