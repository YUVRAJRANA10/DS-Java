/**
 * ============================================================
 * QUESTION: The Parade Problem (N-th from End)
 * FILE: 5 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * Find N-th node from end; if N > size, return last node.
 * 
 * CLASSIFICATION: Linked List Two-Pointer
 * 
 * TEST CASES:
 * Case 1: N=2 → 4 (from 1→2→3→4→5, 4 is 2nd from end)
 * 
 * ALGORITHM:
 * Two pointers separated by N steps.
 * 
 * SIMILAR QUESTIONS:
 * 1. Remove N-th from end
 * 2. Find Middle
 * 3. Cycle Detection
 * ============================================================
 */

public class File5_Q1_NthFromEnd {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    /**
     * TODO: Implement this method
     * Find N-th node from end
     * 
     * @param head - head of linked list
     * @param n - position from end (1-indexed)
     * @return - value of N-th node from end
     */
    public static int findNthFromEnd(ListNode head, int n) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // Helper: Create list
    private static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q1: N-th from End ===\n");
        
        // Test Case 1
        ListNode list1 = createList(new int[]{1, 2, 3, 4, 5});
        int n1 = 2;
        int expected1 = 4;
        int result1 = findNthFromEnd(list1, n1);
        System.out.println("Test 1: 1→2→3→4→5, N=" + n1);
        System.out.println("Result: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        ListNode list2 = createList(new int[]{1, 2, 3, 4, 5});
        int n2 = 5;
        int expected2 = 1;
        int result2 = findNthFromEnd(list2, n2);
        System.out.println("Test 2: 1→2→3→4→5, N=" + n2);
        System.out.println("Result: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - N > size
        ListNode list3 = createList(new int[]{1, 2, 3});
        int n3 = 10;
        int result3 = findNthFromEnd(list3, n3);
        System.out.println("Test 3: 1→2→3, N=" + n3 + " (N > size)");
        System.out.println("Result: " + result3);
        System.out.println("Expected: 3 (last node) or 1 (first node)");
    }
}
