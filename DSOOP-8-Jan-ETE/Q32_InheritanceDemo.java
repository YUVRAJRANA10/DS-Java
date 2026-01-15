/**
 * ============================================================
 * Q32: INHERITANCE DEMONSTRATION
 * ============================================================
 * 
 * PROBLEM:
 * Demonstrate inheritance in Java with the following hierarchy:
 * - Vehicle (base class) with make, model, year
 * - Car extends Vehicle with numDoors
 * - ElectricCar extends Car with batteryCapacity
 * 
 * Implement constructors, getters, and a display method at each level.
 * 
 * CONCEPTS TESTED:
 * 1. Single inheritance
 * 2. Multi-level inheritance
 * 3. super keyword
 * 4. Method overriding
 * 5. Constructor chaining
 * 
 * ============================================================
 */

public class Q32_InheritanceDemo {
    
    /**
     * TODO: Create Vehicle base class
     * - Fields: make (String), model (String), year (int)
     * - Constructor with all fields
     * - Getters for all fields
     * - display() method to print vehicle info
     */
    static class Vehicle {
        // YOUR CODE HERE
        
    }
    
    /**
     * TODO: Create Car class extending Vehicle
     * - Additional field: numDoors (int)
     * - Constructor calling super + setting numDoors
     * - Getter for numDoors
     * - Override display() to include door info
     */
    static class Car extends Vehicle {
        // YOUR CODE HERE
        
        Car(String make, String model, int year, int numDoors) {
            super(make, model, year); // Call parent constructor
            // Set numDoors
        }
    }
    
    /**
     * TODO: Create ElectricCar class extending Car
     * - Additional field: batteryCapacity (double) in kWh
     * - Constructor calling super + setting batteryCapacity
     * - Getter for batteryCapacity
     * - Override display() to include battery info
     * - Add method: calculateRange(double efficiency) 
     *   Returns range = batteryCapacity * efficiency (km/kWh)
     */
    static class ElectricCar extends Car {
        // YOUR CODE HERE
        
        ElectricCar(String make, String model, int year, int numDoors, double batteryCapacity) {
            super(make, model, year, numDoors);
            // Set batteryCapacity
        }
    }
    
    // Additional example: Employee hierarchy
    
    /**
     * TODO: Create Employee base class
     */
    static class Employee {
        protected String name;
        protected int id;
        protected double baseSalary;
        
        // Constructor, getters, calculateSalary() method
    }
    
    /**
     * TODO: Create Manager extending Employee
     * - Additional: bonus (double)
     * - Override calculateSalary() to include bonus
     */
    static class Manager extends Employee {
        // YOUR CODE HERE
    }
    
    /**
     * TODO: Create Developer extending Employee
     * - Additional: overtimeHours (int), overtimeRate (double)
     * - Override calculateSalary() to include overtime
     */
    static class Developer extends Employee {
        // YOUR CODE HERE
    }
    
    public static void main(String[] args) {
        System.out.println("=== Inheritance Demonstration ===\n");
        
        // Test Vehicle hierarchy
        System.out.println("--- Vehicle Hierarchy ---");
        
        // Create and display Vehicle
        // Vehicle v = new Vehicle("Generic", "Model", 2020);
        // v.display();
        
        // Create and display Car
        // Car c = new Car("Toyota", "Camry", 2022, 4);
        // c.display();
        
        // Create and display ElectricCar
        // ElectricCar e = new ElectricCar("Tesla", "Model 3", 2023, 4, 75.0);
        // e.display();
        // System.out.println("Range at 6 km/kWh: " + e.calculateRange(6) + " km");
        
        // Demonstrate polymorphism
        System.out.println("\n--- Polymorphism Demo ---");
        // Vehicle[] vehicles = {v, c, e};
        // for (Vehicle vehicle : vehicles) {
        //     vehicle.display(); // Calls appropriate display() based on actual type
        // }
        
        // Test Employee hierarchy
        System.out.println("\n--- Employee Hierarchy ---");
        // Manager m = new Manager("Alice", 101, 80000, 15000);
        // Developer d = new Developer("Bob", 102, 60000, 20, 50);
        // System.out.println(m.name + " total salary: $" + m.calculateSalary());
        // System.out.println(d.name + " total salary: $" + d.calculateSalary());
        
        /* Expected Output:
         * --- Vehicle Hierarchy ---
         * Vehicle: Generic Model (2020)
         * Car: Toyota Camry (2022), 4 doors
         * Electric Car: Tesla Model 3 (2023), 4 doors, 75.0 kWh battery
         * Range at 6 km/kWh: 450.0 km
         * 
         * --- Polymorphism Demo ---
         * (Each vehicle's display method called based on actual type)
         * 
         * --- Employee Hierarchy ---
         * Alice total salary: $95000.0
         * Bob total salary: $61000.0
         */
        
        System.out.println("\n=== Key Inheritance Concepts ===");
        System.out.println("1. 'extends' keyword creates inheritance");
        System.out.println("2. 'super' calls parent constructor/method");
        System.out.println("3. Child inherits all non-private members");
        System.out.println("4. @Override annotation for overriding methods");
        System.out.println("5. 'protected' allows access in child classes");
    }
}
