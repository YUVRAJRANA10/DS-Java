/**
 * ============================================================
 * QUESTION: Tray Stack (Receive/Serve)
 * FILE: 1 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Manage a stack of cafeteria trays. "Receive" adds a tray to the top,
 * and "Serve" removes the top tray for a customer.
 * 
 * CLASSIFICATION: Stack Data Structure
 * 
 * TEST CASES:
 * Case 1: Receive(10), Receive(20), Serve() → Output: 20
 * Case 2: Receive(5), Serve(), Serve() → Output: 5, Empty
 * 
 * SIMILAR QUESTIONS:
 * 1. Implement Queue using Stacks
 * 2. Min Stack
 * 3. Browser Back Button
 * ============================================================
 */

import java.util.*;

public class File1_Q4_TrayStack {
    
    // TODO: Implement the TrayStack class
    static class TrayStack {
        // YOUR DATA STRUCTURE HERE
        int top;
        int stackArray[];
        int size = 100;
        public TrayStack() {
            // Initialize your stack
             top = -1;
           stackArray= new int[size];

        }
        
        /**
         * Add a tray to the top
         * @param trayId - ID of the tray
         */
        public void receive(int trayId) {
            // YOUR CODE HERE
            if(top == size - 1){
                return;
            }
            stackArray[++top] = trayId;
        }
        
        /**
         * Remove and return the top tray
         * @return - ID of the served tray, or -1 if empty
         */
        public int serve() {
            // YOUR CODE HERE

            if(isEmpty()){
                return -1;
            }

            
            return stackArray[top--];
        }
        
        /**
         * Check if stack is empty
         * @return - true if empty
         */
        public boolean isEmpty() {
            // YOUR CODE HERE
            if(top == -1){
            return true;
            }
            return false;
        }
        
        /**
         * Peek at top tray without removing
         * @return - ID of top tray, or -1 if empty
         */
        public int peek() {
            // YOUR CODE HERE
            if(isEmpty()){
            return -1;
            }

            return stackArray[top];
        }
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q4: Tray Stack ===\n");
        
        // Test Case 1
        System.out.println("Test 1: Receive(10), Receive(20), Serve()");
        TrayStack stack1 = new TrayStack();
        stack1.receive(10);
        stack1.receive(20);
        int result1 = stack1.serve();
        System.out.println("Served: " + result1);
        System.out.println("Expected: 20");
        System.out.println("Status: " + (result1 == 20 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        System.out.println("Test 2: Receive(5), Serve(), Serve()");
        TrayStack stack2 = new TrayStack();
        stack2.receive(5);
        int first = stack2.serve();
        System.out.println("First Serve: " + first + " (Expected: 5)");
        System.out.println("Is Empty: " + stack2.isEmpty() + " (Expected: true)");
        int second = stack2.serve();
        System.out.println("Second Serve: " + second + " (Expected: -1 for empty)");
        System.out.println("Status: " + (first == 5 && stack2.isEmpty() ? "✓ PASSED" : "✗ FAILED"));
    }
}
