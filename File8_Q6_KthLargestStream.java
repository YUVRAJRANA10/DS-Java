/**
 * ============================================================
 * QUESTION: K-th Largest in Stream
 * FILE: 8 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Design a class to find k-th largest in a stream.
 * 
 * CLASSIFICATION: Heap
 * 
 * TEST CASES:
 * Case 1: [4,5,8,2], k=3, add(3) → 4
 * 
 * ALGORITHM:
 * Min-heap of size K.
 * 
 * SIMILAR QUESTIONS:
 * 1. Find Median from Stream
 * 2. Top K Frequent
 * 3. K Closest Points
 * ============================================================
 */

import java.util.*;

public class File8_Q6_KthLargestStream {
    
    /**
     * TODO: Implement KthLargest class
     */
    static class KthLargest {
        // YOUR CODE HERE - Use PriorityQueue (min-heap)
        
        public KthLargest(int k, int[] nums) {
            // YOUR CODE HERE
        }
        
        public int add(int val) {
            // YOUR CODE HERE
            return 0;
        }
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q6: K-th Largest Stream ===\n");
        
        int[] initial = {4, 5, 8, 2};
        int k = 3;
        System.out.println("Initial: [4, 5, 8, 2], k = " + k);
        System.out.println("Sorted desc: [8, 5, 4, 2]");
        System.out.println("3rd largest = 4");
        System.out.println();
        
        KthLargest kthLargest = new KthLargest(k, initial);
        
        System.out.println("add(3): " + kthLargest.add(3));
        System.out.println("Expected: 4 (sorted: [8,5,4,3,2], 3rd=4)");
        
        System.out.println("add(5): " + kthLargest.add(5));
        System.out.println("Expected: 5 (sorted: [8,5,5,4,3,2], 3rd=5)");
        
        System.out.println("add(10): " + kthLargest.add(10));
        System.out.println("Expected: 5 (sorted: [10,8,5,5,4,3,2], 3rd=5)");
        
        System.out.println("add(9): " + kthLargest.add(9));
        System.out.println("Expected: 8 (sorted: [10,9,8,5,5,4,3,2], 3rd=8)");
    }
}
