/**
 * ============================================================
 * QUESTION: Matrix Multiplication
 * FILE: 5 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Standard A × B multiplication.
 * 
 * CLASSIFICATION: Matrix
 * 
 * TEST CASES:
 * Case 1: 2×2, 2×2 → 2×2
 * 
 * ALGORITHM:
 * Triple nested loop O(N³)
 * C[i][j] = Σ A[i][k] * B[k][j]
 * 
 * SIMILAR QUESTIONS:
 * 1. Matrix Exponentiation
 * 2. Sparse Matrix
 * 3. Strassen's Algorithm
 * ============================================================
 */

import java.util.Arrays;

public class File5_Q3_MatrixMultiplication {
    
    /**
     * TODO: Implement this method
     * Multiply two matrices A and B
     * 
     * @param A - first matrix (m x n)
     * @param B - second matrix (n x p)
     * @return - result matrix (m x p)
     */
    public static int[][] multiply(int[][] A, int[][] B) {
        // YOUR CODE HERE
        
        return new int[0][0];
    }
    
    // Helper: Print matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q3: Matrix Multiplication ===\n");
        
        // Test Case 1
        int[][] A1 = {{1, 2}, {3, 4}};
        int[][] B1 = {{5, 6}, {7, 8}};
        int[][] expected1 = {{19, 22}, {43, 50}};
        
        System.out.println("Test 1:");
        System.out.println("Matrix A:");
        printMatrix(A1);
        System.out.println("Matrix B:");
        printMatrix(B1);
        
        int[][] result1 = multiply(A1, B1);
        System.out.println("A × B:");
        printMatrix(result1);
        System.out.println("Expected:");
        printMatrix(expected1);
        System.out.println("Status: " + (Arrays.deepEquals(result1, expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - Non-square
        int[][] A2 = {{1, 2, 3}, {4, 5, 6}};  // 2x3
        int[][] B2 = {{7, 8}, {9, 10}, {11, 12}};  // 3x2
        int[][] expected2 = {{58, 64}, {139, 154}};  // 2x2
        
        System.out.println("Test 2 (Non-square):");
        System.out.println("A (2x3) × B (3x2):");
        int[][] result2 = multiply(A2, B2);
        printMatrix(result2);
        System.out.println("Expected:");
        printMatrix(expected2);
        System.out.println("Status: " + (Arrays.deepEquals(result2, expected2) ? "✓ PASSED" : "✗ FAILED"));
    }
}
