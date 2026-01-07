/**
 * ============================================================
 * QUESTION: Merge Two Sorted Lists
 * FILE: 7 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Combine two sorted linked lists into one.
 * 
 * CLASSIFICATION: Linked List
 * 
 * ALGORITHM:
 * Two-pointer merge.
 * 
 * SIMILAR QUESTIONS:
 * 1. Merge K Lists
 * 2. Sort List
 * 3. Intersection
 * ============================================================
 */

public class File7_Q9_MergeSortedLists {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    /**
     * TODO: Implement this method
     * Merge two sorted linked lists
     * 
     * @param l1 - first sorted list
     * @param l2 - second sorted list
     * @return - merged sorted list
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        // Attach remaining elements (no loop needed!)
        tail.next = (l1 != null) ? l1 : l2;
        
        return dummy.next;
    }
    
    // Helper methods
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
        System.out.println("=== File 7 - Q9: Merge Sorted Lists ===\n");
        
        ListNode l1 = createList(new int[]{1, 2, 4});
        ListNode l2 = createList(new int[]{1, 3, 4});
        System.out.println("List 1: " + listToString(l1));
        System.out.println("List 2: " + listToString(l2));
        
        ListNode merged = mergeTwoLists(l1, l2);
        System.out.println("Merged: " + listToString(merged));
        System.out.println("Expected: 1→1→2→3→4→4");
    }
}
