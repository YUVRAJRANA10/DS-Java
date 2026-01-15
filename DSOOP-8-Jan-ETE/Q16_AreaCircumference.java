/**
 * ============================================================
 * Q16: AREA AND CIRCUMFERENCE USING CONSTRUCTOR
 * ============================================================
 * 
 * PROBLEM:
 * Create a class to calculate:
 * - Area of a square
 * - Circumference of a circle
 * Using constructors for initialization.
 * 
 * FORMULAS:
 * - Area of square = side × side
 * - Circumference of circle = 2 × π × radius
 * 
 * REQUIREMENTS:
 * - Use parameterized constructor
 * - Calculate values in constructor or methods
 * - Display results
 * ============================================================
 */

public class Q16_AreaCircumference {
    
    /**
     * TODO: Create Square class with:
     * - Instance variable: side
     * - Parameterized constructor
     * - Method to calculate and return area
     */
    static class Square {
        // YOUR CODE HERE
        private double side;
        
        // Constructor
        
        // Method to calculate area
        public double getArea() {
            return 0;
        }
        
        // Display method
        public void display() {
            
        }
    }
    
    /**
     * TODO: Create Circle class with:
     * - Instance variable: radius
     * - Parameterized constructor
     * - Method to calculate circumference (2 * PI * r)
     * - Method to calculate area (PI * r * r)
     */
    static class Circle {
        // YOUR CODE HERE
        private double radius;
        
        // Constructor
        
        // Method to calculate circumference
        public double getCircumference() {
            return 0;
        }
        
        // Method to calculate area
        public double getArea() {
            return 0;
        }
        
        // Display method
        public void display() {
            
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Area and Circumference ===\n");
        
        // Test Square
        System.out.println("--- Square ---");
        Square sq1 = new Square();  // TODO: Add parameter
        // sq1.display();
        // System.out.println("Area: " + sq1.getArea());
        
        Square sq2 = new Square();  // TODO: Add parameter
        // sq2.display();
        // System.out.println("Area: " + sq2.getArea());
        
        // Test Circle
        System.out.println("\n--- Circle ---");
        Circle c1 = new Circle();  // TODO: Add parameter
        // c1.display();
        // System.out.println("Circumference: " + c1.getCircumference());
        // System.out.println("Area: " + c1.getArea());
        
        /* Expected Output:
         * Square with side 5.0:
         *   Area = 25.0
         * 
         * Circle with radius 7.0:
         *   Circumference = 43.98... (2 * 3.14159 * 7)
         *   Area = 153.93... (3.14159 * 7 * 7)
         */
    }
}
