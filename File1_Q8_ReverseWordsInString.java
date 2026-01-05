/**
 * ============================================================
 * QUESTION: Reverse Words in String
 * FILE: 1 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Given a sentence, reverse the characters of each individual word
 * but maintain the original sequence of the words.
 * 
 * CLASSIFICATION: String Manipulation
 * 
 * TEST CASES:
 * Case 1: "Hello Coders" → "olleH sredoC"
 * Case 2: "Code Quotient" → "edoC tneitouQ"
 * 
 * ALGORITHM:
 * Split by spaces, reverse each word, and join.
 * 
 * SIMILAR QUESTIONS:
 * 1. Reverse Words in a String II
 * 2. Palindrome Sentence
 * 3. Length of Last Word
 * ============================================================
 */

public class File1_Q8_ReverseWordsInString {
    
    /**
     * TODO: Implement this method
     * Reverse each word in the sentence
     * 
     * @param sentence - input sentence
     * @return - sentence with each word reversed
     */
    public static String reverseEachWord(String sentence) {
        // YOUR CODE HERE
        
        return sentence;
    }
    
    /**
     * Helper: Reverse a single word
     */
    private static String reverseWord(String word) {
        // YOUR CODE HERE
        
        return word;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q8: Reverse Words in String ===\n");
        
        // Test Case 1
        String test1 = "Hello Coders";
        String expected1 = "olleH sredoC";
        String result1 = reverseEachWord(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Result: \"" + result1 + "\"");
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Status: " + (result1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String test2 = "Code Quotient";
        String expected2 = "edoC tneitouQ";
        String result2 = reverseEachWord(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Result: \"" + result2 + "\"");
        System.out.println("Expected: \"" + expected2 + "\"");
        System.out.println("Status: " + (result2.equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        String test3 = "I love Java";
        String expected3 = "I evol avaJ";
        String result3 = reverseEachWord(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Result: \"" + result3 + "\"");
        System.out.println("Expected: \"" + expected3 + "\"");
        System.out.println("Status: " + (result3.equals(expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
