/**
 * ============================================================
 * QUESTION: Longest Subarray with Sum K
 * FILE: 9 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Find longest subarray with sum equal to K.
 * 
 * CLASSIFICATION: Hashing / Two-Pointer
 * 
 * TEST CASES:
 * Case 1: {10,5,2,7,1,9}, k=15 → 4 (subarray [5,2,7,1])
 * 
 * ALGORITHM:
 * Prefix sum with HashMap.
 * 
 * SIMILAR QUESTIONS:
 * 1. Subarray Sum Equals K
 * 2. Maximum Size Subarray
 * 3. Contiguous Sum
 * ============================================================
 */

import java.util.*;

public class File9_Q5_LongestSubarraySumK {
    
    /**
     * TODO: Implement this method
     * Find length of longest subarray with sum = k
     * 
     * @param arr - input array
     * @param k - target sum
     * @return - length of longest subarray
     */
    public static int longestSubarrayWithSum(int[] arr, int k) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Return the actual subarray (start, end indices)
     */
    public static int[] getSubarrayIndices(int[] arr, int k) {
        // YOUR CODE HERE
        
        return new int[]{-1, -1};
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q5: Longest Subarray Sum K ===\n");
        
        int[] test1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        int expected1 = 4; // [5,2,7,1] = 15
        int result1 = longestSubarrayWithSum(test1, k1);
        System.out.println("Test 1: " + Arrays.toString(test1) + ", k=" + k1);
        System.out.println("Longest Length: " + result1);
        System.out.println("Expected: " + expected1 + " (subarray [5,2,7,1])");
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {1, 2, 3, 4, 5};
        int k2 = 9;
        int expected2 = 3; // [2,3,4] or [4,5]? [2,3,4]=9 (len 3), [4,5]=9? No 4+5=9! len 2
        // Actually [2,3,4]=9 has length 3
        int result2 = longestSubarrayWithSum(test2, k2);
        System.out.println("Test 2: " + Arrays.toString(test2) + ", k=" + k2);
        System.out.println("Longest Length: " + result2);
        System.out.println("Expected: " + expected2 + " (subarray [2,3,4])");
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
    }
}
