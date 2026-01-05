/**
 * ============================================================
 * QUESTION: Second Most Profitable Company
 * FILE: 6 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Find 2nd highest profit.
 * 
 * CLASSIFICATION: Array
 * 
 * TEST CASES:
 * Case 1: {10, 20, 5, 15} → 15
 * 
 * ALGORITHM:
 * Two-variable tracking.
 * 
 * SIMILAR QUESTIONS:
 * 1. Third Max
 * 2. K-th Largest
 * 3. Second Smallest
 * ============================================================
 */

import java.util.Arrays;

public class File6_Q4_SecondHighest {
    
    /**
     * TODO: Implement this method
     * Find the second highest value
     * 
     * @param arr - input array
     * @return - second highest value, or Integer.MIN_VALUE if not exists
     */
    public static int secondHighest(int[] arr) {
        // YOUR CODE HERE
        
        return Integer.MIN_VALUE;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q4: Second Highest ===\n");
        
        // Test Case 1
        int[] test1 = {10, 20, 5, 15};
        int expected1 = 15;
        int result1 = secondHighest(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Second Highest: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {5, 5, 5, 5};
        System.out.println("Test 2: " + Arrays.toString(test2));
        int result2 = secondHighest(test2);
        System.out.println("Second Highest: " + result2);
        System.out.println("Expected: No distinct second highest");
        System.out.println();
        
        // Test Case 3
        int[] test3 = {1, 2};
        int expected3 = 1;
        int result3 = secondHighest(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Second Highest: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
