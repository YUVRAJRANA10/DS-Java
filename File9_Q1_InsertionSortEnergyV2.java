/**
 * ============================================================
 * QUESTION: Energy Required (Insertion Sort Shifts)
 * FILE: 9 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * Calculate energy = shifts × 4 during insertion sort.
 * (Same as File 3, Q1)
 * 
 * CLASSIFICATION: Sorting Simulation
 * 
 * TEST CASES:
 * Case 1: {4,2,1,3} → 4 shifts → Energy = 16
 * 
 * ALGORITHM:
 * Simulate insertion sort, count right-shifts.
 * 
 * SIMILAR QUESTIONS:
 * 1. Count Inversions
 * 2. Bubble Sort Swaps
 * 3. Sort Colors
 * ============================================================
 */

import java.util.Arrays;

public class File9_Q1_InsertionSortEnergyV2 {
    
    /**
     * TODO: Implement this method
     * Calculate energy = shifts × 4
     * 
     * @param arr - input array
     * @return - total energy consumed
     */
    public static int calculateEnergy(int[] arr) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Just count shifts (no multiplication)
     */
    public static int countShifts(int[] arr) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q1: Insertion Sort Energy V2 ===\n");
        
        int[] test1 = {4, 2, 1, 3};
        int expected1 = 16; // 4 shifts × 4
        int result1 = calculateEnergy(test1.clone());
        System.out.println("Test 1: {4, 2, 1, 3}");
        System.out.println("Energy: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int[] test2 = {1, 2, 3, 4};
        int expected2 = 0; // Already sorted
        int result2 = calculateEnergy(test2.clone());
        System.out.println("Test 2: {1, 2, 3, 4}");
        System.out.println("Energy: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
    }
}
