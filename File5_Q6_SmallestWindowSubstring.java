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
     * Find minimum window substring     all chars of t
     * 
     * @param s - source string
     * @param t - target string (chars to find)
     * @return - minimum window substring, empty if none exists
     */
    public static String minWindow(String s, String t) {
        // Edge case
        if (s.length() < t.length()) {
            return "";
        }
        
        // Step 1: Build frequency map for target string t
        Map<Character, Integer> required = new HashMap<>();
        for (char c : t.toCharArray()) {
            required.put(c, required.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Initialize variables
        Map<Character, Integer> window = new HashMap<>();  // Current window frequency
        int have = 0;                    // Unique chars we have in required count
        int need = required.size();      // Unique chars we need
        int left = 0;                    // Left pointer
        int minLen = Integer.MAX_VALUE;  // Minimum window length found
        int minStart = 0;                // Start index of minimum window
        
        // Step 3: Expand window with right pointer
        for (int right = 0; right < s.length(); right++) {
            // Add current char to window
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            
            // Check if this char satisfies the required count
            if (required.containsKey(c) && window.get(c).equals(required.get(c))) {
                have++;
            }
            
            // Step 4: Contract window from left while it's valid
            while (have == need) {
                // Update result if this window is smaller
                int windowLen = right - left + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    minStart = left;
                }
                
                // Remove left char from window and shrink
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                
                // Check if removing this char breaks the requirement
                if (required.containsKey(leftChar) && window.get(leftChar) < required.get(leftChar)) {
                    have--;
                }
                left++;  // Shrink window
            }
        }
        
        // Step 5: Return result
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
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
