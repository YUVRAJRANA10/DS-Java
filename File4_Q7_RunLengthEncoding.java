/**
 * ============================================================
 * QUESTION: String Compression (Run-Length Encoding)
 * FILE: 4 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Character + Count compression (Run-length encoding).
 * 
 * CLASSIFICATION: String
 * 
 * TEST CASES:
 * Case 1: "aaabb" → "a3b2"
 * 
 * ALGORITHM:
 * Run-length encoding.
 * 
 * SIMILAR QUESTIONS:
 * 1. String Compression II
 * 2. Look-and-Say
 * 3. Edit Distance
 * ============================================================
 */

public class File4_Q7_RunLengthEncoding {
    
    /**
     * TODO: Implement this method
     * Compress string using run-length encoding
     * Always include count even for single characters
     * 
     * @param s - input string
     * @return - compressed string
     */
    public static String encode(String s) {
        // YOUR CODE HERE
        
        return s;
    }
    
    /**
     * TODO: Implement this method
     * Decode a run-length encoded string
     * 
     * @param s - encoded string like "a3b2"
     * @return - decoded string like "aaabb"
     */
    public static String decode(String s) {
        // YOUR CODE HERE
        
        return s;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 4 - Q7: Run-Length Encoding ===\n");
        
        // Test Case 1 - Encode
        String test1 = "aaabb";
        String expected1 = "a3b2";
        String result1 = encode(test1);
        System.out.println("Test 1 (Encode): \"" + test1 + "\"");
        System.out.println("Encoded: \"" + result1 + "\"");
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Status: " + (result1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - Decode
        String test2 = "a3b2c4";
        String expected2 = "aaabbcccc";
        String result2 = decode(test2);
        System.out.println("Test 2 (Decode): \"" + test2 + "\"");
        System.out.println("Decoded: \"" + result2 + "\"");
        System.out.println("Expected: \"" + expected2 + "\"");
        System.out.println("Status: " + (result2.equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Round trip
        String original = "aaabbbccccddddd";
        String encoded = encode(original);
        String decoded = decode(encoded);
        System.out.println("Test 3 (Round Trip): \"" + original + "\"");
        System.out.println("Encoded: \"" + encoded + "\"");
        System.out.println("Decoded: \"" + decoded + "\"");
        System.out.println("Status: " + (original.equals(decoded) ? "✓ PASSED" : "✗ FAILED"));
    }
}
