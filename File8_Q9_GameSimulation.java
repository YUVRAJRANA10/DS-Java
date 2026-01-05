/**
 * ============================================================
 * QUESTION: Game Simulation
 * FILE: 8 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Simulate a game with specific rules (varies by context).
 * Track scores, moves, or states.
 * 
 * CLASSIFICATION: Simulation
 * 
 * ALGORITHM:
 * Follow game rules step by step.
 * 
 * SIMILAR QUESTIONS:
 * 1. Baseball Game
 * 2. Tic-Tac-Toe
 * 3. Conway's Game of Life
 * ============================================================
 */

import java.util.*;

public class File8_Q9_GameSimulation {
    
    /**
     * TODO: Implement game simulation
     * Example: Card game where highest card wins each round
     * 
     * @param player1 - player 1's cards
     * @param player2 - player 2's cards
     * @return - winner (1 or 2) or 0 for tie
     */
    public static int cardGameWinner(int[] player1, int[] player2) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    /**
     * TODO: Another game - Number guessing simulation
     * Return number of attempts to guess target
     * 
     * @param target - target number
     * @param max - maximum possible number
     * @return - number of guesses using binary search strategy
     */
    public static int guessGame(int target, int max) {
        // YOUR CODE HERE
        
        return 0;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 8 - Q9: Game Simulation ===\n");
        
        // Card Game
        int[] p1 = {3, 1, 5, 7, 2};
        int[] p2 = {2, 4, 3, 8, 1};
        // Round results: 3>2, 1<4, 5>3, 7<8, 2>1 → P1 wins 3, P2 wins 2
        System.out.println("Card Game:");
        System.out.println("Player 1: " + Arrays.toString(p1));
        System.out.println("Player 2: " + Arrays.toString(p2));
        System.out.println("Winner: Player " + cardGameWinner(p1, p2));
        System.out.println("Expected: Player 1 (wins 3 rounds)");
        System.out.println();
        
        // Guess Game (binary search)
        int target = 42;
        int max = 100;
        System.out.println("Guess Game: target=" + target + ", max=" + max);
        System.out.println("Attempts: " + guessGame(target, max));
        System.out.println("Expected: ~7 (log2(100) ≈ 7)");
    }
}
