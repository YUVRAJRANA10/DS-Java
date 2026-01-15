/**
 * ============================================================
 * Q22: COPY LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Copy all elements of one linked list into another linked list.
 * The copy should be a deep copy (independent of original).
 * 
 * EXAMPLE:
 * Original: 1 -> 2 -> 3 -> null
 * Copy: 1 -> 2 -> 3 -> null (separate list)
 * 
 * HINT:
 * - Create new nodes, don't just copy references
 * - Iterate through original, create new node for each
 * 
 * TIME: O(n), SPACE: O(n) for the new list
 * ============================================================
 */

public class Q22_CopyLinkedList {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Create a deep copy of the linked list
     * @param head - head of original list
     * @return head of copied list
     */
    public static Node copyList(Node head) {
        // YOUR CODE HERE
        
        return null;
    }
    
    /**
     * TODO: Copy using recursion
     */
    public static Node copyListRecursive(Node head) {
        // YOUR CODE HERE
        
        return null;
    }
    
    // Helper: Create linked list from array
    public static Node createList(int[] arr) {
        if (arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        
        return head;
    }
    
    // Helper: Print linked list
    public static void printList(Node head, String label) {
        System.out.print(label + ": ");
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Copy Linked List ===\n");
        
        // Create original list
        Node original = createList(new int[]{1, 2, 3, 4, 5});
        printList(original, "Original");
        
        // Copy the list
        Node copied = copyList(original);
        printList(copied, "Copied");
        
        // Prove they are independent by modifying original
        System.out.println("\n--- Proving Independence ---");
        original.data = 100;
        original.next.data = 200;
        printList(original, "Original (modified)");
        printList(copied, "Copied (should be unchanged)");
        
        // Test with empty list
        System.out.println("\n--- Empty List ---");
        Node emptyOriginal = null;
        Node emptyCopied = copyList(emptyOriginal);
        System.out.println("Empty copy: " + (emptyCopied == null ? "null (correct)" : "not null"));
        
        // Test recursive copy
        System.out.println("\n--- Recursive Copy ---");
        Node list2 = createList(new int[]{10, 20, 30});
        printList(list2, "Original");
        Node copied2 = copyListRecursive(list2);
        printList(copied2, "Copied (recursive)");
        
        /* Expected Output:
         * Original: 1 -> 2 -> 3 -> 4 -> 5 -> null
         * Copied: 1 -> 2 -> 3 -> 4 -> 5 -> null
         * 
         * After modifying original:
         * Original (modified): 100 -> 200 -> 3 -> 4 -> 5 -> null
         * Copied (unchanged): 1 -> 2 -> 3 -> 4 -> 5 -> null
         */
    }
}
