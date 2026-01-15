/**
 * ============================================================
 * DSOOP EXAM PRACTICE - 18 JANUARY 2026
 * Based on actual exam pattern observed
 * ============================================================
 * 
 * EXAM PATTERN:
 * - Coding: 1 String(5m), 2 OOPS(5m each), 1 Array/Pattern(5m), 2 LinkedList(10m each)
 * - MCQ: 40 questions (Time complexity, Sorting, OOPS theory, Output-based)
 * 
 * TOPICS FROM SCREENSHOTS:
 * - Split circular list by middle into two lists
 * - Copy list to another
 * - Count set bits
 * - Pyramid pattern
 * - Complex number class (OOPS)
 * - Count nodes in circular LL
 * - Even-Odd rearrangement in Doubly LL
 * ============================================================
 */

import java.util.*;

public class Practice_ExamTopics_18Jan {

    // ============================================================
    // 1. CIRCULAR LINKED LIST OPERATIONS (10 MARKS)
    // ============================================================
    
    static class CircularNode {
        int data;
        CircularNode next;
        
        CircularNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Create circular linked list from array
    static CircularNode createCircular(int[] arr) {
        if (arr.length == 0) return null;
        
        CircularNode head = new CircularNode(arr[0]);
        CircularNode current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new CircularNode(arr[i]);
            current = current.next;
        }
        current.next = head;  // Make it circular
        
        return head;
    }
    
    // Print circular list
    static void printCircular(CircularNode head, String label) {
        if (head == null) {
            System.out.println(label + ": Empty");
            return;
        }
        
        System.out.print(label + ": ");
        CircularNode current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to " + head.data + ")");
    }
    
    /**
     * COUNT NODES IN CIRCULAR LINKED LIST
     * Time: O(n), Space: O(1)
     */
    static int countNodesCircular(CircularNode head) {
        if (head == null) return 0;
        
        int count = 1;
        CircularNode current = head.next;
        
        while (current != head) {
            count++;
            current = current.next;
        }
        
        return count;
    }
    
    /**
     * SPLIT CIRCULAR LIST BY MIDDLE INTO TWO SEPARATE LISTS
     * Uses slow-fast pointer technique
     * Time: O(n), Space: O(1)
     */
    static CircularNode[] splitCircularByMiddle(CircularNode head) {
        if (head == null) return new CircularNode[]{null, null};
        if (head.next == head) return new CircularNode[]{head, null};  // Single node
        
        CircularNode slow = head;
        CircularNode fast = head;
        
        // Find middle using slow-fast pointer
        // For circular: fast.next != head && fast.next.next != head
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // For even number of nodes, move fast one more
        if (fast.next.next == head) {
            fast = fast.next;
        }
        
        // Split into two lists
        CircularNode head1 = head;
        CircularNode head2 = slow.next;
        
        // First list: head to slow, make circular
        slow.next = head1;
        
        // Second list: slow.next to fast, make circular
        fast.next = head2;
        
        return new CircularNode[]{head1, head2};
    }
    
    // ============================================================
    // 2. COPY LIST TO ANOTHER (5-10 MARKS)
    // ============================================================
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    /**
     * COPY SINGLY LINKED LIST TO ANOTHER
     * Time: O(n), Space: O(n)
     */
    static Node copyList(Node head) {
        if (head == null) return null;
        
        // Create new head
        Node newHead = new Node(head.data);
        Node newCurrent = newHead;
        Node current = head.next;
        
        // Copy remaining nodes
        while (current != null) {
            newCurrent.next = new Node(current.data);
            newCurrent = newCurrent.next;
            current = current.next;
        }
        
        return newHead;
    }
    
    /**
     * COPY CIRCULAR LINKED LIST TO ANOTHER
     * Time: O(n), Space: O(n)
     */
    static CircularNode copyCircularList(CircularNode head) {
        if (head == null) return null;
        
        // Create new head
        CircularNode newHead = new CircularNode(head.data);
        CircularNode newCurrent = newHead;
        CircularNode current = head.next;
        
        // Copy remaining nodes
        while (current != head) {
            newCurrent.next = new CircularNode(current.data);
            newCurrent = newCurrent.next;
            current = current.next;
        }
        
        // Make it circular
        newCurrent.next = newHead;
        
        return newHead;
    }
    
    // Helper to print singly linked list
    static void printList(Node head, String label) {
        System.out.print(label + ": ");
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    // ============================================================
    // 3. DOUBLY LINKED LIST - EVEN-ODD REARRANGEMENT (10 MARKS)
    // ============================================================
    
    static class DoublyNode {
        int data;
        DoublyNode prev;
        DoublyNode next;
        
        DoublyNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    // Create doubly linked list
    static DoublyNode createDoubly(int[] arr) {
        if (arr.length == 0) return null;
        
        DoublyNode head = new DoublyNode(arr[0]);
        DoublyNode current = head;
        
        for (int i = 1; i < arr.length; i++) {
            DoublyNode newNode = new DoublyNode(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        
        return head;
    }
    
    // Print doubly linked list
    static void printDoubly(DoublyNode head, String label) {
        System.out.print(label + ": ");
        while (head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    /**
     * REARRANGE DOUBLY LL: ALL EVEN NODES BEFORE ODD NODES
     * Maintain relative order
     * Time: O(n), Space: O(1)
     */
    static DoublyNode rearrangeEvenOdd(DoublyNode head) {
        if (head == null || head.next == null) return head;
        
        DoublyNode evenHead = null, evenTail = null;
        DoublyNode oddHead = null, oddTail = null;
        DoublyNode current = head;
        
        while (current != null) {
            DoublyNode next = current.next;
            current.next = null;
            current.prev = null;
            
            if (current.data % 2 == 0) {
                // Even node
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    current.prev = evenTail;
                    evenTail = current;
                }
            } else {
                // Odd node
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    current.prev = oddTail;
                    oddTail = current;
                }
            }
            
            current = next;
        }
        
        // Connect even list to odd list
        if (evenHead == null) return oddHead;
        if (oddHead == null) return evenHead;
        
        evenTail.next = oddHead;
        oddHead.prev = evenTail;
        
        return evenHead;
    }
    
    // ============================================================
    // 4. COUNT SET BITS (5 MARKS)
    // ============================================================
    
    /**
     * COUNT SET BITS (1s) IN BINARY REPRESENTATION
     * Method 1: Check each bit
     * Time: O(log n) or O(32) for int
     */
    static int countSetBits_v1(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);  // Check last bit
            n = n >> 1;        // Right shift
        }
        return count;
    }
    
    /**
     * COUNT SET BITS
     * Method 2: Brian Kernighan's Algorithm (faster)
     * n & (n-1) removes the rightmost set bit
     * Time: O(number of set bits)
     */
    static int countSetBits_v2(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);  // Remove rightmost set bit
            count++;
        }
        return count;
    }
    
    /**
     * COUNT SET BITS
     * Method 3: Using built-in (for reference)
     */
    static int countSetBits_v3(int n) {
        return Integer.bitCount(n);
    }
    
    // ============================================================
    // 5. PYRAMID PATTERN (5 MARKS)
    // ============================================================
    
    /**
     * PYRAMID PATTERN - Number Pyramid
     * For n=4:
     *       1
     *      1 2
     *     1 2 3
     *    1 2 3 4
     */
    static void pyramidPattern(int n) {
        System.out.println("\n--- Number Pyramid ---");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * STAR PYRAMID
     * For n=4:
     *       *
     *      ***
     *     *****
     *    *******
     */
    static void starPyramid(int n) {
        System.out.println("\n--- Star Pyramid ---");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /**
     * INVERTED PYRAMID
     */
    static void invertedPyramid(int n) {
        System.out.println("\n--- Inverted Pyramid ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /**
     * FLOYD'S TRIANGLE
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */
    static void floydsTriangle(int n) {
        System.out.println("\n--- Floyd's Triangle ---");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    
    /**
     * PASCAL'S TRIANGLE
     *     1
     *    1 1
     *   1 2 1
     *  1 3 3 1
     * 1 4 6 4 1
     */
    static void pascalsTriangle(int n) {
        System.out.println("\n--- Pascal's Triangle ---");
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    
    // ============================================================
    // 6. COMPLEX NUMBER CLASS - OOPS (5 MARKS)
    // ============================================================
    
    /**
     * COMPLEX NUMBER CLASS
     * Demonstrates: Constructors, Method Overloading, this keyword, Static method
     */
    static class Complex {
        private double real;
        private double imaginary;
        
        // Default constructor
        public Complex() {
            this.real = 0;
            this.imaginary = 0;
        }
        
        // Parameterized constructor
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }
        
        // Copy constructor
        public Complex(Complex c) {
            this.real = c.real;
            this.imaginary = c.imaginary;
        }
        
        // Add two complex numbers (returns new object)
        public Complex add(Complex c) {
            return new Complex(this.real + c.real, this.imaginary + c.imaginary);
        }
        
        // Subtract two complex numbers
        public Complex subtract(Complex c) {
            return new Complex(this.real - c.real, this.imaginary - c.imaginary);
        }
        
        // Multiply two complex numbers
        // (a + bi)(c + di) = (ac - bd) + (ad + bc)i
        public Complex multiply(Complex c) {
            double newReal = this.real * c.real - this.imaginary * c.imaginary;
            double newImag = this.real * c.imaginary + this.imaginary * c.real;
            return new Complex(newReal, newImag);
        }
        
        // Static method to add (alternative)
        public static Complex add(Complex c1, Complex c2) {
            return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
        }
        
        // Getters
        public double getReal() { return real; }
        public double getImaginary() { return imaginary; }
        
        // Display
        public void display() {
            if (imaginary >= 0) {
                System.out.println(real + " + " + imaginary + "i");
            } else {
                System.out.println(real + " - " + (-imaginary) + "i");
            }
        }
        
        @Override
        public String toString() {
            if (imaginary >= 0) {
                return real + " + " + imaginary + "i";
            } else {
                return real + " - " + (-imaginary) + "i";
            }
        }
    }
    
    // ============================================================
    // 7. STRING QUESTIONS (5 MARKS)
    // ============================================================
    
    /**
     * CHECK IF STRING IS PALINDROME
     */
    static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    
    /**
     * REVERSE WORDS IN A STRING
     * "Hello World" -> "World Hello"
     */
    static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }
        
        return result.toString();
    }
    
    /**
     * COUNT VOWELS AND CONSONANTS
     */
    static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        s = s.toLowerCase();
        
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        return new int[]{vowels, consonants};
    }
    
    /**
     * FIRST NON-REPEATING CHARACTER
     */
    static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) return c;
        }
        
        return '\0';
    }
    
    /**
     * CHECK BALANCED BRACKETS/PARENTHESES
     */
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    // ============================================================
    // 8. TIME COMPLEXITY QUICK REFERENCE (MCQ PREP)
    // ============================================================
    /*
     * SORTING ALGORITHMS:
     * ┌─────────────────┬─────────┬─────────┬─────────┬─────────┐
     * │ Algorithm       │ Best    │ Average │ Worst   │ Space   │
     * ├─────────────────┼─────────┼─────────┼─────────┼─────────┤
     * │ Bubble Sort     │ O(n)    │ O(n²)   │ O(n²)   │ O(1)    │
     * │ Selection Sort  │ O(n²)   │ O(n²)   │ O(n²)   │ O(1)    │
     * │ Insertion Sort  │ O(n)    │ O(n²)   │ O(n²)   │ O(1)    │
     * │ Merge Sort      │ O(nlogn)│ O(nlogn)│ O(nlogn)│ O(n)    │
     * │ Quick Sort      │ O(nlogn)│ O(nlogn)│ O(n²)   │ O(logn) │
     * │ Heap Sort       │ O(nlogn)│ O(nlogn)│ O(nlogn)│ O(1)    │
     * └─────────────────┴─────────┴─────────┴─────────┴─────────┘
     * 
     * NOTE: Bubble & Insertion have O(n) best case because they
     *       detect already sorted arrays!
     * 
     * SEARCHING:
     * - Linear Search: O(n)
     * - Binary Search: O(log n) - requires sorted array!
     * 
     * DATA STRUCTURES:
     * ┌─────────────────┬─────────┬─────────┬─────────┐
     * │ Operation       │ Array   │ LinkedList│ Stack/Queue│
     * ├─────────────────┼─────────┼─────────┼─────────┤
     * │ Access by index │ O(1)    │ O(n)    │ O(n)    │
     * │ Insert at front │ O(n)    │ O(1)    │ O(1)    │
     * │ Insert at end   │ O(1)*   │ O(1)**  │ O(1)    │
     * │ Delete          │ O(n)    │ O(1)*** │ O(1)    │
     * │ Search          │ O(n)    │ O(n)    │ O(n)    │
     * └─────────────────┴─────────┴─────────┴─────────┘
     * * Amortized for dynamic array
     * ** With tail pointer
     * *** If node reference is given
     * 
     * TREE OPERATIONS (BST):
     * - Search/Insert/Delete: O(log n) average, O(n) worst (skewed)
     * 
     * COMMON BIG-O HIERARCHY (slowest to fastest):
     * O(n!) > O(2^n) > O(n²) > O(n log n) > O(n) > O(log n) > O(1)
     */
    
    // ============================================================
    // MAIN - TEST ALL FUNCTIONS
    // ============================================================
    
    public static void main(String[] args) {
        
        System.out.println("=".repeat(60));
        System.out.println("1. CIRCULAR LINKED LIST OPERATIONS");
        System.out.println("=".repeat(60));
        
        // Create circular list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> (back to 1)
        CircularNode circular = createCircular(new int[]{1, 2, 3, 4, 5, 6});
        printCircular(circular, "Original");
        
        System.out.println("Node count: " + countNodesCircular(circular));
        
        // Split by middle
        System.out.println("\nSplitting by middle...");
        CircularNode[] halves = splitCircularByMiddle(createCircular(new int[]{1, 2, 3, 4, 5, 6}));
        printCircular(halves[0], "First half");
        printCircular(halves[1], "Second half");
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("2. COPY LIST TO ANOTHER");
        System.out.println("=".repeat(60));
        
        // Singly linked list copy
        Node original = new Node(1);
        original.next = new Node(2);
        original.next.next = new Node(3);
        
        Node copied = copyList(original);
        printList(original, "Original");
        printList(copied, "Copied");
        
        // Modify original to prove they're independent
        original.data = 100;
        System.out.println("After modifying original.data = 100:");
        printList(original, "Original");
        printList(copied, "Copied");
        
        // Circular copy
        System.out.println("\nCircular list copy:");
        CircularNode circOriginal = createCircular(new int[]{10, 20, 30});
        CircularNode circCopied = copyCircularList(circOriginal);
        printCircular(circOriginal, "Original");
        printCircular(circCopied, "Copied");
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("3. DOUBLY LL - EVEN-ODD REARRANGEMENT");
        System.out.println("=".repeat(60));
        
        DoublyNode doubly = createDoubly(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        printDoubly(doubly, "Original");
        
        DoublyNode rearranged = rearrangeEvenOdd(doubly);
        printDoubly(rearranged, "Even-Odd");
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("4. COUNT SET BITS");
        System.out.println("=".repeat(60));
        
        int[] testNums = {5, 7, 10, 15, 255};
        for (int n : testNums) {
            System.out.println("n = " + n + " (binary: " + Integer.toBinaryString(n) + ")");
            System.out.println("  Set bits (method 1): " + countSetBits_v1(n));
            System.out.println("  Set bits (method 2): " + countSetBits_v2(n));
            System.out.println("  Set bits (built-in): " + countSetBits_v3(n));
        }
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("5. PYRAMID PATTERNS");
        System.out.println("=".repeat(60));
        
        pyramidPattern(4);
        starPyramid(4);
        invertedPyramid(4);
        floydsTriangle(4);
        pascalsTriangle(5);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("6. COMPLEX NUMBER CLASS (OOPS)");
        System.out.println("=".repeat(60));
        
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, -1);
        
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 - c2 = " + c1.subtract(c2));
        System.out.println("c1 * c2 = " + c1.multiply(c2));
        
        // Copy constructor demo
        Complex c3 = new Complex(c1);
        System.out.println("c3 (copy of c1) = " + c3);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("7. STRING QUESTIONS");
        System.out.println("=".repeat(60));
        
        System.out.println("isPalindrome('A man a plan a canal Panama'): " + isPalindrome("A man a plan a canal Panama"));
        System.out.println("reverseWords('Hello World Java'): " + reverseWords("Hello World Java"));
        
        int[] vc = countVowelsConsonants("Hello World");
        System.out.println("countVowelsConsonants('Hello World'): Vowels=" + vc[0] + ", Consonants=" + vc[1]);
        
        System.out.println("firstNonRepeating('aabbcde'): " + firstNonRepeating("aabbcde"));
        
        System.out.println("isBalanced('{{[]()}}'): " + isBalanced("{{[]()}}"));
        System.out.println("isBalanced('{{[}}'): " + isBalanced("{{[}}"));
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("KEY POINTS FOR EXAM");
        System.out.println("=".repeat(60));
        System.out.println("1. Circular LL: Use while (current != head) to traverse");
        System.out.println("2. Split by middle: Slow-Fast pointer (Floyd's algorithm)");
        System.out.println("3. Copy list: Create NEW nodes, don't just copy references!");
        System.out.println("4. Count set bits: n & (n-1) removes rightmost set bit");
        System.out.println("5. Bubble/Insertion O(n) best case - already sorted detection");
        System.out.println("6. Selection Sort: ALWAYS O(n²) - no best case optimization");
        System.out.println("7. Complex number: (a+bi)(c+di) = (ac-bd) + (ad+bc)i");
        System.out.println("8. this() must be FIRST statement in constructor");
        System.out.println("9. Integer cache: -128 to 127 (use .equals() beyond!)");
    }
}
