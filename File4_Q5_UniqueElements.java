/**
 * ============================================================
 * QUESTION: Unique Elements in Array
 * FILE: 4 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Print only elements that appear exactly once.
 * 
 * CLASSIFICATION: Hashing
 * 
 * TEST CASES:
 * Case 1: {1,3,6,0,0,1} → 3,6
 * 
 * ALGORITHM:
 * Frequency counting via Hash Map.
 * 
 * SIMILAR QUESTIONS:
 * 1. Find All Duplicates
 * 2. First Missing Positive
 * 3. Distribute Candies
 * ============================================================
 */

import java.util.*;

public class File4_Q5_UniqueElements {
    
    /**
     * TODO: Implement this method
     * Find all elements that appear exactly once
     * 
     * @param arr - input array
     * @return - list of unique elements (in order of appearance)
     */
    public static List<Integer> findUnique(int[] arr) {
        // YOUR CODE HERE
        
        return new ArrayList<>();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q5: Unique Elements ===\n");
        
        // Test Case 1
        int[] test1 = {1, 3, 6, 0, 0, 1};
        List<Integer> expected1 = Arrays.asList(3, 6);
        List<Integer> result1 = findUnique(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Unique: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {1, 1, 2, 2, 3, 3};
        List<Integer> expected2 = new ArrayList<>();
        List<Integer> result2 = findUnique(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Unique: " + result2);
        System.out.println("Expected: " + expected2 + " (none)");
        System.out.println("Status: " + (result2.equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {5, 4, 3, 2, 1};
        List<Integer> expected3 = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> result3 = findUnique(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Unique: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3.equals(expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
