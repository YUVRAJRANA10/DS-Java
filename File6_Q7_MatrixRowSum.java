/**
 * ============================================================
 * QUESTION: Matrix Row Sum
 * FILE: 6 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Sum of each row.
 * 
 * CLASSIFICATION: Matrix
 * 
 * TEST CASES:
 * Case 1: [[1,2],[3,4]] → 3, 7
 * 
 * ALGORITHM:
 * Nested loops summing rows.
 * 
 * SIMILAR QUESTIONS:
 * 1. Column Sum
 * 2. Reshape
 * 3. 2D Search
 * ============================================================
 */

import java.util.Arrays;

public class File6_Q7_MatrixRowSum {
    
    /**
     * TODO: Implement this method
     * Calculate sum of each row
     * 
     * @param matrix - 2D matrix
     * @return - array of row sums
     */
    public static int[] rowSums(int[][] matrix) {
        // YOUR CODE HERE
        
        return new int[0];
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q7: Matrix Row Sum ===\n");
        
        // Test Case 1
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[] expected1 = {3, 7};
        int[] result1 = rowSums(matrix1);
        System.out.println("Test 1:");
        for (int[] row : matrix1) System.out.println(Arrays.toString(row));
        System.out.println("Row Sums: " + Arrays.toString(result1));
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Status: " + (Arrays.equals(result1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected2 = {6, 15, 24};
        int[] result2 = rowSums(matrix2);
        System.out.println("Test 2:");
        for (int[] row : matrix2) System.out.println(Arrays.toString(row));
        System.out.println("Row Sums: " + Arrays.toString(result2));
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Status: " + (Arrays.equals(result2, expected2) ? "✓ PASSED" : "✗ FAILED"));
    }
}
