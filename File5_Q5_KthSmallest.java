/**
 * ============================================================
 * QUESTION: K-th Smallest Element
 * FILE: 5 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Find K-th smallest in unsorted list.
 * 
 * CLASSIFICATION: Sorting / Heap
 * 
 * TEST CASES:
 * Case 1: {7,10,4,3,20,15}, K=3 → 7
 * 
 * ALGORITHM:
 * Max-heap of size K.
 * 
 * SIMILAR QUESTIONS:
 * 1. K-th Largest
 * 2. K Closest Points
 * 3. Top K Frequent
 * ============================================================
 */

import java.util.*;

public class File5_Q5_KthSmallest {
    
    /**
     * TODO: Implement this method
     * Find K-th smallest element
     * 
     * @param arr - unsorted array
     * @param k - position (1-indexed)
     * @return - K-th smallest element
     */
    public static int kthSmallest(int[] arr, int k) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    /**
     * TODO: Implement using Heap
     * 
     * @param arr - unsorted array
     * @param k - position (1-indexed)
     * @return - K-th smallest element
     */
    public static int kthSmallestHeap(int[] arr, int k) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q5: K-th Smallest Element ===\n");
        
        // Test Case 1
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        int expected1 = 7;
        int result1 = kthSmallest(arr1.clone(), k1);
        System.out.println("Test 1: " + Arrays.toString(arr1) + ", K=" + k1);
        System.out.println("K-th Smallest: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 1;
        int expected2 = 3;
        int result2 = kthSmallest(arr2.clone(), k2);
        System.out.println("Test 2: " + Arrays.toString(arr2) + ", K=" + k2);
        System.out.println("K-th Smallest: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] arr3 = {1, 2, 3, 4, 5};
        int k3 = 5;
        int expected3 = 5;
        int result3 = kthSmallest(arr3.clone(), k3);
        System.out.println("Test 3: " + Arrays.toString(arr3) + ", K=" + k3);
        System.out.println("K-th Smallest: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
