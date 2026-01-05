/**
 * ============================================================
 * QUESTION: Valid Parentheses
 * FILE: 6 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Standard bracket matching.
 * 
 * CLASSIFICATION: Stack
 * 
 * SIMILAR QUESTIONS:
 * 1. Remove Outermost
 * 2. Nesting Depth
 * 3. Substitution Check
 * ============================================================
 */

import java.util.*;

public class File6_Q8_ValidParentheses {
    
    /**
     * TODO: Implement this method
     * Check if parentheses are valid
     * 
     * @param s - string containing only (){}[]
     * @return - true if valid
     */
    public static boolean isValid(String s) {
        // YOUR CODE HERE
        
        return false;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q8: Valid Parentheses ===\n");
        
        String[] tests = {"()", "()[]{}", "(]", "([)]", "{[]}"};
        boolean[] expected = {true, true, false, false, true};
        
        for (int i = 0; i < tests.length; i++) {
            boolean result = isValid(tests[i]);
            System.out.println("Test " + (i+1) + ": \"" + tests[i] + "\"");
            System.out.println("Valid: " + result + " (Expected: " + expected[i] + ")");
            System.out.println("Status: " + (result == expected[i] ? "✓ PASSED" : "✗ FAILED"));
            System.out.println();
        }
    }
}
