/**
 * ============================================================
 * Q28: DETECT CYCLE IN CIRCULAR LINKED LIST
 * ============================================================
 * 
 * PROBLEM:
 * Detect whether a cycle exists in a linked list.
 * (For circular list, cycle always exists. This is more for 
 * detecting if a regular list has become cyclic)
 * 
 * ALGORITHM: Floyd's Cycle Detection (Tortoise and Hare)
 * - Use two pointers: slow (1 step) and fast (2 steps)
 * - If they meet, cycle exists
 * - If fast reaches null, no cycle
 * 
 * EXAMPLE:
 * 1 -> 2 -> 3 -> 4 -> 5 -> null  (no cycle)
 * 1 -> 2 -> 3 -> 4 -> 5 -> (back to 3)  (cycle at node 3)
 * 
 * TIME: O(n), SPACE: O(1)
 * ============================================================
 */

public class Q28_DetectCycle {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * TODO: Detect if cycle exists using Floyd's algorithm
     * @param head - head of linked list
     * @return true if cycle exists, false otherwise
     */
    public static boolean hasCycle(Node head) {
        // YOUR CODE HERE
        // Use slow (1 step) and fast (2 steps) pointers
        
        return false;
    }
    
    /**
     * TODO: Find the node where cycle starts
     * @param head - head of linked list
     * @return node where cycle starts, or null if no cycle
     */
    public static Node findCycleStart(Node head) {
        // YOUR CODE HERE
        // First detect cycle, then find start
        
        return null;
    }
    
    /**
     * TODO: Count nodes in the cycle
     * @param head - head of linked list
     * @return number of nodes in cycle, 0 if no cycle
     */
    public static int countCycleNodes(Node head) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // Helper: Create list without cycle
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
    
    // Helper: Create list with cycle at position (0-indexed)
    public static Node createListWithCycle(int[] arr, int cyclePos) {
        if (arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node current = head;
        Node cycleNode = (cyclePos == 0) ? head : null;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
            if (i == cyclePos) {
                cycleNode = current;
            }
        }
        
        // Create cycle
        if (cycleNode != null) {
            current.next = cycleNode;
        }
        
        return head;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Detect Cycle in Linked List ===\n");
        
        // Test 1: No cycle
        Node list1 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.println("List 1 (no cycle):");
        System.out.println("Has cycle: " + hasCycle(list1));
        
        // Test 2: Cycle at start (circular list)
        Node list2 = createListWithCycle(new int[]{1, 2, 3, 4, 5}, 0);
        System.out.println("\nList 2 (cycle at start - full circular):");
        System.out.println("Has cycle: " + hasCycle(list2));
        Node cycleStart2 = findCycleStart(list2);
        System.out.println("Cycle starts at: " + (cycleStart2 != null ? cycleStart2.data : "null"));
        System.out.println("Cycle length: " + countCycleNodes(list2));
        
        // Test 3: Cycle in middle
        Node list3 = createListWithCycle(new int[]{1, 2, 3, 4, 5}, 2);
        System.out.println("\nList 3 (cycle at position 2 - node with value 3):");
        System.out.println("Has cycle: " + hasCycle(list3));
        Node cycleStart3 = findCycleStart(list3);
        System.out.println("Cycle starts at: " + (cycleStart3 != null ? cycleStart3.data : "null"));
        System.out.println("Cycle length: " + countCycleNodes(list3));
        
        // Test 4: Single node cycle
        Node single = new Node(100);
        single.next = single;  // Points to itself
        System.out.println("\nSingle node pointing to itself:");
        System.out.println("Has cycle: " + hasCycle(single));
        
        // Test 5: Empty list
        Node empty = null;
        System.out.println("\nEmpty list:");
        System.out.println("Has cycle: " + hasCycle(empty));
        
        /* Expected Output:
         * List 1 (no cycle): Has cycle: false
         * List 2 (full circular): Has cycle: true, starts at 1, length 5
         * List 3 (cycle at 3): Has cycle: true, starts at 3, length 3
         */
    }
}
