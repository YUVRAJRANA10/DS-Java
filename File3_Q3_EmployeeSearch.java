/**
 * ============================================================
 * QUESTION: Special Employee Search
 * FILE: 3 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Locate an employee by ID or name in a personnel list.
 * 
 * CLASSIFICATION: Search Algorithms
 * 
 * TEST CASES:
 * Case 1: "Amit" → Index 2
 * Case 2: "Non-existent" → -1
 * 
 * ALGORITHM:
 * Linear or Binary search based on data state.
 * 
 * SIMILAR QUESTIONS:
 * 1. Find K Smallest Elements
 * 2. Employee Importance
 * 3. Longest Common Prefix
 * ============================================================
 */

import java.util.*;

public class File3_Q3_EmployeeSearch {
    
    // Employee class
    static class Employee {
        int id;
        String name;
        
        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "{" + id + ", " + name + "}";
        }
    }
    
    /**
     * TODO: Implement this method
     * Search employee by name (linear search)
     * 
     * @param employees - list of employees
     * @param name - name to search
     * @return - index of employee, -1 if not found
     */
    public static int searchByName(Employee[] employees, String name) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    /**
     * TODO: Implement this method
     * Search employee by ID (binary search - assumes sorted by ID)
     * 
     * @param employees - list of employees sorted by ID
     * @param id - ID to search
     * @return - index of employee, -1 if not found
     */
    public static int searchById(Employee[] employees, int id) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q3: Employee Search ===\n");
        
        Employee[] employees = {
            new Employee(101, "Rahul"),
            new Employee(102, "Priya"),
            new Employee(103, "Amit"),
            new Employee(104, "Sneha"),
            new Employee(105, "Vikas")
        };
        
        System.out.println("Employee List: " + Arrays.toString(employees));
        System.out.println();
        
        // Test Case 1 - Search by name
        String name1 = "Amit";
        int expected1 = 2;
        int result1 = searchByName(employees, name1);
        System.out.println("Test 1: Search by name \"" + name1 + "\"");
        System.out.println("Index: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - Not found
        String name2 = "Non-existent";
        int expected2 = -1;
        int result2 = searchByName(employees, name2);
        System.out.println("Test 2: Search by name \"" + name2 + "\"");
        System.out.println("Index: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Search by ID
        int id3 = 104;
        int expected3 = 3;
        int result3 = searchById(employees, id3);
        System.out.println("Test 3: Search by ID " + id3);
        System.out.println("Index: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
