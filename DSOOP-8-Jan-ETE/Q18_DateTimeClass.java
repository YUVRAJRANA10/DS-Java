/**
 * ============================================================
 * Q18: DATE AND TIME CLASS (GET/SET)
 * ============================================================
 * 
 * PROBLEM:
 * Create a class to store date and time using getter and setter methods.
 * 
 * REQUIREMENTS:
 * - Private instance variables: day, month, year, hour, minute, second
 * - Getter and Setter methods for each
 * - Validation in setters (e.g., day 1-31, month 1-12, hour 0-23)
 * - Display method to show date and time
 * - Default and parameterized constructors
 * 
 * HINT:
 * - Encapsulation: Private variables + Public getters/setters
 * ============================================================
 */

public class Q18_DateTimeClass {
    
    /**
     * TODO: Implement DateTime class with getters and setters
     */
    static class DateTime {
        // Private instance variables
        private int day;
        private int month;
        private int year;
        private int hour;
        private int minute;
        private int second;
        
        // TODO: Default constructor (set to current or default date)
        public DateTime() {
            // YOUR CODE HERE
        }
        
        // TODO: Parameterized constructor
        public DateTime(int day, int month, int year, int hour, int minute, int second) {
            // YOUR CODE HERE - use setters for validation
        }
        
        // TODO: Getters
        public int getDay() { return day; }
        public int getMonth() { return month; }
        public int getYear() { return year; }
        public int getHour() { return hour; }
        public int getMinute() { return minute; }
        public int getSecond() { return second; }
        
        // TODO: Setters with validation
        public void setDay(int day) {
            // Validate: 1-31
            // YOUR CODE HERE
        }
        
        public void setMonth(int month) {
            // Validate: 1-12
            // YOUR CODE HERE
        }
        
        public void setYear(int year) {
            // Validate: positive
            // YOUR CODE HERE
        }
        
        public void setHour(int hour) {
            // Validate: 0-23
            // YOUR CODE HERE
        }
        
        public void setMinute(int minute) {
            // Validate: 0-59
            // YOUR CODE HERE
        }
        
        public void setSecond(int second) {
            // Validate: 0-59
            // YOUR CODE HERE
        }
        
        // TODO: Display in format: DD/MM/YYYY HH:MM:SS
        public void display() {
            // YOUR CODE HERE
        }
        
        // TODO: Display date only
        public String getDateString() {
            return "";
        }
        
        // TODO: Display time only
        public String getTimeString() {
            return "";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Date and Time Class ===\n");
        
        // Create with parameterized constructor
        DateTime dt1 = new DateTime(15, 1, 2026, 14, 30, 45);
        System.out.println("DateTime 1:");
        dt1.display();
        
        // Create default and use setters
        DateTime dt2 = new DateTime();
        dt2.setDay(25);
        dt2.setMonth(12);
        dt2.setYear(2025);
        dt2.setHour(9);
        dt2.setMinute(15);
        dt2.setSecond(0);
        System.out.println("\nDateTime 2:");
        dt2.display();
        
        // Test validation
        System.out.println("\n--- Testing Validation ---");
        DateTime dt3 = new DateTime();
        dt3.setMonth(13);  // Invalid - should not set or set to valid
        dt3.setHour(25);   // Invalid
        dt3.setDay(32);    // Invalid
        System.out.println("After invalid inputs:");
        dt3.display();
        
        // Use getters
        System.out.println("\n--- Using Getters ---");
        System.out.println("Day: " + dt1.getDay());
        System.out.println("Month: " + dt1.getMonth());
        System.out.println("Year: " + dt1.getYear());
        System.out.println("Date String: " + dt1.getDateString());
        System.out.println("Time String: " + dt1.getTimeString());
        
        /* Expected Output:
         * DateTime 1: 15/01/2026 14:30:45
         * DateTime 2: 25/12/2025 09:15:00
         */
    }
}
