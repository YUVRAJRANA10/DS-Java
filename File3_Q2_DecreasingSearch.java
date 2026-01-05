/**
 * ============================================================
 * QUESTION: Decreasing ID Search
 * FILE: 3 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Search for a target in a strictly decreasing array.
 * 
 * CLASSIFICATION: Binary Search
 * 
 * TEST CASES:
 * Case 1: {100,50,44,33,12}, Target=33 → 3
 * Case 2: Target=5 → -1
 * 
 * ALGORITHM:
 * Binary search with reversed conditional logic.
 * 
 * SIMILAR QUESTIONS:
 * 1. Search in Infinite Array
 * 2. Square Root
 * 3. Median of Two Sorted Arrays
 * ============================================================
 */

import java.util.Arrays;

public class File3_Q2_DecreasingSearch {
    
    /**
     * TODO: Implement this method
     * Binary search in a descending array
     * 
     * @param arr - strictly decreasing array
     * @param target - value to find
     * @return - index of target, -1 if not found
     */
    public static int searchDecreasing(int[] arr, int target) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q2: Decreasing ID Search ===\n");
        
        // Test Case 1
        int[] arr1 = {100, 50, 44, 33, 12};
        int target1 = 33;
        int expected1 = 3;
        int result1 = searchDecreasing(arr1, target1);
        System.out.println("Test 1: " + Arrays.toString(arr1) + ", Target=" + target1);
        System.out.println("Index: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int target2 = 5;
        int expected2 = -1;
        int result2 = searchDecreasing(arr1, target2);
        System.out.println("Test 2: " + Arrays.toString(arr1) + ", Target=" + target2);
        System.out.println("Index: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int target3 = 100;
        int expected3 = 0;
        int result3 = searchDecreasing(arr1, target3);
        System.out.println("Test 3: " + Arrays.toString(arr1) + ", Target=" + target3);
        System.out.println("Index: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
