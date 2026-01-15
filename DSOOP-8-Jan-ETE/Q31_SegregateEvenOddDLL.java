/**
 * ============================================================
 * Q31: SEGREGATE EVEN AND ODD VALUED NODES (DLL)
 * ============================================================
 * 
 * PROBLEM:
 * Segregate a doubly linked list such that all nodes with 
 * EVEN values come before nodes with ODD values.
 * Maintain relative order within even and odd groups.
 * 
 * EXAMPLE:
 * Input: 17 <-> 15 <-> 8 <-> 12 <-> 10 <-> 5 <-> 4
 * Output: 8 <-> 12 <-> 10 <-> 4 <-> 17 <-> 15 <-> 5
 * 
 * HINT:
 * - Create two separate lists for even and odd values
 * - Traverse original list, append to appropriate list
 * - Merge even list followed by odd list
 * - Remember to update head.prev = null
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q31_SegregateEvenOddDLL {
    
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
     * TODO: Segregate DLL - even values first, then odd values
     * @param head - head of doubly linked list
     * @return new head after segregation
     */
    public static Node segregateEvenOdd(Node head) {
        // YOUR CODE HERE
        // 1. Maintain evenHead, evenTail, oddHead, oddTail
        // 2. Traverse and add each node to appropriate list
        // 3. Connect evenTail to oddHead
        // 4. Handle edge cases (all even or all odd)
        
        return head;
    }
    
    /**
     * TODO: Alternative - In-place segregation using swapping
     * More complex but true O(1) space
     */
    public static Node segregateInPlace(Node head) {
        // YOUR CODE HERE
        // Use two pointers - one from start, one from end
        // Swap when needed
        
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
        if (head.prev != null) return false;
        
        while (head.next != null) {
            if (head.next.prev != head) return false;
            head = head.next;
        }
        return true;
    }
    
    // Helper: Check if segregation is correct
    public static boolean isSegregated(Node head) {
        // All evens should come before any odd
        boolean foundOdd = false;
        while (head != null) {
            if (head.data % 2 != 0) {
                foundOdd = true;
            } else if (foundOdd) {
                // Found even after odd - not segregated
                return false;
            }
            head = head.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Segregate Even and Odd Valued Nodes (DLL) ===\n");
        
        // Test 1: Mixed values
        Node list1 = createDLL(new int[]{17, 15, 8, 12, 10, 5, 4});
        printDLL(list1, "Original");
        list1 = segregateEvenOdd(list1);
        printDLL(list1, "Segregated");
        System.out.println("DLL valid: " + verifyDLL(list1));
        System.out.println("Properly segregated: " + isSegregated(list1));
        
        // Test 2: Already segregated
        System.out.println();
        Node list2 = createDLL(new int[]{2, 4, 6, 1, 3, 5});
        printDLL(list2, "Original");
        list2 = segregateEvenOdd(list2);
        printDLL(list2, "Segregated");
        System.out.println("Properly segregated: " + isSegregated(list2));
        
        // Test 3: All odd values
        System.out.println();
        Node list3 = createDLL(new int[]{1, 3, 5, 7, 9});
        printDLL(list3, "Original");
        list3 = segregateEvenOdd(list3);
        printDLL(list3, "Segregated");
        System.out.println("Properly segregated: " + isSegregated(list3));
        
        // Test 4: All even values
        System.out.println();
        Node list4 = createDLL(new int[]{2, 4, 6, 8, 10});
        printDLL(list4, "Original");
        list4 = segregateEvenOdd(list4);
        printDLL(list4, "Segregated");
        System.out.println("Properly segregated: " + isSegregated(list4));
        
        // Test 5: Alternating values
        System.out.println();
        Node list5 = createDLL(new int[]{1, 2, 3, 4, 5, 6});
        printDLL(list5, "Original");
        list5 = segregateEvenOdd(list5);
        printDLL(list5, "Segregated");
        System.out.println("Properly segregated: " + isSegregated(list5));
        
        /* Expected Output:
         * Original: 17 <-> 15 <-> 8 <-> 12 <-> 10 <-> 5 <-> 4
         * Segregated: 8 <-> 12 <-> 10 <-> 4 <-> 17 <-> 15 <-> 5
         * 
         * Original: 1 <-> 3 <-> 5 <-> 7 <-> 9
         * Segregated: 1 <-> 3 <-> 5 <-> 7 <-> 9 (unchanged)
         * 
         * Original: 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6
         * Segregated: 2 <-> 4 <-> 6 <-> 1 <-> 3 <-> 5
         */
    }
}
