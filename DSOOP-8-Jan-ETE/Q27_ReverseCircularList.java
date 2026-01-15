/**
 * ============================================================
 * Q27: REVERSE CIRCULAR LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Reverse a circular linked list.
 * 
 * EXAMPLE:
 * Input: 1 -> 2 -> 3 -> 4 -> (back to 1)
 * Output: 4 -> 3 -> 2 -> 1 -> (back to 4)
 * 
 * HINT:
 * - Similar to reversing singly linked list
 * - But need to handle the circular nature
 * - After reversing, the last node should point to new head
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q27_ReverseCircularList {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Reverse circular linked list
     * @param head - head of circular list
     * @return new head of reversed circular list
     */
    public static Node reverse(Node head) {
        // YOUR CODE HERE
        // Use prev, current, next pointers
        // Don't forget to handle the circular connection
        
        return head;
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
    
    // Helper: Verify circular property
    public static boolean verifyCircular(Node head) {
        if (head == null) return true;
        
        Node current = head.next;
        int count = 1;
        while (current != head && count < 1000) {
            current = current.next;
            count++;
        }
        return current == head;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Reverse Circular Linked List ===\n");
        
        // Test 1
        Node list1 = createCircularList(new int[]{1, 2, 3, 4, 5});
        printCircular(list1, "Original");
        
        list1 = reverse(list1);
        printCircular(list1, "Reversed");
        System.out.println("Is circular: " + verifyCircular(list1));
        
        // Test 2
        System.out.println("\n--- Test 2 ---");
        Node list2 = createCircularList(new int[]{10, 20, 30});
        printCircular(list2, "Original");
        
        list2 = reverse(list2);
        printCircular(list2, "Reversed");
        
        // Test 3: Two nodes
        System.out.println("\n--- Two nodes ---");
        Node list3 = createCircularList(new int[]{5, 10});
        printCircular(list3, "Original");
        
        list3 = reverse(list3);
        printCircular(list3, "Reversed");
        
        // Test 4: Single node
        System.out.println("\n--- Single node ---");
        Node list4 = createCircularList(new int[]{100});
        printCircular(list4, "Original");
        
        list4 = reverse(list4);
        printCircular(list4, "Reversed");
        
        /* Expected Output:
         * Original: 1 -> 2 -> 3 -> 4 -> 5 -> (back to 1)
         * Reversed: 5 -> 4 -> 3 -> 2 -> 1 -> (back to 5)
         * Is circular: true
         * 
         * Original: 10 -> 20 -> 30 -> (back to 10)
         * Reversed: 30 -> 20 -> 10 -> (back to 30)
         */
    }
}
