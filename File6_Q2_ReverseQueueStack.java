/**
 * ============================================================
 * QUESTION: Reverse Queue (Using Stack)
 * FILE: 6 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Reverse a queue using stack.
 * 
 * CLASSIFICATION: Stack/Queue
 * 
 * TEST CASES:
 * Case 1: {1,2,3,4} → {4,3,2,1}
 * 
 * ALGORITHM:
 * Push to stack, pop to queue.
 * 
 * SIMILAR QUESTIONS:
 * 1. Reverse Stack with Queue
 * 2. Stack using Queues
 * 3. Task Scheduling
 * ============================================================
 */

import java.util.*;

public class File6_Q2_ReverseQueueStack {
    
    /**
     * TODO: Implement this method
     * Reverse queue using a stack
     * 
     * @param queue - input queue
     */
    public static void reverseUsingStack(Queue<Integer> queue) {
        // YOUR CODE HERE
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q2: Reverse Queue Using Stack ===\n");
        
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Test 1: " + queue1);
        reverseUsingStack(queue1);
        System.out.println("Reversed: " + queue1);
        System.out.println("Expected: [4, 3, 2, 1]");
        System.out.println();
        
        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Test 2: " + queue2);
        reverseUsingStack(queue2);
        System.out.println("Reversed: " + queue2);
        System.out.println("Expected: [50, 40, 30, 20, 10]");
    }
}
