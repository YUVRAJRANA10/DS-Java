/**
 * ============================================================
 * Q3: CAPITALIZE FIRST LETTER OF EACH WORD
 * ============================================================
 * 
 * PROBLEM:
 * Given a sentence, capitalize the first letter of every word.
 * 
 * EXAMPLES:
 * Input: "hello world"
 * Output: "Hello World"
 * 
 * Input: "java programming is fun"
 * Output: "Java Programming Is Fun"
 * 
 * HINT:
 * - Split by spaces, capitalize first char, join back
 * - Or iterate and capitalize after each space
 * ============================================================
 */

public class Q03_CapitalizeWords {
    
    /**
     * TODO: Implement this method
     * @param sentence - input sentence
     * @return sentence with first letter of each word capitalized
     */
    public static String capitalizeWords(String sentence) {
        // YOUR CODE HERE
        
        return "";
    }
    
    public static void main(String[] args) {
        String[] testStrings = {
            "hello world",
            "java programming is fun",
            "THE QUICK BROWN FOX",
            "  multiple   spaces  here  "
        };
        
        System.out.println("=== Capitalize First Letter ===\n");
        
        for (String str : testStrings) {
            System.out.println("Input:  \"" + str + "\"");
            System.out.println("Output: \"" + capitalizeWords(str) + "\"");
            System.out.println();
        }
        
        /* Expected Output:
         * "hello world" → "Hello World"
         * "java programming is fun" → "Java Programming Is Fun"
         * "THE QUICK BROWN FOX" → "THE QUICK BROWN FOX" (already uppercase)
         * "  multiple   spaces  here  " → "  Multiple   Spaces  Here  "
         */
    }
}
