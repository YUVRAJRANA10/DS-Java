/**
 * ============================================================
 * QUESTION: Quality Check (Even/Odd Count)
 * FILE: 7 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * Count even and odd dice faces.
 * 
 * CLASSIFICATION: Array
 * 
 * TEST CASES:
 * Case 1: {1,3,5,8} → E:1, O:3
 * 
 * ALGORITHM:
 * Iterate and check parity.
 * 
 * SIMILAR QUESTIONS:
 * 1. Sort by Parity
 * 2. Odd Occurring
 * 3. Even/Odd Sums
 * ============================================================
 */

import java.util.Arrays;

public class File7_Q1_EvenOddCount {
    
    /**
     * TODO: Implement this method
     * Count even and odd numbers
     * 
     * @param arr - input array
     * @return - array with [evenCount, oddCount]
     */
    public static int[] countEvenOdd(int[] arr) {
        // YOUR CODE HERE
        
        return new int[]{0, 0};
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q1: Even/Odd Count ===\n");
        
        int[] test1 = {1, 3, 5, 8};
        int[] result1 = countEvenOdd(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Even: " + result1[0] + ", Odd: " + result1[1]);
        System.out.println("Expected: Even=1, Odd=3");
        System.out.println("Status: " + (result1[0] == 1 && result1[1] == 3 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {2, 4, 6, 8, 10};
        int[] result2 = countEvenOdd(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Even: " + result2[0] + ", Odd: " + result2[1]);
        System.out.println("Expected: Even=5, Odd=0");
        System.out.println("Status: " + (result2[0] == 5 && result2[1] == 0 ? "✓ PASSED" : "✗ FAILED"));
    }
}
