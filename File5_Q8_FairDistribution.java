/**
 * ============================================================
 * QUESTION: Santa's Fair Distribution
 * FILE: 5 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Take back candies so no one has more than min + K.
 * 
 * CLASSIFICATION: Greedy
 * 
 * TEST CASES:
 * Case 1: {5,3,6,2,8}, K=3 → 4 (take back 4 candies)
 * 
 * ALGORITHM:
 * Sum of max(0, A[i] - (Min + K))
 * 
 * SIMILAR QUESTIONS:
 * 1. Burst Balloons
 * 2. Gas Station
 * 3. Non-overlapping Intervals
 * ============================================================
 */

import java.util.Arrays;

public class File5_Q8_FairDistribution {
    
    /**
     * TODO: Implement this method
     * Calculate how many candies to take back
     * 
     * @param candies - array of candy counts
     * @param k - maximum allowed difference from minimum
     * @return - total candies to take back
     */
    public static int candiesToTakeBack(int[] candies, int k) {
        // YOUR CODE HERE
        // 1. Find minimum
        // 2. Calculate threshold = min + k
        // 3. Sum all excess candies above threshold
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q8: Santa's Fair Distribution ===\n");
        
        // Test Case 1
        int[] candies1 = {5, 3, 6, 2, 8};
        int k1 = 3;
        // Min = 2, Threshold = 5
        // Take back: max(0,5-5) + max(0,3-5) + max(0,6-5) + max(0,2-5) + max(0,8-5)
        //          = 0 + 0 + 1 + 0 + 3 = 4
        int expected1 = 4;
        int result1 = candiesToTakeBack(candies1, k1);
        System.out.println("Test 1: " + Arrays.toString(candies1) + ", K=" + k1);
        System.out.println("Candies to take back: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] candies2 = {1, 2, 3, 4, 5};
        int k2 = 10;
        int expected2 = 0; // All within threshold
        int result2 = candiesToTakeBack(candies2, k2);
        System.out.println("Test 2: " + Arrays.toString(candies2) + ", K=" + k2);
        System.out.println("Candies to take back: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] candies3 = {10, 10, 10, 10};
        int k3 = 0;
        int expected3 = 0;
        int result3 = candiesToTakeBack(candies3, k3);
        System.out.println("Test 3: " + Arrays.toString(candies3) + ", K=" + k3);
        System.out.println("Candies to take back: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
