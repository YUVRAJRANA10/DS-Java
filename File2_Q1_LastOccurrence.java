/**
 * ============================================================
 * QUESTION: K Challenges For Last Occurrence
 * FILE: 2 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * In a descending sorted list, find the last occurrence index of K
 * target values and sum those indices.
 * 
 * CLASSIFICATION: Binary Search
 * 
 * TEST CASES:
 * Case 1: N=7, Arr={6,5,5,4,2,2}, K=3 → Output: 9
 * Case 2: N=5, Target=8 → Output: 3
 * 
 * ALGORITHM:
 * Modified Binary Search to keep looking in the right half after
 * finding the target.
 * 
 * SIMILAR QUESTIONS:
 * 1. First Occurrence
 * 2. Search in Rotated Array
 * 3. Find Floor/Ceil
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q1_LastOccurrence {
    
    /**
     * TODO: Implement this method
     * Find the last occurrence of target in descending sorted array
     * 
     * @param arr - descending sorted array
     * @param target - value to find
     * @return - index of last occurrence, -1 if not found
     */
    public static int findLastOccurrence(int[] arr, int target) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    /**
     * TODO: Implement this method
     * Find sum of last occurrence indices for multiple targets
     * 
     * @param arr - descending sorted array
     * @param targets - array of target values
     * @return - sum of indices
     */
    public static int sumOfLastOccurrenceIndices(int[] arr, int[] targets) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q1: Last Occurrence (Binary Search) ===\n");
        
        // Test Case 1
        int[] arr1 = {6, 5, 5, 4, 2, 2};
        int target1 = 5;
        int expected1 = 2; // Last occurrence of 5 is at index 2
        int result1 = findLastOccurrence(arr1, target1);
        System.out.println("Test 1: " + Arrays.toString(arr1) + ", Target=" + target1);
        System.out.println("Last Occurrence Index: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] arr2 = {6, 5, 5, 4, 2, 2};
        int target2 = 2;
        int expected2 = 5; // Last occurrence of 2 is at index 5
        int result2 = findLastOccurrence(arr2, target2);
        System.out.println("Test 2: " + Arrays.toString(arr2) + ", Target=" + target2);
        System.out.println("Last Occurrence Index: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Not found
        int target3 = 8;
        int result3 = findLastOccurrence(arr2, target3);
        System.out.println("Test 3: Target=" + target3 + " (not in array)");
        System.out.println("Result: " + result3 + " (Expected: -1)");
        System.out.println("Status: " + (result3 == -1 ? "✓ PASSED" : "✗ FAILED"));
    }
}
