/**
 * ============================================================
 * QUESTION: Heena Counting Characters
 * FILE: 5 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Total frequency of alphabets in mixed string.
 * 
 * CLASSIFICATION: Hashing
 * 
 * TEST CASES:
 * Case 1: "aabcccc" → a:2, b:1, c:4
 * 
 * ALGORITHM:
 * Use 26-size frequency array.
 * 
 * SIMILAR QUESTIONS:
 * 1. First Non-Repeating
 * 2. String Frequency Map
 * 3. Anagram Check
 * ============================================================
 */

import java.util.*;

public class File5_Q7_CountingCharacters {
    
    /**
     * TODO: Implement this method
     * Count frequency of each character
     * 
     * @param s - input string
     * @return - map of character to frequency
     */
    public static Map<Character, Integer> countCharacters(String s) {
        // YOUR CODE HERE
        
        return new HashMap<>();
    }
    
    /**
     * TODO: Implement this method
     * Count frequency using array (only lowercase letters)
     * 
     * @param s - input string (lowercase only)
     * @return - frequency array of size 26
     */
    public static int[] countCharactersArray(String s) {
        // YOUR CODE HERE
        
        return new int[26];
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q7: Counting Characters ===\n");
        
        // Test Case 1
        String test1 = "aabcccc";
        Map<Character, Integer> result1 = countCharacters(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Frequency: " + result1);
        System.out.println("Expected: {a=2, b=1, c=4}");
        boolean pass1 = result1.getOrDefault('a', 0) == 2 && 
                       result1.getOrDefault('b', 0) == 1 && 
                       result1.getOrDefault('c', 0) == 4;
        System.out.println("Status: " + (pass1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String test2 = "programming";
        Map<Character, Integer> result2 = countCharacters(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Frequency: " + result2);
        System.out.println("Expected: g=2, m=2, r=2, others=1");
        System.out.println();
        
        // Test Case 3 - Using array
        String test3 = "hello";
        int[] arr = countCharactersArray(test3);
        System.out.println("Test 3 (Array method): \"" + test3 + "\"");
        System.out.print("Non-zero frequencies: ");
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.print((char)('a' + i) + "=" + arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Expected: e=1 h=1 l=2 o=1");
    }
}
