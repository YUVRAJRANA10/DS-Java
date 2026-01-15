/**
 * ============================================================
 * Q33: POLYMORPHISM WITH EMPLOYEE CLASS
 * ============================================================
 * 
 * PROBLEM:
 * Demonstrate polymorphism using an Employee class hierarchy.
 * 
 * Create:
 * 1. Employee (abstract base) with abstract calculatePay() method
 * 2. FullTimeEmployee - fixed monthly salary
 * 3. PartTimeEmployee - hourly rate × hours worked
 * 4. ContractEmployee - fixed contract amount
 * 
 * Show compile-time (overloading) and runtime (overriding) polymorphism.
 * 
 * CONCEPTS TESTED:
 * 1. Method overriding (runtime polymorphism)
 * 2. Method overloading (compile-time polymorphism)
 * 3. Abstract classes and methods
 * 4. Dynamic method dispatch
 * 
 * ============================================================
 */

public class Q33_Polymorphism {
    
    /**
     * TODO: Create abstract Employee class
     * - Fields: name, id
     * - Abstract method: calculatePay()
     * - Concrete method: displayInfo()
     */
    static abstract class Employee {
        protected String name;
        protected int id;
        
        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }
        
        // Abstract method - must be implemented by subclasses
        public abstract double calculatePay();
        
        // Concrete method - can be inherited as-is
        public void displayInfo() {
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
    
    /**
     * TODO: Create FullTimeEmployee
     * - Additional: monthlySalary
     * - Override calculatePay() to return monthlySalary
     */
    static class FullTimeEmployee extends Employee {
        // YOUR CODE HERE
        
        FullTimeEmployee(String name, int id, double monthlySalary) {
            super(name, id);
            // Set salary
        }
        
        @Override
        public double calculatePay() {
            // Return monthly salary
            return 0;
        }
    }
    
    /**
     * TODO: Create PartTimeEmployee
     * - Additional: hourlyRate, hoursWorked
     * - Override calculatePay() to return hourlyRate × hoursWorked
     */
    static class PartTimeEmployee extends Employee {
        // YOUR CODE HERE
        
        PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
            super(name, id);
            // Set rate and hours
        }
        
        @Override
        public double calculatePay() {
            // Return hourly calculation
            return 0;
        }
    }
    
    /**
     * TODO: Create ContractEmployee
     * - Additional: contractAmount, projectName
     * - Override calculatePay() to return contractAmount
     */
    static class ContractEmployee extends Employee {
        // YOUR CODE HERE
        
        ContractEmployee(String name, int id, double contractAmount, String projectName) {
            super(name, id);
            // Set contract details
        }
        
        @Override
        public double calculatePay() {
            // Return contract amount
            return 0;
        }
    }
    
    /**
     * TODO: Demonstrate METHOD OVERLOADING (Compile-time Polymorphism)
     * Create a Calculator class with multiple add() methods
     */
    static class Calculator {
        // Overload 1: Two integers
        public int add(int a, int b) {
            return a + b;
        }
        
        // TODO: Overload 2 - Three integers
        public int add(int a, int b, int c) {
            // YOUR CODE
            return 0;
        }
        
        // TODO: Overload 3 - Two doubles
        public double add(double a, double b) {
            // YOUR CODE
            return 0;
        }
        
        // TODO: Overload 4 - Array of integers
        public int add(int[] nums) {
            // YOUR CODE
            return 0;
        }
        
        // TODO: Overload 5 - String concatenation
        public String add(String a, String b) {
            // YOUR CODE
            return "";
        }
    }
    
    /**
     * Payroll processor - demonstrates runtime polymorphism
     */
    static class Payroll {
        public static void processPayroll(Employee[] employees) {
            System.out.println("\n=== Monthly Payroll Report ===");
            double totalPayout = 0;
            
            for (Employee emp : employees) {
                emp.displayInfo();
                double pay = emp.calculatePay(); // Dynamic dispatch!
                System.out.println("Pay: $" + String.format("%.2f", pay));
                System.out.println();
                totalPayout += pay;
            }
            
            System.out.println("Total Payout: $" + String.format("%.2f", totalPayout));
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Polymorphism Demonstration ===\n");
        
        // ----- RUNTIME POLYMORPHISM (Method Overriding) -----
        System.out.println("--- Runtime Polymorphism (Overriding) ---");
        
        // Create different employee types
        // Employee[] employees = {
        //     new FullTimeEmployee("Alice", 101, 5000),
        //     new PartTimeEmployee("Bob", 102, 25, 80),
        //     new ContractEmployee("Charlie", 103, 8000, "Website Redesign")
        // };
        
        // Process payroll - same method call, different behavior
        // Payroll.processPayroll(employees);
        
        // ----- COMPILE-TIME POLYMORPHISM (Method Overloading) -----
        System.out.println("\n--- Compile-time Polymorphism (Overloading) ---");
        Calculator calc = new Calculator();
        
        System.out.println("add(5, 3) = " + calc.add(5, 3));
        System.out.println("add(1, 2, 3) = " + calc.add(1, 2, 3));
        System.out.println("add(2.5, 3.5) = " + calc.add(2.5, 3.5));
        System.out.println("add({1,2,3,4,5}) = " + calc.add(new int[]{1, 2, 3, 4, 5}));
        System.out.println("add(\"Hello\", \"World\") = " + calc.add("Hello", "World"));
        
        /* Expected Output:
         * --- Runtime Polymorphism (Overriding) ---
         * === Monthly Payroll Report ===
         * ID: 101, Name: Alice
         * Pay: $5000.00
         * 
         * ID: 102, Name: Bob
         * Pay: $2000.00
         * 
         * ID: 103, Name: Charlie
         * Pay: $8000.00
         * 
         * Total Payout: $15000.00
         * 
         * --- Compile-time Polymorphism (Overloading) ---
         * add(5, 3) = 8
         * add(1, 2, 3) = 6
         * add(2.5, 3.5) = 6.0
         * add({1,2,3,4,5}) = 15
         * add("Hello", "World") = HelloWorld
         */
        
        System.out.println("\n=== Key Polymorphism Concepts ===");
        System.out.println("OVERRIDING (Runtime):");
        System.out.println("  - Same method signature in parent and child");
        System.out.println("  - Method called based on OBJECT type (runtime)");
        System.out.println("  - Use @Override annotation");
        System.out.println("\nOVERLOADING (Compile-time):");
        System.out.println("  - Same method name, different parameters");
        System.out.println("  - Method called based on PARAMETER types (compile-time)");
        System.out.println("  - Can change return type if parameters differ");
    }
}
