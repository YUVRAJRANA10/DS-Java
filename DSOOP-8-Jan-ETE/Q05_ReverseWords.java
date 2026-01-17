/**
 * ============================================================
 * Q5: REVERSE WORDS IN A STRING
 * ============================================================
 * 
 * PROBLEM:
 * Reverse the order of words in a given sentence.
 * 
 * EXAMPLES:
 * Input: "Hello World Java"
 * Output: "Java World Hello"
 * 
 * Input: "I love programming"
 * Output: "programming love I"
 * 
 * HINT:
 * - Split by spaces, reverse the array, join back
 * - Or use StringBuilder
 * ============================================================
 */

public class Q05_ReverseWords {
    
    /**
     * TODO: Implement this method - Reverse order of words
     * @param sentence - input sentence
     * @return sentence with words in reverse order
     */
    public static String reverseWordOrder(String sentence) {
        // YOUR CODE HERE

        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >=0; i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
    
    /**
     * TODO: Implement this method - Reverse each word individually
     * Input: "Hello World" → Output: "olleH dlroW"
     */
    public static String reverseEachWord(String sentence) {
        // YOUR CODE HERE

          String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            for(int j = s.length() - 1; j>=0 ; j--){
                  sb.append(s.charAt(j));
            }
            sb.append(" ");
        }
        
        return sb.toString().trim();
        
    }
    
    public static void main(String[] args) {
        String[] testStrings = {
            "Hello World Java",
            "I love programming",
            "The quick brown fox",
            "a b c d e"
        };
        
        System.out.println("=== Reverse Words ===\n");
        
        System.out.println("--- Reverse Word Order ---");
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" → \"" + reverseWordOrder(str) + "\"");
        }
        
        System.out.println("\n--- Reverse Each Word ---");
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" → \"" + reverseEachWord(str) + "\"");
        }
        
        /* Expected Output (Reverse Word Order):
         * "Hello World Java" → "Java World Hello"
         * "I love programming" → "programming love I"
         * 
         * Expected Output (Reverse Each Word):
         * "Hello World Java" → "olleH dlroW avaJ"
         * "I love programming" → "I evol gnimmargorp"
         */
    }
}
