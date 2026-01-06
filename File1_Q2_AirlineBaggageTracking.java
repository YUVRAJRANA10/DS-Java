/**
 * ============================================================
 * QUESTION: Airline Baggage Tracking
 * FILE: 1 | QUESTION: 2
 * ============================================================
 * 
 * STATEMENT:
 * As an engineer for an airline, you need to process unique luggage IDs
 * scanned before takeoff. Ensure that all IDs are recorded correctly
 * and find the frequency of unique items.
 * 
 * CLASSIFICATION: Hashing / Frequency Array
 * 
 * TEST CASES:
 * Case 1: N=5, IDs={101,102,101,103,102} → Count Unique: 3
 * Case 2: N=3, IDs={50,50,50} → Count Unique: 1
 * 
 * SIMILAR QUESTIONS:
 * 1. Find the Single Number
 * 2. Two Sum
 * 3. Top K Frequent IDs
 * 
 *
 * ============================================================
 */

import java.util.*;

public class File1_Q2_AirlineBaggageTracking {
    
    /**
     * TODO: Implement this method
     * Count the number of unique IDs in the array
     * 
     * @param ids - array of luggage IDs
     * @return - count of unique IDs
     */
    public static int countUnique(int[] ids) {
        // YOUR CODE HERE
        int hash[] = new int[1000];
     
        for(int  i: ids){
            hash[i]++;
        }
      int count = 0;
      for (int i = 0; i < hash.length; i++) {
        if(hash[i] > 0){
            count++;
        }
      }

        return count;
    }
    
    /**
     * TODO: Implement this method (BONUS)
     * Return a map of ID to frequency
     * 
     * @param ids - array of luggage IDs
     * @return - map of ID -> frequency
     */
    public static Map<Integer, Integer> getFrequencyMap(int[] ids) {
        // YOUR CODE HERE
        
        return new HashMap<>();
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 1 - Q2: Airline Baggage Tracking ===\n");
        
        // Test Case 1
        int[] test1 = {101, 102, 101, 103, 102};
        int expected1 = 3;
        int result1 = countUnique(test1);
        System.out.println("Test 1: IDs = " + Arrays.toString(test1));
        System.out.println("Unique Count: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int[] test2 = {50, 50, 50};
        int expected2 = 1;
        int result2 = countUnique(test2);
        System.out.println("Test 2: IDs = " + Arrays.toString(test2));
        System.out.println("Unique Count: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
    }
}
