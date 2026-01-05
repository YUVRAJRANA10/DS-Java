/**
 * ============================================================
 * QUESTION: Server Log Analysis
 * FILE: 9 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Analyze server logs for patterns, errors, or statistics.
 * 
 * CLASSIFICATION: Hashing / String
 * 
 * TEST CASES:
 * Case 1: Count error types in logs
 * 
 * ALGORITHM:
 * HashMap for counting, pattern matching.
 * 
 * SIMILAR QUESTIONS:
 * 1. Word Frequency
 * 2. Top K Elements
 * 3. Log Parsing
 * ============================================================
 */

import java.util.*;

public class File9_Q3_ServerLogAnalysis {
    
    /**
     * TODO: Implement this method
     * Count occurrences of each log level (ERROR, WARN, INFO)
     * 
     * @param logs - array of log entries
     * @return - map of level to count
     */
    public static Map<String, Integer> countLogLevels(String[] logs) {
        // YOUR CODE HERE
        
        return new HashMap<>();
    }
    
    /**
     * TODO: Find most common error message
     */
    public static String mostCommonError(String[] logs) {
        // YOUR CODE HERE
        
        return "";
    }
    
    /**
     * TODO: Count unique IP addresses
     */
    public static int countUniqueIPs(String[] logs) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 9 - Q3: Server Log Analysis ===\n");
        
        String[] logs = {
            "ERROR: Connection failed",
            "INFO: Server started",
            "WARN: Low memory",
            "ERROR: Timeout",
            "ERROR: Connection failed",
            "INFO: Request processed"
        };
        
        System.out.println("Logs:");
        for (String log : logs) System.out.println("  " + log);
        System.out.println();
        
        Map<String, Integer> levels = countLogLevels(logs);
        System.out.println("Log Levels: " + levels);
        System.out.println("Expected: {ERROR=3, INFO=2, WARN=1}");
        System.out.println();
        
        System.out.println("Most Common Error: " + mostCommonError(logs));
        System.out.println("Expected: Connection failed");
    }
}
