/**
 * ============================================================
 * QUESTION: Rearrange Linked List (Odd-Even)
 * FILE: 3 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Group odd-indexed nodes followed by even-indexed nodes.
 * 
 * CLASSIFICATION: Linked List
 * 
 * TEST CASES:
 * Case 1: 1→2→3→4→5 → 1→3→5→2→4
 * Case 2: 10→20 → 10→20
 * 
 * ALGORITHM:
 * Separate into two lists and join.
 * 
 * SIMILAR QUESTIONS:
 * 1. Partition List
 * 2. Zig-Zag List
 * 3. Rotate List
 * ============================================================
 */

public class File3_Q8_OddEvenLinkedList {
    
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
     * Rearrange so odd-indexed nodes come before even-indexed nodes
     * Note: Index starts from 1
     * 
     * @param head - head of linked list
     * @return - head of rearranged list
     */
    public static ListNode oddEvenList(ListNode head) {
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
    
    // Helper: Convert list to string
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
        System.out.println("=== File 3 - Q8: Odd-Even Linked List ===\n");
        
        // Test Case 1
        ListNode list1 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Test 1: " + listToString(list1));
        ListNode result1 = oddEvenList(list1);
        System.out.println("Result: " + listToString(result1));
        System.out.println("Expected: 1→3→5→2→4");
        System.out.println();
        
        // Test Case 2
        ListNode list2 = createList(new int[]{10, 20});
        System.out.println("Test 2: " + listToString(list2));
        ListNode result2 = oddEvenList(list2);
        System.out.println("Result: " + listToString(result2));
        System.out.println("Expected: 10→20");
        System.out.println();
        
        // Test Case 3
        ListNode list3 = createList(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("Test 3: " + listToString(list3));
        ListNode result3 = oddEvenList(list3);
        System.out.println("Result: " + listToString(result3));
        System.out.println("Expected: 1→3→5→2→4→6");
    }
}
