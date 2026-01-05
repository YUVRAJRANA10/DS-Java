/**
 * ============================================================
 * QUESTION: Baseball Game Scoring (File 6 Version)
 * FILE: 6 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Score tracker (identical to File 4, Q9).
 * 
 * CLASSIFICATION: Stack
 * 
 * SIMILAR QUESTIONS:
 * 1. RPN
 * 2. Stack Calc
 * 3. Backspace Compare
 * ============================================================
 */

import java.util.*;

public class File6_Q9_BaseballGameV2 {
    
    /**
     * TODO: Implement this method
     * Calculate total score
     * 
     * Rules:
     * - Integer: Record new score
     * - "+": Sum of last two scores
     * - "D": Double the last score
     * - "C": Remove last score
     * 
     * @param ops - array of operations
     * @return - total score
     */
    public static int calPoints(String[] ops) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q9: Baseball Game V2 ===\n");
        
        String[] ops1 = {"5", "2", "C", "D", "+"};
        int expected1 = 30;
        int result1 = calPoints(ops1);
        System.out.println("Test 1: " + Arrays.toString(ops1));
        System.out.println("Score: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
    }
}
