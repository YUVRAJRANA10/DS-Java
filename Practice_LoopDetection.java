/**
 * ============================================================
 * QUESTION: Detect Loop & Count Nodes in Loop
 * PRACTICE QUESTION (Two-Pointer / Floyd's Algorithm)
 * ============================================================
 * 
 * STATEMENT:
 * 1. Detect if a linked list has a loop
 * 2. If loop exists, count the number of nodes in the loop
 * 
 * TEST CASES:
 * Case 1: 1→2→3→4→5→3 (loop back to 3) → Loop: Yes, Nodes in loop: 3
 * Case 2: 1→2→3→4→null → Loop: No
 * 
 * ALGORITHM:
 * Floyd's Cycle Detection (Tortoise & Hare)
 * - Slow moves 1 step, Fast moves 2 steps
 * - If they meet → loop exists
 * - To count: keep one fixed, move other until they meet again
 * ============================================================
 */

public class Practice_LoopDetection {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    /**
     * Detect if linked list has a loop
     * 
     * @param head - head of linked list
     * @return - true if loop exists
     */
    public static boolean hasLoop(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps
            
            if (slow == fast) {
                return true;  // They met → Loop exists!
            }
        }
        return false;  // Fast reached end → No loop
    }
    
    /**
     * Count number of nodes in the loop
     * 
     * @param head - head of linked list
     * @return - number of nodes in loop, 0 if no loop
     */
    public static int countNodesInLoop(ListNode head) {
        if (head == null || head.next == null) {
            return 0;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Step 1: Detect loop and find meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                // Loop detected! Now count nodes
                // Keep slow fixed, move fast until it comes back
                int count = 1;
                fast = fast.next;
                
                while (fast != slow) {
                    count++;
                    fast = fast.next;
                }
                return count;
            }
        }
        return 0;  // No loop
    }
    
    /**
     * BONUS: Find the starting node of the loop
     * 
     * @param head - head of linked list
     * @return - starting node of loop, null if no loop
     */
    public static ListNode findLoopStart(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Step 1: Find meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                // Step 2: Reset slow to head, move both at same speed
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;  // This is the loop start!
            }
        }
        return null;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== Practice: Loop Detection ===\n");
        
        // Test Case 1: List with loop
        // 1 → 2 → 3 → 4 → 5
        //         ↑       ↓
        //         └───────┘
        System.out.println("Test 1: 1→2→3→4→5→(back to 3)");
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = head1.next.next; // Loop to node 3
        
        System.out.println("Has Loop: " + hasLoop(head1) + " (Expected: true)");
        System.out.println("Nodes in Loop: " + countNodesInLoop(head1) + " (Expected: 3)");
        ListNode loopStart1 = findLoopStart(head1);
        System.out.println("Loop starts at: " + (loopStart1 != null ? loopStart1.val : "null") + " (Expected: 3)");
        System.out.println();
        
        // Test Case 2: List without loop
        System.out.println("Test 2: 1→2→3→4→null");
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        
        System.out.println("Has Loop: " + hasLoop(head2) + " (Expected: false)");
        System.out.println("Nodes in Loop: " + countNodesInLoop(head2) + " (Expected: 0)");
        System.out.println();
        
        // Test Case 3: Single node loop
        System.out.println("Test 3: 1→(back to 1)");
        ListNode head3 = new ListNode(1);
        head3.next = head3; // Points to itself
        
        System.out.println("Has Loop: " + hasLoop(head3) + " (Expected: true)");
        System.out.println("Nodes in Loop: " + countNodesInLoop(head3) + " (Expected: 1)");
    }
}
