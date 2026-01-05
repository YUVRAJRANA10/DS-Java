/**
 * ============================================================
 * QUESTION: Split Circular Linked List
 * FILE: 7 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Split even-length circular list into two circular lists.
 * 
 * CLASSIFICATION: Linked List
 * 
 * TEST CASES:
 * Case 1: 1...4 → {1,2}, {3,4}
 * 
 * ALGORITHM:
 * Fast/Slow pointer to find middle; break links.
 * 
 * SIMILAR QUESTIONS:
 * 1. Check Circular
 * 2. Circular Insert
 * 3. Remove Loop
 * ============================================================
 */

public class File7_Q8_SplitCircularList {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    /**
     * TODO: Implement this method
     * Split circular list into two circular lists
     * 
     * @param head - head of circular linked list
     * @return - array of two heads [first half, second half]
     */
    public static ListNode[] splitCircular(ListNode head) {
        // YOUR CODE HERE
        
        return new ListNode[2];
    }
    
    // Helper: Create circular list
    private static ListNode createCircular(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        curr.next = head; // Make circular
        return head;
    }
    
    // Helper: Print circular list (limited iterations)
    private static String printCircular(ListNode head, int maxNodes) {
        if (head == null) return "null";
        StringBuilder sb = new StringBuilder();
        ListNode curr = head;
        for (int i = 0; i < maxNodes && curr != null; i++) {
            sb.append(curr.val);
            curr = curr.next;
            if (curr == head) {
                sb.append("→(back to head)");
                break;
            }
            sb.append("→");
        }
        return sb.toString();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q8: Split Circular List ===\n");
        
        ListNode list1 = createCircular(new int[]{1, 2, 3, 4});
        System.out.println("Original (circular): " + printCircular(list1, 5));
        
        ListNode[] result = splitCircular(list1);
        System.out.println("First half: " + printCircular(result[0], 3));
        System.out.println("Second half: " + printCircular(result[1], 3));
        System.out.println("Expected: {1,2}, {3,4}");
    }
}
