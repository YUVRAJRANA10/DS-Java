/**
 * ============================================================
 * QUESTION: Reverse Linked List
 * FILE: 2 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Reverse the pointers of a singly linked list.
 * 
 * CLASSIFICATION: Linked List
 * 
 * TEST CASES:
 * Case 1: 1→2→3→4 → 4→3→2→1
 * Case 2: 10→20 → 20→10
 * 
 * ALGORITHM:
 * Use prev, curr, next pointers to flip links.
 * 
 * SIMILAR QUESTIONS:
 * 1. Reverse Linked List II
 * 2. Palindrome Linked List
 * 3. Swap Nodes in Pairs
 * ============================================================
 */

public class File2_Q9_ReverseLinkedList {
    
    // Node class for Linked List
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    /**
     * TODO: Implement this method
     * Reverse the linked list iteratively
     * 
     * @param head - head of linked list
     * @return - new head of reversed list
     */
    public static ListNode reverseIterative(ListNode head) {
        // YOUR CODE HERE
        
        return head;
    }
    
    /**
     * TODO: Implement this method
     * Reverse the linked list recursively
     * 
     * @param head - head of linked list
     * @return - new head of reversed list
     */
    public static ListNode reverseRecursive(ListNode head) {
        // YOUR CODE HERE
        
        return head;
    }
    
    // Helper: Create list from array
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
    
    // Helper: Print list
    private static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append("→");
            head = head.next;
        }
        return sb.toString();
    }
    
    // Helper: Check if lists match
    private static boolean listsEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 2 - Q9: Reverse Linked List ===\n");
        
        // Test Case 1
        ListNode list1 = createList(new int[]{1, 2, 3, 4});
        ListNode expected1 = createList(new int[]{4, 3, 2, 1});
        System.out.println("Test 1: " + listToString(list1));
        ListNode result1 = reverseIterative(list1);
        System.out.println("Result: " + listToString(result1));
        System.out.println("Expected: " + listToString(expected1));
        System.out.println("Status: " + (listsEqual(result1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        ListNode list2 = createList(new int[]{10, 20});
        ListNode expected2 = createList(new int[]{20, 10});
        System.out.println("Test 2: " + listToString(list2));
        ListNode result2 = reverseIterative(list2);
        System.out.println("Result: " + listToString(result2));
        System.out.println("Expected: " + listToString(expected2));
        System.out.println("Status: " + (listsEqual(result2, expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Single node
        ListNode list3 = createList(new int[]{5});
        System.out.println("Test 3: " + listToString(list3));
        ListNode result3 = reverseIterative(list3);
        System.out.println("Result: " + listToString(result3));
        System.out.println("Expected: 5");
        System.out.println("Status: " + (result3.val == 5 ? "✓ PASSED" : "✗ FAILED"));
    }
}
