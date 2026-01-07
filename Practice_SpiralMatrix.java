/**
 * ============================================================
 * PRACTICE: Spiral Matrix Problems
 * ============================================================
 */

import java.util.*;

public class Practice_SpiralMatrix {

    // ============================================================
    // 1. PRINT MATRIX IN SPIRAL ORDER
    // ============================================================
    /*
     * ALGORITHM: Use 4 boundaries (top, bottom, left, right)
     * 
     * Direction: → ↓ ← ↑ (repeat)
     * 
     *     left         right
     *       ↓           ↓
     * top → 1  2  3  4  ←
     *       5  6  7  8
     *       9  10 11 12 ← bottom
     * 
     * Step 1: Go RIGHT across top row, then top++
     * Step 2: Go DOWN along right col, then right--
     * Step 3: Go LEFT across bottom row, then bottom--
     * Step 4: Go UP along left col, then left++
     * Repeat until boundaries cross!
     */
    
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) return result;
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            
            // 1. Go RIGHT (along top row)
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;  // Done with top row, move down
            
            // 2. Go DOWN (along right column)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;  // Done with right col, move left
            
            // 3. Go LEFT (along bottom row) - check if rows remaining
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;  // Done with bottom row, move up
            }
            
            // 4. Go UP (along left column) - check if cols remaining
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;  // Done with left col, move right
            }
        }
        
        return result;
    }

    // ============================================================
    // 2. GENERATE SPIRAL MATRIX (Fill 1 to n²)
    // ============================================================
    /*
     * Same logic but FILL instead of READ
     * 
     * Input: n=3
     * Output:
     * 1  2  3
     * 8  9  4
     * 7  6  5
     */
    
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;  // Counter from 1 to n²
        
        while (top <= bottom && left <= right) {
            
            // 1. Fill RIGHT
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            
            // 2. Fill DOWN
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            
            // 3. Fill LEFT
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            
            // 4. Fill UP
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        
        return matrix;
    }

    // ============================================================
    // 3. SPIRAL MATRIX III (Walk from center outward)
    // ============================================================
    /*
     * Start from (rStart, cStart), walk in spiral, return all positions
     * in order visited (even outside the grid, skip those)
     * 
     * Pattern: R1, D1, L2, U2, R3, D3, L4, U4...
     * (steps increase by 1 after every 2 direction changes)
     */
    
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int idx = 0;
        
        // Directions: right, down, left, up
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;  // Start going right
        int steps = 1;
        
        int r = rStart, c = cStart;
        result[idx++] = new int[]{r, c};
        
        while (idx < rows * cols) {
            // Do 2 directions with same step count
            for (int d = 0; d < 2; d++) {
                for (int s = 0; s < steps; s++) {
                    r += dirs[dir][0];
                    c += dirs[dir][1];
                    
                    // Check if inside grid
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[idx++] = new int[]{r, c};
                    }
                }
                dir = (dir + 1) % 4;  // Change direction
            }
            steps++;  // Increase step count after every 2 directions
        }
        
        return result;
    }

    // ============================================================
    // 4. PRINT ANTI-SPIRAL (Reverse spiral)
    // ============================================================
    /*
     * Print in reverse spiral order (outside-in but reversed)
     * Just get spiral order and reverse it!
     */
    
    public static List<Integer> antiSpiralOrder(int[][] matrix) {
        List<Integer> result = spiralOrder(matrix);
        Collections.reverse(result);
        return result;
    }

    // ============================================================
    // TEST CASES
    // ============================================================
    public static void main(String[] args) {
        
        System.out.println("=== 1. PRINT SPIRAL ORDER ===\n");
        
        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        System.out.println("Matrix:");
        printMatrix(matrix1);
        System.out.println("Spiral Order: " + spiralOrder(matrix1));
        System.out.println("Expected: [1,2,3,4,8,12,11,10,9,5,6,7]\n");
        
        // -----
        System.out.println("=== 2. GENERATE SPIRAL MATRIX ===\n");
        
        int[][] generated = generateMatrix(4);
        System.out.println("Generated 4x4 Spiral Matrix:");
        printMatrix(generated);
        System.out.println("Expected:");
        System.out.println("[1,  2,  3,  4]");
        System.out.println("[12, 13, 14, 5]");
        System.out.println("[11, 16, 15, 6]");
        System.out.println("[10, 9,  8,  7]\n");
        
        // -----
        System.out.println("=== 3. ANTI-SPIRAL ORDER ===\n");
        
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix:");
        printMatrix(matrix2);
        System.out.println("Anti-Spiral: " + antiSpiralOrder(matrix2));
        System.out.println("Expected: [5,6,3,2,1,4,7,8,9] (reverse of spiral)\n");
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
