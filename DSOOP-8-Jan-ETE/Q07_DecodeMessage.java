/**
 * ============================================================
 * Q7: DECODE MESSAGE (STRING REVERSE)
 * ============================================================
 * 
 * PROBLEM:
 * Decode a message by reversing the given string.
 * 
 * EXAMPLES:
 * Input: "olleH" → Output: "Hello"
 * Input: "avaJ gnitset" → Output: "testing Java"
 * 
 * HINT:
 * - Use StringBuilder.reverse()
 * - Or iterate from end to start
 * ============================================================
 */

public class Q07_DecodeMessage {
    
    /**
     * TODO: Implement this method - Reverse entire string
     * @param encoded - encoded/reversed message
     * @return decoded message
     */
    public static String decode(String encoded) {
        // YOUR CODE HERE
        
        return "";
    }
    
    /**
     * TODO: Implement this method - Using StringBuilder
     */
    public static String decodeWithStringBuilder(String encoded) {
        // YOUR CODE HERE
        
        return "";
    }
    
    /**
     * TODO: Implement this method - Without using StringBuilder
     * (manual iteration)
     */
    public static String decodeManual(String encoded) {
        // YOUR CODE HERE
        
        return "";
    }
    
    public static void main(String[] args) {
        String[] testStrings = {
            "olleH",
            "avaJ gnitset",
            "!dlroW olleH",
            "redoced a ma I"
        };
        
        System.out.println("=== Decode Message ===\n");
        
        for (String str : testStrings) {
            System.out.println("Encoded: \"" + str + "\"");
            System.out.println("Decoded: \"" + decode(str) + "\"");
            System.out.println();
        }
        
        /* Expected Output:
         * "olleH" → "Hello"
         * "avaJ gnitset" → "testing Java"
         * "!dlroW olleH" → "Hello World!"
         * "redoced a ma I" → "I am a decoder"
         */
    }
}
