/**
 * ============================================================
 * QUESTION: Audit Function (Mode Finding)
 * FILE: 2 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Identify the winning ID (the mode) from an array of vote IDs.
 * 
 * CLASSIFICATION: Hashing
 * 
 * TEST CASES:
 * Case 1: {1,2,2,1,1} → 1
 * Case 2: {7,7,7,7,7} → 7
 * 
 * ALGORITHM:
 * Use Hash Map for frequency counting.
 * 
 * SIMILAR QUESTIONS:
 * 1. Majority Element
 * 2. Top K Frequent Elements
 * 3. Frequency of Smallest Element
 * ============================================================
 */

import java.util.*;

public class File2_Q5_AuditFunction {
    
    /**
     * TODO: Implement this method
     * Find the mode (most frequent element)
     * 
     * @param votes - array of vote IDs
     * @return - winning ID (mode)
     */
    public static int findWinner(int[] votes) {
        // YOUR CODE HERE
       
        int hash[] = new int[99];
      for (int i = 0; i < votes.length; i++) {
        hash[votes[i]]++;
      }

      int max= 0;
      for (int i = 0; i < hash.length; i++) {
        if(hash[i] > hash[max]){
            max = i;
        }
      }

        return max;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q5: Audit Function (Mode Finding) ===\n");
        
        // Test Case 1
        int[] test1 = {1, 2, 2, 1, 1};
        int expected1 = 1;
        int result1 = findWinner(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Winner: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {7, 7, 7, 7, 7};
        int expected2 = 7;
        int result2 = findWinner(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Winner: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {3, 3, 4, 4, 4, 5};
        int expected3 = 4;
        int result3 = findWinner(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Winner: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
