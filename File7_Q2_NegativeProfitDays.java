/**
 * ============================================================
 * QUESTION: Bookstore Loss Count
 * FILE: 7 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Count days with negative profit.
 * 
 * CLASSIFICATION: Array
 * 
 * TEST CASES:
 * Case 1: {10,-5,-2,8} → 2
 * 
 * ALGORITHM:
 * Count elements < 0.
 * 
 * SIMILAR QUESTIONS:
 * 1. Negatives in Matrix
 * 2. Smaller than X
 * 3. Profit %
 * ============================================================
 */

import java.util.Arrays;

public class File7_Q2_NegativeProfitDays {
    
    /**
     * TODO: Implement this method
     * Count days with negative profit
     * 
     * @param profits - array of daily profits
     * @return - count of negative days
     */
    public static int countNegativeDays(int[] profits) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q2: Negative Profit Days ===\n");
        
        int[] test1 = {10, -5, -2, 8};
        int expected1 = 2;
        int result1 = countNegativeDays(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Negative Days: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {1, 2, 3, 4, 5};
        int expected2 = 0;
        int result2 = countNegativeDays(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Negative Days: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
    }
}
