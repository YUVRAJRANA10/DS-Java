/**
 * ============================================================
 * QUESTION: Examination Negative Marking
 * FILE: 6 | QUESTION: 5
 * ============================================================
 * 
 * STATEMENT:
 * Calculate marks: +4 for correct, -1 for wrong.
 * 
 * CLASSIFICATION: Math
 * 
 * TEST CASES:
 * Case 1: 10 Correct, 5 Wrong → 35
 * 
 * ALGORITHM:
 * Score = (C × 4) - W
 * 
 * SIMILAR QUESTIONS:
 * 1. Bonus Scoring
 * 2. Passing Grade
 * 3. Average Marks
 * ============================================================
 */

public class File6_Q5_ExaminationMarks {
    
    /**
     * TODO: Implement this method
     * Calculate examination score
     * 
     * @param correct - number of correct answers
     * @param wrong - number of wrong answers
     * @return - total score
     */
    public static int calculateScore(int correct, int wrong) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q5: Examination Marks ===\n");
        
        // Test Case 1
        int correct1 = 10, wrong1 = 5;
        int expected1 = 35; // 10*4 - 5 = 35
        int result1 = calculateScore(correct1, wrong1);
        System.out.println("Test 1: Correct=" + correct1 + ", Wrong=" + wrong1);
        System.out.println("Score: " + result1);
        System.out.println("Expected: " + expected1);
        System.out.println("Status: " + (result1 == expected1 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2
        int correct2 = 0, wrong2 = 10;
        int expected2 = -10;
        int result2 = calculateScore(correct2, wrong2);
        System.out.println("Test 2: Correct=" + correct2 + ", Wrong=" + wrong2);
        System.out.println("Score: " + result2);
        System.out.println("Expected: " + expected2);
        System.out.println("Status: " + (result2 == expected2 ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3
        int correct3 = 25, wrong3 = 0;
        int expected3 = 100;
        int result3 = calculateScore(correct3, wrong3);
        System.out.println("Test 3: Correct=" + correct3 + ", Wrong=" + wrong3);
        System.out.println("Score: " + result3);
        System.out.println("Expected: " + expected3);
        System.out.println("Status: " + (result3 == expected3 ? "✓ PASSED" : "✗ FAILED"));
    }
}
