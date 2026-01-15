/**
 * ============================================================
 * Q23: COUNT NODES IN CIRCULAR LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Count the total number of nodes present in a circular linked list.
 * 
 * EXAMPLE:
 * Input: 1 -> 2 -> 3 -> 4 -> (back to 1)
 * Output: 4
 * 
 * HINT:
 * - Start from head, traverse until you reach head again
 * - Use do-while or check next == head
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q23_CountNodesCircular {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Count nodes in circular linked list
     * @param head - head of circular list
     * @return number of nodes
     */
    public static int countNodes(Node head) {
        // YOUR CODE HERE
        
        return 0;
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
        
        // Make it circular
        current.next = head;
        
        return head;
    }
    
    // Helper: Print circular linked list
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
        System.out.println("=== Count Nodes in Circular Linked List ===\n");
        
        // Test 1
        Node list1 = createCircularList(new int[]{1, 2, 3, 4});
        printCircular(list1, "List 1");
        System.out.println("Count: " + countNodes(list1));
        
        // Test 2
        Node list2 = createCircularList(new int[]{10, 20, 30, 40, 50, 60});
        printCircular(list2, "\nList 2");
        System.out.println("Count: " + countNodes(list2));
        
        // Test 3: Single node
        Node list3 = createCircularList(new int[]{100});
        printCircular(list3, "\nList 3 (single node)");
        System.out.println("Count: " + countNodes(list3));
        
        // Test 4: Empty list
        Node list4 = null;
        System.out.println("\nEmpty list count: " + countNodes(list4));
        
        /* Expected Output:
         * List 1: 1 -> 2 -> 3 -> 4 -> (back to 1)
         * Count: 4
         * 
         * List 2: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> (back to 10)
         * Count: 6
         * 
         * List 3: 100 -> (back to 100)
         * Count: 1
         * 
         * Empty list count: 0
         */
    }
}
