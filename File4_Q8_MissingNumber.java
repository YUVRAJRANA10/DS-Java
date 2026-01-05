/**
 * ============================================================
 * QUESTION: Find Missing Number
 * FILE: 4 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Find the missing number in range 1..N.
 * 
 * CLASSIFICATION: Math
 * 
 * TEST CASES:
 * Case 1: {1,2,4,5} → 3
 * 
 * ALGORITHM:
 * Total Sum - Array Sum = Missing Number
 * Formula: n*(n+1)/2
 * 
 * SIMILAR QUESTIONS:
 * 1. Missing and Repeating
 * 2. Missing in Unsorted
 * 3. Missing in Sorted
 * ============================================================
 */

import java.util.Arrays;

public class File4_Q8_MissingNumber {
    
    /**
     * TODO: Implement this method
     * Find missing number in 1 to N range
     * 
     * @param arr - array containing N-1 numbers from 1 to N
     * @param n - the range is 1 to n
     * @return - the missing number
     */
    public static int findMissing(int[] arr, int n) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    /**
     * TODO: Implement this method (Alternative using XOR)
     * Find missing number using XOR
     * 
     * @param arr - array containing N-1 numbers from 1 to N
     * @param n - the range is 1 to n
     * @return - the missing number
     */
    public static int findMissingXOR(int[] arr, int n) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q8: Find Missing Number ===\n");
        
        // Test Case 1
        int[] test1 = {1, 2, 4, 5};
        int n1 = 5;
        int expected1 = 3;
        int result1 = findMissing(test1, n1);
        System.out.println("Test 1: " + Arrays.toString(test1) + ", N=" + n1);
        System.out.println("Missing: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int n2 = 10;
        int expected2 = 7;
        int result2 = findMissing(test2, n2);
        System.out.println("Test 2: N=" + n2 + ", Missing from array");
        System.out.println("Missing: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Missing first
        int[] test3 = {2, 3, 4, 5};
        int n3 = 5;
        int expected3 = 1;
        int result3 = findMissing(test3, n3);
        System.out.println("Test 3: " + Arrays.toString(test3) + ", N=" + n3);
        System.out.println("Missing: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
