/**
 * ============================================================
 * QUESTION: Sorted Intersection of Two Lists
 * FILE: 9 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Find common elements from two sorted linked lists.
 * 
 * CLASSIFICATION: Linked List
 * 
 * TEST CASES:
 * Case 1: {1,2,4,6}, {2,4,6,8} → {2,4,6}
 * 
 * ALGORITHM:
 * Two-pointer; advance smaller.
 * 
 * SIMILAR QUESTIONS:
 * 1. Intersection of Arrays
 * 2. Common Elements
 * 3. Merge Sorted Lists
 * ============================================================
 */

import java.util.*;

public class File9_Q9_SortedIntersection {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    /**
     * TODO: Implement this method
     * Find intersection of two sorted lists
     * 
     * @param l1 - first sorted list
     * @param l2 - second sorted list
     * @return - sorted intersection (common elements)
     */
    public static ListNode sortedIntersection(ListNode l1, ListNode l2) {
        // YOUR CODE HERE
        
        return null;
    }
    
    /**
     * TODO: Array version - intersection of two sorted arrays
     */
    public static int[] sortedIntersectionArrays(int[] a, int[] b) {
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
        System.out.println("=== File 9 - Q9: Sorted Intersection ===\n");
        
        ListNode l1 = createList(new int[]{1, 2, 4, 6});
        ListNode l2 = createList(new int[]{2, 4, 6, 8});
        System.out.println("List 1: " + listToString(l1));
        System.out.println("List 2: " + listToString(l2));
        ListNode intersection = sortedIntersection(l1, l2);
        System.out.println("Intersection: " + listToString(intersection));
        System.out.println("Expected: 2→4→6");
        System.out.println();
        
        // Array version
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6, 8};
        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Array 2: " + Arrays.toString(b));
        System.out.println("Intersection: " + Arrays.toString(sortedIntersectionArrays(a, b)));
        System.out.println("Expected: [2, 2, 4]");
    }
}
