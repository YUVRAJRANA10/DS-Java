/**
 * ============================================================
 * QUESTION: Stack Reversal (Partial - Even Indices)
 * FILE: 7 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Reverse even-indexed elements only.
 * 
 * CLASSIFICATION: Stack / Array
 * 
 * TEST CASES:
 * Case 1: {A,B,C,D} → {C,B,A,D}
 * 
 * ALGORITHM:
 * Store even indices in stack; overwrite back.
 * 
 * SIMILAR QUESTIONS:
 * 1. Reverse Vowels
 * 2. Reverse String II
 * 3. Sort Indices
 * ============================================================
 */

import java.util.*;

public class File7_Q4_PartialStackReversal {
    
    /**
     * TODO: Implement this method
     * Reverse elements at even indices (0, 2, 4, ...)
     * 
     * @param arr - input array
     */
    public static void reverseEvenIndices(char[] arr) {
        // YOUR CODE HERE
        
    }
    
    /**
     * TODO: Integer version
     */
    public static void reverseEvenIndices(int[] arr) {
        // YOUR CODE HERE
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q4: Partial Stack Reversal ===\n");
        
        // Test Case 1
        char[] test1 = {'A', 'B', 'C', 'D'};
        System.out.println("Test 1: " + Arrays.toString(test1));
        reverseEvenIndices(test1);
        System.out.println("Result: " + Arrays.toString(test1));
        System.out.println("Expected: [C, B, A, D]");
        // Even indices: 0,2 have A,C → reversed: C,A
        System.out.println();
        
        // Test Case 2
        char[] test2 = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Test 2: " + Arrays.toString(test2));
        reverseEvenIndices(test2);
        System.out.println("Result: " + Arrays.toString(test2));
        System.out.println("Expected: [E, B, C, D, A, F]");
        // Even indices: 0,2,4 have A,C,E → reversed: E,C,A
        System.out.println();
        
        // Test Case 3 - Integer
        int[] test3 = {1, 2, 3, 4, 5};
        System.out.println("Test 3: " + Arrays.toString(test3));
        reverseEvenIndices(test3);
        System.out.println("Result: " + Arrays.toString(test3));
        System.out.println("Expected: [5, 2, 3, 4, 1]");
    }
}
