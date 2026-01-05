/**
 * ============================================================
 * QUESTION: Merge Two Sorted Arrays
 * FILE: 2 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Combine two pre-sorted lists into one sorted list.
 * 
 * CLASSIFICATION: Two-Pointer
 * 
 * TEST CASES:
 * Case 1: A={1,3,5}, B={2,4,6} → {1,2,3,4,5,6}
 * Case 2: A={10}, B={1,2} → {1,2,10}
 * 
 * ALGORITHM:
 * Compare heads of both arrays and add smaller to result.
 * 
 * SIMILAR QUESTIONS:
 * 1. Merge Sorted Linked Lists
 * 2. Merge K Sorted Lists
 * 3. Intersection of Sorted Arrays
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q7_MergeSortedArrays {
    
    /**
     * TODO: Implement this method
     * Merge two sorted arrays into one sorted array
     * 
     * @param arr1 - first sorted array
     * @param arr2 - second sorted array
     * @return - merged sorted array
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        // YOUR CODE HERE
        
        return new int[0];
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q7: Merge Two Sorted Arrays ===\n");
        
        // Test Case 1
        int[] a1 = {1, 3, 5};
        int[] b1 = {2, 4, 6};
        int[] expected1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = merge(a1, b1);
        System.out.println("Test 1: A=" + Arrays.toString(a1) + ", B=" + Arrays.toString(b1));
        System.out.println("Result: " + Arrays.toString(result1));
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Status: " + (Arrays.equals(result1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] a2 = {10};
        int[] b2 = {1, 2};
        int[] expected2 = {1, 2, 10};
        int[] result2 = merge(a2, b2);
        System.out.println("Test 2: A=" + Arrays.toString(a2) + ", B=" + Arrays.toString(b2));
        System.out.println("Result: " + Arrays.toString(result2));
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Status: " + (Arrays.equals(result2, expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] a3 = {};
        int[] b3 = {1, 2, 3};
        int[] expected3 = {1, 2, 3};
        int[] result3 = merge(a3, b3);
        System.out.println("Test 3: A=" + Arrays.toString(a3) + ", B=" + Arrays.toString(b3));
        System.out.println("Result: " + Arrays.toString(result3));
        System.out.println("Expected: " + Arrays.toString(expected3));
        System.out.println("Status: " + (Arrays.equals(result3, expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
