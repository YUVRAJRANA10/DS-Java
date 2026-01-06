/**
 * ============================================================
 * QUESTION: Hex/Cleaning String
 * FILE: 1 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Raw data strings often contain noise. Extract and clean valid numeric
 * or hexadecimal values from a given string by removing leading zeros.
 * 
 * CLASSIFICATION: String Processing
 * 
 * TEST CASES:
 * Case 1: "0056" → "56"
 * Case 2: "00012" → "12"
 * 
 * SIMILAR QUESTIONS:
 * 1. Valid Number
 * 2. String to Integer (atoi)
 * 3. Hex to Decimal Converter
 * ============================================================
 */

public class File1_Q3_CleaningString {
    
    /**
     * TODO: Implement this method
     * Remove leading zeros from a numeric string
     * 
     * @param s - input string with leading zeros
     * @return - cleaned string without leading zeros
     */
    public static String removeLeadingZeros(String s) {
        // YOUR CODE HERE
        String result = " ";
        for(char c: s.toCharArray()){
            if(c == '0'){
                continue;
            }
            else{
            result+=c;}
        }
        if(result == " "){
            result+='0';
        }
        return result.trim();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q3: Hex/Cleaning String ===\n");
        
        // Test Case 1
        String test1 = "0056";
        String expected1 = "56";
        String result1 = removeLeadingZeros(test1);
        System.out.println("Test 1: Input = \"" + test1 + "\"");
        System.out.println("Result: \"" + result1 + "\"");
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Status: " + (result1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        String test2 = "00012";
        String expected2 = "12";
        String result2 = removeLeadingZeros(test2);
        System.out.println("Test 2: Input = \"" + test2 + "\"");
        System.out.println("Result: \"" + result2 + "\"");
        System.out.println("Expected: \"" + expected2 + "\"");
        System.out.println("Status: " + (result2.equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Edge Case
        String test3 = "0000";
        String expected3 = "0";
        String result3 = removeLeadingZeros(test3);
        System.out.println("Test 3 (Edge): Input = \"" + test3 + "\"");
        System.out.println("Result: \"" + result3 + "\"");
        System.out.println("Expected: \"" + expected3 + "\"");
        System.out.println("Status: " + (result3.equals(expected3) ? "✓ PASSED" : "✗ FAILED"));
    }
}
