/**
 * ============================================================
 * Q12: BINARY INVERSION AND CONVERSION
 * ============================================================
 * 
 * PROBLEM:
 * Convert a number to binary, invert its bits (0→1, 1→0), 
 * then convert the result back to decimal.
 * 
 * EXAMPLES:
 * Input: 5
 * Binary: 101
 * Inverted: 010
 * Output: 2
 * 
 * HINT:
 * - Use Integer.toBinaryString() for conversion
 * - Invert each character
 * - Use Integer.parseInt(str, 2) to convert back
 * ============================================================
 */

public class Q12_BinaryInversion {
    
    /**
     * TODO: Implement this method
     * @param n - input decimal number
     * @return decimal value after binary inversion
     */
    public static int invertBinary(int n) {
        // Step 1: Convert to binary string
        // Step 2: Invert each bit
        // Step 3: Convert back to decimal
        
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Implement using bitwise operations (more efficient)
     */
    public static int invertBinaryBitwise(int n) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    public static void main(String[] args) {
        int[] testNumbers = {5, 7, 10, 1, 8, 15};
        
        System.out.println("=== Binary Inversion ===\n");
        
        for (int n : testNumbers) {
            String binary = Integer.toBinaryString(n);
            int inverted = invertBinary(n);
            String invertedBinary = Integer.toBinaryString(inverted);
            
            System.out.println("n = " + n);
            System.out.println("  Binary: " + binary);
            System.out.println("  Inverted Binary: " + invertedBinary);
            System.out.println("  Inverted Decimal: " + inverted);
            System.out.println();
        }
        
        /* Expected Output:
         * n = 5 → Binary: 101 → Inverted: 010 → Decimal: 2
         * n = 7 → Binary: 111 → Inverted: 000 → Decimal: 0
         * n = 10 → Binary: 1010 → Inverted: 0101 → Decimal: 5
         * n = 1 → Binary: 1 → Inverted: 0 → Decimal: 0
         * n = 8 → Binary: 1000 → Inverted: 0111 → Decimal: 7
         * n = 15 → Binary: 1111 → Inverted: 0000 → Decimal: 0
         */
    }
}
