/**
 * ============================================================
 * QUESTION: Find K-th Rotation
 * FILE: 2 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Determine how many times a sorted array has been rotated.
 * 
 * CLASSIFICATION: Binary Search
 * 
 * TEST CASES:
 * Case 1: {4,5,6,1,2,3} → K=3
 * Case 2: {1,2,3} → K=0
 * 
 * ALGORITHM:
 * Find the index of the minimum element using binary search.
 * 
 * SIMILAR QUESTIONS:
 * 1. Search in Rotated Array
 * 2. Find Minimum in Rotated Array
 * 3. Search in Rotated Array II
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q3_FindRotation {
    
    /**
     * TODO: Implement this method
     * Find how many times the array has been rotated
     * 
     * @param arr - rotated sorted array
     * @return - number of rotations (index of minimum element)
     */
    public static int findRotationCount(int[] arr) {
        // YOUR CODE HERE
          int min = 0;
          for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[min]){
                min = i;
            }
          }
        return min;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q3: Find K-th Rotation ===\n");
        
        // Test Case 1
        int[] test1 = {4, 5, 6, 1, 2, 3};
        int expected1 = 3;
        int result1 = findRotationCount(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Rotation Count: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {1, 2, 3};
        int expected2 = 0;
        int result2 = findRotationCount(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Rotation Count: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {2, 3, 4, 5, 1};
        int expected3 = 4;
        int result3 = findRotationCount(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Rotation Count: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
