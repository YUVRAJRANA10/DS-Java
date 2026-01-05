/**
 * ============================================================
 * QUESTION: Tickets Collection Time
 * FILE: 7 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Wait time for K-th person buying tickets.
 * 
 * CLASSIFICATION: Queue Simulation
 * 
 * TEST CASES:
 * Case 1: {1,2}, Person 0 → 1
 * 
 * ALGORITHM:
 * Round-robin simulation.
 * 
 * SIMILAR QUESTIONS:
 * 1. Ticket Time O(N)
 * 2. CPU Scheduling
 * 3. Josephus Problem
 * ============================================================
 */

import java.util.Arrays;

public class File7_Q5_TicketTime {
    
    /**
     * TODO: Implement this method
     * Calculate time for person at position k to buy all tickets
     * Each person buys one ticket per second, then goes to back of queue
     * 
     * @param tickets - tickets each person wants to buy
     * @param k - position of target person (0-indexed)
     * @return - time when person k finishes
     */
    public static int timeRequiredToBuy(int[] tickets, int k) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q5: Tickets Collection Time ===\n");
        
        // Test Case 1
        int[] tickets1 = {2, 3, 2};
        int k1 = 2;
        int expected1 = 6;
        int result1 = timeRequiredToBuy(tickets1, k1);
        System.out.println("Test 1: " + Arrays.toString(tickets1) + ", k=" + k1);
        System.out.println("Time: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] tickets2 = {5, 1, 1, 1};
        int k2 = 0;
        int expected2 = 8;
        int result2 = timeRequiredToBuy(tickets2, k2);
        System.out.println("Test 2: " + Arrays.toString(tickets2) + ", k=" + k2);
        System.out.println("Time: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
    }
}
