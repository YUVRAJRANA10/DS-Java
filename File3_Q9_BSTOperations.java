/**
 * ============================================================
 * QUESTION: Binary Search Tree Operations
 * FILE: 3 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Insert values into BST and perform Inorder traversal.
 * 
 * CLASSIFICATION: Tree
 * 
 * TEST CASES:
 * Case 1: {5,3,7} → Inorder: 3,5,7
 * Case 2: {10,5,1} → Inorder: 1,5,10
 * 
 * ALGORITHM:
 * Recursive insertion and DFS traversal.
 * 
 * SIMILAR QUESTIONS:
 * 1. Validate BST
 * 2. LCA in BST
 * 3. K-th Smallest in BST
 * ============================================================
 */

import java.util.*;

public class File3_Q9_BSTOperations {
    
    static class TreeNode {
        int val;
        TreeNode left, right;
        
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    /**
     * TODO: Implement this method
     * Insert a value into BST
     * 
     * @param root - root of BST
     * @param val - value to insert
     * @return - root of BST
     */
    public static TreeNode insert(TreeNode root, int val) {
        // YOUR CODE HERE
        
        return root;
    }
    
    /**
     * TODO: Implement this method
     * Perform inorder traversal
     * 
     * @param root - root of BST
     * @return - list of values in inorder
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        // YOUR CODE HERE
        
        return new ArrayList<>();
    }
    
    /**
     * TODO: Implement this method
     * Search for a value in BST
     * 
     * @param root - root of BST
     * @param val - value to search
     * @return - true if found
     */
    public static boolean search(TreeNode root, int val) {
        // YOUR CODE HERE
        
        return false;
    }
    
    // Helper: Build BST from array
    private static TreeNode buildBST(int[] values) {
        TreeNode root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        return root;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q9: BST Operations ===\n");
        
        // Test Case 1
        int[] values1 = {5, 3, 7};
        TreeNode root1 = buildBST(values1);
        List<Integer> inorder1 = inorderTraversal(root1);
        List<Integer> expected1 = Arrays.asList(3, 5, 7);
        System.out.println("Test 1: Insert " + Arrays.toString(values1));
        System.out.println("Inorder: " + inorder1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (inorder1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] values2 = {10, 5, 1};
        TreeNode root2 = buildBST(values2);
        List<Integer> inorder2 = inorderTraversal(root2);
        List<Integer> expected2 = Arrays.asList(1, 5, 10);
        System.out.println("Test 2: Insert " + Arrays.toString(values2));
        System.out.println("Inorder: " + inorder2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (inorder2.equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Search
        System.out.println("Test 3: Search for 5 in BST");
        boolean found = search(root2, 5);
        System.out.println("Found: " + found + " (Expected: true)");
        System.out.println("Status: " + (found ? "✓ PASSED" : "✗ FAILED"));
    }
}
