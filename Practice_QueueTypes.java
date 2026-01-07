/**
 * ============================================================
 * PRACTICE: Deque, Circular Queue, Priority Queue
 * - Manual Implementation (front, rear pointers)
 * - Using Java Collections (ArrayDeque, PriorityQueue)
 * ============================================================
 */

import java.util.*;

public class Practice_QueueTypes {

    // ============================================================
    // 1. CIRCULAR QUEUE - Manual Implementation
    // ============================================================
    /*
     * CONCEPT:
     * Regular queue wastes space when front moves forward.
     * Circular queue reuses empty spaces at the beginning.
     * 
     * Uses modulo (%) to wrap around!
     * 
     *   0   1   2   3   4
     * [ _ ] [ _ ] [ 3 ] [ 4 ] [ 5 ]
     *               ↑           ↑
     *             front        rear
     * 
     * After dequeue, front moves. 
     * After enqueue, if rear at end, it wraps to index 0.
     */
    
    static class CircularQueue {
        private int[] arr;
        private int front;
        private int rear;
        private int size;
        private int capacity;
        
        public CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }
        
        // Check if queue is empty
        public boolean isEmpty() {
            return size == 0;
        }
        
        // Check if queue is full
        public boolean isFull() {
            return size == capacity;
        }
        
        // INSERT: Add element at rear
        public boolean enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return false;
            }
            
            if (isEmpty()) {
                front = 0;  // First element
            }
            
            // Move rear circularly
            rear = (rear + 1) % capacity;
            arr[rear] = value;
            size++;
            return true;
        }
        
        // DELETE: Remove element from front
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            
            int value = arr[front];
            
            if (front == rear) {
                // Last element being removed
                front = -1;
                rear = -1;
            } else {
                // Move front circularly
                front = (front + 1) % capacity;
            }
            
            size--;
            return value;
        }
        
        // PEEK: Get front element without removing
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
        
        // UPDATE: Update element at specific position (0 = front)
        public boolean update(int position, int newValue) {
            if (position < 0 || position >= size) {
                System.out.println("Invalid position!");
                return false;
            }
            
            // Calculate actual index in circular array
            int actualIndex = (front + position) % capacity;
            arr[actualIndex] = newValue;
            return true;
        }
        
        // Display queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue: []");
                return;
            }
            
            System.out.print("Queue: [");
            int i = front;
            for (int count = 0; count < size; count++) {
                System.out.print(arr[i]);
                if (count < size - 1) System.out.print(", ");
                i = (i + 1) % capacity;
            }
            System.out.println("]  (front=" + front + ", rear=" + rear + ")");
        }
    }

    // ============================================================
    // 2. DEQUE (Double-Ended Queue) - Manual Implementation
    // ============================================================
    /*
     * CONCEPT:
     * Insert/Delete from BOTH ends (front and rear)
     * 
     * Operations:
     * - insertFront(), insertRear()
     * - deleteFront(), deleteRear()
     * - getFront(), getRear()
     * 
     *        FRONT                    REAR
     *          ↓                        ↓
     *   ←[DELETE/INSERT]  [1] [2] [3]  [DELETE/INSERT]→
     */
    
    static class Deque {
        private int[] arr;
        private int front;
        private int rear;
        private int size;
        private int capacity;
        
        public Deque(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = -1;
            rear = -1;
            size = 0;
        }
        
        public boolean isEmpty() {
            return size == 0;
        }
        
        public boolean isFull() {
            return size == capacity;
        }
        
        // INSERT at FRONT
        public boolean insertFront(int value) {
            if (isFull()) {
                System.out.println("Deque is full!");
                return false;
            }
            
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                // Move front backward circularly
                front = (front - 1 + capacity) % capacity;
            }
            
            arr[front] = value;
            size++;
            return true;
        }
        
        // INSERT at REAR
        public boolean insertRear(int value) {
            if (isFull()) {
                System.out.println("Deque is full!");
                return false;
            }
            
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                // Move rear forward circularly
                rear = (rear + 1) % capacity;
            }
            
            arr[rear] = value;
            size++;
            return true;
        }
        
        // DELETE from FRONT
        public int deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty!");
                return -1;
            }
            
            int value = arr[front];
            
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            
            size--;
            return value;
        }
        
        // DELETE from REAR
        public int deleteRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty!");
                return -1;
            }
            
            int value = arr[rear];
            
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                rear = (rear - 1 + capacity) % capacity;
            }
            
            size--;
            return value;
        }
        
        // GET FRONT
        public int getFront() {
            if (isEmpty()) return -1;
            return arr[front];
        }
        
        // GET REAR
        public int getRear() {
            if (isEmpty()) return -1;
            return arr[rear];
        }
        
        // UPDATE at position
        public boolean update(int position, int newValue) {
            if (position < 0 || position >= size) {
                return false;
            }
            int actualIndex = (front + position) % capacity;
            arr[actualIndex] = newValue;
            return true;
        }
        
        public void display() {
            if (isEmpty()) {
                System.out.println("Deque: []");
                return;
            }
            System.out.print("Deque: [");
            int i = front;
            for (int count = 0; count < size; count++) {
                System.out.print(arr[i]);
                if (count < size - 1) System.out.print(", ");
                i = (i + 1) % capacity;
            }
            System.out.println("]");
        }
    }

    // ============================================================
    // 3. PRIORITY QUEUE - Manual Implementation (Min-Heap)
    // ============================================================
    /*
     * CONCEPT:
     * Elements are removed based on PRIORITY, not order of insertion.
     * Implemented using HEAP (complete binary tree in array).
     * 
     * Min-Heap: Smallest element has highest priority (removed first)
     * Max-Heap: Largest element has highest priority
     * 
     * For index i:
     * - Parent: (i - 1) / 2
     * - Left Child: 2*i + 1
     * - Right Child: 2*i + 2
     */
    
    static class MinPriorityQueue {
        private int[] heap;
        private int size;
        private int capacity;
        
        public MinPriorityQueue(int capacity) {
            this.capacity = capacity;
            heap = new int[capacity];
            size = 0;
        }
        
        public boolean isEmpty() {
            return size == 0;
        }
        
        public boolean isFull() {
            return size == capacity;
        }
        
        // Get parent index
        private int parent(int i) { return (i - 1) / 2; }
        
        // Get left child index
        private int leftChild(int i) { return 2 * i + 1; }
        
        // Get right child index
        private int rightChild(int i) { return 2 * i + 2; }
        
        // Swap elements
        private void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }
        
        // INSERT: Add element and bubble up
        public boolean insert(int value) {
            if (isFull()) {
                System.out.println("Priority Queue is full!");
                return false;
            }
            
            // Add at end
            heap[size] = value;
            int current = size;
            size++;
            
            // Bubble UP: Move up while smaller than parent
            while (current > 0 && heap[current] < heap[parent(current)]) {
                swap(current, parent(current));
                current = parent(current);
            }
            
            return true;
        }
        
        // DELETE: Remove minimum (root) and heapify down
        public int extractMin() {
            if (isEmpty()) {
                System.out.println("Priority Queue is empty!");
                return -1;
            }
            
            int min = heap[0];
            
            // Move last element to root
            heap[0] = heap[size - 1];
            size--;
            
            // Heapify DOWN from root
            heapifyDown(0);
            
            return min;
        }
        
        // Heapify down (sink)
        private void heapifyDown(int i) {
            int smallest = i;
            int left = leftChild(i);
            int right = rightChild(i);
            
            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            
            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }
            
            if (smallest != i) {
                swap(i, smallest);
                heapifyDown(smallest);  // Recurse
            }
        }
        
        // PEEK: Get minimum without removing
        public int peek() {
            if (isEmpty()) return -1;
            return heap[0];
        }
        
        // UPDATE: Change value and re-heapify
        public boolean update(int oldValue, int newValue) {
            // Find the old value
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (heap[i] == oldValue) {
                    index = i;
                    break;
                }
            }
            
            if (index == -1) {
                System.out.println("Value not found!");
                return false;
            }
            
            heap[index] = newValue;
            
            // If new value is smaller, bubble up
            if (newValue < oldValue) {
                while (index > 0 && heap[index] < heap[parent(index)]) {
                    swap(index, parent(index));
                    index = parent(index);
                }
            } else {
                // If new value is larger, heapify down
                heapifyDown(index);
            }
            
            return true;
        }
        
        public void display() {
            System.out.print("PriorityQueue: [");
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i]);
                if (i < size - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    // ============================================================
    // 4. USING JAVA COLLECTIONS
    // ============================================================
    
    public static void demonstrateJavaCollections() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("JAVA COLLECTIONS - ArrayDeque & PriorityQueue");
        System.out.println("=".repeat(60) + "\n");
        
        // ----- ArrayDeque as Queue (FIFO) -----
        System.out.println("--- ArrayDeque as QUEUE (FIFO) ---");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        // INSERT (at rear)
        queue.offer(10);       // or add(), addLast(), offerLast()
        queue.offer(20);
        queue.offer(30);
        System.out.println("After offer(10,20,30): " + queue);
        
        // DELETE (from front)
        System.out.println("poll(): " + queue.poll());  // or remove(), pollFirst()
        System.out.println("After poll: " + queue);
        
        // PEEK
        System.out.println("peek(): " + queue.peek());  // or peekFirst()
        System.out.println();
        
        // ----- ArrayDeque as Stack (LIFO) -----
        System.out.println("--- ArrayDeque as STACK (LIFO) ---");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        // PUSH (at front)
        stack.push(10);        // or addFirst()
        stack.push(20);
        stack.push(30);
        System.out.println("After push(10,20,30): " + stack);
        
        // POP (from front)
        System.out.println("pop(): " + stack.pop());  // or removeFirst()
        System.out.println("After pop: " + stack);
        System.out.println();
        
        // ----- ArrayDeque as Deque (Both ends) -----
        System.out.println("--- ArrayDeque as DEQUE (Both Ends) ---");
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        // Insert at both ends
        deque.addFirst(10);    // Front
        deque.addLast(20);     // Rear
        deque.offerFirst(5);   // Front (returns boolean)
        deque.offerLast(25);   // Rear (returns boolean)
        System.out.println("After insertions: " + deque);
        
        // Delete from both ends
        System.out.println("removeFirst(): " + deque.removeFirst());
        System.out.println("removeLast(): " + deque.removeLast());
        System.out.println("After deletions: " + deque);
        
        // Peek both ends
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());
        System.out.println();
        
        // ----- PriorityQueue (Min-Heap by default) -----
        System.out.println("--- PriorityQueue (Min-Heap) ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // INSERT
        minHeap.offer(30);     // or add()
        minHeap.offer(10);
        minHeap.offer(20);
        System.out.println("After offer(30,10,20): " + minHeap);
        System.out.println("(Note: Internal order may differ, but poll gives min)");
        
        // DELETE (removes minimum)
        System.out.println("poll(): " + minHeap.poll());  // Returns 10
        System.out.println("poll(): " + minHeap.poll());  // Returns 20
        System.out.println();
        
        // ----- PriorityQueue (Max-Heap) -----
        System.out.println("--- PriorityQueue (Max-Heap) ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(20);
        System.out.println("After offer(30,10,20): " + maxHeap);
        
        System.out.println("poll(): " + maxHeap.poll());  // Returns 30 (max)
        System.out.println("poll(): " + maxHeap.poll());  // Returns 20
        System.out.println();
        
        // ----- PriorityQueue with Custom Objects -----
        System.out.println("--- PriorityQueue with Custom Comparator ---");
        // Sort by string length (shortest first)
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> a.length() - b.length());
        
        pq.offer("banana");
        pq.offer("apple");
        pq.offer("kiwi");
        pq.offer("fig");
        
        System.out.println("Sorted by length (shortest first):");
        while (!pq.isEmpty()) {
            System.out.println("  " + pq.poll());
        }
    }

    // ============================================================
    // QUICK REFERENCE TABLE
    // ============================================================
    /*
     * ┌─────────────────────────────────────────────────────────────────┐
     * │                    ARRAYDEQUE METHODS                           │
     * ├──────────────┬────────────────┬─────────────────────────────────┤
     * │ Operation    │ Front          │ Rear                            │
     * ├──────────────┼────────────────┼─────────────────────────────────┤
     * │ INSERT       │ addFirst()     │ addLast() / offer() / add()     │
     * │              │ offerFirst()   │ offerLast()                     │
     * ├──────────────┼────────────────┼─────────────────────────────────┤
     * │ DELETE       │ removeFirst()  │ removeLast()                    │
     * │              │ pollFirst()    │ pollLast()                      │
     * │              │ poll()         │                                 │
     * ├──────────────┼────────────────┼─────────────────────────────────┤
     * │ PEEK         │ peekFirst()    │ peekLast()                      │
     * │              │ peek()         │                                 │
     * ├──────────────┼────────────────┼─────────────────────────────────┤
     * │ STACK OPS    │ push()         │ (works on front)                │
     * │              │ pop()          │                                 │
     * └──────────────┴────────────────┴─────────────────────────────────┘
     * 
     * ┌─────────────────────────────────────────────────────────────────┐
     * │                   PRIORITYQUEUE METHODS                         │
     * ├──────────────┬──────────────────────────────────────────────────┤
     * │ INSERT       │ offer() / add()                                  │
     * │ DELETE       │ poll() / remove()                                │
     * │ PEEK         │ peek()                                           │
     * │ UPDATE       │ remove() + add() (no direct update)              │
     * │ MAX-HEAP     │ new PriorityQueue<>(Collections.reverseOrder())  │
     * └──────────────┴──────────────────────────────────────────────────┘
     */

    // ============================================================
    // TEST CASES
    // ============================================================
    public static void main(String[] args) {
        
        // ----- Test Circular Queue -----
        System.out.println("=".repeat(60));
        System.out.println("1. CIRCULAR QUEUE - Manual Implementation");
        System.out.println("=".repeat(60) + "\n");
        
        CircularQueue cq = new CircularQueue(5);
        
        System.out.println("Enqueue: 10, 20, 30, 40");
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.display();
        
        System.out.println("\nDequeue twice:");
        System.out.println("Removed: " + cq.dequeue());
        System.out.println("Removed: " + cq.dequeue());
        cq.display();
        
        System.out.println("\nEnqueue: 50, 60 (wraps around!)");
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();
        
        System.out.println("\nUpdate position 1 to 999:");
        cq.update(1, 999);
        cq.display();
        
        // ----- Test Deque -----
        System.out.println("\n" + "=".repeat(60));
        System.out.println("2. DEQUE - Manual Implementation");
        System.out.println("=".repeat(60) + "\n");
        
        Deque dq = new Deque(5);
        
        System.out.println("insertRear: 10, 20");
        dq.insertRear(10);
        dq.insertRear(20);
        dq.display();
        
        System.out.println("\ninsertFront: 5");
        dq.insertFront(5);
        dq.display();
        
        System.out.println("\ndeleteFront: " + dq.deleteFront());
        dq.display();
        
        System.out.println("\ndeleteRear: " + dq.deleteRear());
        dq.display();
        
        System.out.println("\ngetFront: " + dq.getFront());
        System.out.println("getRear: " + dq.getRear());
        
        // ----- Test Priority Queue -----
        System.out.println("\n" + "=".repeat(60));
        System.out.println("3. PRIORITY QUEUE (Min-Heap) - Manual Implementation");
        System.out.println("=".repeat(60) + "\n");
        
        MinPriorityQueue pq = new MinPriorityQueue(10);
        
        System.out.println("Insert: 30, 10, 20, 5, 15");
        pq.insert(30);
        pq.insert(10);
        pq.insert(20);
        pq.insert(5);
        pq.insert(15);
        pq.display();
        
        System.out.println("\nExtract min (should be 5): " + pq.extractMin());
        pq.display();
        
        System.out.println("\nExtract min (should be 10): " + pq.extractMin());
        pq.display();
        
        System.out.println("\nUpdate 30 to 1:");
        pq.update(30, 1);
        pq.display();
        
        System.out.println("\nExtract min (should be 1): " + pq.extractMin());
        pq.display();
        
        // ----- Java Collections Demo -----
        demonstrateJavaCollections();
    }
}
