/**
 * ============================================================
 * Q26: SPLIT CIRCULAR LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Split a circular linked list into two equal halves.
 * If odd number of nodes, first half gets the extra node.
 * 
 * EXAMPLES:
 * Input: 1 -> 2 -> 3 -> 4 -> (back to 1)
 * Output: 
 *   First half: 1 -> 2 -> (back to 1)
 *   Second half: 3 -> 4 -> (back to 3)
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> (back to 1)
 * Output:
 *   First half: 1 -> 2 -> 3 -> (back to 1)
 *   Second half: 4 -> 5 -> (back to 4)
 * 
 * HINT:
 * - Use slow and fast pointers to find middle
 * - Split at middle, make both halves circular
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q26_SplitCircularList {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Split circular list into two halves
     * @param head - head of circular list
     * @return array of two heads [head1, head2]
     */
    public static Node[] splitList(Node head) {
        // YOUR CODE HERE
        // Use slow-fast pointer to find middle
        // Split and make both halves circular
        
        return new Node[]{null, null};
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
    
    // Helper: Count nodes in circular list
    public static int countNodes(Node head) {
        if (head == null) return 0;
        
        int count = 1;
        Node current = head.next;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Split Circular Linked List ===\n");
        
        // Test 1: Even number of nodes
        System.out.println("--- Even nodes (4) ---");
        Node list1 = createCircularList(new int[]{1, 2, 3, 4});
        printCircular(list1, "Original");
        
        Node[] halves1 = splitList(list1);
        printCircular(halves1[0], "First half");
        printCircular(halves1[1], "Second half");
        
        // Test 2: Odd number of nodes
        System.out.println("\n--- Odd nodes (5) ---");
        Node list2 = createCircularList(new int[]{1, 2, 3, 4, 5});
        printCircular(list2, "Original");
        
        Node[] halves2 = splitList(list2);
        printCircular(halves2[0], "First half");
        printCircular(halves2[1], "Second half");
        
        // Test 3: Two nodes
        System.out.println("\n--- Two nodes ---");
        Node list3 = createCircularList(new int[]{10, 20});
        printCircular(list3, "Original");
        
        Node[] halves3 = splitList(list3);
        printCircular(halves3[0], "First half");
        printCircular(halves3[1], "Second half");
        
        // Test 4: Single node
        System.out.println("\n--- Single node ---");
        Node list4 = createCircularList(new int[]{100});
        printCircular(list4, "Original");
        
        Node[] halves4 = splitList(list4);
        printCircular(halves4[0], "First half");
        printCircular(halves4[1], "Second half");
        
        /* Expected Output:
         * Even (4):
         *   Original: 1 -> 2 -> 3 -> 4 -> (back to 1)
         *   First half: 1 -> 2 -> (back to 1)
         *   Second half: 3 -> 4 -> (back to 3)
         * 
         * Odd (5):
         *   Original: 1 -> 2 -> 3 -> 4 -> 5 -> (back to 1)
         *   First half: 1 -> 2 -> 3 -> (back to 1)
         *   Second half: 4 -> 5 -> (back to 4)
         */
    }
}
