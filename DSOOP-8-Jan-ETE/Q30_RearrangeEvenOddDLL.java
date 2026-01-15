/**
 * ============================================================
 * Q30: REARRANGE EVEN-ODD POSITIONED NODES (DLL)
 * ============================================================
 * 
 * PROBLEM:
 * Rearrange a doubly linked list such that all nodes at
 * even positions come first, followed by nodes at odd positions.
 * (Positions are 1-indexed)
 * 
 * EXAMPLE:
 * Input: 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6
 * Output: 2 <-> 4 <-> 6 <-> 1 <-> 3 <-> 5
 * (Even positions: 2nd, 4th, 6th) then (Odd: 1st, 3rd, 5th)
 * 
 * HINT:
 * - Traverse and separate into two lists based on position
 * - Reconnect even-position list followed by odd-position list
 * - Maintain proper prev/next links
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q30_RearrangeEvenOddDLL {
    
    static class Node {
        int data;
        Node prev;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    /**
     * TODO: Rearrange DLL - even positions first, then odd positions
     * Position is 1-indexed
     * @param head - head of doubly linked list
     * @return new head after rearrangement
     */
    public static Node rearrangeByPosition(Node head) {
        // YOUR CODE HERE
        // 1. Separate into oddPos and evenPos lists
        // 2. Connect evenPos list followed by oddPos list
        // 3. Fix all prev/next pointers
        
        return head;
    }
    
    /**
     * TODO: Alternative - Keep relative order but group by position
     * Even-positioned nodes maintain their relative order
     * Odd-positioned nodes maintain their relative order
     */
    public static Node rearrangePreserveOrder(Node head) {
        // YOUR CODE HERE
        
        return head;
    }
    
    // Helper: Create doubly linked list from array
    public static Node createDLL(int[] arr) {
        if (arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        
        return head;
    }
    
    // Helper: Print doubly linked list forward
    public static void printDLL(Node head, String label) {
        System.out.print(label + ": ");
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" <-> ");
            head = head.next;
        }
        System.out.println();
    }
    
    // Helper: Verify DLL integrity
    public static boolean verifyDLL(Node head) {
        if (head == null) return true;
        if (head.prev != null) return false; // head.prev should be null
        
        while (head.next != null) {
            if (head.next.prev != head) return false;
            head = head.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Rearrange Even-Odd Positioned Nodes (DLL) ===\n");
        
        // Test 1: Even number of nodes
        Node list1 = createDLL(new int[]{1, 2, 3, 4, 5, 6});
        printDLL(list1, "Original");
        list1 = rearrangeByPosition(list1);
        printDLL(list1, "Rearranged");
        System.out.println("DLL valid: " + verifyDLL(list1));
        
        // Test 2: Odd number of nodes
        System.out.println();
        Node list2 = createDLL(new int[]{10, 20, 30, 40, 50});
        printDLL(list2, "Original");
        list2 = rearrangeByPosition(list2);
        printDLL(list2, "Rearranged");
        System.out.println("DLL valid: " + verifyDLL(list2));
        
        // Test 3: Two nodes
        System.out.println();
        Node list3 = createDLL(new int[]{1, 2});
        printDLL(list3, "Original");
        list3 = rearrangeByPosition(list3);
        printDLL(list3, "Rearranged");
        System.out.println("DLL valid: " + verifyDLL(list3));
        
        // Test 4: Single node
        System.out.println();
        Node list4 = createDLL(new int[]{100});
        printDLL(list4, "Original");
        list4 = rearrangeByPosition(list4);
        printDLL(list4, "Rearranged");
        System.out.println("DLL valid: " + verifyDLL(list4));
        
        /* Expected Output:
         * Original: 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6
         * Rearranged: 2 <-> 4 <-> 6 <-> 1 <-> 3 <-> 5
         * 
         * Original: 10 <-> 20 <-> 30 <-> 40 <-> 50
         * Rearranged: 20 <-> 40 <-> 10 <-> 30 <-> 50
         * 
         * Original: 1 <-> 2
         * Rearranged: 2 <-> 1
         * 
         * Original: 100
         * Rearranged: 100 (unchanged - only odd position)
         */
    }
}
