/**
 * ============================================================
 * QUESTION: Array Operation (Move Zeroes)
 * FILE: 2 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Shift all non-zero elements to the front while maintaining their
 * relative order. Fill remaining positions with zeros.
 * 
 * CLASSIFICATION: Two-Pointer
 * 
 * TEST CASES:
 * Case 1: {0,1,0,3,12} → {1,3,12,0,0}
 * Case 2: {0} → {0}
 * 
 * ALGORITHM:
 * Overwrite non-zeros at a tracking index, then fill rest with zeros.
 * 
 * SIMILAR QUESTIONS:
 * 1. Remove Duplicates
 * 2. Remove Element
 * 3. Sort Colors
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q6_MoveZeroes {
    
    /**
     * TODO: Implement this method
     * Move all zeros to the end, maintain relative order of non-zeros
     * 
     * @param arr - input array
     */
    public static void moveZeroes(int[] arr) {
        // YOUR CODE HERE
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q6: Move Zeroes ===\n");
        
        // Test Case 1
        int[] test1 = {0, 1, 0, 3, 12};
        int[] expected1 = {1, 3, 12, 0, 0};
        System.out.println("Test 1: " + Arrays.toString(test1));
        moveZeroes(test1);
        System.out.println("Result: " + Arrays.toString(test1));
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Status: " + (Arrays.equals(test1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {0};
        int[] expected2 = {0};
        System.out.println("Test 2: " + Arrays.toString(test2));
        moveZeroes(test2);
        System.out.println("Result: " + Arrays.toString(test2));
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Status: " + (Arrays.equals(test2, expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {1, 2, 3};
        int[] expected3 = {1, 2, 3};
        System.out.println("Test 3: " + Arrays.toString(test3));
        moveZeroes(test3);
        System.out.println("Result: " + Arrays.toString(test3));
        System.out.println("Expected: " + Arrays.toString(expected3));
        System.out.println("Status: " + (Arrays.equals(test3, expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
