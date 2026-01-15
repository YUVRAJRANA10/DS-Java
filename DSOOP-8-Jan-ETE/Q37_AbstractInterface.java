/**
 * ============================================================
 * Q37: ABSTRACT CLASS AND INTERFACE DEMO
 * ============================================================
 * 
 * PROBLEM:
 * Demonstrate the difference between abstract class and interface.
 * 
 * Create:
 * 1. Abstract class Shape with abstract area() and perimeter()
 * 2. Interface Drawable with draw() method
 * 3. Interface Colorable with setColor() and getColor()
 * 4. Concrete classes: Circle, Rectangle implementing both
 * 
 * KEY DIFFERENCES:
 * - Abstract class: Can have constructors, instance variables, 
 *   concrete methods
 * - Interface: Only abstract methods (before Java 8), 
 *   constants, default/static methods (Java 8+)
 * - Class extends ONE abstract class, implements MULTIPLE interfaces
 * 
 * ============================================================
 */

public class Q37_AbstractInterface {
    
    /**
     * TODO: Create abstract Shape class
     */
    static abstract class Shape {
        protected String name;
        
        // Constructor - abstract classes CAN have constructors
        public Shape(String name) {
            this.name = name;
        }
        
        // Abstract methods - MUST be implemented by subclasses
        public abstract double area();
        public abstract double perimeter();
        
        // Concrete method - CAN be inherited
        public void displayInfo() {
            System.out.println("Shape: " + name);
            System.out.printf("Area: %.2f%n", area());
            System.out.printf("Perimeter: %.2f%n", perimeter());
        }
        
        public String getName() { return name; }
    }
    
    /**
     * TODO: Create Drawable interface
     */
    interface Drawable {
        void draw();  // Implicitly public abstract
        
        // Default method (Java 8+)
        default void drawWithBorder() {
            System.out.println("Drawing with border:");
            draw();
        }
        
        // Static method (Java 8+)
        static void printInfo() {
            System.out.println("Drawable interface for shapes");
        }
    }
    
    /**
     * TODO: Create Colorable interface
     */
    interface Colorable {
        void setColor(String color);
        String getColor();
        
        // Constant (implicitly public static final)
        String DEFAULT_COLOR = "BLACK";
    }
    
    /**
     * TODO: Create Circle class
     * - Extends Shape (abstract class)
     * - Implements Drawable, Colorable (interfaces)
     */
    static class Circle extends Shape implements Drawable, Colorable {
        private double radius;
        private String color;
        
        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
            this.color = DEFAULT_COLOR;  // From Colorable interface
        }
        
        @Override
        public double area() {
            // YOUR CODE HERE
            return Math.PI * radius * radius;
        }
        
        @Override
        public double perimeter() {
            // YOUR CODE HERE
            return 2 * Math.PI * radius;
        }
        
        @Override
        public void draw() {
            // YOUR CODE HERE
            System.out.println("Drawing " + color + " circle with radius " + radius);
        }
        
        @Override
        public void setColor(String color) {
            this.color = color;
        }
        
        @Override
        public String getColor() {
            return color;
        }
    }
    
    /**
     * TODO: Create Rectangle class
     */
    static class Rectangle extends Shape implements Drawable, Colorable {
        private double width;
        private double height;
        private String color;
        
        public Rectangle(double width, double height) {
            super("Rectangle");
            this.width = width;
            this.height = height;
            this.color = DEFAULT_COLOR;
        }
        
        @Override
        public double area() {
            // YOUR CODE HERE
            return width * height;
        }
        
        @Override
        public double perimeter() {
            // YOUR CODE HERE
            return 2 * (width + height);
        }
        
        @Override
        public void draw() {
            // YOUR CODE HERE
            System.out.println("Drawing " + color + " rectangle " + width + "x" + height);
        }
        
        @Override
        public void setColor(String color) {
            this.color = color;
        }
        
        @Override
        public String getColor() {
            return color;
        }
    }
    
    /**
     * TODO: Create Triangle class
     */
    static class Triangle extends Shape implements Drawable, Colorable {
        private double a, b, c;  // Three sides
        private String color = Colorable.DEFAULT_COLOR;
        
        public Triangle(double a, double b, double c) {
            super("Triangle");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public double area() {
            // Heron's formula
            double s = perimeter() / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        
        @Override
        public double perimeter() {
            return a + b + c;
        }
        
        @Override
        public void draw() {
            System.out.println("Drawing " + color + " triangle with sides " + a + ", " + b + ", " + c);
        }
        
        @Override
        public void setColor(String color) { this.color = color; }
        
        @Override
        public String getColor() { return color; }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Abstract Class & Interface Demo ===\n");
        
        // Create shapes
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(3, 4, 5);
        
        // Using abstract class reference
        System.out.println("--- Using Shape Reference (Polymorphism) ---");
        Shape[] shapes = {c, r, t};
        for (Shape s : shapes) {
            s.displayInfo();
            System.out.println();
        }
        
        // Using interface reference
        System.out.println("--- Using Drawable Interface ---");
        Drawable[] drawables = {c, r, t};
        for (Drawable d : drawables) {
            d.draw();
        }
        
        // Using default method
        System.out.println("\n--- Default Method ---");
        c.drawWithBorder();
        
        // Using static method
        System.out.println("\n--- Static Method ---");
        Drawable.printInfo();
        
        // Using Colorable interface
        System.out.println("\n--- Colorable Interface ---");
        c.setColor("RED");
        r.setColor("BLUE");
        c.draw();
        r.draw();
        
        // Using interface constant
        System.out.println("\nDefault color: " + Colorable.DEFAULT_COLOR);
        
        // Key differences summary
        System.out.println("\n=== KEY DIFFERENCES ===");
        System.out.println("ABSTRACT CLASS:");
        System.out.println("  - Can have constructors");
        System.out.println("  - Can have instance variables");
        System.out.println("  - Can have concrete methods");
        System.out.println("  - Single inheritance only");
        System.out.println("  - Use 'extends' keyword");
        
        System.out.println("\nINTERFACE:");
        System.out.println("  - No constructors");
        System.out.println("  - Only constants (public static final)");
        System.out.println("  - All methods abstract (before Java 8)");
        System.out.println("  - Multiple inheritance allowed");
        System.out.println("  - Use 'implements' keyword");
        System.out.println("  - Default/static methods (Java 8+)");
    }
}
