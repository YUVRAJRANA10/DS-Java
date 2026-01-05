/**
 * ============================================================
 * QUESTION: Placement Drive (Sort by CGPA)
 * FILE: 6 | QUESTION: 3
 * ============================================================
 * 
 * STATEMENT:
 * Sort students by CGPA descending.
 * 
 * CLASSIFICATION: Sorting
 * 
 * TEST CASES:
 * Case 1: {9.0, 8.5, 9.5} → {9.5, 9.0, 8.5}
 * 
 * ALGORITHM:
 * Standard sort O(N log N)
 * 
 * SIMILAR QUESTIONS:
 * 1. Multi-key Sort
 * 2. Meeting Rooms
 * 3. Merge Intervals
 * ============================================================
 */

import java.util.*;

public class File6_Q3_PlacementDrive {
    
    static class Student {
        String name;
        double cgpa;
        
        Student(String name, double cgpa) {
            this.name = name;
            this.cgpa = cgpa;
        }
        
        @Override
        public String toString() {
            return name + "(" + cgpa + ")";
        }
    }
    
    /**
     * TODO: Implement this method
     * Sort students by CGPA in descending order
     * 
     * @param students - array of students
     */
    public static void sortByCGPA(Student[] students) {
        // YOUR CODE HERE
        
    }
    
    /**
     * TODO: Implement for simple double array
     * Sort CGPAs in descending order
     * 
     * @param cgpas - array of CGPAs
     */
    public static void sortDescending(double[] cgpas) {
        // YOUR CODE HERE
        
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 6 - Q3: Placement Drive ===\n");
        
        // Test Case 1 - Simple array
        double[] cgpas1 = {9.0, 8.5, 9.5};
        System.out.println("Test 1: " + Arrays.toString(cgpas1));
        sortDescending(cgpas1);
        System.out.println("Sorted: " + Arrays.toString(cgpas1));
        System.out.println("Expected: [9.5, 9.0, 8.5]");
        System.out.println();
        
        // Test Case 2 - Student objects
        Student[] students = {
            new Student("Alice", 8.5),
            new Student("Bob", 9.2),
            new Student("Charlie", 7.8),
            new Student("Diana", 9.5)
        };
        System.out.println("Test 2: " + Arrays.toString(students));
        sortByCGPA(students);
        System.out.println("Sorted: " + Arrays.toString(students));
        System.out.println("Expected: Diana(9.5), Bob(9.2), Alice(8.5), Charlie(7.8)");
    }
}
