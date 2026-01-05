/**
 * ============================================================
 * QUESTION: Reward Points (Sum of Digits)
 * FILE: 7 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Sum of digits of ID.
 * 
 * CLASSIFICATION: Math
 * 
 * TEST CASES:
 * Case 1: 515 → 11
 * 
 * ALGORITHM:
 * While loop with modulo 10.
 * 
 * SIMILAR QUESTIONS:
 * 1. Digital Root
 * 2. Palindrome Number
 * 3. Armstrong Number
 * ============================================================
 */

public class File7_Q3_SumOfDigits {
    
    /**
     * TODO: Implement this method
     * Calculate sum of digits
     * 
     * @param n - input number
     * @return - sum of digits
     */
    public static int sumOfDigits(int n) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Implement digital root (keep summing until single digit)
     */
    public static int digitalRoot(int n) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 7 - Q3: Sum of Digits ===\n");
        
        int test1 = 515;
        int expected1 = 11;
        int result1 = sumOfDigits(test1);
        System.out.println("Test 1: " + test1);
        System.out.println("Sum: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int test2 = 12345;
        int expected2 = 15;
        int result2 = sumOfDigits(test2);
        System.out.println("Test 2: " + test2);
        System.out.println("Sum: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        int test3 = 9999;
        int expected3 = 36;
        int result3 = sumOfDigits(test3);
        System.out.println("Test 3: " + test3);
        System.out.println("Sum: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
