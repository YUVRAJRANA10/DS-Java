/**
 * ============================================================
 * Q34: FORMATTED OUTPUT USING PRINTF
 * ============================================================
 * 
 * PROBLEM:
 * Demonstrate various printf format specifiers in Java.
 * 
 * FORMAT SPECIFIERS:
 * %d - integer
 * %f - floating point
 * %s - string
 * %c - character
 * %b - boolean
 * %n - newline
 * %x - hexadecimal
 * %o - octal
 * %e - scientific notation
 * 
 * WIDTH AND PRECISION:
 * %10d   - right-align in 10 spaces
 * %-10d  - left-align in 10 spaces
 * %010d  - pad with zeros
 * %.2f   - 2 decimal places
 * %10.2f - 10 width, 2 decimals
 * 
 * ============================================================
 */

public class Q34_PrintfFormatting {
    
    public static void main(String[] args) {
        System.out.println("=== Printf Formatting Examples ===\n");
        
        // ----- BASIC FORMAT SPECIFIERS -----
        System.out.println("--- Basic Specifiers ---");
        
        int num = 42;
        double pi = 3.14159265;
        String name = "Yuvraj";
        char grade = 'A';
        boolean passed = true;
        
        // TODO: Use printf to print each variable
        System.out.printf("Integer: %d%n", num);
        System.out.printf("Float: %f%n", pi);
        System.out.printf("String: %s%n", name);
        System.out.printf("Character: %c%n", grade);
        System.out.printf("Boolean: %b%n", passed);
        
        // ----- WIDTH AND ALIGNMENT -----
        System.out.println("\n--- Width and Alignment ---");
        
        // Right-align (default)
        System.out.printf("Right-aligned: |%10d|%n", 42);
        System.out.printf("Right-aligned: |%10d|%n", 12345);
        
        // Left-align (use minus)
        System.out.printf("Left-aligned:  |%-10d|%n", 42);
        System.out.printf("Left-aligned:  |%-10d|%n", 12345);
        
        // Zero padding
        System.out.printf("Zero padded:   |%010d|%n", 42);
        
        // ----- FLOATING POINT PRECISION -----
        System.out.println("\n--- Floating Point Precision ---");
        
        double price = 1234.5678;
        System.out.printf("Default:      %f%n", price);
        System.out.printf("2 decimals:   %.2f%n", price);
        System.out.printf("0 decimals:   %.0f%n", price);
        System.out.printf("10 width, 2 dec: |%10.2f|%n", price);
        System.out.printf("Left-align:   |%-10.2f|%n", price);
        
        // ----- STRING FORMATTING -----
        System.out.println("\n--- String Formatting ---");
        
        String item = "Apple";
        System.out.printf("Right-align 15: |%15s|%n", item);
        System.out.printf("Left-align 15:  |%-15s|%n", item);
        System.out.printf("Max 3 chars:    |%.3s|%n", item);  // Truncate
        
        // ----- TABLE FORMATTING -----
        System.out.println("\n--- Table Example ---");
        printTable();
        
        // ----- NUMBER BASES -----
        System.out.println("\n--- Number Bases ---");
        int value = 255;
        System.out.printf("Decimal: %d%n", value);
        System.out.printf("Hex:     %x%n", value);
        System.out.printf("HEX:     %X%n", value);
        System.out.printf("Octal:   %o%n", value);
        System.out.printf("With prefix: 0x%X, 0%o%n", value, value);
        
        // ----- SCIENTIFIC NOTATION -----
        System.out.println("\n--- Scientific Notation ---");
        double big = 1234567890.123;
        double small = 0.00000123;
        System.out.printf("Big number:   %e%n", big);
        System.out.printf("Small number: %e%n", small);
        System.out.printf("Precision:    %.2e%n", big);
        
        // ----- MULTIPLE VALUES -----
        System.out.println("\n--- Multiple Values ---");
        String student = "Alice";
        int score = 95;
        double percentage = 94.5;
        System.out.printf("%s scored %d marks (%.1f%%)%n", student, score, percentage);
        // Note: %% prints literal %
        
        // ----- PRACTICE EXERCISES -----
        System.out.println("\n--- Practice Exercises ---");
        exerciseReceipt();
        exerciseScoreCard();
    }
    
    /**
     * TODO: Create a formatted table
     */
    public static void printTable() {
        System.out.printf("%-10s %10s %10s%n", "Item", "Qty", "Price");
        System.out.printf("%-10s %10d %10.2f%n", "Apple", 5, 25.50);
        System.out.printf("%-10s %10d %10.2f%n", "Banana", 12, 15.00);
        System.out.printf("%-10s %10d %10.2f%n", "Orange", 8, 32.75);
        System.out.printf("%s%n", "-".repeat(32));
        System.out.printf("%-10s %10s %10.2f%n", "Total", "", 73.25);
    }
    
    /**
     * TODO: Print a formatted receipt
     */
    public static void exerciseReceipt() {
        System.out.println("\n=== SHOPPING RECEIPT ===");
        // YOUR CODE HERE
        // Print items with aligned prices
        // Example:
        // Item               Price
        // Laptop         $1,299.99
        // Mouse             $25.50
        // Keyboard          $75.00
        // -------------------------
        // TOTAL          $1,400.49
    }
    
    /**
     * TODO: Print a formatted score card
     */
    public static void exerciseScoreCard() {
        System.out.println("\n=== SCORE CARD ===");
        // YOUR CODE HERE
        // Print student scores with percentage
        // Example:
        // Name       | Math | Science | Total | Percent
        // Alice      |   85 |      90 |   175 |   87.5%
        // Bob        |   72 |      78 |   150 |   75.0%
    }
    
    /* Expected Output Summary:
     * 
     * Integer: 42
     * Float: 3.141593
     * 
     * Right-aligned: |        42|
     * Left-aligned:  |42        |
     * Zero padded:   |0000000042|
     * 
     * 2 decimals:   1234.57
     * 10 width, 2 dec: |   1234.57|
     * 
     * Hex:     ff
     * Octal:   377
     * 
     * Alice scored 95 marks (94.5%)
     */
}
