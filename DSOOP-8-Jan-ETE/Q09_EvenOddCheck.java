/**
 * ============================================================
 * Q9: EVEN OR ODD NUMBER CHECK
 * ============================================================
 * 
 * PROBLEM:
 * Determine whether a given number is even or odd.
 * 
 * EXAMPLES:
 * Input: 4 → Output: "Even"
 * Input: 7 → Output: "Odd"
 * Input: 0 → Output: "Even"
 * Input: -3 → Output: "Odd"
 * 
 * HINT:
 * - Method 1: Use modulo (n % 2)
 * - Method 2: Use bitwise AND (n & 1)
 * ============================================================
 */

public class Q09_EvenOddCheck {
    
    /**
     * TODO: Implement using modulo operator
     * @param n - input number
     * @return "Even" or "Odd"
     */
    public static String checkEvenOdd(int n) {
        // YOUR CODE HERE
        
        return "";
    }
    
    /**
     * TODO: Implement using bitwise AND
     * If (n & 1) == 0, number is even
     * If (n & 1) == 1, number is odd
     */
    public static String checkEvenOddBitwise(int n) {
        // YOUR CODE HERE
        
        return "";
    }
    
    public static void main(String[] args) {
        int[] testNumbers = {4, 7, 0, -3, 100, 99, -8, 1};
        
        System.out.println("=== Even or Odd Check ===\n");
        
        System.out.println("--- Using Modulo ---");
        for (int n : testNumbers) {
            System.out.println(n + " → " + checkEvenOdd(n));
        }
        
        System.out.println("\n--- Using Bitwise AND ---");
        for (int n : testNumbers) {
            System.out.println(n + " → " + checkEvenOddBitwise(n));
        }
        
        /* Expected Output:
         * 4 → Even
         * 7 → Odd
         * 0 → Even
         * -3 → Odd
         * 100 → Even
         * 99 → Odd
         * -8 → Even
         * 1 → Odd
         */
    }
}
