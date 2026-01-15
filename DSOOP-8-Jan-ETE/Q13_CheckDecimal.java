/**
 * ============================================================
 * Q13: CHECK DECIMAL VALUE IN NUMBER
 * ============================================================
 * 
 * PROBLEM:
 * Check whether a given number contains a decimal (fractional) part.
 * 
 * EXAMPLES:
 * Input: 5.5 → Output: true (has decimal)
 * Input: 5.0 → Output: false (no fractional part)
 * Input: 10 → Output: false
 * Input: 3.14159 → Output: true
 * 
 * HINT:
 * - Compare with floor value
 * - Or use modulo: n % 1 != 0
 * ============================================================
 */

public class Q13_CheckDecimal {
    
    /**
     * TODO: Implement this method
     * @param n - input number (as double)
     * @return true if has fractional part, false otherwise
     */
    public static boolean hasDecimalPart(double n) {
        // YOUR CODE HERE
        
        return false;
    }
    
    /**
     * TODO: Alternative method using floor
     */
    public static boolean hasDecimalPartFloor(double n) {
        // YOUR CODE HERE
        
        return false;
    }
    
    /**
     * TODO: Check from String input
     * @param str - number as string (e.g., "5.5", "10", "3.0")
     */
    public static boolean hasDecimalFromString(String str) {
        // YOUR CODE HERE
        
        return false;
    }
    
    public static void main(String[] args) {
        double[] testNumbers = {5.5, 5.0, 10, 3.14159, 0.001, 100.0, -2.5};
        
        System.out.println("=== Check Decimal Part ===\n");
        
        for (double n : testNumbers) {
            System.out.println(n + " → Has decimal: " + hasDecimalPart(n));
        }
        
        System.out.println("\n--- From String ---");
        String[] strNumbers = {"5.5", "10", "3.0", "0.001", "100"};
        for (String str : strNumbers) {
            System.out.println("\"" + str + "\" → Has decimal: " + hasDecimalFromString(str));
        }
        
        /* Expected Output:
         * 5.5 → Has decimal: true
         * 5.0 → Has decimal: false
         * 10.0 → Has decimal: false
         * 3.14159 → Has decimal: true
         * 0.001 → Has decimal: true
         * 100.0 → Has decimal: false
         * -2.5 → Has decimal: true
         */
    }
}
