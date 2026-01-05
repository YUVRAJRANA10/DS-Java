/**
 * ============================================================
 * QUESTION: Matrix Diagonals Sum
 * FILE: 1 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * For a square matrix, calculate the sum of elements on the primary
 * diagonal and the secondary diagonal.
 * 
 * CLASSIFICATION: Matrix / 2D Array
 * 
 * TEST CASES:
 * Case 1: 3×3 [[1,2,3],[4,5,6],[7,8,9]] → Main: 15, Secondary: 15
 * Case 2: 2×2 [[1,2],[3,4]] → Main: 5, Secondary: 5
 * 
 * ALGORITHM:
 * Sum A[i][i] and A[i][N-1-i] for i=0 to N-1
 * 
 * SIMILAR QUESTIONS:
 * 1. Transpose Matrix
 * 2. Matrix Symmetry
 * 3. Rotate Matrix 90 Degrees
 * ============================================================
 */

import java.util.Arrays;

public class File1_Q9_MatrixDiagonalsSum {
    
    /**
     * TODO: Implement this method
     * Calculate sum of primary diagonal (top-left to bottom-right)
     * 
     * @param matrix - square matrix
     * @return - sum of primary diagonal
     */
    public static int primaryDiagonalSum(int[][] matrix) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Implement this method
     * Calculate sum of secondary diagonal (top-right to bottom-left)
     * 
     * @param matrix - square matrix
     * @return - sum of secondary diagonal
     */
    public static int secondaryDiagonalSum(int[][] matrix) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Implement this method
     * Calculate total diagonal sum (avoid counting center twice for odd N)
     * 
     * @param matrix - square matrix
     * @return - total diagonal sum
     */
    public static int totalDiagonalSum(int[][] matrix) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q9: Matrix Diagonals Sum ===\n");
        
        // Test Case 1
        int[][] test1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Test 1: 3x3 Matrix");
        printMatrix(test1);
        int primary1 = primaryDiagonalSum(test1);
        int secondary1 = secondaryDiagonalSum(test1);
        System.out.println("Primary Diagonal Sum: " + primary1 + " (Expected: 15)");
        System.out.println("Secondary Diagonal Sum: " + secondary1 + " (Expected: 15)");
        System.out.println("Status: " + (primary1 == 15 && secondary1 == 15 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[][] test2 = {
            {1, 2},
            {3, 4}
        };
        System.out.println("Test 2: 2x2 Matrix");
        printMatrix(test2);
        int primary2 = primaryDiagonalSum(test2);
        int secondary2 = secondaryDiagonalSum(test2);
        System.out.println("Primary Diagonal Sum: " + primary2 + " (Expected: 5)");
        System.out.println("Secondary Diagonal Sum: " + secondary2 + " (Expected: 5)");
        System.out.println("Status: " + (primary2 == 5 && secondary2 == 5 ? "✓ PASSED" : "✗ FAILED"));
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
