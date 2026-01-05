/**
 * ============================================================
 * QUESTION: Rat in a Maze
 * FILE: 8 | QUESTION: 8
 * ============================================================
 * 
 * STATEMENT:
 * Find all paths from (0,0) to (n-1,n-1) using backtracking.
 * 
 * CLASSIFICATION: Backtracking
 * 
 * TEST CASES:
 * Case 1: [[1,0],[1,1]] → DDRR (path exists)
 * 
 * ALGORITHM:
 * DFS with backtracking; mark visited.
 * 
 * SIMILAR QUESTIONS:
 * 1. Word Search
 * 2. Sudoku Solver
 * 3. N-Queens
 * ============================================================
 */

import java.util.*;

public class File8_Q8_RatInMaze {
    
    /**
     * TODO: Implement this method
     * Find all paths from (0,0) to (n-1,n-1)
     * Can move: D(down), U(up), L(left), R(right)
     * 1 = open, 0 = blocked
     * 
     * @param maze - 2D maze grid
     * @return - list of all valid paths
     */
    public static List<String> findPaths(int[][] maze) {
        // YOUR CODE HERE
        
        return new ArrayList<>();
    }
    
    /**
     * TODO: Helper method for backtracking
     */
    private static void solve(int[][] maze, int r, int c, String path, 
                              List<String> result, boolean[][] visited) {
        // YOUR CODE HERE
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q8: Rat in a Maze ===\n");
        
        int[][] maze1 = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        System.out.println("Maze 1:");
        System.out.println("1 0 0 0");
        System.out.println("1 1 0 1");
        System.out.println("1 1 0 0");
        System.out.println("0 1 1 1");
        System.out.println();
        System.out.println("Paths: " + findPaths(maze1));
        System.out.println("Expected: [DDRDRR, DRDDRR]");
        System.out.println();
        
        int[][] maze2 = {
            {1, 1},
            {1, 1}
        };
        System.out.println("Maze 2:");
        System.out.println("1 1");
        System.out.println("1 1");
        System.out.println("Paths: " + findPaths(maze2));
        System.out.println("Expected: [DR, RD]");
    }
}
