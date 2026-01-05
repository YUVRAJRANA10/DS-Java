/**
 * ============================================================
 * QUESTION: Sorted Union of Two Lists
 * FILE: 9 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Merge two sorted linked lists, remove duplicates.
 * 
 * CLASSIFICATION: Linked List
 * 
 * TEST CASES:
 * Case 1: {1,2,4}, {1,3,4} → {1,2,3,4}
 * 
 * ALGORITHM:
 * Two-pointer merge, skip duplicates.
 * 
 * SIMILAR QUESTIONS:
 * 1. Merge Sorted Lists
 * 2. Union of Arrays
 * 3. Remove Duplicates
 * ============================================================
 */

import java.util.*;

public class File9_Q8_SortedUnion {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    /**
     * TODO: Implement this method
     * Merge two sorted lists and remove duplicates
     * 
     * @param l1 - first sorted list
     * @param l2 - second sorted list
     * @return - sorted union (no duplicates)
     */
    public static ListNode sortedUnion(ListNode l1, ListNode l2) {
        // YOUR CODE HERE
        
        return null;
    }
    
    /**
     * TODO: Array version - union of two sorted arrays
     */
    public static int[] sortedUnionArrays(int[] a, int[] b) {
        // YOUR CODE HERE
        
        return new int[0];
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
        return sb.length() == 0 ? "null" : sb.toString();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q8: Sorted Union ===\n");
        
        ListNode l1 = createList(new int[]{1, 2, 4});
        ListNode l2 = createList(new int[]{1, 3, 4});
        System.out.println("List 1: " + listToString(l1));
        System.out.println("List 2: " + listToString(l2));
        ListNode union = sortedUnion(l1, l2);
        System.out.println("Union: " + listToString(union));
        System.out.println("Expected: 1→2→3→4");
        System.out.println();
        
        // Array version
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {2, 3, 5, 7};
        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Array 2: " + Arrays.toString(b));
        System.out.println("Union: " + Arrays.toString(sortedUnionArrays(a, b)));
        System.out.println("Expected: [1, 2, 3, 4, 5, 6, 7]");
    }
}
