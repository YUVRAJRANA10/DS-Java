/**
 * ============================================================
 * QUESTION: Anti Hacking Attempt (Palindrome Check)
 * FILE: 6 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * Check if string is palindrome.
 * 
 * CLASSIFICATION: String
 * 
 * TEST CASES:
 * Case 1: "racecar" → YES
 * 
 * ALGORITHM:
 * Two-pointer comparison.
 * 
 * SIMILAR QUESTIONS:
 * 1. Valid Palindrome II
 * 2. Longest Palindromic Substring
 * 3. Palindrome Number
 * ============================================================
 */

public class File6_Q1_PalindromeCheck {
    
    /**
     * TODO: Implement this method
     * Check if string is a palindrome
     * 
     * @param s - input string
     * @return - true if palindrome
     */
    public static boolean isPalindrome(String s) {
        // YOUR CODE HERE
        
        return false;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q1: Palindrome Check ===\n");
        
        String[] tests = {"racecar", "hello", "madam", "level", "world"};
        boolean[] expected = {true, false, true, true, false};
        
        for (int i = 0; i < tests.length; i++) {
            boolean result = isPalindrome(tests[i]);
            System.out.println("Test " + (i+1) + ": \"" + tests[i] + "\"");
            System.out.println("Is Palindrome: " + result);
            System.out.println("Expected: " + expected[i]);
            System.out.println("Status: " + (result == expected[i] ? "✓ PASSED" : "✗ FAILED"));
            System.out.println();
        }
    }
}
