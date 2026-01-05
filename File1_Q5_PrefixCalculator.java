/**
 * ============================================================
 * QUESTION: Action-First Calculator (Prefix Notation)
 * FILE: 1 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Evaluate mathematical expressions where the operator appears before
 * the operands (Prefix notation).
 * 
 * CLASSIFICATION: Stack / Expression Evaluation
 * 
 * TEST CASES:
 * Case 1: "* 3 4" → 12
 * Case 2: "+ 10 20" → 30
 * 
 * ALGORITHM:
 * Iterate from right to left. Push operands to stack. For operators,
 * pop two values, calculate, and push back.
 * 
 * SIMILAR QUESTIONS:
 * 1. Evaluate Postfix Expression
 * 2. Infix to Postfix Conversion
 * 3. Expression Tree Construction
 * ============================================================
 */

import java.util.*;

public class File1_Q5_PrefixCalculator {
    
    /**
     * TODO: Implement this method
     * Evaluate a prefix expression
     * 
     * @param expression - prefix expression like "* 3 4"
     * @return - result of evaluation
     */
    public static int evaluatePrefix(String expression) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q5: Prefix Calculator ===\n");
        
        // Test Case 1
        String test1 = "* 3 4";
        int expected1 = 12;
        int result1 = evaluatePrefix(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Result: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String test2 = "+ 10 20";
        int expected2 = 30;
        int result2 = evaluatePrefix(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Result: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 (Complex)
        String test3 = "- + 10 20 5";  // (10 + 20) - 5 = 25
        int expected3 = 25;
        int result3 = evaluatePrefix(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Result: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
