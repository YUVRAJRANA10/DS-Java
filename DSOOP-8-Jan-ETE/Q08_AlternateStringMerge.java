/**
 * ============================================================
 * Q8: ALTERNATE STRING MERGE
 * ============================================================
 * 
 * PROBLEM:
 * Merge two strings by taking alternate characters from each string.
 * 
 * EXAMPLES:
 * Input: "abc", "defghi"
 * Output: "adbecfghi"
 * 
 * Input: "HELLO", "world"
 * Output: "HwEoLrLlOd"
 * 
 * HINT:
 * - Use two pointers, one for each string
 * - When one string ends, append remaining from other
 * ============================================================
 */

public class Q08_AlternateStringMerge {
    
    /**
     * TODO: Implement this method
     * @param str1 - first string
     * @param str2 - second string
     * @return merged string with alternate characters
     */
    public static String mergeAlternate(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        // Alternate characters from both strings
        while (i < str1.length() && j < str2.length()) {
            result.append(str1.charAt(i++));
            result.append(str2.charAt(j++));
        }
        
        // Append remaining characters from str1
        while (i < str1.length()) {
            result.append(str1.charAt(i++));
        }
        
        // Append remaining characters from str2
        while (j < str2.length()) {
            result.append(str2.charAt(j++));
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Alternate String Merge ===\n");
        
        // Test case 1
        String a1 = "abc", b1 = "defghi";
        System.out.println("\"" + a1 + "\" + \"" + b1 + "\" → \"" + mergeAlternate(a1, b1) + "\"");
        
        // Test case 2
        String a2 = "HELLO", b2 = "world";
        System.out.println("\"" + a2 + "\" + \"" + b2 + "\" → \"" + mergeAlternate(a2, b2) + "\"");
        
        // Test case 3
        String a3 = "12345", b3 = "ab";
        System.out.println("\"" + a3 + "\" + \"" + b3 + "\" → \"" + mergeAlternate(a3, b3) + "\"");
        
        // Test case 4
        String a4 = "", b4 = "xyz";
        System.out.println("\"" + a4 + "\" + \"" + b4 + "\" → \"" + mergeAlternate(a4, b4) + "\"");
        
        // Test case 5
        String a5 = "AB", b5 = "CD";
        System.out.println("\"" + a5 + "\" + \"" + b5 + "\" → \"" + mergeAlternate(a5, b5) + "\"");
        
        /* Expected Output:
         * "abc" + "defghi" → "adbecfghi"
         * "HELLO" + "world" → "HwEoLrLlOd"
         * "12345" + "ab" → "1a2b345"
         * "" + "xyz" → "xyz"
         * "AB" + "CD" → "ACBD"
         */
    }
}
