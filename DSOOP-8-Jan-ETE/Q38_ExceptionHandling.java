/**
 * ============================================================
 * Q38: EXCEPTION HANDLING
 * ============================================================
 * 
 * PROBLEM:
 * Demonstrate exception handling concepts in Java.
 * 
 * CONCEPTS:
 * 1. try-catch-finally blocks
 * 2. Multiple catch blocks
 * 3. Throwing exceptions
 * 4. Custom exceptions
 * 5. Checked vs Unchecked exceptions
 * 
 * COMMON EXCEPTIONS:
 * - ArithmeticException (divide by zero)
 * - ArrayIndexOutOfBoundsException
 * - NullPointerException
 * - NumberFormatException
 * - IllegalArgumentException
 * 
 * ============================================================
 */

public class Q38_ExceptionHandling {
    
    /**
     * TODO: Create custom exception
     */
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    
    static class InsufficientBalanceException extends Exception {
        private double balance;
        private double amount;
        
        public InsufficientBalanceException(double balance, double amount) {
            super("Insufficient balance: " + balance + ", Required: " + amount);
            this.balance = balance;
            this.amount = amount;
        }
        
        public double getBalance() { return balance; }
        public double getAmount() { return amount; }
    }
    
    /**
     * TODO: Basic try-catch
     */
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
    }
    
    /**
     * TODO: Multiple catch blocks
     */
    public static void multipleCatch(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);  // May throw NumberFormatException
            int[] arr = new int[5];
            arr[num] = 100;  // May throw ArrayIndexOutOfBoundsException
            int result = 100 / num;  // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (Exception e) {
            // Catch-all for any other exception
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * TODO: try-catch-finally
     * Finally block ALWAYS executes
     */
    public static void demonstrateFinally(boolean throwException) {
        try {
            System.out.println("In try block");
            if (throwException) {
                throw new RuntimeException("Test exception");
            }
            System.out.println("After potential exception");
        } catch (RuntimeException e) {
            System.out.println("In catch block: " + e.getMessage());
        } finally {
            System.out.println("In finally block (always runs)");
        }
    }
    
    /**
     * TODO: Throwing exceptions
     */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        if (age > 150) {
            throw new InvalidAgeException("Age seems unrealistic: " + age);
        }
        System.out.println("Age " + age + " is valid");
    }
    
    /**
     * TODO: Bank account with exception handling
     */
    static class BankAccount {
        private double balance;
        
        public BankAccount(double initialBalance) {
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
            this.balance = initialBalance;
        }
        
        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        }
        
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
        }
        
        public double getBalance() { return balance; }
    }
    
    /**
     * TODO: Re-throwing exceptions
     */
    public static void processData(String data) throws IllegalArgumentException {
        try {
            if (data == null) {
                throw new NullPointerException("Data is null");
            }
            if (data.isEmpty()) {
                throw new IllegalArgumentException("Data is empty");
            }
            System.out.println("Processing: " + data);
        } catch (NullPointerException e) {
            // Log and re-throw as different exception
            System.out.println("Logging: " + e.getMessage());
            throw new IllegalArgumentException("Invalid data provided", e);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===\n");
        
        // Test 1: Basic try-catch
        System.out.println("--- Basic Try-Catch ---");
        System.out.println("10 / 2 = " + divide(10, 2));
        System.out.println("10 / 0 = " + divide(10, 0));
        
        // Test 2: Multiple catch blocks
        System.out.println("\n--- Multiple Catch Blocks ---");
        multipleCatch(new String[]{"5"});    // Success
        multipleCatch(new String[]{"abc"});  // NumberFormatException
        multipleCatch(new String[]{"10"});   // ArrayIndexOutOfBoundsException
        multipleCatch(new String[]{"0"});    // ArithmeticException
        
        // Test 3: Finally block
        System.out.println("\n--- Finally Block ---");
        System.out.println("Without exception:");
        demonstrateFinally(false);
        System.out.println("\nWith exception:");
        demonstrateFinally(true);
        
        // Test 4: Custom exceptions
        System.out.println("\n--- Custom Exceptions ---");
        try {
            validateAge(25);
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        
        // Test 5: Bank account
        System.out.println("\n--- Bank Account ---");
        try {
            BankAccount account = new BankAccount(1000);
            account.deposit(500);
            account.withdraw(300);
            account.withdraw(2000);  // This will throw exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation: " + e.getMessage());
        }
        
        // Test 6: Re-throwing
        System.out.println("\n--- Re-throwing Exceptions ---");
        try {
            processData(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught re-thrown: " + e.getMessage());
        }
        
        // Summary
        System.out.println("\n=== EXCEPTION HANDLING SUMMARY ===");
        System.out.println("try: Code that might throw exception");
        System.out.println("catch: Handle specific exception types");
        System.out.println("finally: Always executes (cleanup code)");
        System.out.println("throw: Explicitly throw an exception");
        System.out.println("throws: Declare method may throw exception");
        System.out.println("\nChecked: Must be caught or declared (IOException)");
        System.out.println("Unchecked: RuntimeException subclasses");
    }
}
