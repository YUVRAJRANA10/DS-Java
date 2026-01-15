/**
 * ============================================================
 * PRACTICE: OOP CONCEPTS - Classes, Objects, Constructors
 * - Access Control (public, private, protected, default)
 * - Constructors (Default, Parameterized, Copy)
 * - Wrapper Classes
 * - Static vs Instance (variables & methods)
 * - this keyword
 * - Method/Constructor Overloading
 * - TRICKY "GUESS THE OUTPUT" QUESTIONS
 * ============================================================
 */

// ============================================================
// 1. ACCESS CONTROL MODIFIERS
// ============================================================
/*
 * ┌────────────┬──────────┬─────────┬─────────────┬─────────┐
 * │ Modifier   │ Class    │ Package │ Subclass    │ World   │
 * ├────────────┼──────────┼─────────┼─────────────┼─────────┤
 * │ public     │    ✓     │    ✓    │      ✓      │    ✓    │
 * │ protected  │    ✓     │    ✓    │      ✓      │    ✗    │
 * │ default    │    ✓     │    ✓    │      ✗      │    ✗    │
 * │ private    │    ✓     │    ✗    │      ✗      │    ✗    │
 * └────────────┴──────────┴─────────┴─────────────┴─────────┘
 */

class AccessControlDemo {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;           // package-private
    private int privateVar = 40;
    
    public void display() {
        // All accessible within same class
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}

// ============================================================
// 2. CONSTRUCTORS - Default, Parameterized, Copy
// ============================================================
/*
 * CONSTRUCTOR RULES:
 * 1. Same name as class
 * 2. No return type (not even void)
 * 3. Called automatically when object is created
 * 4. If no constructor defined, Java provides default (no-arg) constructor
 * 5. Once you define ANY constructor, default is NOT provided
 */

class Student {
    String name;
    int age;
    double marks;
    
    // Default Constructor (no parameters)
    public Student() {
        name = "Unknown";
        age = 0;
        marks = 0.0;
        System.out.println("Default constructor called!");
    }
    
    // Parameterized Constructor
    public Student(String name, int age, double marks) {
        this.name = name;      // 'this' refers to current object
        this.age = age;
        this.marks = marks;
        System.out.println("Parameterized constructor called!");
    }
    
    
    // Copy Constructor (creates copy of another object)
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.marks = other.marks;
        System.out.println("Copy constructor called!");
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

// ============================================================
// 3. CONSTRUCTOR OVERLOADING
// ============================================================
/*
 * Multiple constructors with DIFFERENT parameter lists
 * (Different number OR different types)
 */

class Box {
    int length, width, height;
    
    // No parameters
    Box() {
        length = width = height = 1;
    }
    
    // One parameter (cube)
    Box(int side) {
        length = width = height = side;
    }
    
    // Three parameters
    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
    
    // Copy constructor
    Box(Box b) {
        length = b.length;
        width = b.width;
        height = b.height;
    }
    
    int volume() {
        return length * width * height;
    }
}

// ============================================================
// 4. STATIC vs INSTANCE VARIABLES & METHODS
// ============================================================
/*
 * STATIC (Class-level):
 * - Shared by ALL objects of the class
 * - Memory allocated ONCE (when class loads)
 * - Accessed via ClassName.variableName
 * - Can be accessed without creating object
 * 
 * INSTANCE (Object-level):
 * - Separate copy for EACH object
 * - Memory allocated when object is created
 * - Must create object to access
 */

class Counter {
    static int staticCount = 0;      // Shared by all objects
    int instanceCount = 0;           // Separate for each object
    
    Counter() {
        staticCount++;               // Increments shared variable
        instanceCount++;             // Increments this object's variable
    }
    
    // Static method - can only access static members
    static void displayStatic() {
        System.out.println("Static count: " + staticCount);
        // System.out.println(instanceCount);  // ERROR! Can't access instance variable
    }
    
    // Instance method - can access both static and instance
    void displayInstance() {
        System.out.println("Static: " + staticCount + ", Instance: " + instanceCount);
    }
}

// ============================================================
// 5. 'this' KEYWORD
// ============================================================
/*
 * USES OF 'this':
 * 1. Refer to current object's instance variable
 * 2. Call current object's method
 * 3. Call another constructor in same class (constructor chaining)
 * 4. Return current object
 * 5. Pass current object as parameter
 */

class ThisDemo {
    int x;
    
    // Use 1: Distinguish between parameter and instance variable
    ThisDemo(int x) {
        this.x = x;  // this.x = instance variable, x = parameter
    }
    
    // Use 2: Call another constructor (MUST be first statement)
    ThisDemo() {
        this(10);    // Calls ThisDemo(int x)
    }
    
    // Use 3: Return current object
    ThisDemo setValue(int x) {
        this.x = x;
        return this;  // Returns current object (for chaining)
    }
    
    void display() {
        System.out.println("x = " + this.x);
    }
}

// ============================================================
// 6. METHOD OVERLOADING
// ============================================================
/*
 * Same method name, DIFFERENT:
 * 1. Number of parameters
 * 2. Type of parameters
 * 3. Order of parameters
 * 
 * NOTE: Return type alone does NOT constitute overloading!
 */

class Calculator {
    // Different number of parameters
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Different type of parameters
    double add(double a, double b) {
        return a + b;
    }
    
    // Different order of parameters
    void display(int a, String s) {
        System.out.println("Int: " + a + ", String: " + s);
    }
    
    void display(String s, int a) {
        System.out.println("String: " + s + ", Int: " + a);
    }
}

// ============================================================
// 7. WRAPPER CLASSES
// ============================================================
/*
 * Convert primitive types to objects
 * 
 * Primitive  →  Wrapper Class
 * ─────────────────────────────
 * byte       →  Byte
 * short      →  Short
 * int        →  Integer
 * long       →  Long
 * float      →  Float
 * double     →  Double
 * char       →  Character
 * boolean    →  Boolean
 * 
 * AUTOBOXING: Primitive → Object (automatic)
 * UNBOXING: Object → Primitive (automatic)
 */

class WrapperDemo {
    static void demonstrate() {
        // Manual Boxing (primitive to object)
        int a = 10;
        Integer obj1 = Integer.valueOf(a);
        String str  = String.valueOf(a);

        // int a = Integer.parseInt(a);
        // Autoboxing (automatic)
        Integer obj2 = a;
        
        // Manual Unboxing (object to primitive)
        int b = obj1.intValue();
        
        // Auto-unboxing (automatic)
        int c = obj2;
        
        System.out.println("Primitive: " + a);
        System.out.println("Object: " + obj1);
        System.out.println("Unboxed: " + b);
        
        // Useful methods
        String s = "123";
        int num = Integer.parseInt(s);        // String to int
        // String str = Integer.toString(num);   // int to String
        
        System.out.println("Parsed: " + num);
        System.out.println("Max Int: " + Integer.MAX_VALUE);
        System.out.println("Min Int: " + Integer.MIN_VALUE);
    }
}

// ============================================================
// 8. TRICKY "GUESS THE OUTPUT" QUESTIONS
// ============================================================

class TrickyQuestions {
    
    // ===== QUESTION 1: Static vs Instance =====
    static class Q1 {
        static int x = 10;
        int y = 20;
        
        static void test() {
            System.out.println("Q1 Output:");
            System.out.println(x);       // OK - static can access static
            // System.out.println(y);    // ERROR! Static cannot access instance
        }
    }
    
    // ===== QUESTION 2: Constructor Chaining =====
    static class Q2 {
        Q2() {
            this(10);
            System.out.println("Default constructor");
        }
        
        Q2(int x) {
            System.out.println("Parameterized: " + x);
        }
        
        static void test() {
            System.out.println("\nQ2 Output:");
            Q2 obj = new Q2();
            // Output: "Parameterized: 10" then "Default constructor"
        }
    }
    
    // ===== QUESTION 3: Static Variable Shared =====
    static class Q3 {
        static int count = 0;
        
        Q3() {
            count++;
        }
        
        static void test() {
            System.out.println("\nQ3 Output:");
            Q3 a = new Q3();
            Q3 b = new Q3();
            Q3 c = new Q3();
            System.out.println("Count: " + count);  // 3 (shared!)
        }
    }
    
    // ===== QUESTION 4: this() must be FIRST statement =====
    static class Q4 {
        int x;
        
        Q4() {
            // System.out.println("Test");  // ERROR if before this()
            this(5);  // MUST be first statement
            System.out.println("After this()");
        }
        
        Q4(int x) {
            this.x = x;
        }
        
        static void test() {
            System.out.println("\nQ4 Output:");
            Q4 obj = new Q4();
            System.out.println("x = " + obj.x);
        }
    }
    
    // ===== QUESTION 5: Wrapper Class Comparison =====
    static class Q5 {
        static void test() {
            System.out.println("\nQ5 Output (TRICKY!):");
            Integer a = 100;
            Integer b = 100;
            Integer c = 200;
            Integer d = 200;
            
            System.out.println(a == b);      // true (cached -128 to 127)
            System.out.println(c == d);      // false (beyond cache range)
            System.out.println(a.equals(b)); // true (value comparison)
            System.out.println(c.equals(d)); // true (value comparison)
        }
    }
    
    // ===== QUESTION 6: Overloading with Autoboxing =====
    static class Q6 {
        void display(int x) {
            System.out.println("int: " + x);
        }
        
        void display(Integer x) {
            System.out.println("Integer: " + x);
        }
        
        static void test() {
            System.out.println("\nQ6 Output:");
            Q6 obj = new Q6();
            obj.display(10);           // int version (exact match)
            obj.display(Integer.valueOf(10));  // Integer version
        }
    }
    
    // ===== QUESTION 7: Method Overloading Priority =====
    static class Q7 {
        void display(int x) {
            System.out.println("int");
        }
        
        void display(long x) {
            System.out.println("long");
        }
        
        void display(Integer x) {
            System.out.println("Integer");
        }
        
        static void test() {
            System.out.println("\nQ7 Output:");
            Q7 obj = new Q7();
            obj.display(10);  // Calls int version (exact match priority)
        }
    }
    
    // ===== QUESTION 8: Static Block Execution =====
    static class Q8 {
        static int x;
        
        static {
            System.out.println("Static block executed!");
            x = 100;
        }
        
        Q8() {
            System.out.println("Constructor executed!");
        }
        
        static void test() {
            System.out.println("\nQ8 Output:");
            // Static block runs when class is loaded (before constructor)
            Q8 obj = new Q8();
            System.out.println("x = " + x);
        }
    }
    
    // ===== QUESTION 9: this vs super in constructor =====
    static class Q9Parent {
        Q9Parent(int x) {
            System.out.println("Parent: " + x);
        }
    }
    
    static class Q9Child extends Q9Parent {
        Q9Child() {
            super(10);  // Call parent constructor (MUST be first)
            System.out.println("Child constructor");
        }
        
        static void test() {
            System.out.println("\nQ9 Output:");
            Q9Child obj = new Q9Child();
        }
    }
    
    // ===== QUESTION 10: Final Variable =====
    static class Q10 {
        final int x;
        
        Q10(int x) {
            this.x = x;  // OK - can initialize in constructor
        }
        
        void change() {
            // this.x = 100;  // ERROR! Cannot modify final variable
        }
        
        static void test() {
            System.out.println("\nQ10 Output:");
            Q10 obj = new Q10(50);
            System.out.println("Final x = " + obj.x);
        }
    }
}

// ============================================================
// 9. CODING PRACTICE PROBLEMS
// ============================================================

class CodingProblems {
    
    // PROBLEM 1: Create a BankAccount class with proper encapsulation
    static class BankAccount {
        private String accountNumber;
        private String holderName;
        private double balance;
        private static int totalAccounts = 0;
        
        public BankAccount(String accountNumber, String holderName) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = 0.0;
            totalAccounts++;
        }
        
        public BankAccount(String accountNumber, String holderName, double initialBalance) {
            this(accountNumber, holderName);  // Constructor chaining
            this.balance = initialBalance;
        }
        
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }
        }
        
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                return true;
            }
            System.out.println("Insufficient balance!");
            return false;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public static int getTotalAccounts() {
            return totalAccounts;
        }
        
        public void displayInfo() {
            System.out.println("Account: " + accountNumber);
            System.out.println("Holder: " + holderName);
            System.out.println("Balance: " + balance);
        }
    }
    
    // PROBLEM 2: Employee class with method overloading
    static class Employee {
        private String name;
        private int id;
        private double salary;
        
        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
            this.salary = 0.0;
        }
        
        // Overloaded setSalary methods
        public void setSalary(double salary) {
            this.salary = salary;
        }
        
        public void setSalary(int baseSalary, double bonus) {
            this.salary = baseSalary + bonus;
        }
        
        public void setSalary(int baseSalary, double bonus, double allowance) {
            this.salary = baseSalary + bonus + allowance;
        }
        
        public void display() {
            System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
        }
    }
    
    // PROBLEM 3: Point class with copy constructor
    static class Point {
        private int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        // Copy constructor
        public Point(Point p) {
            this.x = p.x;
            this.y = p.y;
        }
        
        public double distance(Point other) {
            int dx = this.x - other.x;
            int dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
        
        public void display() {
            System.out.println("(" + x + ", " + y + ")");
        }
    }
    
    // PROBLEM 4: Singleton Pattern (only ONE object allowed)
    static class Singleton {
        private static Singleton instance = null;
        private int value;
        
        // Private constructor - cannot create from outside
        private Singleton() {
            value = 100;
            System.out.println("Singleton instance created!");
        }
        
        // Public method to get the single instance
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
        
        public void setValue(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }
}

// ============================================================
// MAIN - RUN ALL TESTS
// ============================================================

public class Practice_OOP_Concepts {
    public static void main(String[] args) {
        
        System.out.println("=".repeat(60));
        System.out.println("CONSTRUCTORS DEMO");
        System.out.println("=".repeat(60));
        
        Student s1 = new Student();
        s1.display();
        
        Student s2 = new Student("Alice", 20, 85.5);
        s2.display();
        
        Student s3 = new Student(s2);  // Copy
        s3.display();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("CONSTRUCTOR OVERLOADING");
        System.out.println("=".repeat(60));
        
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);
        Box b4 = new Box(b3);
        
        System.out.println("b1 volume: " + b1.volume());
        System.out.println("b2 volume: " + b2.volume());
        System.out.println("b3 volume: " + b3.volume());
        System.out.println("b4 volume: " + b4.volume());
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("STATIC vs INSTANCE");
        System.out.println("=".repeat(60));
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        System.out.println("\nAfter creating 3 objects:");
        Counter.displayStatic();  // Static method - called via class name
        c1.displayInstance();     // Each object has its own instance count
        c2.displayInstance();
        c3.displayInstance();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("'this' KEYWORD - Method Chaining");
        System.out.println("=".repeat(60));
        
        ThisDemo td = new ThisDemo();
        td.setValue(100).setValue(200).display();  // Method chaining!
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("METHOD OVERLOADING");
        System.out.println("=".repeat(60));
        
        Calculator calc = new Calculator();
        System.out.println("add(5, 10): " + calc.add(5, 10));
        System.out.println("add(5, 10, 15): " + calc.add(5, 10, 15));
        System.out.println("add(5.5, 10.5): " + calc.add(5.5, 10.5));
        calc.display(100, "Hello");
        calc.display("World", 200);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("WRAPPER CLASSES");
        System.out.println("=".repeat(60));
        
        WrapperDemo.demonstrate();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("TRICKY QUESTIONS - GUESS THE OUTPUT!");
        System.out.println("=".repeat(60));
        
        // Run all tricky questions
        TrickyQuestions.Q1.test();
        TrickyQuestions.Q2.test();
        TrickyQuestions.Q3.test();
        TrickyQuestions.Q4.test();
        TrickyQuestions.Q5.test();
        TrickyQuestions.Q6.test();
        TrickyQuestions.Q7.test();
        TrickyQuestions.Q8.test();
        TrickyQuestions.Q9Child.test();
        TrickyQuestions.Q10.test();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("CODING PROBLEMS");
        System.out.println("=".repeat(60));
        
        // Problem 1: BankAccount
        System.out.println("\n--- BankAccount ---");
        CodingProblems.BankAccount acc1 = new CodingProblems.BankAccount("ACC001", "John");
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.displayInfo();
        System.out.println("Total Accounts: " + CodingProblems.BankAccount.getTotalAccounts());
        
        // Problem 2: Employee
        System.out.println("\n--- Employee ---");
        CodingProblems.Employee emp = new CodingProblems.Employee("Alice", 101);
        emp.setSalary(50000);
        emp.display();
        emp.setSalary(50000, 5000);
        emp.display();
        emp.setSalary(50000, 5000, 2000);
        emp.display();
        
        // Problem 3: Point
        System.out.println("\n--- Point ---");
        CodingProblems.Point p1 = new CodingProblems.Point(3, 4);
        CodingProblems.Point p2 = new CodingProblems.Point(p1);  // Copy
        p1.display();
        p2.display();
        System.out.println("Distance: " + p1.distance(new CodingProblems.Point(0, 0)));
        
        // Problem 4: Singleton
        System.out.println("\n--- Singleton ---");
        CodingProblems.Singleton sing1 = CodingProblems.Singleton.getInstance();
        CodingProblems.Singleton sing2 = CodingProblems.Singleton.getInstance();
        System.out.println("sing1 == sing2: " + (sing1 == sing2));  // true (same object!)
        sing1.setValue(500);
        System.out.println("sing2 value: " + sing2.getValue());  // 500 (shared!)
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("KEY POINTS TO REMEMBER");
        System.out.println("=".repeat(60));
        System.out.println("1. Static variables are SHARED by all objects");
        System.out.println("2. this() must be FIRST statement in constructor");
        System.out.println("3. Integer cache: -128 to 127 (== works, beyond that use .equals())");
        System.out.println("4. Static methods CANNOT access instance variables");
        System.out.println("5. Overloading: Same name, different parameters");
        System.out.println("6. Constructor chaining: this() for same class, super() for parent");
        System.out.println("7. Final variables can be initialized ONCE (in constructor)");
        System.out.println("8. Static block runs when class is LOADED (before constructor)");
    }
}
