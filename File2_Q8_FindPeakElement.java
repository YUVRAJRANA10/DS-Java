/**
 * ============================================================
 * QUESTION: Find Peak Element
 * FILE: 2 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Find an element that is strictly greater than its neighbors.
 * 
 * CLASSIFICATION: Binary Search
 * 
 * TEST CASES:
 * Case 1: {1,2,3,1} → 3
 * Case 2: {1,2,1,3,5,6,4} → 6
 * 
 * ALGORITHM:
 * Move toward the higher neighbor (mid+1 if A[mid] < A[mid+1])
 * 
 * SIMILAR QUESTIONS:
 * 1. Peak in 2D Matrix
 * 2. Bitonic Point
 * 3. Local Minimum
 * ============================================================
 */

import java.util.Arrays;

public class File2_Q8_FindPeakElement {
    
    /**
     * TODO: Implement this method
     * Find a peak element (greater than its neighbors)
     * 
     * @param arr - input array
     * @return - value of peak element
     */
    public static int findPeak(int[] arr) {
        // O(n) Linear Solution - Fixed with edge cases
        int n = arr.length;
        if (n == 1) return arr[0];
        
        // Check first element
        if (arr[0] > arr[1]) return arr[0];
        
        // Check last element
        if (arr[n-1] > arr[n-2]) return arr[n-1];
        
        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }
    
    /**
     * O(log n) Binary Search Solution
     * Key insight: Move towards the higher neighbor
     * 
     * @param arr - input array
     * @return - index of peak element
     */
    public static int findPeakIndex(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                // Peak is on the right side
                left = mid + 1;
            } else {
                // Peak is on the left side (or at mid)
                right = mid;
            }
        }
        // left == right, pointing to a peak
        return left;
    }
    
    /**
     * O(log n) Binary Search - Returns VALUE instead of index
     */
    public static int findPeakBinarySearch(int[] arr) {
        return arr[findPeakIndex(arr)];
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q8: Find Peak Element ===\n");
        
        // Test Case 1
        int[] test1 = {1, 2, 3, 1};
        int expected1 = 3;
        int result1 = findPeak(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        System.out.println("Peak: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {1, 2, 1, 3, 5, 6, 4};
        // Multiple valid peaks: 2 or 6
        int result2 = findPeak(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        System.out.println("Peak: " + result2);
        System.out.println("Expected: 2 or 6 (any valid peak)");
        boolean valid2 = (result2 == 2 || result2 == 6);
        System.out.println("Status: " + (valid2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] test3 = {1};
        int expected3 = 1;
        int result3 = findPeak(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
        System.out.println("Peak: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
