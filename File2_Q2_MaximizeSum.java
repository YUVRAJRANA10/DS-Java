/**
 * ============================================================
 * QUESTION: Botanical Garden (Maximize Sum)
 * FILE: 2 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Swap any two plants in an array exactly once to maximize the sum
 * of the first and last plant heights.
 * 
 * CLASSIFICATION: Greedy
 * 
 * TEST CASES:
 * Case 1: {5,3,6,3,7} → Swap 6,5 → 13
 * Case 2: {1,4,5,3,8,2} → Swap 8,1 → 10
 * 
 * ALGORITHM:
 * Find max in middle; try swapping with first or last element.
 * 
 * SIMILAR QUESTIONS:
 * 1. Maximize Array Sum after K Negations
 * 2. Largest Number after One Swap
 * 3. Container With Most Water
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q2_MaximizeSum {
    
    /**
     * TODO: Implement this method
     * Find maximum possible sum of first + last after one swap
     * 
     * @param arr - array of heights
     * @return - maximum sum of first and last element
     */
    public static int maximizeFirstLastSum(int[] arr) {
        // YOUR CODE HERE
        int max = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        int temp = arr[0] ;
        arr[0] = arr[max];
        arr[max] = temp;
        return arr[0] + arr[arr.length - 1];
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q2: Botanical Garden (Maximize Sum) ===\n");
        
        // Test Case 1
        int[] test1 = {5, 3, 6, 3, 7};
        int expected1 = 13;
        int result1 = maximizeFirstLastSum(test1.clone());
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Max Sum: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {1, 4, 5, 3, 8, 2};
        int expected2 = 10;
        int result2 = maximizeFirstLastSum(test2.clone());
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Max Sum: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {10, 1, 2, 3, 10};
        int expected3 = 20; // Already maximum
        int result3 = maximizeFirstLastSum(test3.clone());
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Max Sum: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
