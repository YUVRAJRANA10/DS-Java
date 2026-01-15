/**
 * ============================================================
 * Q4: STRING PALINDROME CHECK
 * ============================================================
 * 
 * PROBLEM:
 * Check whether a given string is a palindrome.
 * A palindrome reads the same forwards and backwards.
 * 
 * EXAMPLES:
 * Input: "radar" → Output: true
 * Input: "hello" → Output: false
 * Input: "A man a plan a canal Panama" → Output: true (ignoring spaces/case)
 * 
 * HINT:
 * - Compare characters from start and end moving inward
 * - Consider ignoring case and non-alphanumeric characters
 * ============================================================
 */

public class Q04_StringPalindrome {
    
    /**
     * TODO: Implement this method (simple version - exact match)
     * @param str - input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // YOUR CODE HERE
        
        return false;
    }
    
    /**
     * TODO: Implement this method (ignoring case and non-alphanumeric)
     * @param str - input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeIgnoreCase(String str) {
        // YOUR CODE HERE
        
        return false;
    }
    
    public static void main(String[] args) {
        String[] testStrings = {
            "radar",
            "hello",
            "madam",
            "racecar",
            "A man a plan a canal Panama",
            "Was it a car or a cat I saw"
        };
        
        System.out.println("=== Palindrome Check ===\n");
        
        System.out.println("--- Simple Check (exact match) ---");
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" → " + isPalindrome(str));
        }
        
        System.out.println("\n--- Ignore Case/Spaces ---");
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" → " + isPalindromeIgnoreCase(str));
        }
        
        /* Expected Output (Simple):
         * "radar" → true
         * "hello" → false
         * "madam" → true
         * "racecar" → true
         * "A man a plan a canal Panama" → false
         * 
         * Expected Output (Ignore Case/Spaces):
         * "A man a plan a canal Panama" → true
         * "Was it a car or a cat I saw" → true
         */
    }
}
