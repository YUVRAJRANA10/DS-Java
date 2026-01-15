/**
 * ============================================================
 * Q39: ENCAPSULATION AND ACCESS MODIFIERS
 * ============================================================
 * 
 * PROBLEM:
 * Demonstrate encapsulation using access modifiers.
 * 
 * ACCESS MODIFIERS:
 * 1. private   - Only within the class
 * 2. default   - Within the package (no modifier)
 * 3. protected - Package + subclasses
 * 4. public    - Everywhere
 * 
 * ENCAPSULATION PRINCIPLES:
 * - Make fields private
 * - Provide public getters/setters
 * - Add validation in setters
 * - Hide implementation details
 * 
 * ============================================================
 */

public class Q39_Encapsulation {
    
    /**
     * TODO: Create Student class with proper encapsulation
     */
    static class Student {
        // Private fields - data hiding
        private int id;
        private String name;
        private int age;
        private double gpa;
        private String email;
        
        // Static counter for auto ID
        private static int nextId = 1000;
        
        /**
         * TODO: Constructor with validation
         */
        public Student(String name, int age) {
            this.id = nextId++;
            setName(name);  // Use setter for validation
            setAge(age);
            this.gpa = 0.0;
        }
        
        // ----- GETTERS (read access) -----
        public int getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public double getGpa() { return gpa; }
        public String getEmail() { return email; }
        
        // ----- SETTERS with validation -----
        
        /**
         * TODO: Name setter with validation
         */
        public void setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            this.name = name.trim();
        }
        
        /**
         * TODO: Age setter with validation
         */
        public void setAge(int age) {
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Invalid age: " + age);
            }
            this.age = age;
        }
        
        /**
         * TODO: GPA setter with validation
         */
        public void setGpa(double gpa) {
            if (gpa < 0.0 || gpa > 4.0) {
                throw new IllegalArgumentException("GPA must be 0.0-4.0");
            }
            this.gpa = gpa;
        }
        
        /**
         * TODO: Email setter with validation
         */
        public void setEmail(String email) {
            if (email != null && !email.contains("@")) {
                throw new IllegalArgumentException("Invalid email format");
            }
            this.email = email;
        }
        
        // ----- Computed properties -----
        
        /**
         * Grade based on GPA (read-only property)
         */
        public String getGrade() {
            if (gpa >= 3.7) return "A";
            if (gpa >= 3.3) return "A-";
            if (gpa >= 3.0) return "B+";
            if (gpa >= 2.7) return "B";
            if (gpa >= 2.3) return "B-";
            if (gpa >= 2.0) return "C";
            return "F";
        }
        
        /**
         * Check if student is adult
         */
        public boolean isAdult() {
            return age >= 18;
        }
        
        @Override
        public String toString() {
            return String.format("Student[id=%d, name=%s, age=%d, gpa=%.2f, grade=%s]",
                id, name, age, gpa, getGrade());
        }
    }
    
    /**
     * TODO: Create BankAccount with encapsulation
     * - Hide balance, account number
     * - Provide controlled access through methods
     */
    static class BankAccount {
        private final String accountNumber;  // Immutable
        private double balance;
        private String accountHolder;
        private boolean isActive;
        
        // Private constructor - use factory method
        private BankAccount(String accountHolder, double initialDeposit) {
            this.accountNumber = generateAccountNumber();
            this.accountHolder = accountHolder;
            this.balance = initialDeposit;
            this.isActive = true;
        }
        
        /**
         * Factory method - controlled object creation
         */
        public static BankAccount openAccount(String holder, double deposit) {
            if (deposit < 100) {
                throw new IllegalArgumentException("Minimum deposit is $100");
            }
            return new BankAccount(holder, deposit);
        }
        
        private static String generateAccountNumber() {
            return "ACC" + System.currentTimeMillis();
        }
        
        // Getters - read-only access
        public String getAccountNumber() { return accountNumber; }
        public double getBalance() { return balance; }
        public String getAccountHolder() { return accountHolder; }
        public boolean isActive() { return isActive; }
        
        // Controlled operations instead of direct setters
        
        public void deposit(double amount) {
            validateActive();
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
            balance += amount;
        }
        
        public void withdraw(double amount) {
            validateActive();
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
            if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
            balance -= amount;
        }
        
        public void deactivate() {
            this.isActive = false;
        }
        
        private void validateActive() {
            if (!isActive) throw new IllegalStateException("Account is inactive");
        }
        
        @Override
        public String toString() {
            return String.format("Account[%s, Holder=%s, Balance=$%.2f, Active=%s]",
                accountNumber, accountHolder, balance, isActive);
        }
    }
    
    /**
     * Immutable class example
     */
    static final class ImmutablePerson {
        private final String name;
        private final int age;
        
        public ImmutablePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() { return name; }
        public int getAge() { return age; }
        
        // No setters - object is immutable
        
        // Return new object with modified value
        public ImmutablePerson withAge(int newAge) {
            return new ImmutablePerson(this.name, newAge);
        }
        
        public ImmutablePerson withName(String newName) {
            return new ImmutablePerson(newName, this.age);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Encapsulation Demo ===\n");
        
        // Test 1: Student class
        System.out.println("--- Student Class ---");
        Student s1 = new Student("Alice", 20);
        s1.setGpa(3.8);
        s1.setEmail("alice@email.com");
        System.out.println(s1);
        System.out.println("Is adult: " + s1.isAdult());
        
        Student s2 = new Student("Bob", 17);
        s2.setGpa(2.5);
        System.out.println(s2);
        System.out.println("Is adult: " + s2.isAdult());
        
        // Test validation
        System.out.println("\n--- Validation Tests ---");
        try {
            s1.setAge(-5);  // Should fail
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        
        try {
            s1.setGpa(5.0);  // Should fail
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        
        // Test 2: Bank Account
        System.out.println("\n--- Bank Account ---");
        BankAccount account = BankAccount.openAccount("John Doe", 500);
        System.out.println(account);
        
        account.deposit(200);
        System.out.println("After deposit: Balance = $" + account.getBalance());
        
        account.withdraw(100);
        System.out.println("After withdrawal: Balance = $" + account.getBalance());
        
        // Cannot directly modify balance
        // account.balance = 1000000; // Compilation error - private
        
        // Test 3: Immutable class
        System.out.println("\n--- Immutable Class ---");
        ImmutablePerson p1 = new ImmutablePerson("Charlie", 25);
        System.out.println("Original: " + p1.getName() + ", " + p1.getAge());
        
        ImmutablePerson p2 = p1.withAge(26);  // Creates new object
        System.out.println("Modified: " + p2.getName() + ", " + p2.getAge());
        System.out.println("Original unchanged: " + p1.getName() + ", " + p1.getAge());
        
        // Summary
        System.out.println("\n=== ENCAPSULATION SUMMARY ===");
        System.out.println("1. Make fields private");
        System.out.println("2. Provide public getters for read access");
        System.out.println("3. Provide setters with validation for write access");
        System.out.println("4. Use final for immutable fields");
        System.out.println("5. Hide implementation details");
        System.out.println("6. Control object creation with factory methods");
    }
}
