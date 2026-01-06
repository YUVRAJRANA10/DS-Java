/**
 * ============================================================
 * QUESTION: Energy Required for Insertion Sort
 * FILE: 3 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * Calculate total energy spent sorting N products using Insertion Sort,
 * where each shift costs 4 units.
 * 
 * CLASSIFICATION: Sorting Simulation
 * 
 * TEST CASES:
 * Case 1: {2,4,1,3,5} → 12
 * Case 2: {10,9,8...1} → 180
 * 
 * ALGORITHM:
 * Count shifts in Insertion Sort and multiply by 4.
 * 
 * SIMILAR QUESTIONS:
 * 1. Count Inversions
 * 2. Min Swaps to Sort
 * 3. Bubble Sort Swap Count
 * ============================================================
 */

import java.util.Arrays;

public class File3_Q1_InsertionSortEnergy {
    
    /**
     * TODO: Implement this method
     * Calculate total energy for insertion sort (each shift = 4 units)
     * 
     * @param arr - array to sort
     * @return - total energy spent
     */
    public static int calculateEnergy(int[] arr) {
        // YOUR CODE HERE
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > key ) {
                arr[j+1 ]  = arr[j];
                j--;
                swaps++;
            }

            arr[j + 1] = key;
        }
        return swaps * 4;
    }
    
    /**
     * TODO: Implement this method
     * Count number of shifts in insertion sort
     * 
     * @param arr - array to sort
     * @return - number of shifts
     */
    public static int countShifts(int[] arr) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q1: Insertion Sort Energy ===\n");
        
        // Test Case 1
        int[] test1 = {2, 4, 1, 3, 5};
        int expected1 = 12; // 3 shifts * 4 = 12
        int result1 = calculateEnergy(test1.clone());
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Energy: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - Reverse sorted (worst case)
        int[] test2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int expected2 = 180; // 45 shifts * 4 = 180 (sum of 1+2+...+9 = 45)
        int result2 = calculateEnergy(test2.clone());
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Energy: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Already sorted
        int[] test3 = {1, 2, 3, 4, 5};
        int expected3 = 0;
        int result3 = calculateEnergy(test3.clone());
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Energy: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
