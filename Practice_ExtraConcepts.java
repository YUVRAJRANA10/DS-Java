/**
 * ============================================================
 * PRACTICE: Matrix Rotation, Bit Manipulation, Queue with 2 Stacks
 * ============================================================
 */

import java.util.*;

public class Practice_ExtraConcepts {

    // ============================================================
    // 1. MATRIX ROTATION (90° Clockwise)
    // ============================================================
    /*
     * CONCEPT:
     * Rotate a matrix 90° clockwise in-place.
     * 
     * ALGORITHM (2 Steps):
     * Step 1: Transpose (swap rows and columns)
     * Step 2: Reverse each row
     * 
     * EXAMPLE:
     * Original:        Transpose:       Reverse rows:
     * 1 2 3           1 4 7            7 4 1
     * 4 5 6    →      2 5 8      →     8 5 2
     * 7 8 9           3 6 9            9 6 3
     * 
     * Time: O(n²), Space: O(1)
     */
    
    public static void rotateMatrix90Clockwise(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // j starts from i+1 to avoid double swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    
    /*
     * 90° ANTI-CLOCKWISE:
     * Step 1: Transpose
     * Step 2: Reverse each COLUMN (or reverse rows then transpose)
     * 
     * 180° ROTATION:
     * Reverse each row, then reverse order of rows
     */
    
    public static void rotateMatrix90AntiClockwise(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each column
        for (int j = 0; j < n; j++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
    }

    // ============================================================
    // 2. BIT MANIPULATION
    // ============================================================
    /*
     * COMMON OPERATIONS:
     * 
     * AND (&):  1 & 1 = 1, else 0    → Check if bit is set
     * OR  (|):  0 | 0 = 0, else 1    → Set a bit
     * XOR (^):  same = 0, diff = 1   → Toggle bit, find unique
     * NOT (~):  Flip all bits
     * LEFT SHIFT (<<):  Multiply by 2
     * RIGHT SHIFT (>>): Divide by 2
     * 
     * TRICKS:
     * n & 1         → Check if odd (last bit is 1)
     * n & (n-1)     → Remove rightmost set bit
     * n | (1 << i)  → Set i-th bit
     * n & ~(1 << i) → Clear i-th bit
     * n ^ (1 << i)  → Toggle i-th bit
     * n & -n        → Get rightmost set bit
     */
    
    // Check if number is odd
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
        // 5 = 101, 5 & 1 = 101 & 001 = 001 = 1 → odd
        // 4 = 100, 4 & 1 = 100 & 001 = 000 = 0 → even
    }
    
    // Check if i-th bit is set (0-indexed from right)
    public static boolean isBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
        // n=5 (101), i=2: 1<<2 = 100, 101 & 100 = 100 ≠ 0 → true
    }
    
    // Set the i-th bit
    public static int setBit(int n, int i) {
        return n | (1 << i);
        // n=5 (101), i=1: 1<<1 = 010, 101 | 010 = 111 = 7
    }
    
    // Clear the i-th bit
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
        // n=7 (111), i=1: 1<<1 = 010, ~010 = 101, 111 & 101 = 101 = 5
    }
    
    // Toggle the i-th bit
    public static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }
    
    // Count set bits (number of 1s)
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);  // Removes rightmost set bit
            count++;
        }
        return count;
        // 7 = 111 → 110 (count=1) → 100 (count=2) → 000 (count=3)
    }
    
    // Check if power of 2
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
        // Power of 2 has only ONE set bit
        // 8 = 1000, 7 = 0111, 8 & 7 = 0 → true
        // 6 = 0110, 5 = 0101, 6 & 5 = 0100 ≠ 0 → false
    }
    
    // Find single number (all others appear twice)
    public static int findSingleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR: same numbers cancel out!
        }
        return result;
        // [2,3,2] → 0^2=2, 2^3=1, 1^2=3 → answer is 3
    }
    
    // Swap two numbers without temp
    public static void swapWithXOR(int a, int b) {
        System.out.println("Before: a=" + a + ", b=" + b);
        a = a ^ b;
        b = a ^ b;  // (a^b)^b = a
        a = a ^ b;  // (a^b)^a = b
        System.out.println("After: a=" + a + ", b=" + b);
    }

    // ============================================================
    // 3. QUEUE USING TWO STACKS
    // ============================================================
    /*
     * CONCEPT:
     * Queue = FIFO (First In First Out)
     * Stack = LIFO (Last In First Out)
     * 
     * Use TWO stacks to simulate queue behavior.
     * 
     * APPROACH 1: Make enqueue costly
     * - Push to stack2, transfer all from stack1 to stack2, push, transfer back
     * 
     * APPROACH 2: Make dequeue costly (BETTER - Amortized O(1))
     * - stack1 = input stack (for enqueue)
     * - stack2 = output stack (for dequeue)
     * - Only transfer when stack2 is empty
     * 
     * VISUAL:
     * Enqueue 1,2,3:
     *   stack1: [1,2,3] (top=3)
     *   stack2: []
     * 
     * Dequeue:
     *   Transfer to stack2: [3,2,1] (top=1)
     *   Pop from stack2 → 1 (correct! FIFO)
     */
    
    static class QueueUsingStacks {
        Stack<Integer> stack1;  // Input stack
        Stack<Integer> stack2;  // Output stack
        
        public QueueUsingStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }
        
        // Enqueue: O(1)
        public void enqueue(int x) {
            stack1.push(x);
        }
        
        // Dequeue: Amortized O(1)
        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty!");
            }
            
            // Transfer from stack1 to stack2 only if stack2 is empty
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            
            return stack2.pop();
        }
        
        // Peek front: Amortized O(1)
        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty!");
            }
            
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            
            return stack2.peek();
        }
        
        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
        
        public int size() {
            return stack1.size() + stack2.size();
        }
    }
    
    /*
     * WHY DOES THIS WORK?
     * 
     * Stack reverses order: push 1,2,3 → pop gives 3,2,1
     * Two stacks = reverse twice = original order!
     * 
     * stack1: [1,2,3]  →  transfer  →  stack2: [3,2,1]
     *                                   pop gives 1,2,3 ✅ (FIFO!)
     */

    // ============================================================
    // TEST CASES
    // ============================================================
    public static void main(String[] args) {
        
        // ----- Test Matrix Rotation -----
        System.out.println("=== 1. MATRIX ROTATION ===\n");
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original:");
        printMatrix(matrix);
        
        rotateMatrix90Clockwise(matrix);
        System.out.println("After 90° Clockwise:");
        printMatrix(matrix);
        
        // ----- Test Bit Manipulation -----
        System.out.println("=== 2. BIT MANIPULATION ===\n");
        
        System.out.println("isOdd(5): " + isOdd(5) + " (Expected: true)");
        System.out.println("isOdd(4): " + isOdd(4) + " (Expected: false)");
        System.out.println("isBitSet(5, 2): " + isBitSet(5, 2) + " (5=101, bit 2 is 1)");
        System.out.println("setBit(5, 1): " + setBit(5, 1) + " (101 → 111 = 7)");
        System.out.println("clearBit(7, 1): " + clearBit(7, 1) + " (111 → 101 = 5)");
        System.out.println("countSetBits(7): " + countSetBits(7) + " (111 has 3 ones)");
        System.out.println("isPowerOfTwo(8): " + isPowerOfTwo(8) + " (Expected: true)");
        System.out.println("isPowerOfTwo(6): " + isPowerOfTwo(6) + " (Expected: false)");
        System.out.println("findSingleNumber([2,3,2]): " + findSingleNumber(new int[]{2,3,2}));
        swapWithXOR(5, 10);
        System.out.println();
        
        // ----- Test Queue Using Stacks -----
        System.out.println("=== 3. QUEUE USING TWO STACKS ===\n");
        
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Enqueued: 1, 2, 3");
        
        System.out.println("Peek: " + queue.peek() + " (Expected: 1)");
        System.out.println("Dequeue: " + queue.dequeue() + " (Expected: 1)");
        System.out.println("Dequeue: " + queue.dequeue() + " (Expected: 2)");
        
        queue.enqueue(4);
        System.out.println("Enqueued: 4");
        
        System.out.println("Dequeue: " + queue.dequeue() + " (Expected: 3)");
        System.out.println("Dequeue: " + queue.dequeue() + " (Expected: 4)");
        System.out.println("isEmpty: " + queue.isEmpty() + " (Expected: true)");
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
