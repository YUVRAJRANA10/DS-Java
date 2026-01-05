/**
 * ============================================================
 * QUESTION: Heat Wave (Max Temperature)
 * FILE: 4 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Identify trends and max temperature from logs.
 * 
 * CLASSIFICATION: Array Statistics
 * 
 * TEST CASES:
 * Case 1: {30,31,32,33,35,36,37} → 37
 * 
 * ALGORITHM:
 * Single pass traversal.
 * 
 * SIMILAR QUESTIONS:
 * 1. Daily Temperatures
 * 2. Moving Average
 * 3. Buy/Sell Stock I
 * ============================================================
 */

import java.util.Arrays;

public class File4_Q6_HeatWave {
    
    /**
     * TODO: Implement this method
     * Find the maximum temperature
     * 
     * @param temps - array of temperatures
     * @return - maximum temperature
     */
    public static int findMax(int[] temps) {
        // YOUR CODE HERE
        
        return Integer.MIN_VALUE;
    }
    
    /**
     * TODO: Implement this method
     * Check if temperatures are in increasing trend
     * 
     * @param temps - array of temperatures
     * @return - true if always increasing
     */
    public static boolean isIncreasingTrend(int[] temps) {
        // YOUR CODE HERE
        
        return false;
    }
    
    /**
     * TODO: Implement this method
     * Find longest increasing streak of days
     * 
     * @param temps - array of temperatures
     * @return - length of longest increasing streak
     */
    public static int longestIncreasingStreak(int[] temps) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q6: Heat Wave ===\n");
        
        // Test Case 1
        int[] temps1 = {30, 31, 32, 33, 35, 36, 37};
        int expectedMax = 37;
        int resultMax = findMax(temps1);
        System.out.println("Test 1: " + Arrays.toString(temps1));
        System.out.println("Max Temperature: " + resultMax);
        System.out.println("Expected: " + expectedMax);
        System.out.println("Status: " + (resultMax == expectedMax ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - Trend
        boolean trend = isIncreasingTrend(temps1);
        System.out.println("Test 2: Is increasing trend?");
        System.out.println("Result: " + trend);
        System.out.println("Expected: true");
        System.out.println("Status: " + (trend == true ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] temps2 = {30, 32, 31, 33, 35, 34, 40};
        int streak = longestIncreasingStreak(temps2);
        System.out.println("Test 3: " + Arrays.toString(temps2));
        System.out.println("Longest Streak: " + streak);
        System.out.println("Expected: 3 (31→33→35)");
        System.out.println("Status: " + (streak == 3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
