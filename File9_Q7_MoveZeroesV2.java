/**
 * ============================================================
 * QUESTION: Move Zeroes to End (V2)
 * FILE: 9 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Move all zeroes to end while maintaining order.
 * (Same as File 2, Q6)
 * 
 * CLASSIFICATION: Two-Pointer
 * 
 * TEST CASES:
 * Case 1: {0,1,0,3,12} → {1,3,12,0,0}
 * 
 * ALGORITHM:
 * Two-pointer; non-zero pointer writes, other iterates.
 * 
 * SIMILAR QUESTIONS:
 * 1. Sort Binary Array
 * 2. Remove Element
 * 3. Move Even/Odd
 * ============================================================
 */

import java.util.Arrays;

public class File9_Q7_MoveZeroesV2 {
    
    /**
     * TODO: Implement this method
     * Move zeros to end, maintain relative order
     * 
     * @param nums - input array
     */
    public static void moveZeroes(int[] nums) {
        // YOUR CODE HERE
        
    }
    
    /**
     * TODO: Variant - move all X's to end
     */
    public static void moveElementToEnd(int[] nums, int x) {
        // YOUR CODE HERE
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q7: Move Zeroes V2 ===\n");
        
        int[] test1 = {0, 1, 0, 3, 12};
        int[] expected1 = {1, 3, 12, 0, 0};
        System.out.println("Test 1: " + Arrays.toString(test1));
        moveZeroes(test1);
        System.out.println("Result: " + Arrays.toString(test1));
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Status: " + (Arrays.equals(test1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {0, 0, 1};
        int[] expected2 = {1, 0, 0};
        System.out.println("Test 2: " + Arrays.toString(test2));
        moveZeroes(test2);
        System.out.println("Result: " + Arrays.toString(test2));
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Status: " + (Arrays.equals(test2, expected2) ? "✓ PASSED" : "✗ FAILED"));
    }
}
