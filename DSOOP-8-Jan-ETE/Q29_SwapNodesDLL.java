/**
 * ============================================================
 * Q29: SWAP NODES IN DOUBLY LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Swap two given nodes in a doubly linked list.
 * 
 * EXAMPLE:
 * Input: 1 <-> 2 <-> 3 <-> 4 <-> 5
 * Swap nodes with values 2 and 4
 * Output: 1 <-> 4 <-> 3 <-> 2 <-> 5
 * 
 * HINT:
 * - Find both nodes first
 * - Handle adjacent nodes specially
 * - Update prev and next pointers of both nodes
 * - Update neighbors' pointers too
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q29_SwapNodesDLL {
    
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
     * TODO: Swap two nodes with given values
     * @param head - head of doubly linked list
     * @param val1 - first value to swap
     * @param val2 - second value to swap
     * @return head (may change if head is swapped)
     */
    public static Node swapNodes(Node head, int val1, int val2) {
        // YOUR CODE HERE
        // 1. Find both nodes
        // 2. Handle if adjacent
        // 3. Swap by updating prev/next pointers
        
        return head;
    }
    
    /**
     * TODO: Swap nodes at given positions (0-indexed)
     */
    public static Node swapByPosition(Node head, int pos1, int pos2) {
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
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" <-> ");
            head = head.next;
        }
        System.out.println();
    }
    
    // Helper: Verify DLL integrity (prev/next links)
    public static boolean verifyDLL(Node head) {
        if (head == null) return true;
        
        while (head.next != null) {
            if (head.next.prev != head) return false;
            head = head.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Swap Nodes in Doubly Linked List ===\n");
        
        // Test 1: Swap non-adjacent nodes
        Node list1 = createDLL(new int[]{1, 2, 3, 4, 5});
        printDLL(list1, "Original");
        list1 = swapNodes(list1, 2, 4);
        printDLL(list1, "After swap(2, 4)");
        System.out.println("DLL valid: " + verifyDLL(list1));
        
        // Test 2: Swap adjacent nodes
        System.out.println();
        Node list2 = createDLL(new int[]{1, 2, 3, 4, 5});
        printDLL(list2, "Original");
        list2 = swapNodes(list2, 2, 3);
        printDLL(list2, "After swap(2, 3)");
        System.out.println("DLL valid: " + verifyDLL(list2));
        
        // Test 3: Swap with head
        System.out.println();
        Node list3 = createDLL(new int[]{1, 2, 3, 4, 5});
        printDLL(list3, "Original");
        list3 = swapNodes(list3, 1, 4);
        printDLL(list3, "After swap(1, 4)");
        System.out.println("DLL valid: " + verifyDLL(list3));
        
        // Test 4: Swap with tail
        System.out.println();
        Node list4 = createDLL(new int[]{1, 2, 3, 4, 5});
        printDLL(list4, "Original");
        list4 = swapNodes(list4, 2, 5);
        printDLL(list4, "After swap(2, 5)");
        System.out.println("DLL valid: " + verifyDLL(list4));
        
        /* Expected Output:
         * Original: 1 <-> 2 <-> 3 <-> 4 <-> 5
         * After swap(2, 4): 1 <-> 4 <-> 3 <-> 2 <-> 5
         * 
         * After swap(2, 3): 1 <-> 3 <-> 2 <-> 4 <-> 5
         * After swap(1, 4): 4 <-> 2 <-> 3 <-> 1 <-> 5
         */
    }
}
