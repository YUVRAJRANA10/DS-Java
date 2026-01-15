/**
 * ============================================================
 * Q21: REVERSE SINGLY LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Write a program to reverse a singly linked list.
 * 
 * EXAMPLE:
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> null
 * Output: 5 -> 4 -> 3 -> 2 -> 1 -> null
 * 
 * HINT:
 * - Use three pointers: prev, current, next
 * - Iterate and reverse links one by one
 * - Or use recursion
 * 
 * TIME: O(n), SPACE: O(1) for iterative
 * ============================================================
 */

public class Q21_ReverseSinglyLinkedList {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Reverse linked list iteratively
     * @param head - head of the list
     * @return new head (previously tail)
     */
    public static Node reverseIterative(Node head) {
        // YOUR CODE HERE
        
        return head;
    }
    
    /**
     * TODO: Reverse linked list recursively
     */
    public static Node reverseRecursive(Node head) {
        // Base case
        // YOUR CODE HERE
        
        return head;
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
        System.out.println("=== Reverse Singly Linked List ===\n");
        
        // Test 1
        Node list1 = createList(new int[]{1, 2, 3, 4, 5});
        printList(list1, "Original");
        list1 = reverseIterative(list1);
        printList(list1, "Reversed (Iterative)");
        
        // Test 2
        Node list2 = createList(new int[]{10, 20, 30});
        printList(list2, "\nOriginal");
        list2 = reverseRecursive(list2);
        printList(list2, "Reversed (Recursive)");
        
        // Test 3: Single element
        Node list3 = createList(new int[]{100});
        printList(list3, "\nSingle element");
        list3 = reverseIterative(list3);
        printList(list3, "Reversed");
        
        // Test 4: Empty list
        Node list4 = null;
        System.out.println("\nEmpty list: " + (reverseIterative(list4) == null ? "null" : "not null"));
        
        /* Expected Output:
         * Original: 1 -> 2 -> 3 -> 4 -> 5 -> null
         * Reversed: 5 -> 4 -> 3 -> 2 -> 1 -> null
         */
    }
}
