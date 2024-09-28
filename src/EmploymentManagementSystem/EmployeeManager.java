package EmploymentManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private static EmployeeManager instance;
    private Map<String, Employee> employees;

    // Private constructor to prevent instantiation
    private EmployeeManager() {
        employees = new HashMap<>();  // Initialize the employees map here
    }
    
    // Method to get the single instance
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }


    // Add an employee
    public void addEmployee(Employee employee) {
        employees.put(employee.id, employee);
    }

    // Remove an employee
    public void removeEmployee(String employeeId) {
        employees.remove(employeeId);
    }

    // Retrieve an employee
    public Employee getEmployee(String employeeId) {
        return employees.get(employeeId);
    }

//    @Override
//    public void clockIn() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void clockOut() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void trackWorkHours() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
