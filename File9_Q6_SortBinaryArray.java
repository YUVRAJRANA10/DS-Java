/**
 * ============================================================
 * QUESTION: Sort Binary Array
 * FILE: 9 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Sort array containing only 0s and 1s.
 * 
 * CLASSIFICATION: Two-Pointer
 * 
 * TEST CASES:
 * Case 1: {1,0,1,0,1} → {0,0,1,1,1}
 * 
 * ALGORITHM:
 * Count zeros, fill; or two-pointer swap.
 * 
 * SIMILAR QUESTIONS:
 * 1. Sort Colors (Dutch Flag)
 * 2. Move Zeroes
 * 3. Segregate Even/Odd
 * ============================================================
 */

import java.util.Arrays;

public class File9_Q6_SortBinaryArray {
    
    /**
     * TODO: Implement this method
     * Sort array with only 0s and 1s
     * 
     * @param arr - input binary array
     */
    public static void sortBinary(int[] arr) {
        // YOUR CODE HERE
        
    }
    
    /**
     * TODO: Implement using two-pointer swap (in-place)
     */
    public static void sortBinaryTwoPointer(int[] arr) {
        // YOUR CODE HERE
        
    }
    
    /**
     * TODO: Sort 0s, 1s, and 2s (Dutch National Flag)
     */
    public static void sortColors(int[] arr) {
        // YOUR CODE HERE
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q6: Sort Binary Array ===\n");
        
        int[] test1 = {1, 0, 1, 0, 1};
        int[] expected1 = {0, 0, 1, 1, 1};
        System.out.println("Test 1: " + Arrays.toString(test1));
        sortBinary(test1);
        System.out.println("Sorted: " + Arrays.toString(test1));
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Status: " + (Arrays.equals(test1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {0, 0, 0, 1, 1};
        int[] expected2 = {0, 0, 0, 1, 1};
        System.out.println("Test 2: " + Arrays.toString(test2));
        sortBinary(test2);
        System.out.println("Sorted: " + Arrays.toString(test2));
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Status: " + (Arrays.equals(test2, expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Dutch Flag Test
        int[] test3 = {2, 0, 1, 2, 1, 0};
        int[] expected3 = {0, 0, 1, 1, 2, 2};
        System.out.println("Test 3 (Dutch Flag): " + Arrays.toString(test3));
        sortColors(test3);
        System.out.println("Sorted: " + Arrays.toString(test3));
        System.out.println("Expected: " + Arrays.toString(expected3));
        System.out.println("Status: " + (Arrays.equals(test3, expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
