/**
 * ============================================================
 * QUESTION: collectData() - Height Report
 * FILE: 6 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Generate height report from array.
 * 
 * CLASSIFICATION: Array Processing
 * 
 * SIMILAR QUESTIONS:
 * 1. Height Checker
 * 2. Min Absolute Difference
 * 3. Max Gap
 * ============================================================
 */

import java.util.Arrays;

public class File6_Q6_HeightReport {
    
    /**
     * TODO: Implement this method
     * Generate statistics from height data
     * 
     * @param heights - array of heights
     * @return - array with [min, max, average]
     */
    public static double[] generateReport(int[] heights) {
        // YOUR CODE HERE
        
        return new double[3];
    }
    
    /**
     * TODO: Implement this method
     * Count how many heights are out of order
     * 
     * @param heights - array of heights
     * @return - count of heights not in sorted position
     */
    public static int heightChecker(int[] heights) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q6: Height Report ===\n");
        
        // Test Case 1
        int[] heights1 = {165, 170, 155, 180, 160};
        double[] report1 = generateReport(heights1);
        System.out.println("Test 1: " + Arrays.toString(heights1));
        System.out.println("Min: " + report1[0] + ", Max: " + report1[1] + ", Avg: " + report1[2]);
        System.out.println("Expected: Min=155, Max=180, Avg=166");
        System.out.println();
        
        // Test Case 2 - Height checker
        int[] heights2 = {1, 1, 4, 2, 1, 3};
        int outOfOrder = heightChecker(heights2);
        System.out.println("Test 2 (Height Checker): " + Arrays.toString(heights2));
        System.out.println("Out of order: " + outOfOrder);
        System.out.println("Expected: 3");
    }
}
