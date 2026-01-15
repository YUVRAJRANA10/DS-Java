/**
 * ============================================================
 * Q40: CONSTRUCTORS - ALL TYPES
 * ============================================================
 * 
 * PROBLEM:
 * Demonstrate all types of constructors in Java.
 * 
 * CONSTRUCTOR TYPES:
 * 1. Default Constructor (no parameters)
 * 2. Parameterized Constructor
 * 3. Copy Constructor
 * 4. Constructor Overloading
 * 5. Constructor Chaining (using this() and super())
 * 
 * KEY POINTS:
 * - Same name as class
 * - No return type (not even void)
 * - Called automatically when object is created
 * - If no constructor defined, Java provides default
 * - Once any constructor is defined, no default is provided
 * 
 * ============================================================
 */

public class Q40_Constructors {
    
    /**
     * Class demonstrating all constructor types
     */
    static class Person {
        private String name;
        private int age;
        private String email;
        
        // Object count - static
        private static int objectCount = 0;
        
        /**
         * 1. DEFAULT CONSTRUCTOR
         * No parameters, sets default values
         */
        public Person() {
            this.name = "Unknown";
            this.age = 0;
            this.email = "not-provided";
            objectCount++;
            System.out.println("Default constructor called");
        }
        
        /**
         * 2. PARAMETERIZED CONSTRUCTOR
         * Takes parameters to initialize object
         */
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            this.email = "not-provided";
            objectCount++;
            System.out.println("Parameterized constructor (2 args) called");
        }
        
        /**
         * 3. CONSTRUCTOR OVERLOADING
         * Multiple constructors with different parameters
         */
        public Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
            objectCount++;
            System.out.println("Parameterized constructor (3 args) called");
        }
        
        /**
         * 4. COPY CONSTRUCTOR
         * Creates new object copying values from another object
         */
        public Person(Person other) {
            this.name = other.name;
            this.age = other.age;
            this.email = other.email;
            objectCount++;
            System.out.println("Copy constructor called");
        }
        
        // Getters
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getEmail() { return email; }
        public static int getObjectCount() { return objectCount; }
        
        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + ", email=" + email + "]";
        }
    }
    
    /**
     * 5. CONSTRUCTOR CHAINING with this()
     */
    static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;
        
        private static int nextId = 1000;
        
        // Full constructor
        public Employee(String name, String department, double salary) {
            this.id = nextId++;
            this.name = name;
            this.department = department;
            this.salary = salary;
            System.out.println("Full constructor called");
        }
        
        // Chain to full constructor
        public Employee(String name, String department) {
            this(name, department, 30000.0);  // Chain with default salary
            System.out.println("2-param constructor chained");
        }
        
        // Chain again
        public Employee(String name) {
            this(name, "General");  // Chain with default department
            System.out.println("1-param constructor chained");
        }
        
        // Default chains
        public Employee() {
            this("New Employee");  // Chain with default name
            System.out.println("Default constructor chained");
        }
        
        @Override
        public String toString() {
            return String.format("Employee[id=%d, name=%s, dept=%s, salary=%.2f]",
                id, name, department, salary);
        }
    }
    
    /**
     * 6. CONSTRUCTOR CHAINING with super() - Inheritance
     */
    static class Animal {
        protected String name;
        protected int age;
        
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Animal constructor called");
        }
        
        public Animal(String name) {
            this(name, 0);
        }
    }
    
    static class Dog extends Animal {
        private String breed;
        
        public Dog(String name, int age, String breed) {
            super(name, age);  // Call parent constructor FIRST
            this.breed = breed;
            System.out.println("Dog constructor called");
        }
        
        public Dog(String name, String breed) {
            this(name, 1, breed);  // Chain within same class
        }
        
        public Dog(String name) {
            this(name, "Unknown");  // Chain again
        }
        
        @Override
        public String toString() {
            return "Dog[name=" + name + ", age=" + age + ", breed=" + breed + "]";
        }
    }
    
    /**
     * Private constructor - Singleton pattern
     */
    static class Singleton {
        private static Singleton instance = null;
        private String data;
        
        // Private constructor - cannot create from outside
        private Singleton() {
            data = "Singleton Data";
            System.out.println("Singleton created (only once!)");
        }
        
        // Public method to get the single instance
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
        
        public String getData() { return data; }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Constructor Types Demo ===\n");
        
        // Test 1: Default constructor
        System.out.println("--- Default Constructor ---");
        Person p1 = new Person();
        System.out.println(p1);
        
        // Test 2: Parameterized constructors
        System.out.println("\n--- Parameterized Constructors ---");
        Person p2 = new Person("Alice", 25);
        System.out.println(p2);
        
        Person p3 = new Person("Bob", 30, "bob@email.com");
        System.out.println(p3);
        
        // Test 3: Copy constructor
        System.out.println("\n--- Copy Constructor ---");
        Person p4 = new Person(p3);  // Copy of p3
        System.out.println("Original: " + p3);
        System.out.println("Copy: " + p4);
        System.out.println("Are same object? " + (p3 == p4));  // false
        
        System.out.println("\nTotal Person objects: " + Person.getObjectCount());
        
        // Test 4: Constructor chaining with this()
        System.out.println("\n--- Constructor Chaining (this) ---");
        System.out.println("Creating with full params:");
        Employee e1 = new Employee("John", "IT", 50000);
        System.out.println(e1);
        
        System.out.println("\nCreating with default salary:");
        Employee e2 = new Employee("Jane", "HR");
        System.out.println(e2);
        
        System.out.println("\nCreating with defaults:");
        Employee e3 = new Employee();
        System.out.println(e3);
        
        // Test 5: Constructor chaining with super()
        System.out.println("\n--- Constructor Chaining (super) ---");
        Dog d1 = new Dog("Buddy", 3, "Labrador");
        System.out.println(d1);
        
        System.out.println();
        Dog d2 = new Dog("Max");
        System.out.println(d2);
        
        // Test 6: Private constructor (Singleton)
        System.out.println("\n--- Private Constructor (Singleton) ---");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Same instance? " + (s1 == s2));  // true
        
        // Summary
        System.out.println("\n=== CONSTRUCTOR SUMMARY ===");
        System.out.println("1. Default: No params, provides initial values");
        System.out.println("2. Parameterized: Takes params for initialization");
        System.out.println("3. Copy: Creates object from another object");
        System.out.println("4. Overloading: Multiple constructors, different params");
        System.out.println("5. Chaining this(): Call another constructor in same class");
        System.out.println("6. Chaining super(): Call parent class constructor");
        System.out.println("7. Private: Prevent external instantiation (Singleton)");
        System.out.println("\nIMPORTANT:");
        System.out.println("- this() or super() must be FIRST statement");
        System.out.println("- Cannot use both this() and super() together");
        System.out.println("- Java provides default constructor only if NO constructor defined");
    }
}
