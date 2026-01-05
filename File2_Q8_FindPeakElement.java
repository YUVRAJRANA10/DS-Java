/**
 * ============================================================
 * QUESTION: Find Peak Element
 * FILE: 2 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Find an element that is strictly greater than its neighbors.
 * 
 * CLASSIFICATION: Binary Search
 * 
 * TEST CASES:
 * Case 1: {1,2,3,1} → 3
 * Case 2: {1,2,1,3,5,6,4} → 6
 * 
 * ALGORITHM:
 * Move toward the higher neighbor (mid+1 if A[mid] < A[mid+1])
 * 
 * SIMILAR QUESTIONS:
 * 1. Peak in 2D Matrix
 * 2. Bitonic Point
 * 3. Local Minimum
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q8_FindPeakElement {
    
    /**
     * TODO: Implement this method
     * Find a peak element (greater than its neighbors)
     * 
     * @param arr - input array
     * @return - value of peak element
     */
    public static int findPeak(int[] arr) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    /**
     * TODO: Implement this method
     * Find index of a peak element
     * 
     * @param arr - input array
     * @return - index of peak element
     */
    public static int findPeakIndex(int[] arr) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q8: Find Peak Element ===\n");
        
        // Test Case 1
        int[] test1 = {1, 2, 3, 1};
        int expected1 = 3;
        int result1 = findPeak(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Peak: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {1, 2, 1, 3, 5, 6, 4};
        // Multiple valid peaks: 2 or 6
        int result2 = findPeak(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Peak: " + result2);
        System.out.println("Expected: 2 or 6 (any valid peak)");
        boolean valid2 = (result2 == 2 || result2 == 6);
        System.out.println("Status: " + (valid2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {1};
        int expected3 = 1;
        int result3 = findPeak(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Peak: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
