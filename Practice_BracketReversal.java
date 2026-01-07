/**
 * ============================================================
 * PRACTICE: Minimum Bracket Reversals to Balance
 * ============================================================
 * 
 * QUESTION:
 * Given a string with only '{' and '}', find minimum reversals
 * needed to make it balanced.
 * 
 * EXAMPLES:
 * "}}{{"  → 2 reversals  (reverse first } and last {)
 * "{{{}"  → 1 reversal   (reverse one { to })
 * "}}}}"  → Not possible (odd length)
 * 
 * RULE: If length is odd, return -1 (impossible to balance)
 */

import java.util.*;

public class Practice_BracketReversal {

    /*
     * ALGORITHM:
     * 
     * Step 1: Remove all balanced pairs using stack
     *         "}}{{" → after removing balanced: "}}{{"
     *         "{}}{" → after removing balanced: "}{"
     * 
     * Step 2: Count remaining unmatched brackets
     *         open = count of '{'
     *         close = count of '}'
     * 
     * Step 3: Calculate reversals needed
     *         - Each pair of '{{' needs 1 reversal → open/2
     *         - Each pair of '}}' needs 1 reversal → close/2
     *         - If one '{' and one '}' remain (like "}{"), need 2 reversals
     * 
     * Formula: (open + 1)/2 + (close + 1)/2
     *          OR: ceil(open/2) + ceil(close/2)
     */
    
    public static int minReversals(String s) {
        // Step 0: Odd length is impossible
        if (s.length() % 2 != 0) {
            return -1;
        }
        
        // Step 1: Remove balanced pairs using stack
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push(c);
            } else {
                // c == '}'
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();  // Balanced pair found, remove
                } else {
                    stack.push(c);  // Unmatched '}'
                }
            }
        }
        
        // Step 2: Count unmatched brackets
        int open = 0;   // Count of '{'
        int close = 0;  // Count of '}'
        
        while (!stack.isEmpty()) {
            if (stack.pop() == '{') {
                open++;
            } else {
                close++;
            }
        }
        
        // Step 3: Calculate reversals
        // open/2 (pairs of {{) + close/2 (pairs of }})
        // Use ceiling division: (n + 1) / 2
        return (open + 1) / 2 + (close + 1) / 2;
    }
    
    /*
     * WHY THIS FORMULA WORKS?
     * 
     * After removing balanced pairs, we have only:
     * - '}}}}...{{{{' pattern (close brackets first, then open)
     * 
     * Example 1: "}}{{"  (close=2, open=2)
     *   "}}" → need 1 reversal to make "{}" → close/2 = 1
     *   "{{" → need 1 reversal to make "{}" → open/2 = 1
     *   Total: 2 ✓
     * 
     * Example 2: "}{" (close=1, open=1)
     *   Need to reverse BOTH → 2 reversals
     *   (1+1)/2 + (1+1)/2 = 1 + 1 = 2 ✓
     * 
     * Example 3: "}}}{{{" (close=3, open=3)
     *   "}}}" → 2 reversals (one pair + one left)
     *   "{{{" → 2 reversals (one pair + one left)
     *   (3+1)/2 + (3+1)/2 = 2 + 2 = 4 ✓
     */

    // ============================================================
    // SIMPLER VERSION (without stack) - For only { and }
    // ============================================================
    
    public static int minReversalsSimple(String s) {
        if (s.length() % 2 != 0) return -1;
        
        int open = 0;  // Unmatched '{'
        int close = 0; // Unmatched '}'
        
        for (char c : s.toCharArray()) {
            if (c == '{') {
                open++;
            } else {
                // c == '}'
                if (open > 0) {
                    open--;  // Match with a '{'
                } else {
                    close++; // Unmatched '}'
                }
            }
        }
        
        // Formula: ceil(open/2) + ceil(close/2)
        return (open + 1) / 2 + (close + 1) / 2;
    }

    // ============================================================
    // TEST CASES
    // ============================================================
    public static void main(String[] args) {
        System.out.println("=== Minimum Bracket Reversals ===\n");
        
        String[] tests = {"}{", "}{}{", "}}{{"  , "{{{{", "}}}}", "{{}}", "}{{{}"};
        int[] expected = {  2,     2,      2,       2,       2,      0,      -1};
        
        for (int i = 0; i < tests.length; i++) {
            int result = minReversals(tests[i]);
            System.out.println("Input: \"" + tests[i] + "\"");
            System.out.println("Reversals needed: " + result);
            System.out.println("Expected: " + expected[i]);
            System.out.println("Status: " + (result == expected[i] ? "✓ PASSED" : "✗ FAILED"));
            System.out.println();
        }
        
        // Trace through example
        System.out.println("=== TRACE: \"}}{{\": ===");
        System.out.println("Original: }}{{");
        System.out.println("After removing balanced: }}{{ (nothing balanced)");
        System.out.println("Unmatched: close=2, open=2");
        System.out.println("Reversals: (2+1)/2 + (2+1)/2 = 1 + 1 = 2");
        System.out.println();
        
        System.out.println("=== TRACE: \"}{{{}\": ===");
        System.out.println("Original: }{{{}");
        System.out.println("Length = 5 (odd) → Impossible! Return -1");
    }
}
