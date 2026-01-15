/**
 * ============================================================
 * Q35: SECURITY GATE CLASS SIMULATION
 * ============================================================
 * 
 * PROBLEM:
 * Create a SecurityGate class that simulates a building security system.
 * 
 * Requirements:
 * 1. Track total entries and exits (static counters)
 * 2. Each gate has a gateId and location
 * 3. Methods: entry(), exit(), getOccupancy()
 * 4. Maximum occupancy limit
 * 5. Log each entry/exit with timestamp
 * 
 * CONCEPTS TESTED:
 * - Static vs Instance variables
 * - Static methods
 * - Class design
 * - Encapsulation
 * 
 * ============================================================
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q35_SecurityGateClass {
    
    /**
     * TODO: Create SecurityGate class
     */
    static class SecurityGate {
        // Instance variables
        private String gateId;
        private String location;
        private boolean isActive;
        
        // Static variables (shared across all gates)
        private static int totalEntries = 0;
        private static int totalExits = 0;
        private static int currentOccupancy = 0;
        private static final int MAX_OCCUPANCY = 100;
        
        // Instance counter for this specific gate
        private int gateEntries = 0;
        private int gateExits = 0;
        
        /**
         * TODO: Constructor
         */
        public SecurityGate(String gateId, String location) {
            // YOUR CODE HERE
            this.gateId = gateId;
            this.location = location;
            this.isActive = true;
        }
        
        /**
         * TODO: Process an entry
         * - Check if building is at max capacity
         * - Increment counters
         * - Log the entry
         * @return true if entry allowed, false if at capacity
         */
        public boolean entry() {
            // YOUR CODE HERE
            // 1. Check capacity
            // 2. Increment totalEntries, currentOccupancy, gateEntries
            // 3. Log entry
            // 4. Return success/failure
            
            return false;
        }
        
        /**
         * TODO: Process an exit
         * - Decrement counters
         * - Log the exit
         */
        public void exit() {
            // YOUR CODE HERE
            // 1. Decrement currentOccupancy (not below 0)
            // 2. Increment totalExits, gateExits
            // 3. Log exit
        }
        
        /**
         * TODO: Log with timestamp
         */
        private void log(String action) {
            LocalTime now = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.printf("[%s] Gate %s (%s): %s%n", 
                now.format(formatter), gateId, location, action);
        }
        
        // Getters
        public String getGateId() { return gateId; }
        public String getLocation() { return location; }
        public boolean isActive() { return isActive; }
        public int getGateEntries() { return gateEntries; }
        public int getGateExits() { return gateExits; }
        
        // Control methods
        public void activate() { isActive = true; }
        public void deactivate() { isActive = false; }
        
        // Static methods
        public static int getTotalEntries() { return totalEntries; }
        public static int getTotalExits() { return totalExits; }
        public static int getCurrentOccupancy() { return currentOccupancy; }
        public static int getMaxOccupancy() { return MAX_OCCUPANCY; }
        public static int getAvailableCapacity() { 
            return MAX_OCCUPANCY - currentOccupancy; 
        }
        
        /**
         * TODO: Reset all counters (for new day)
         */
        public static void resetDailyCounters() {
            // YOUR CODE HERE
            totalEntries = 0;
            totalExits = 0;
            currentOccupancy = 0;
        }
        
        /**
         * TODO: Print gate statistics
         */
        public void printGateStats() {
            System.out.println("Gate: " + gateId + " (" + location + ")");
            System.out.println("  Status: " + (isActive ? "ACTIVE" : "INACTIVE"));
            System.out.println("  Entries through this gate: " + gateEntries);
            System.out.println("  Exits through this gate: " + gateExits);
        }
        
        /**
         * TODO: Print building statistics
         */
        public static void printBuildingStats() {
            System.out.println("\n=== Building Statistics ===");
            System.out.println("Total Entries: " + totalEntries);
            System.out.println("Total Exits: " + totalExits);
            System.out.println("Current Occupancy: " + currentOccupancy + "/" + MAX_OCCUPANCY);
            System.out.println("Available Capacity: " + getAvailableCapacity());
        }
    }
    
    /**
     * Alternative: Visitor tracking with ID
     */
    static class VisitorPass {
        private static int passCounter = 0;
        
        private int passId;
        private String visitorName;
        private LocalTime entryTime;
        private LocalTime exitTime;
        private String purpose;
        
        public VisitorPass(String visitorName, String purpose) {
            this.passId = ++passCounter;
            this.visitorName = visitorName;
            this.purpose = purpose;
            this.entryTime = LocalTime.now();
        }
        
        public void checkOut() {
            this.exitTime = LocalTime.now();
        }
        
        public void printPass() {
            System.out.println("Pass #" + passId);
            System.out.println("Visitor: " + visitorName);
            System.out.println("Purpose: " + purpose);
            System.out.println("Entry: " + entryTime);
            if (exitTime != null) {
                System.out.println("Exit: " + exitTime);
            }
        }
        
        public static int getTotalPassesIssued() {
            return passCounter;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Security Gate Simulation ===\n");
        
        // Create gates
        SecurityGate mainGate = new SecurityGate("G1", "Main Entrance");
        SecurityGate sideGate = new SecurityGate("G2", "Side Entrance");
        SecurityGate parkingGate = new SecurityGate("G3", "Parking");
        
        // Simulate entries
        System.out.println("--- Morning Rush ---");
        mainGate.entry();
        mainGate.entry();
        mainGate.entry();
        sideGate.entry();
        sideGate.entry();
        parkingGate.entry();
        
        // Some exits
        System.out.println("\n--- Some Exits ---");
        mainGate.exit();
        parkingGate.exit();
        
        // Print individual gate stats
        System.out.println("\n--- Gate Statistics ---");
        mainGate.printGateStats();
        System.out.println();
        sideGate.printGateStats();
        System.out.println();
        parkingGate.printGateStats();
        
        // Print building stats
        SecurityGate.printBuildingStats();
        
        // Visitor pass demo
        System.out.println("\n\n--- Visitor Pass System ---");
        VisitorPass v1 = new VisitorPass("John Doe", "Meeting with HR");
        v1.printPass();
        
        System.out.println();
        VisitorPass v2 = new VisitorPass("Jane Smith", "Interview");
        v2.printPass();
        
        // Check out
        v1.checkOut();
        System.out.println("\nAfter checkout:");
        v1.printPass();
        
        System.out.println("\nTotal passes issued: " + VisitorPass.getTotalPassesIssued());
        
        /* Expected Output:
         * --- Morning Rush ---
         * [HH:mm:ss] Gate G1 (Main Entrance): Entry - Occupancy: 1/100
         * [HH:mm:ss] Gate G1 (Main Entrance): Entry - Occupancy: 2/100
         * ...
         * 
         * --- Building Statistics ---
         * Total Entries: 6
         * Total Exits: 2
         * Current Occupancy: 4/100
         */
    }
}
