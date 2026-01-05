/**
 * ============================================================
 * QUESTION: Action Logs Stack (SLL-based)
 * FILE: 8 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Implement stack using singly linked list for action logging.
 * 
 * CLASSIFICATION: Stack / Linked List
 * 
 * TEST CASES:
 * Case 1: push(A), push(B), pop() → B
 * 
 * ALGORITHM:
 * Head insertion and removal.
 * 
 * SIMILAR QUESTIONS:
 * 1. Queue via Linked List
 * 2. Min Stack
 * 3. Browser History
 * ============================================================
 */

public class File8_Q3_ActionLogsStack {
    
    static class Node {
        String action;
        Node next;
        Node(String action) { this.action = action; }
    }
    
    /**
     * TODO: Implement Stack using Singly Linked List
     */
    static class ActionStack {
        private Node top;
        
        public void push(String action) {
            // YOUR CODE HERE
        }
        
        public String pop() {
            // YOUR CODE HERE
            return null;
        }
        
        public String peek() {
            // YOUR CODE HERE
            return null;
        }
        
        public boolean isEmpty() {
            // YOUR CODE HERE
            return true;
        }
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q3: Action Logs Stack ===\n");
        
        ActionStack stack = new ActionStack();
        
        System.out.println("push(\"Open File\")");
        stack.push("Open File");
        
        System.out.println("push(\"Edit Text\")");
        stack.push("Edit Text");
        
        System.out.println("push(\"Save\")");
        stack.push("Save");
        
        System.out.println("\nPeek: " + stack.peek());
        System.out.println("Expected: Save");
        System.out.println();
        
        System.out.println("Pop: " + stack.pop());
        System.out.println("Expected: Save");
        
        System.out.println("Pop: " + stack.pop());
        System.out.println("Expected: Edit Text");
        
        System.out.println("\nIs Empty: " + stack.isEmpty());
        System.out.println("Expected: false");
    }
}
