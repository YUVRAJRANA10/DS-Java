/**
 * ============================================================
 * QUESTION: Bubble Sort Swaps
 * FILE: 9 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Count number of swaps in bubble sort.
 * 
 * CLASSIFICATION: Sorting Simulation
 * 
 * TEST CASES:
 * Case 1: {4,2,3,1} → 5 swaps
 * 
 * ALGORITHM:
 * Simulate bubble sort, count swaps.
 * 
 * SIMILAR QUESTIONS:
 * 1. Insertion Sort Shifts
 * 2. Count Inversions
 * 3. Merge Sort
 * ============================================================
 */

import java.util.Arrays;

public class File9_Q2_BubbleSortSwaps {
    
    /**
     * TODO: Implement this method
     * Count swaps in bubble sort
     * 
     * @param arr - input array
     * @return - number of swaps
     */
    public static int countSwaps(int[] arr) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Also return the sorted array along with swap count
     */
    public static int[] bubbleSort(int[] arr) {
        // YOUR CODE HERE - modifies array in place
        
        return arr;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q2: Bubble Sort Swaps ===\n");
        
        int[] test1 = {4, 2, 3, 1};
        int expected1 = 5;
        int result1 = countSwaps(test1.clone());
        System.out.println("Test 1: {4, 2, 3, 1}");
        System.out.println("Swaps: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {1, 2, 3, 4};
        int expected2 = 0;
        int result2 = countSwaps(test2.clone());
        System.out.println("Test 2: {1, 2, 3, 4}");
        System.out.println("Swaps: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test3 = {4, 3, 2, 1};
        int expected3 = 6; // Maximum swaps for n=4
        int result3 = countSwaps(test3.clone());
        System.out.println("Test 3: {4, 3, 2, 1}");
        System.out.println("Swaps: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
