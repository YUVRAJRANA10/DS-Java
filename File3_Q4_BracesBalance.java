/**
 * ============================================================
 * QUESTION: Code Braces Balance
 * FILE: 3 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Check if brackets in code are correctly nested.
 * 
 * CLASSIFICATION: Stack
 * 
 * TEST CASES:
 * Case 1: "{[()]}" → Balanced
 * Case 2: "{[(])}" → Not Balanced
 * 
 * ALGORITHM:
 * Push open brackets; pop and check on closing brackets.
 * 
 * SIMILAR QUESTIONS:
 * 1. Longest Valid Parentheses
 * 2. Generate Parentheses
 * 3. Min Add to Make Valid
 * ============================================================
 */

import java.util.*;

public class File3_Q4_BracesBalance {
    
    /**
     * TODO: Implement this method
     * Check if the brackets are balanced
     * 
     * @param s - string containing brackets
     * @return - true if balanced, false otherwise
     */
    public static boolean isBalanced(String s) {
        // YOUR CODE HERE
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '(' ){
                  st.push(c);
            }
            else{
                char compareopen = st.pop();
                if(compareopen == '{' && c == '}'){
                   continue;
                }
                else if(compareopen == '[' && c == ']'){
                   continue;
                }
                else if(compareopen == '(' && c == ')'){
                   continue;
                }
                else{
                    return false;
                }
                
             
            }
        }
        return true;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q4: Code Braces Balance ===\n");
        
        // Test Case 1
        String test1 = "{[()]}";
        boolean expected1 = true;
        boolean result1 = isBalanced(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Balanced: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String test2 = "{[(])}";
        boolean expected2 = false;
        boolean result2 = isBalanced(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Balanced: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        String test3 = "((()))";
        boolean expected3 = true;
        boolean result3 = isBalanced(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Balanced: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 4
        String test4 = "([)]";
        boolean expected4 = false;
        boolean result4 = isBalanced(test4);
        System.out.println("Test 4: \"" + test4 + "\"");
        System.out.println("Balanced: " + result4);
        System.out.println("Expected: " + expected4);
        System.out.println("Status: " + (result4 == expected4 ? "✓ PASSED" : "✗ FAILED"));
    }
}
