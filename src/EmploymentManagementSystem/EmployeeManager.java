package EmploymentManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private static EmployeeManager instance;
    private final Map<String, Employee> employees;

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
}
