/**
 * ============================================================
 * Q6: JUMBLE A STRING
 * ============================================================
 * 
 * PROBLEM:
 * Rearrange or jumble the characters of a given string.
 * Common approaches:
 * - Shuffle randomly
 * - Sort characters alphabetically
 * - Reverse alternate characters
 * 
 * EXAMPLES:
 * Input: "hello"
 * Random Shuffle: "olleh" or "lehol" (varies)
 * Alphabetical: "ehllo"
 * 
 * HINT:
 * - Convert to char array, then shuffle or sort
 * - Use Collections.shuffle() for random
 * - Use Arrays.sort() for alphabetical
 * ============================================================
 */

import java.util.*;

public class Q06_JumbleString {
    
    /**
     * TODO: Implement this method - Random shuffle
     * @param str - input string
     * @return randomly shuffled string
     */
    public static String randomShuffle(String str) {
        // YOUR CODE HERE
        
        return "";
    }
    
    /**
     * TODO: Implement this method - Sort alphabetically
     * @param str - input string
     * @return alphabetically sorted string
     */
    public static String sortAlphabetically(String str) {
        // YOUR CODE HERE
        
        return "";
    }
    
    /**
     * TODO: Implement this method - Swap adjacent pairs
     * Input: "abcdef" → Output: "badcfe"
     */
    public static String swapPairs(String str) {
        // YOUR CODE HERE
        
        return "";
    }
    
    public static void main(String[] args) {
        String[] testStrings = {
            "hello",
            "programming",
            "abcdef",
            "java"
        };
        
        System.out.println("=== Jumble String ===\n");
        
        System.out.println("--- Alphabetically Sorted ---");
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" → \"" + sortAlphabetically(str) + "\"");
        }
        
        System.out.println("\n--- Swap Pairs ---");
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" → \"" + swapPairs(str) + "\"");
        }
        
        System.out.println("\n--- Random Shuffle (varies each run) ---");
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" → \"" + randomShuffle(str) + "\"");
        }
        
        /* Expected Output:
         * Alphabetically: "hello" → "ehllo"
         * Swap Pairs: "abcdef" → "badcfe"
         * Random: varies each time
         */
    }
}
