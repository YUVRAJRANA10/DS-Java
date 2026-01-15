/**
 * ============================================================
 * Q1: UPPERCASE OR LOWERCASE CHECK
 * ============================================================
 * 
 * PROBLEM:
 * Write a program to check whether an input character is 
 * uppercase or lowercase.
 * 
 * EXAMPLES:
 * Input: 'A' → Output: "Uppercase"
 * Input: 'z' → Output: "Lowercase"
 * Input: '5' → Output: "Not a letter"
 * 
 * HINT:
 * - Uppercase: 'A' to 'Z' (ASCII 65-90)
 * - Lowercase: 'a' to 'z' (ASCII 97-122)
 * ============================================================
 */

public class Q01_UppercaseLowercaseCheck {
    
    /**
     * TODO: Implement this method
     * @param ch - input character
     * @return "Uppercase", "Lowercase", or "Not a letter"
     */
    public static String checkCase(char ch) {
        // YOUR CODE HERE
        
        return "";
    }
    
    public static void main(String[] args) {
        // Test cases
        char[] testChars = {'A', 'z', 'M', 'p', '5', '@', 'Z', 'a'};
        
        System.out.println("=== Uppercase/Lowercase Check ===\n");
        
        for (char ch : testChars) {
            System.out.println("'" + ch + "' → " + checkCase(ch));
        }
        
        /* Expected Output:
         * 'A' → Uppercase
         * 'z' → Lowercase
         * 'M' → Uppercase
         * 'p' → Lowercase
         * '5' → Not a letter
         * '@' → Not a letter
         * 'Z' → Uppercase
         * 'a' → Lowercase
         */
    }
}
