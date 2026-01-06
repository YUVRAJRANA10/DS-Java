/**
 * ============================================================
 * QUESTION: Family Photograph
 * FILE: 1 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * You are given an array of family member heights sorted in ascending order.
 * To improve a photograph, the photographer wants you to reverse the positions
 * of people in blocks of size K. If the final group contains fewer than K
 * members, reverse that group as well.
 * 
 * CLASSIFICATION: Array Manipulation / Two-Pointer
 * 
 * TEST CASES:
 * Case 1: N=9, Heights={1,2,3,4,5,6,7,8,9}, K=3 → Output: 3,2,1,6,5,4,9,8,7
 * Case 2: N=9, Heights={1,2,3,4,5,6,7,8,9}, K=2 → Output: 2,1,4,3,6,5,8,7,9
 * 
 * SIMILAR QUESTIONS:
 * 1. Reverse Linked List in K-groups
 * 2. Rotate Array by D positions
 * 3. String Segment Reversal
 * ============================================================
 */

import java.util.Arrays;

public class File1_Q1_FamilyPhotograph {
    
    /**
     * TODO: Implement this method
     * Reverse the array in blocks of size K
     * 
     * @param heights - array of heights
     * @param k - block size
     * @return - modified array with reversed blocks
     */
    public static int[] reverseInBlocks(int[] heights, int k) {
        // YOUR CODE HERE
         int arr[] = new int[heights.length];
         for(int l = 0; l< arr.length; l++){
            arr[l] = heights[l];
         }
          
          for (int i = 0; i < heights.length; i++) {
            if((i+1) % k == 0){
                int copyi = i;
                for(int j = i+1 - k; j <= i; j++ ){
                 heights[j] = arr[copyi];
                 copyi--;
                }
            }
          }

                 
        return heights;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q1: Family Photograph ===\n");
        
        // Test Case 1
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k1 = 3;
        int[] expected1 = {3, 2, 1, 6, 5, 4, 9, 8, 7};
        int[] result1 = reverseInBlocks(test1.clone(), k1);
        System.out.println("Test 1: " + Arrays.toString(result1));
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Status: " + (Arrays.equals(result1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k2 = 2;
        int[] expected2 = {2, 1, 4, 3, 6, 5, 8, 7, 9};
        int[] result2 = reverseInBlocks(test2.clone(), k2);
        System.out.println("Test 2: " + Arrays.toString(result2));
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Status: " + (Arrays.equals(result2, expected2) ? "✓ PASSED" : "✗ FAILED"));
    }
}
