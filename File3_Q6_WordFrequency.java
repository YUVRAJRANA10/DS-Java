/**
 * ============================================================
 * QUESTION: Word Frequency
 * FILE: 3 | QUESTION: 6
 * ============================================================
 * 
 * STATEMENT:
 * Count occurrences of the word "Riya" in a sentence.
 * 
 * CLASSIFICATION: String Matching
 * 
 * TEST CASES:
 * Case 1: "Riya is here" → 1
 * Case 2: "Riyansh is here" → 0 (Riyansh != Riya)
 * 
 * ALGORITHM:
 * Tokenize sentence and compare tokens.
 * 
 * SIMILAR QUESTIONS:
 * 1. KMP Algorithm
 * 2. Count Substrings
 * 3. Most Frequent Word
 * ============================================================
 */

public class File3_Q6_WordFrequency {
    
    /**
     * TODO: Implement this method
     * Count occurrences of a specific word in sentence
     * 
     * @param sentence - input sentence
     * @param word - word to count
     * @return - count of word occurrences
     */
    public static int countWord(String sentence, String word) {
        // YOUR CODE HERE
        String[] arr = sentence.split("\\s+");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(word)){
                count++;
            }
        }

        return count;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 3 - Q6: Word Frequency ===\n");
        
        // Test Case 1
        String sentence1 = "Riya is here";
        String word1 = "Riya";
        int expected1 = 1;
        int result1 = countWord(sentence1, word1);
        System.out.println("Test 1: \"" + sentence1 + "\", Word: \"" + word1 + "\"");
        System.out.println("Count: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String sentence2 = "Riyansh is here";
        String word2 = "Riya";
        int expected2 = 0;
        int result2 = countWord(sentence2, word2);
        System.out.println("Test 2: \"" + sentence2 + "\", Word: \"" + word2 + "\"");
        System.out.println("Count: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        String sentence3 = "Riya met Riya and Riya said hello";
        String word3 = "Riya";
        int expected3 = 3;
        int result3 = countWord(sentence3, word3);
        System.out.println("Test 3: \"" + sentence3 + "\", Word: \"" + word3 + "\"");
        System.out.println("Count: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
