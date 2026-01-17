/**
 * ============================================================
 * Q11: COUNT SET BITS
 * ============================================================
 * 
 * PROBLEM:
 * Count the number of set bits (1s) in the binary representation 
 * of a number.
 * 
 * EXAMPLES:
 * Input: 5 (binary: 101) → Output: 2
 * Input: 7 (binary: 111) → Output: 3
 * Input: 15 (binary: 1111) → Output: 4
 * 
 * HINT:
 * Method 1: Check each bit using n & 1, then right shift
 * Method 2: Brian Kernighan's - n & (n-1) removes rightmost set bit
 * ============================================================
 */

public class Q11_CountSetBits {
    
    /**
     * TODO: Implement Method 1 - Check each bit
     * @param n - input number
     * @return count of set bits
     */
    public static int countSetBits(int n) {
        // YOUR CODE HERE
        String num = Integer.toBinaryString(n);
          int count = 0;
        for (int index = 0; index < num.length(); index++) {
            if(num.charAt(index) != '0'){
                count++;
            }
        }
        return count;
    }
    
    /**
     * TODO: Implement Method 2 - Brian Kernighan's Algorithm
     * n & (n-1) removes the rightmost set bit
     * Count how many times you can do this
     */
    public static int countSetBitsKernighan(int n) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    public static void main(String[] args) {
        int[] testNumbers = {5, 7, 15, 1, 0, 255, 128, 10};
        
        System.out.println("=== Count Set Bits ===\n");
        
        for (int n : testNumbers) {
            System.out.println("n = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
            System.out.println("  Method 1: " + countSetBits(n));
            System.out.println("  Method 2 (Kernighan): " + countSetBitsKernighan(n));
            System.out.println("  Built-in: " + Integer.bitCount(n));
            System.out.println();
        }
        
        /* Expected Output:
         * n = 5 (binary: 101) → 2
         * n = 7 (binary: 111) → 3
         * n = 15 (binary: 1111) → 4
         * n = 1 (binary: 1) → 1
         * n = 0 (binary: 0) → 0
         * n = 255 (binary: 11111111) → 8
         * n = 128 (binary: 10000000) → 1
         * n = 10 (binary: 1010) → 2
         */
    }
}
