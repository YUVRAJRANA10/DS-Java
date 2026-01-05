/**
 * ============================================================
 * QUESTION: Flight Gate Management (Queue)
 * FILE: 8 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Manage flight queue: enqueue arrivals, dequeue departures.
 * 
 * CLASSIFICATION: Queue
 * 
 * TEST CASES:
 * Case 1: enqueue(F1), enqueue(F2), dequeue() → F1
 * 
 * ALGORITHM:
 * FIFO using array or linked list.
 * 
 * SIMILAR QUESTIONS:
 * 1. Design Circular Queue
 * 2. Deque Implementation
 * 3. Priority Queue
 * ============================================================
 */

public class File8_Q4_FlightGateQueue {
    
    /**
     * TODO: Implement Queue for Flight Management
     */
    static class FlightQueue {
        private String[] flights;
        private int front, rear, size, capacity;
        
        public FlightQueue(int capacity) {
            this.capacity = capacity;
            this.flights = new String[capacity];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }
        
        public boolean enqueue(String flight) {
            // YOUR CODE HERE
            return false;
        }
        
        public String dequeue() {
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
        
        public boolean isFull() {
            // YOUR CODE HERE
            return false;
        }
        
        public int size() {
            return size;
        }
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q4: Flight Gate Queue ===\n");
        
        FlightQueue queue = new FlightQueue(5);
        
        System.out.println("enqueue(\"AI101\")");
        queue.enqueue("AI101");
        
        System.out.println("enqueue(\"BA202\")");
        queue.enqueue("BA202");
        
        System.out.println("enqueue(\"EK303\")");
        queue.enqueue("EK303");
        
        System.out.println("\nPeek: " + queue.peek());
        System.out.println("Expected: AI101");
        System.out.println();
        
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Expected: AI101");
        
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Expected: BA202");
        
        System.out.println("\nSize: " + queue.size());
        System.out.println("Expected: 1");
    }
}
