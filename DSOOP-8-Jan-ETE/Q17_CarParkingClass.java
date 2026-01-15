/**
 * ============================================================
 * Q17: CAR PARKING CLASS
 * ============================================================
 * 
 * PROBLEM:
 * Design a class for a car parking system using constructor-based 
 * initialization.
 * 
 * REQUIREMENTS:
 * - Track total parking spots
 * - Track available spots
 * - Park a car (decrease available)
 * - Remove a car (increase available)
 * - Display parking status
 * - Use static variable for total parked cars across all lots
 * 
 * HINT:
 * - Instance variables: totalSpots, availableSpots, lotName
 * - Static variable: totalParkedCars (across all lots)
 * ============================================================
 */

public class Q17_CarParkingClass {
    
    /**
     * TODO: Implement CarParking class
     */
    static class CarParking {
        // Instance variables
        private String lotName;
        private int totalSpots;
        private int availableSpots;
        
        // Static variable - total cars parked across all lots
        private static int totalParkedCars = 0;
        
        // TODO: Default constructor
        public CarParking() {
            // YOUR CODE HERE
        }
        
        // TODO: Parameterized constructor
        public CarParking(String lotName, int totalSpots) {
            // YOUR CODE HERE
        }
        
        // TODO: Park a car
        public boolean parkCar() {
            // Return true if successful, false if lot is full
            // YOUR CODE HERE
            return false;
        }
        
        // TODO: Remove a car
        public boolean removeCar() {
            // Return true if successful, false if lot is empty
            // YOUR CODE HERE
            return false;
        }
        
        // TODO: Check if lot is full
        public boolean isFull() {
            // YOUR CODE HERE
            return false;
        }
        
        // TODO: Check if lot is empty
        public boolean isEmpty() {
            // YOUR CODE HERE
            return false;
        }
        
        // TODO: Get available spots
        public int getAvailableSpots() {
            return availableSpots;
        }
        
        // TODO: Static method to get total parked cars
        public static int getTotalParkedCars() {
            return totalParkedCars;
        }
        
        // TODO: Display status
        public void displayStatus() {
            // YOUR CODE HERE
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Car Parking System ===\n");
        
        // Create parking lots
        CarParking lot1 = new CarParking("Main Lot", 5);
        CarParking lot2 = new CarParking("Side Lot", 3);
        
        // Display initial status
        System.out.println("--- Initial Status ---");
        lot1.displayStatus();
        lot2.displayStatus();
        
        // Park some cars
        System.out.println("\n--- Parking Cars ---");
        System.out.println("Park in Lot1: " + lot1.parkCar());
        System.out.println("Park in Lot1: " + lot1.parkCar());
        System.out.println("Park in Lot2: " + lot2.parkCar());
        
        // Display status
        System.out.println("\n--- After Parking ---");
        lot1.displayStatus();
        lot2.displayStatus();
        System.out.println("Total parked (all lots): " + CarParking.getTotalParkedCars());
        
        // Remove a car
        System.out.println("\n--- Removing Car ---");
        System.out.println("Remove from Lot1: " + lot1.removeCar());
        lot1.displayStatus();
        
        // Try to overfill lot2
        System.out.println("\n--- Trying to fill Lot2 ---");
        lot2.parkCar();
        lot2.parkCar();
        System.out.println("Try parking when full: " + lot2.parkCar());
        
        /* Expected Output:
         * Lot1 (Main Lot): 5 total, 5 available
         * After parking 2: 3 available
         * Total parked: 3 (2 in lot1 + 1 in lot2)
         */
    }
}
