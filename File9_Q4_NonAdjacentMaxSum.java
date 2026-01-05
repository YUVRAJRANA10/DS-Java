/**
 * ============================================================
 * QUESTION: Non-Adjacent Maximum Sum (DP)
 * FILE: 9 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Find maximum sum of non-adjacent elements.
 * (House Robber Problem)
 * 
 * CLASSIFICATION: Dynamic Programming
 * 
 * TEST CASES:
 * Case 1: {3,2,5,10,7} → 15 (3+5+7 or 3+10)
 * 
 * ALGORITHM:
 * dp[i] = max(dp[i-1], dp[i-2] + arr[i])
 * 
 * SIMILAR QUESTIONS:
 * 1. House Robber II (circular)
 * 2. Delete & Earn
 * 3. Paint House
 * ============================================================
 */

import java.util.Arrays;

public class File9_Q4_NonAdjacentMaxSum {
    
    /**
     * TODO: Implement this method
     * Find maximum sum of non-adjacent elements
     * 
     * @param nums - input array
     * @return - maximum sum
     */
    public static int maxNonAdjacentSum(int[] nums) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Return the elements that form max sum
     */
    public static int[] getMaxSumElements(int[] nums) {
        // YOUR CODE HERE
        
        return new int[0];
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q4: Non-Adjacent Max Sum ===\n");
        
        int[] test1 = {3, 2, 5, 10, 7};
        int expected1 = 15; // 3 + 5 + 7 = 15 or 3 + 10 + 2? No, 3+10=13. Actually 5+10=15!
        // Wait: non-adjacent means can't pick neighbors
        // Options: 3+5+7=15, 3+10=13, 2+10=12, 2+7=9, 5+7=12
        // Actually 3+5+7 is not valid (5 and 7 are adjacent)
        // Valid: 3+5=8 (skip 2,10,take 7? 3+5+7 - 5&7 not adjacent), 3+10=13, 2+7=9
        // 3,5,7 -> indices 0,2,4 - none adjacent! = 15
        int result1 = maxNonAdjacentSum(test1);
        System.out.println("Test 1: {3, 2, 5, 10, 7}");
        System.out.println("Result: " + result1);
        System.out.println("Expected: 15 (3+5+7 at indices 0,2,4)");
        System.out.println("Status: " + (result1 == 15 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {1, 2, 3, 1};
        int expected2 = 4; // 1+3 = 4
        int result2 = maxNonAdjacentSum(test2);
        System.out.println("Test 2: {1, 2, 3, 1}");
        System.out.println("Result: " + result2);
        System.out.println("Expected: 4 (1+3)");
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test3 = {2, 7, 9, 3, 1};
        int expected3 = 12; // 2+9+1 = 12
        int result3 = maxNonAdjacentSum(test3);
        System.out.println("Test 3: {2, 7, 9, 3, 1}");
        System.out.println("Result: " + result3);
        System.out.println("Expected: 12 (2+9+1)");
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
