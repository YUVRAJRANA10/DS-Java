/**
 * ============================================================
 * Q15: PATTERN PRINTING
 * ============================================================
 * 
 * PROBLEM:
 * Print the following pattern:
 *         1
 *        212
 *       32123
 *      4321234
 *     543212345
 * 
 * EXAMPLES:
 * For n=4:
 *       1
 *      212
 *     32123
 *    4321234
 * 
 * HINT:
 * - Each row i has:
 *   - (n-i) leading spaces
 *   - Numbers from i down to 1
 *   - Numbers from 2 up to i
 * ============================================================
 */

public class Q15_PatternPrinting {
    
    /**
     * TODO: Print the main pattern
     * @param n - number of rows
     */
    public static void printPattern(int n) {
        // YOUR CODE HERE
        
    }
    
    /**
     * BONUS: Print inverted pattern
     *    4321234
     *     32123
     *      212
     *       1
     */
    public static void printInvertedPattern(int n) {
        // YOUR CODE HERE
        
    }
    
    /**
     * BONUS: Print diamond pattern combining both
     */
    public static void printDiamondPattern(int n) {
        // YOUR CODE HERE
        
    }
    
    public static void main(String[] args) {
        System.out.println("=== Pattern Printing ===\n");
        
        System.out.println("--- Pattern (n=5) ---");
        printPattern(5);
        
        System.out.println("\n--- Pattern (n=4) ---");
        printPattern(4);
        
        System.out.println("\n--- Inverted Pattern (n=4) ---");
        printInvertedPattern(4);
        
        System.out.println("\n--- Diamond Pattern (n=4) ---");
        printDiamondPattern(4);
        
        /* Expected Output for n=5:
         *         1
         *        212
         *       32123
         *      4321234
         *     543212345
         * 
         * Expected Output for n=4:
         *       1
         *      212
         *     32123
         *    4321234
         */
    }
}
