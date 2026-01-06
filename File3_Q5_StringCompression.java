import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ============================================================
 * QUESTION: String Compression
 * FILE: 3 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Replace consecutive repeats with character and count
 * (e.g., "aaabb" → "a3b2")
 * 
 * CLASSIFICATION: String / Two-Pointer
 * 
 * TEST CASES:
 * Case 1: "aaabb" → "a3b2"
 * Case 2: "abcd" → "abcd"
 * 
 * ALGORITHM:
 * Iterate and count contiguous characters.
 * 
 * SIMILAR QUESTIONS:
 * 1. Decompress String
 * 2. String Encoding
 * 3. Group Elements
 * ============================================================
 */

public class File3_Q5_StringCompression {
    
    /**
     * TODO: Implement this method
     * Compress the string using run-length encoding
     * 
     * @param s - input string
     * @return - compressed string
     */
    public static String compress(String s) {
        // YOUR CODE HERE
        StringBuilder sb = new StringBuilder();
        
       LinkedHashMap <Character,Integer> map = new LinkedHashMap<>();
     for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        map.merge(c, 1, Integer::sum);

     }

     for(char c: map.keySet()){
        
        sb.append(c);
        if(map.get(c) != 1){
        sb.append(map.get(c)); }
     }

        return sb.toString();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q5: String Compression ===\n");
        
        // Test Case 1
        String test1 = "aaabb";
        String expected1 = "a3b2";
        String result1 = compress(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Compressed: \"" + result1 + "\"");
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Status: " + (result1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - No compression benefit
        String test2 = "abcd";
        String expected2 = "abcd"; // or "a1b1c1d1" depending on requirement
        String result2 = compress(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Compressed: \"" + result2 + "\"");
        System.out.println("Expected: \"" + expected2 + "\" (or shorter)");
        System.out.println("Status: " + (result2.length() <= test2.length() ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        String test3 = "aabbbcccc";
        String expected3 = "a2b3c4";
        String result3 = compress(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Compressed: \"" + result3 + "\"");
        System.out.println("Expected: \"" + expected3 + "\"");
        System.out.println("Status: " + (result3.equals(expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
