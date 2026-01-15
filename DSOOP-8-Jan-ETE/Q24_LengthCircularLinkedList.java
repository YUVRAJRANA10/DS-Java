/**
 * ============================================================
 * Q24: FIND LENGTH OF CIRCULAR LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Determine the size or length of a circular linked list.
 * (Similar to Q23, but may include additional operations)
 * 
 * ADDITIONAL TASKS:
 * - Find if a node with given value exists
 * - Get node at specific position
 * - Find position of a value
 * 
 * EXAMPLE:
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> (back to 1)
 * Length: 5
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q24_LengthCircularLinkedList {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Find length of circular linked list
     * @param head - head of circular list
     * @return length of the list
     */
    public static int getLength(Node head) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Check if a value exists in the circular list
     * @param head - head of circular list
     * @param value - value to search
     * @return true if found, false otherwise
     */
    public static boolean contains(Node head, int value) {
        // YOUR CODE HERE
        
        return false;
    }
    
    /**
     * TODO: Get node at specific position (0-indexed)
     * @param head - head of circular list
     * @param position - position to get (0-indexed)
     * @return node at position, or null if invalid
     */
    public static Node getNodeAt(Node head, int position) {
        // YOUR CODE HERE
        
        return null;
    }
    
    /**
     * TODO: Find position of a value (0-indexed)
     * @param head - head of circular list
     * @param value - value to find
     * @return position (0-indexed), or -1 if not found
     */
    public static int findPosition(Node head, int value) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // Helper: Create circular linked list from array
    public static Node createCircularList(int[] arr) {
        if (arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        
        current.next = head;  // Make it circular
        return head;
    }
    
    // Helper: Print circular linked list
    public static void printCircular(Node head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        
        System.out.print("List: ");
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(circular)");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Length of Circular Linked List ===\n");
        
        Node list = createCircularList(new int[]{10, 20, 30, 40, 50});
        printCircular(list);
        
        // Test length
        System.out.println("\nLength: " + getLength(list));
        
        // Test contains
        System.out.println("\n--- Contains ---");
        System.out.println("Contains 30: " + contains(list, 30));
        System.out.println("Contains 100: " + contains(list, 100));
        
        // Test getNodeAt
        System.out.println("\n--- Get Node At Position ---");
        Node node2 = getNodeAt(list, 2);
        System.out.println("Node at position 2: " + (node2 != null ? node2.data : "null"));
        Node node5 = getNodeAt(list, 5);
        System.out.println("Node at position 5: " + (node5 != null ? node5.data : "null (invalid)"));
        
        // Test findPosition
        System.out.println("\n--- Find Position ---");
        System.out.println("Position of 40: " + findPosition(list, 40));
        System.out.println("Position of 10: " + findPosition(list, 10));
        System.out.println("Position of 100: " + findPosition(list, 100));
        
        /* Expected Output:
         * List: 10 -> 20 -> 30 -> 40 -> 50 -> (circular)
         * Length: 5
         * Contains 30: true
         * Contains 100: false
         * Node at position 2: 30
         * Node at position 5: null (invalid)
         * Position of 40: 3
         * Position of 10: 0
         * Position of 100: -1
         */
    }
}
