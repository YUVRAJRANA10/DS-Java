/**
 * ============================================================
 * QUESTION: Validate String (Alphanumeric Check)
 * FILE: 8 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * Check if string contains only letters and digits.
 * 
 * CLASSIFICATION: String
 * 
 * TEST CASES:
 * Case 1: "abc123" → true
 * Case 2: "abc@123" → false
 * 
 * ALGORITHM:
 * Iterate; check Character.isLetterOrDigit().
 * 
 * SIMILAR QUESTIONS:
 * 1. Valid Palindrome
 * 2. Valid IP Address
 * 3. Valid Number
 * ============================================================
 */

public class File8_Q2_ValidateAlphanumeric {
    
    /**
     * TODO: Implement this method
     * Check if string is alphanumeric (only letters and digits)
     * 
     * @param s - input string
     * @return - true if alphanumeric only
     */
    public static boolean isAlphanumeric(String s) {
        // YOUR CODE HERE
        
        return false;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q2: Validate Alphanumeric ===\n");
        
        String test1 = "abc123";
        boolean expected1 = true;
        boolean result1 = isAlphanumeric(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Result: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        String test2 = "abc@123";
        boolean expected2 = false;
        boolean result2 = isAlphanumeric(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Result: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        String test3 = "HelloWorld2024";
        boolean expected3 = true;
        boolean result3 = isAlphanumeric(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Result: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
