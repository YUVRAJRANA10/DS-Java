/**
 * ============================================================
 * QUESTION: Code Compiler Output (Bracket Matching)
 * FILE: 4 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Match brackets in a code string (including code content).
 * 
 * CLASSIFICATION: Stack
 * 
 * TEST CASES:
 * Case 1: "for(){}" → Balanced
 * 
 * ALGORITHM:
 * Stack-based matching (ignore non-bracket characters).
 * 
 * SIMILAR QUESTIONS:
 * 1. Min Brackets to Remove
 * 2. Redundant Parentheses
 * 3. Score of Parentheses
 * ============================================================
 */

import java.util.*;

public class File4_Q3_CodeCompilerBrackets {
    
    /**
     * TODO: Implement this method
     * Check if brackets in code are balanced
     * (Only consider (), {}, [] - ignore other characters)
     * 
     * @param code - code string
     * @return - true if brackets are balanced
     */
    public static boolean isCodeBalanced(String code) {
        // YOUR CODE HERE
        
        return false;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q3: Code Compiler Brackets ===\n");
        
        // Test Case 1
        String test1 = "for(){}";
        boolean expected1 = true;
        boolean result1 = isCodeBalanced(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Balanced: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String test2 = "if(a[i] > 0) { return true; }";
        boolean expected2 = true;
        boolean result2 = isCodeBalanced(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Balanced: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Unbalanced
        String test3 = "while(true { }";
        boolean expected3 = false;
        boolean result3 = isCodeBalanced(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Balanced: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
