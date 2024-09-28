/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmploymentManagementSystem;

/**
 *
 * @author kajan
 */
public class EmployeeManagementSystem {
    
    public static void main(String[] args) {
        
        // Singleton EmployeeManager instance
        EmployeeManager manager = EmployeeManager.getInstance();  // Fixed typo

        // Using the Builder pattern to create a Full-Time Employee
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        Employee fullTimeEmployee = fullTimeBuilder.setId("101")
                                                   .setName("Alice")
                                                   .setDepartment("Engineering")
                                                   .setRole("Engineer")
                                                   .setWorkingHoursPerWeek(40)
                                                   .setSalary(80000)
                                                   .build();
        manager.addEmployee(fullTimeEmployee);

        // Using the Factory pattern to create a Part-Time Employee
        Employee partTimeEmployee = EmployeeFactory.createEmployee("parttime", "102", "Bob", "Marketing", "Consultant", 20, 40000);
        manager.addEmployee(partTimeEmployee);

        // Retrieve and display employees
        Employee retrievedFullTime = manager.getEmployee("101");
        Employee retrievedPartTime = manager.getEmployee("102");

        System.out.println("Full-Time Employee: " + retrievedFullTime.name + ", Role: " + retrievedFullTime.role);
        System.out.println("Part-Time Employee: " + retrievedPartTime.name + ", Role: " + retrievedPartTime.role);
        
        // Simulate clocking in and out
        retrievedFullTime.clockIn();
        retrievedFullTime.clockOut();
        retrievedFullTime.trackWorkHours();
        
        retrievedPartTime.clockIn();
        retrievedPartTime.clockOut();
        retrievedPartTime.trackWorkHours();
    }
}

