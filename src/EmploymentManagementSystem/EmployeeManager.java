package EmploymentManagementSystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author KyungA Jang
 * @class EmployeeManager
 * Implemented Singleton Responsibility Principle: only one instance here
 * class EmployeeManager handles the employee information to add or delete.
 * This system only allows this functionality.
 * @method:
 *  addEmployee(Employee employee)
 *  removeEmployee(String employeeID)
 *  getEmployee(String employeeID)
 */

public class EmployeeManager {
    
    //variable to store the one instance of class
    private static EmployeeManager instance;
    
    //lists for storing the employees
    private final Map<String, Employee> employees;

    // Private constructor to prevent instantiation: not touch from outside
    private EmployeeManager() {
        
        // Initialize the employees map here
        employees = new HashMap<>();  
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
