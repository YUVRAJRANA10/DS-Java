/**
 * ============================================================
 * QUESTION: Total Search Time
 * FILE: 2 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Calculate total distance/time spent moving between book positions
 * on a shelf in the given sequence.
 * 
 * CLASSIFICATION: Simulation
 * 
 * TEST CASES:
 * Case 1: {1,4,2} → 5
 * Case 2: {7,6,5,4} → 3
 * 
 * ALGORITHM:
 * Sum of absolute differences: Σ|A[i] - A[i-1]|
 * 
 * SIMILAR QUESTIONS:
 * 1. Disk Scheduling (SSTF)
 * 2. Path Sum in 1D Grid
 * 3. Robot Movement on X-axis
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q4_TotalSearchTime {
    
    /**
     * TODO: Implement this method
     * Calculate total distance traveled between positions
     * 
     * @param positions - array of positions to visit
     * @return - total distance
     */
    public static int totalDistance(int[] positions) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q4: Total Search Time ===\n");
        
        // Test Case 1
        int[] test1 = {1, 4, 2};
        int expected1 = 5; // |4-1| + |2-4| = 3 + 2 = 5
        int result1 = totalDistance(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Total Distance: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {7, 6, 5, 4};
        int expected2 = 3; // |6-7| + |5-6| + |4-5| = 1+1+1 = 3
        int result2 = totalDistance(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Total Distance: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {0, 10, 5, 15};
        int expected3 = 25; // 10 + 5 + 10 = 25
        int result3 = totalDistance(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Total Distance: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
