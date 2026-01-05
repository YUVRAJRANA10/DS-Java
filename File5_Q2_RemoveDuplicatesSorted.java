/**
 * ============================================================
 * QUESTION: Remove Duplicates (Sorted List)
 * FILE: 5 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Delete duplicates in sorted linked list.
 * 
 * CLASSIFICATION: Linked List
 * 
 * TEST CASES:
 * Case 1: 1→1→2 → 1→2
 * 
 * ALGORITHM:
 * Compare current with next; skip next if same.
 * 
 * SIMILAR QUESTIONS:
 * 1. Remove from Unsorted
 * 2. Remove All Duplicates
 * 3. Flatten List
 * ============================================================
 */

public class File5_Q2_RemoveDuplicatesSorted {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    /**
     * TODO: Implement this method
     * Remove duplicates from sorted linked list
     * 
     * @param head - head of sorted linked list
     * @return - head of list without duplicates
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // YOUR CODE HERE
        
        return head;
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
    
    // Helper: List to string
    private static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append("→");
            head = head.next;
        }
        return sb.toString();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q2: Remove Duplicates (Sorted) ===\n");
        
        // Test Case 1
        ListNode list1 = createList(new int[]{1, 1, 2});
        System.out.println("Test 1: " + listToString(list1));
        ListNode result1 = deleteDuplicates(list1);
        System.out.println("Result: " + listToString(result1));
        System.out.println("Expected: 1→2");
        System.out.println();
        
        // Test Case 2
        ListNode list2 = createList(new int[]{1, 1, 2, 3, 3});
        System.out.println("Test 2: " + listToString(list2));
        ListNode result2 = deleteDuplicates(list2);
        System.out.println("Result: " + listToString(result2));
        System.out.println("Expected: 1→2→3");
        System.out.println();
        
        // Test Case 3
        ListNode list3 = createList(new int[]{1, 1, 1, 1, 1});
        System.out.println("Test 3: " + listToString(list3));
        ListNode result3 = deleteDuplicates(list3);
        System.out.println("Result: " + listToString(result3));
        System.out.println("Expected: 1");
    }
}
