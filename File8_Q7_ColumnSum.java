/**
 * ============================================================
 * QUESTION: Column-wise Sum
 * FILE: 8 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Sum of each column in a matrix.
 * 
 * CLASSIFICATION: Matrix
 * 
 * TEST CASES:
 * Case 1: [[1,2],[3,4]] → [4, 6]
 * 
 * ALGORITHM:
 * Iterate column-first.
 * 
 * SIMILAR QUESTIONS:
 * 1. Row-wise Sum
 * 2. Diagonal Sum
 * 3. Max in Column
 * ============================================================
 */

import java.util.Arrays;

public class File8_Q7_ColumnSum {
    
    /**
     * TODO: Implement this method
     * Calculate sum of each column
     * 
     * @param matrix - 2D matrix
     * @return - array of column sums
     */
    public static int[] columnSum(int[][] matrix) {
        // YOUR CODE HERE
        
        return new int[0];
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q7: Column Sum ===\n");
        
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        System.out.println("Matrix 1:");
        System.out.println("1 2");
        System.out.println("3 4");
        System.out.println("Column Sums: " + Arrays.toString(columnSum(matrix1)));
        System.out.println("Expected: [4, 6]");
        System.out.println();
        
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix 2:");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println("Column Sums: " + Arrays.toString(columnSum(matrix2)));
        System.out.println("Expected: [12, 15, 18]");
    }
}
