/**
 * ============================================================
 * QUESTION: Seat Reservation
 * FILE: 1 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Manage a grid of seats. Check if a specific row and column are
 * available for reservation in a theatre.
 * 
 * CLASSIFICATION: 2D Array / Matrix
 * 
 * TEST CASES:
 * Case 1: 3×3 grid, Reserve(1,1) → Available
 * Case 2: Reserve(1,1) again → Not Available
 * 
 * SIMILAR QUESTIONS:
 * 1. Tic-Tac-Toe
 * 2. Flood Fill
 * 3. Island Count
 * ============================================================
 */

public class File1_Q6_SeatReservation {
    
    // TODO: Implement the SeatManager class
    static class SeatManager {
        // YOUR DATA STRUCTURE HERE (boolean 2D array recommended)
        
        public SeatManager(int rows, int cols) {
            // Initialize the seat grid
        }
        
        /**
         * Check if a seat is available
         * @param row - row index (0-based)
         * @param col - column index (0-based)
         * @return - true if available
         */
        public boolean isAvailable(int row, int col) {
            // YOUR CODE HERE
            return false;
        }
        
        /**
         * Reserve a seat if available
         * @param row - row index
         * @param col - column index
         * @return - true if reservation successful
         */
        public boolean reserve(int row, int col) {
            // YOUR CODE HERE
            return false;
        }
        
        /**
         * Cancel a reservation
         * @param row - row index
         * @param col - column index
         * @return - true if cancellation successful
         */
        public boolean cancel(int row, int col) {
            // YOUR CODE HERE
            return false;
        }
        
        /**
         * Display the seat grid
         */
        public void display() {
            // YOUR CODE HERE - Print O for available, X for reserved
        }
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q6: Seat Reservation ===\n");
        
        SeatManager manager = new SeatManager(3, 3);
        
        // Test Case 1
        System.out.println("Test 1: Reserve(1,1) on empty grid");
        boolean result1 = manager.reserve(1, 1);
        System.out.println("Reservation Result: " + result1);
        System.out.println("Expected: true");
        System.out.println("Status: " + (result1 == true ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        System.out.println("Test 2: Reserve(1,1) again");
        boolean result2 = manager.reserve(1, 1);
        System.out.println("Reservation Result: " + result2);
        System.out.println("Expected: false (already reserved)");
        System.out.println("Status: " + (result2 == false ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        System.out.println("Test 3: Check availability");
        boolean available = manager.isAvailable(0, 0);
        System.out.println("Seat (0,0) Available: " + available);
        System.out.println("Expected: true");
        System.out.println("Status: " + (available == true ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        System.out.println("Current Seat Layout:");
        manager.display();
    }
}
