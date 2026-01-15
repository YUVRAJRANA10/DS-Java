/**
 * ============================================================
 * Q25: INSERT IN SORTED CIRCULAR LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Insert an element into a sorted circular linked list such that 
 * the order remains ascending.
 * 
 * EXAMPLES:
 * List: 1 -> 3 -> 5 -> 7 -> (back to 1)
 * Insert 4: 1 -> 3 -> 4 -> 5 -> 7 -> (back to 1)
 * Insert 0: 0 -> 1 -> 3 -> 5 -> 7 -> (back to 0)
 * Insert 10: 1 -> 3 -> 5 -> 7 -> 10 -> (back to 1)
 * 
 * CASES TO HANDLE:
 * 1. Empty list
 * 2. Insert before head (smallest)
 * 3. Insert after tail (largest)
 * 4. Insert in middle
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q25_InsertSortedCircular {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Insert value in sorted circular list
     * @param head - head of sorted circular list
     * @param value - value to insert
     * @return new head (may change if inserting smallest)
     */
    public static Node insertSorted(Node head, int value) {
        // YOUR CODE HERE
        // Handle: empty, before head, after tail, middle
        
        return head;
    }
    
    // Helper: Create sorted circular list from array
    public static Node createCircularList(int[] arr) {
        if (arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        
        current.next = head;
        return head;
    }
    
    // Helper: Print circular list
    public static void printCircular(Node head, String label) {
        if (head == null) {
            System.out.println(label + ": Empty");
            return;
        }
        
        System.out.print(label + ": ");
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to " + head.data + ")");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Insert in Sorted Circular List ===\n");
        
        // Create sorted circular list
        Node list = createCircularList(new int[]{1, 3, 5, 7, 9});
        printCircular(list, "Original");
        
        // Insert in middle
        System.out.println("\n--- Insert 4 (middle) ---");
        list = insertSorted(list, 4);
        printCircular(list, "After insert 4");
        
        // Insert at beginning
        System.out.println("\n--- Insert 0 (beginning) ---");
        list = insertSorted(list, 0);
        printCircular(list, "After insert 0");
        
        // Insert at end
        System.out.println("\n--- Insert 10 (end) ---");
        list = insertSorted(list, 10);
        printCircular(list, "After insert 10");
        
        // Insert duplicate
        System.out.println("\n--- Insert 5 (duplicate) ---");
        list = insertSorted(list, 5);
        printCircular(list, "After insert 5");
        
        // Test empty list
        System.out.println("\n--- Insert into empty list ---");
        Node emptyList = null;
        emptyList = insertSorted(emptyList, 100);
        printCircular(emptyList, "After insert 100");
        
        /* Expected Output:
         * Original: 1 -> 3 -> 5 -> 7 -> 9 -> (back to 1)
         * After insert 4: 1 -> 3 -> 4 -> 5 -> 7 -> 9 -> (back to 1)
         * After insert 0: 0 -> 1 -> 3 -> 4 -> 5 -> 7 -> 9 -> (back to 0)
         * After insert 10: 0 -> 1 -> 3 -> 4 -> 5 -> 7 -> 9 -> 10 -> (back to 0)
         */
    }
}
