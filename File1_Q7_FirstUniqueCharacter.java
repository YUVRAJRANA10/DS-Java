/**
 * ============================================================
 * QUESTION: First Unique Character
 * FILE: 1 | QUESTION: 7
 * ============================================================
 * 
 * STATEMENT:
 * Find the first character in a string that does not repeat
 * anywhere else in the sequence.
 * 
 * CLASSIFICATION: Hashing / String
 * 
 * TEST CASES:
 * Case 1: "codequotient" → 'c'
 * Case 2: "aabb" → -1 (no unique character)
 * 
 * ALGORITHM:
 * Create a frequency map. Second pass finds the first char with count 1.
 * 
 * SIMILAR QUESTIONS:
 * 1. Check if Anagram
 * 2. Longest Substring Without Repeating Characters
 * 3. Group Anagrams
 * ============================================================
 */

import java.util.*;

public class File1_Q7_FirstUniqueCharacter {
    
    /**
     * TODO: Implement this method
     * Find the first non-repeating character
     * 
     * @param s - input string
     * @return - first unique character, or '\0' if none exists
     */
    public static char firstUnique(String s) {
        // YOUR CODE HERE
        
        return '\0';
    }
    
    /**
     * TODO: Implement this method
     * Find the INDEX of first non-repeating character
     * 
     * @param s - input string
     * @return - index of first unique char, or -1 if none
     */
    public static int firstUniqueIndex(String s) {
        // YOUR CODE HERE
        
        return -1;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q7: First Unique Character ===\n");
        
        // Test Case 1
        String test1 = "codequotient";
        char expected1 = 'c';
        char result1 = firstUnique(test1);
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("First Unique: '" + result1 + "'");
        System.out.println("Expected: '" + expected1 + "'");
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String test2 = "aabb";
        char expected2 = '\0';
        char result2 = firstUnique(test2);
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("First Unique: " + (result2 == '\0' ? "None" : "'" + result2 + "'"));
        System.out.println("Expected: None");
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        String test3 = "leetcode";
        char expected3 = 'l';
        char result3 = firstUnique(test3);
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("First Unique: '" + result3 + "'");
        System.out.println("Expected: '" + expected3 + "'");
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
