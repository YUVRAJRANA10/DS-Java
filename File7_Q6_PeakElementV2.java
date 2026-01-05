/**
 * ============================================================
 * QUESTION: Find Peak Element (File 7 Version)
 * FILE: 7 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Find a peak element (identical to File 2, Q8).
 * 
 * CLASSIFICATION: Binary Search
 * 
 * SIMILAR QUESTIONS:
 * 1. Peak Index Mountain
 * 2. Min in Rotated
 * 3. Koko Bananas
 * ============================================================
 */

import java.util.Arrays;

public class File7_Q6_PeakElementV2 {
    
    /**
     * TODO: Implement using Binary Search O(log n)
     */
    public static int findPeakElement(int[] nums) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q6: Peak Element V2 ===\n");
        
        int[] test1 = {1, 2, 3, 1};
        int result1 = findPeakElement(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Peak Index: " + result1 + ", Value: " + (result1 >= 0 ? test1[result1] : "N/A"));
        System.out.println("Expected: Index 2, Value 3");
        System.out.println();
        
        int[] test2 = {1, 2, 1, 3, 5, 6, 4};
        int result2 = findPeakElement(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Peak Index: " + result2 + ", Value: " + (result2 >= 0 ? test2[result2] : "N/A"));
        System.out.println("Expected: Index 1 or 5");
    }
}
