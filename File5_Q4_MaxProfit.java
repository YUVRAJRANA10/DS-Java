/**
 * ============================================================
 * QUESTION: Max Profit (Stock Buy/Sell)
 * FILE: 5 | QUESTION: 4
 * ============================================================
 * 
 * STATEMENT:
 * Single buy-sell stock profit. Find maximum profit from one transaction.
 * 
 * CLASSIFICATION: DP / Greedy
 * 
 * TEST CASES:
 * Case 1: {7,1,5,3,6,4} → 5 (buy at 1, sell at 6)
 * 
 * ALGORITHM:
 * Track min price and max diff.
 * 
 * SIMILAR QUESTIONS:
 * 1. Buy/Sell Stock II
 * 2. Buy/Sell Stock III
 * 3. Kadane's Algorithm
 * ============================================================
 */

import java.util.Arrays;

public class File5_Q4_MaxProfit {
    
    /**
     * TODO: Implement this method
     * Find maximum profit from single buy-sell transaction
     * 
     * @param prices - array of stock prices
     * @return - maximum profit (0 if no profit possible)
     */
    public static int maxProfit(int[] prices) {

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    
    for (int price : prices) {
        minPrice = Math.min(minPrice, price);      // Best buy so far
        maxProfit = Math.max(maxProfit, price - minPrice);  // Profit if sell today
    }
    
    return maxProfit;

    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q4: Max Profit ===\n");
        
        // Test Case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5;
        int result1 = maxProfit(prices1);
        System.out.println("Test 1: " + Arrays.toString(prices1));
        System.out.println("Max Profit: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - No profit
        int[] prices2 = {7, 6, 4, 3, 1};
        int expected2 = 0;
        int result2 = maxProfit(prices2);
        System.out.println("Test 2: " + Arrays.toString(prices2));
        System.out.println("Max Profit: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int[] prices3 = {2, 4, 1};
        int expected3 = 2;
        int result3 = maxProfit(prices3);
        System.out.println("Test 3: " + Arrays.toString(prices3));
        System.out.println("Max Profit: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
