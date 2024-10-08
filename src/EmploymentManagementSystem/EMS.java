/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author KyungA Jang
 * @class EmployeeManagementSystem
 * Employee management system for managing Full time and Part time employees
 * Using SRP, Builder, Factory Pattern for creating this system.
 */

public class EMS {
    
    public static void main(String[] args) {
        
        //Get one instance from EmployeeManager implemented SRP
        EmployeeManager manager = EmployeeManager.getInstance(); 

        // Using the Builder pattern to create a Full-Time Employee
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        Employee fullTimeEmployee = fullTimeBuilder.setId("000001")
                                                   .setName("Cute Apple")
                                                   .setDepartment("Programming")
                                                   .setRole("Programmer")
                                                   .setWorkingHoursPerWeek(40)
                                                   .setSalary(80000)
                                                   .build();
        manager.addEmployee(fullTimeEmployee);

        // Using the Factory pattern to create a Part-Time Employee
        Employee partTimeEmployee = EmployeeFactory.createEmployee("parttime", "000002", "Handsome John", "Sales", "Saleman", 20, 40000);
        manager.addEmployee(partTimeEmployee);

        // Retrieve and display employees
        Employee retrievedFullTime = manager.getEmployee("000001");
        Employee retrievedPartTime = manager.getEmployee("000002");

        System.out.println("Full-Time Employee: " + retrievedFullTime.name + ", Role: " + retrievedFullTime.role);
        System.out.println("Part-Time Employee: " + retrievedPartTime.name + ", Role: " + retrievedPartTime.role);
        
        // Simulate clocking in and out
        retrievedFullTime.clockIn();
        retrievedFullTime.clockOut();
        retrievedFullTime.trackWorkHours();
        
        // Simulate clocking in and out
        retrievedPartTime.clockIn();
        retrievedPartTime.clockOut();
        retrievedPartTime.trackWorkHours();
    }
}

