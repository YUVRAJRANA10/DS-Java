/**
 * ============================================================
 * QUESTION: Village Order Reversal (Re-reverse Queue)
 * FILE: 4 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Re-reverse a queue to its original state using recursion.
 * 
 * CLASSIFICATION: Recursion
 * 
 * TEST CASES:
 * Case 1: {4,3,2,1} → {1,2,3,4}
 * 
 * ALGORITHM:
 * Dequeue, recurse, then enqueue.
 * 
 * SIMILAR QUESTIONS:
 * 1. Reverse Stack
 * 2. Sort Stack
 * 3. Interleave Queue
 * ============================================================
 */

import java.util.*;

public class File4_Q2_RecursiveQueueReverse {
    
    /**
     * TODO: Implement this method
     * Reverse queue using recursion only (no stack)
     * 
     * @param queue - input queue
     */
    public static void reverseRecursive(Queue<Integer> queue) {
        // YOUR CODE HERE
        // Base case: if queue is empty, return
        // Recursive case: dequeue front, recurse, enqueue front
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q2: Recursive Queue Reversal ===\n");
        
        // Test Case 1
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(4, 3, 2, 1));
        System.out.println("Test 1: " + queue1);
        reverseRecursive(queue1);
        System.out.println("Reversed: " + queue1);
        System.out.println("Expected: [1, 2, 3, 4]");
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 4);
        System.out.println("Status: " + (new ArrayList<>(queue1).equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));
        System.out.println("Test 2: " + queue2);
        reverseRecursive(queue2);
        System.out.println("Reversed: " + queue2);
        System.out.println("Expected: [1, 2, 3, 4, 5]");
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Status: " + (new ArrayList<>(queue2).equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
    }
}
