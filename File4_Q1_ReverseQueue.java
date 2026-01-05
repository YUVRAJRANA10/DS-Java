/**
 * ============================================================
 * QUESTION: VIP Reversal at Ice Cream Truck
 * FILE: 4 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * Completely reverse a queue of customers.
 * 
 * CLASSIFICATION: Queue / Stack
 * 
 * TEST CASES:
 * Case 1: {1,2,3,4} → {4,3,2,1}
 * Case 2: {10,20,30} → {30,20,10}
 * 
 * ALGORITHM:
 * Use a stack to reverse the elements.
 * 
 * SIMILAR QUESTIONS:
 * 1. Reverse First K
 * 2. Generate Binary 1-N
 * 3. Circular Queue
 * ============================================================
 */

import java.util.*;

public class File4_Q1_ReverseQueue {
    
    /**
     * TODO: Implement this method
     * Reverse a queue using a stack
     * 
     * @param queue - input queue
     * @return - reversed queue
     */
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // YOUR CODE HERE
        
        return queue;
    }
    
    /**
     * TODO: Implement this method (Alternative)
     * Reverse a queue using recursion
     * 
     * @param queue - input queue
     */
    public static void reverseQueueRecursive(Queue<Integer> queue) {
        // YOUR CODE HERE
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q1: Reverse Queue ===\n");
        
        // Test Case 1
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Test 1: " + queue1);
        Queue<Integer> result1 = reverseQueue(queue1);
        System.out.println("Reversed: " + result1);
        System.out.println("Expected: [4, 3, 2, 1]");
        List<Integer> expected1 = Arrays.asList(4, 3, 2, 1);
        System.out.println("Status: " + (new ArrayList<>(result1).equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println("Test 2: " + queue2);
        Queue<Integer> result2 = reverseQueue(queue2);
        System.out.println("Reversed: " + result2);
        System.out.println("Expected: [30, 20, 10]");
        List<Integer> expected2 = Arrays.asList(30, 20, 10);
        System.out.println("Status: " + (new ArrayList<>(result2).equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
    }
}
