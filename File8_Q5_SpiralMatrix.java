/**
 * ============================================================
 * QUESTION: Matrix Spiral Print
 * FILE: 8 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Print matrix in spiral order (clockwise).
 * 
 * CLASSIFICATION: Matrix
 * 
 * TEST CASES:
 * Case 1: [[1,2],[3,4]] → 1,2,4,3
 * 
 * ALGORITHM:
 * Four boundaries: top, bottom, left, right.
 * 
 * SIMILAR QUESTIONS:
 * 1. Spiral Matrix II (generate)
 * 2. Diagonal Traversal
 * 3. Rotate Matrix
 * ============================================================
 */

import java.util.*;

public class File8_Q5_SpiralMatrix {
    
    /**
     * TODO: Implement this method
     * Return elements in spiral order
     * 
     * @param matrix - 2D matrix
     * @return - list of elements in spiral order
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        // YOUR CODE HERE
        
        return new ArrayList<>();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q5: Spiral Matrix ===\n");
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix 1:");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println("Spiral: " + spiralOrder(matrix1));
        System.out.println("Expected: [1, 2, 3, 6, 9, 8, 7, 4, 5]");
        System.out.println();
        
        int[][] matrix2 = {
            {1, 2},
            {3, 4}
        };
        System.out.println("Matrix 2:");
        System.out.println("1 2");
        System.out.println("3 4");
        System.out.println("Spiral: " + spiralOrder(matrix2));
        System.out.println("Expected: [1, 2, 4, 3]");
    }
}
