/**
 * ============================================================
 * QUESTION: Smallest Window Substring
 * FILE: 5 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Shortest substring containing all chars of T.
 * 
 * CLASSIFICATION: Sliding Window
 * 
 * TEST CASES:
 * Case 1: S="ADOBECODEBANC", T="ABC" → "BANC"
 * 
 * ALGORITHM:
 * Expand right, contract left with frequency map.
 * 
 * SIMILAR QUESTIONS:
 * 1. Longest with K Unique
 * 2. Permutation in String
 * 3. Find All Anagrams
 * ============================================================
 */

import java.util.*;

public class File5_Q6_SmallestWindowSubstring {
    
    /**
     * TODO: Implement this method
     * Find minimum window substring containing all chars of t
     * 
     * @param s - source string
     * @param t - target string (chars to find)
     * @return - minimum window substring, empty if none exists
     */
    public static String minWindow(String s, String t) {
        // YOUR CODE HERE
        
        return "";
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q6: Smallest Window Substring ===\n");
        
        // Test Case 1
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        String expected1 = "BANC";
        String result1 = minWindow(s1, t1);
        System.out.println("Test 1: S=\"" + s1 + "\", T=\"" + t1 + "\"");
        System.out.println("Min Window: \"" + result1 + "\"");
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Status: " + (result1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String s2 = "a";
        String t2 = "a";
        String expected2 = "a";
        String result2 = minWindow(s2, t2);
        System.out.println("Test 2: S=\"" + s2 + "\", T=\"" + t2 + "\"");
        System.out.println("Min Window: \"" + result2 + "\"");
        System.out.println("Expected: \"" + expected2 + "\"");
        System.out.println("Status: " + (result2.equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - No valid window
        String s3 = "a";
        String t3 = "aa";
        String expected3 = "";
        String result3 = minWindow(s3, t3);
        System.out.println("Test 3: S=\"" + s3 + "\", T=\"" + t3 + "\"");
        System.out.println("Min Window: \"" + result3 + "\"");
        System.out.println("Expected: \"" + expected3 + "\" (none)");
        System.out.println("Status: " + (result3.equals(expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
