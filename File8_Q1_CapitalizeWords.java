/**
 * ============================================================
 * QUESTION: Capitalize First Letter
 * FILE: 8 | QUESTION: 1
 * ============================================================
 * 
 * STATEMENT:
 * Convert first character of each word to uppercase.
 * 
 * CLASSIFICATION: String
 * 
 * TEST CASES:
 * Case 1: "hello world" → "Hello World"
 * 
 * ALGORITHM:
 * Split, capitalize each word, join.
 * 
 * SIMILAR QUESTIONS:
 * 1. To Title Case
 * 2. Detect Capital
 * 3. Sentence Case
 * ============================================================
 */

public class File8_Q1_CapitalizeWords {
    
    /**
     * TODO: Implement this method
     * Capitalize first letter of each word
     * 
     * @param s - input string
     * @return - title case string
     */
    public static String capitalizeWords(String s) {
        // YOUR CODE HERE
        
        return "";
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q1: Capitalize Words ===\n");
        
        String test1 = "hello world";
        String expected1 = "Hello World";
        String result1 = capitalizeWords(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Result: \"" + result1 + "\"");
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Status: " + (expected1.equals(result1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        String test2 = "the quick brown fox";
        String expected2 = "The Quick Brown Fox";
        String result2 = capitalizeWords(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Result: \"" + result2 + "\"");
        System.out.println("Expected: \"" + expected2 + "\"");
        System.out.println("Status: " + (expected2.equals(result2) ? "✓ PASSED" : "✗ FAILED"));
    }
}
