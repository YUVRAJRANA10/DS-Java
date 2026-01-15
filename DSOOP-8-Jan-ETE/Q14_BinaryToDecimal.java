/**
 * ============================================================
 * Q14: BINARY TO DECIMAL CONVERSION
 * ============================================================
 * 
 * PROBLEM:
 * Convert a given binary number into its decimal equivalent.
 * 
 * EXAMPLES:
 * Input: 101 → Output: 5
 * Input: 1111 → Output: 15
 * Input: 1000 → Output: 8
 * 
 * FORMULA:
 * 101 = 1×2² + 0×2¹ + 1×2⁰ = 4 + 0 + 1 = 5
 * 
 * HINT:
 * - Iterate from right to left, multiply by powers of 2
 * - Or use Integer.parseInt(str, 2)
 * ============================================================
 */

public class Q14_BinaryToDecimal {
    
    /**
     * TODO: Implement manually (without built-in)
     * @param binary - binary number as integer (e.g., 101)
     * @return decimal equivalent
     */
    public static int binaryToDecimal(int binary) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Implement using String input
     * @param binaryStr - binary number as string (e.g., "101")
     * @return decimal equivalent
     */
    public static int binaryStringToDecimal(String binaryStr) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * BONUS: Decimal to Binary conversion
     */
    public static String decimalToBinary(int decimal) {
        // YOUR CODE HERE
        
        return "";
    }
    
    public static void main(String[] args) {
        int[] binaryNumbers = {101, 1111, 1000, 1, 0, 11111111, 1010};
        
        System.out.println("=== Binary to Decimal ===\n");
        
        System.out.println("--- Integer Input ---");
        for (int binary : binaryNumbers) {
            System.out.println(binary + " (binary) → " + binaryToDecimal(binary) + " (decimal)");
        }
        
        System.out.println("\n--- String Input ---");
        String[] binaryStrings = {"101", "1111", "1000", "11111111"};
        for (String binary : binaryStrings) {
            System.out.println("\"" + binary + "\" → " + binaryStringToDecimal(binary));
            System.out.println("  Built-in check: " + Integer.parseInt(binary, 2));
        }
        
        System.out.println("\n--- Decimal to Binary ---");
        int[] decimals = {5, 15, 8, 255, 10};
        for (int d : decimals) {
            System.out.println(d + " → " + decimalToBinary(d));
        }
        
        /* Expected Output:
         * 101 (binary) → 5 (decimal)
         * 1111 (binary) → 15 (decimal)
         * 1000 (binary) → 8 (decimal)
         * 1 (binary) → 1 (decimal)
         * 0 (binary) → 0 (decimal)
         * 11111111 (binary) → 255 (decimal)
         * 1010 (binary) → 10 (decimal)
         */
    }
}
