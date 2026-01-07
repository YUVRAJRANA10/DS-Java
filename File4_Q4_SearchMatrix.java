/**
 * ============================================================
 * QUESTION: Search in Matrix
 * FILE: 4 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Search for target in a row-sorted matrix.
 * 
 * CLASSIFICATION: Matrix Binary Search
 * 
 * TEST CASES:
 * Case 1: Target=3 → Found
 * 
 * ALGORITHM:
 * Step-wise search from top-right corner.
 * 
 * SIMILAR QUESTIONS:
 * 1. Search Matrix II
 * 2. Row with Max 1s
 * 3. Matrix Median
 * ============================================================
 */

import java.util.Arrays;

public class File4_Q4_SearchMatrix {
    
    /**
     * TODO: Implement this method
     * Search for target in row-sorted matrix
     * Each row is sorted, but not column-wise sorted
     * 
     * @param matrix - 2D matrix
     * @param target - value to find
     * @return - true if found
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        // YOUR CODE HERE
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * TODO: Implement this method
     * Search in row and column sorted matrix
     * (Staircase search from top-right)
     * 
     * @param matrix - row and column sorted matrix
     * @param target - value to find
     * @return - [row, col] if found, [-1, -1] otherwise
     */
    public static int[] searchMatrixPosition(int[][] matrix, int target) {
        // YOUR CODE HERE
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q4: Search in Matrix ===\n");
        
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        
        // Test Case 1
        int target1 = 5;
        boolean result1 = searchMatrix(matrix, target1);
        System.out.println("Test 1: Search for " + target1);
        System.out.println("Found: " + result1);
        System.out.println("Expected: true");
        System.out.println("Status: " + (result1 == true ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int target2 = 20;
        boolean result2 = searchMatrix(matrix, target2);
        System.out.println("Test 2: Search for " + target2);
        System.out.println("Found: " + result2);
        System.out.println("Expected: false");
        System.out.println("Status: " + (result2 == false ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Position
        int target3 = 9;
        int[] pos = searchMatrixPosition(matrix, target3);
        System.out.println("Test 3: Find position of " + target3);
        System.out.println("Position: " + Arrays.toString(pos));
        System.out.println("Expected: [2, 2]");
        System.out.println("Status: " + (pos[0] == 2 && pos[1] == 2 ? "✓ PASSED" : "✗ FAILED"));
    }
}
