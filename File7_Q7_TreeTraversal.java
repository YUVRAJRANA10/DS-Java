/**
 * ============================================================
 * QUESTION: Binary Tree Traversal
 * FILE: 7 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Preorder and Postorder output.
 * 
 * CLASSIFICATION: Tree
 * 
 * TEST CASES:
 * Case 1: Pre: 1-2-3, Post: 2-3-1
 * 
 * ALGORITHM:
 * DFS recursion.
 * 
 * SIMILAR QUESTIONS:
 * 1. Level Order (BFS)
 * 2. Zigzag
 * 3. Construct from Pre/Inorder
 * ============================================================
 */

import java.util.*;

public class File7_Q7_TreeTraversal {
    
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    
    /**
     * TODO: Implement Preorder (Root, Left, Right)
     */
    public static List<Integer> preorder(TreeNode root) {
        // YOUR CODE HERE
        
        return new ArrayList<>();
    }
    
    /**
     * TODO: Implement Postorder (Left, Right, Root)
     */
    public static List<Integer> postorder(TreeNode root) {
        // YOUR CODE HERE
        
        return new ArrayList<>();
    }
    
    /**
     * TODO: Implement Inorder (Left, Root, Right)
     */
    public static List<Integer> inorder(TreeNode root) {
        // YOUR CODE HERE
        
        return new ArrayList<>();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q7: Binary Tree Traversal ===\n");
        
        //       1
        //      / \
        //     2   3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        System.out.println("Tree:    1");
        System.out.println("        / \\");
        System.out.println("       2   3");
        System.out.println();
        
        System.out.println("Preorder: " + preorder(root));
        System.out.println("Expected: [1, 2, 3]");
        System.out.println();
        
        System.out.println("Inorder: " + inorder(root));
        System.out.println("Expected: [2, 1, 3]");
        System.out.println();
        
        System.out.println("Postorder: " + postorder(root));
        System.out.println("Expected: [2, 3, 1]");
    }
}
