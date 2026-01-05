/**
 * ============================================================
 * QUESTION: Baseball Game Scoring
 * FILE: 4 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Calculate score using 'C', 'D', '+' rules:
 * - Integer: Record a new score
 * - 'C': Invalidate previous score (remove it)
 * - 'D': Double the previous score and record it
 * - '+': Sum of previous two scores and record it
 * 
 * CLASSIFICATION: Stack
 * 
 * TEST CASES:
 * Case 1: ["5","2","C","D","+"] → 30
 * 
 * ALGORITHM:
 * Push scores; pop for 'C', peek for 'D' and '+'.
 * 
 * SIMILAR QUESTIONS:
 * 1. Evaluate RPN
 * 2. Backspace String
 * 3. Simplify Path
 * ============================================================
 */

import java.util.*;

public class File4_Q9_BaseballGame {
    
    /**
     * TODO: Implement this method
     * Calculate total score based on operations
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
        System.out.println("=== File 4 - Q9: Baseball Game Scoring ===\n");
        
        // Test Case 1
        String[] ops1 = {"5", "2", "C", "D", "+"};
        // 5 -> [5], score=5
        // 2 -> [5,2], score=7
        // C -> [5] (remove 2), score=5
        // D -> [5,10] (double 5), score=15
        // + -> [5,10,15] (5+10=15), score=30
        int expected1 = 30;
        int result1 = calPoints(ops1);
        System.out.println("Test 1: " + Arrays.toString(ops1));
        System.out.println("Score: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        // 5 -> [5]
        // -2 -> [5,-2]
        // 4 -> [5,-2,4]
        // C -> [5,-2]
        // D -> [5,-2,-4]
        // 9 -> [5,-2,-4,9]
        // + -> [5,-2,-4,9,5] (9+(-4))
        // + -> [5,-2,-4,9,5,14] (5+9)
        int expected2 = 27;
        int result2 = calPoints(ops2);
        System.out.println("Test 2: " + Arrays.toString(ops2));
        System.out.println("Score: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        String[] ops3 = {"1"};
        int expected3 = 1;
        int result3 = calPoints(ops3);
        System.out.println("Test 3: " + Arrays.toString(ops3));
        System.out.println("Score: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
