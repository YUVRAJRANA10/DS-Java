/**
 * ============================================================
 * Q19: OVERRIDE toString METHOD
 * ============================================================
 * 
 * PROBLEM:
 * Override the toString() method to display object details meaningfully.
 * 
 * CONCEPT:
 * - Every class inherits toString() from Object class
 * - Default: returns className@hashCode
 * - Override to return meaningful string representation
 * 
 * EXAMPLE:
 * Without override: Student@15db9742
 * With override: Student[name=John, age=20, grade=A]
 * 
 * HINT:
 * - Use @Override annotation
 * - Return a formatted string with object details
 * ============================================================
 */

public class Q19_ToStringOverride {
    
    /**
     * TODO: Create Student class and override toString()
     */
    static class Student {
        private String name;
        private int age;
        private String grade;
        private double marks;
        
        public Student(String name, int age, String grade, double marks) {
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.marks = marks;
        }
        
        // TODO: Override toString()
        @Override
        public String toString() {
            // YOUR CODE HERE
            // Return: Student[name=John, age=20, grade=A, marks=85.5]
            return super.toString();  // Replace this
        }
    }
    
    /**
     * TODO: Create Book class and override toString()
     */
    static class Book {
        private String title;
        private String author;
        private int year;
        private double price;
        
        public Book(String title, String author, int year, double price) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price;
        }
        
        // TODO: Override toString()
        @Override
        public String toString() {
            // YOUR CODE HERE
            return super.toString();  // Replace this
        }
    }
    
    /**
     * TODO: Create Point class and override toString()
     */
    static class Point {
        private int x;
        private int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        // TODO: Override toString()
        @Override
        public String toString() {
            // Return: (x, y)
            // YOUR CODE HERE
            return super.toString();  // Replace this
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Override toString() ===\n");
        
        // Without proper override (shows default)
        System.out.println("--- Before Override (default) ---");
        Object obj = new Object();
        System.out.println("Object: " + obj);
        
        // With override
        System.out.println("\n--- After Override ---");
        
        Student s1 = new Student("John", 20, "A", 85.5);
        Student s2 = new Student("Alice", 22, "B+", 78.0);
        System.out.println(s1);
        System.out.println(s2);
        
        Book b1 = new Book("Java Programming", "James Gosling", 2020, 599.99);
        System.out.println(b1);
        
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-1, 5);
        System.out.println(p1);
        System.out.println(p2);
        
        // Using in print statements directly
        System.out.println("\n--- Using in concatenation ---");
        System.out.println("Created student: " + s1);
        System.out.println("Point is at: " + p1);
        
        /* Expected Output:
         * Student[name=John, age=20, grade=A, marks=85.5]
         * Student[name=Alice, age=22, grade=B+, marks=78.0]
         * Book[title=Java Programming, author=James Gosling, year=2020, price=599.99]
         * (3, 4)
         * (-1, 5)
         */
    }
}
