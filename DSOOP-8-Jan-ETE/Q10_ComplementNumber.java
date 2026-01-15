/**
 * ============================================================
 * Q10: COMPLEMENT OF A NUMBER
 * ============================================================
 * 
 * PROBLEM:
 * Find the complement of a given number.
 * The complement is obtained by flipping all bits (0→1, 1→0).
 * 
 * EXAMPLES:
 * Input: 5 (binary: 101) → Output: 2 (binary: 010)
 * Input: 7 (binary: 111) → Output: 0 (binary: 000)
 * Input: 10 (binary: 1010) → Output: 5 (binary: 0101)
 * 
 * HINT:
 * - Find the number of bits in the number
 * - Create a mask of all 1s of same length
 * - XOR with mask to flip bits
 * ============================================================
 */

public class Q10_ComplementNumber {
    
    /**
     * TODO: Implement this method
     * @param n - input number
     * @return complement of the number
     */
    public static int findComplement(int n) {
        if (n == 0) return 1;
        
        // YOUR CODE HERE
        
        return 0;
    }
    
    public static void main(String[] args) {
        int[] testNumbers = {5, 7, 10, 1, 0, 15, 8};
        
        System.out.println("=== Complement of Number ===\n");
        
        for (int n : testNumbers) {
            int complement = findComplement(n);
            System.out.println("n = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
            System.out.println("Complement = " + complement + " (binary: " + Integer.toBinaryString(complement) + ")");
            System.out.println();
        }
        
        /* Expected Output:
         * n = 5 (binary: 101) → Complement = 2 (binary: 10)
         * n = 7 (binary: 111) → Complement = 0 (binary: 0)
         * n = 10 (binary: 1010) → Complement = 5 (binary: 101)
         * n = 1 (binary: 1) → Complement = 0 (binary: 0)
         * n = 0 (binary: 0) → Complement = 1 (binary: 1)
         * n = 15 (binary: 1111) → Complement = 0 (binary: 0)
         * n = 8 (binary: 1000) → Complement = 7 (binary: 111)
         */
    }
}
