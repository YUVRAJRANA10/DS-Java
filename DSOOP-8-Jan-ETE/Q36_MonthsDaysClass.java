/**
 * ============================================================
 * Q36: MONTHS AND DAYS INCREMENT CLASS
 * ============================================================
 * 
 * PROBLEM:
 * Create a MonthsDays class that:
 * 1. Stores months and days
 * 2. Has methods to increment/decrement days
 * 3. Automatically converts days to months (30 days = 1 month)
 * 4. Handles overflow and underflow
 * 
 * EXAMPLE:
 * MonthsDays md = new MonthsDays(2, 25);  // 2 months, 25 days
 * md.addDays(10);  // Result: 3 months, 5 days
 * 
 * CONCEPTS TESTED:
 * - Class design
 * - Getters and setters
 * - Validation
 * - Encapsulation
 * 
 * ============================================================
 */

public class Q36_MonthsDaysClass {
    
    /**
     * TODO: Create MonthsDays class
     */
    static class MonthsDays {
        private int months;
        private int days;
        private static final int DAYS_PER_MONTH = 30;
        
        /**
         * TODO: Default constructor (0 months, 0 days)
         */
        public MonthsDays() {
            // YOUR CODE HERE
            this.months = 0;
            this.days = 0;
        }
        
        /**
         * TODO: Parameterized constructor
         * Should normalize if days >= 30
         */
        public MonthsDays(int months, int days) {
            // YOUR CODE HERE
            // Handle negative values
            // Normalize (e.g., 2 months, 45 days -> 3 months, 15 days)
        }
        
        /**
         * TODO: Add days and normalize
         * @param d - days to add (can be negative)
         */
        public void addDays(int d) {
            // YOUR CODE HERE
            // 1. Add days
            // 2. If days >= 30, convert to months
            // 3. Handle negative result
        }
        
        /**
         * TODO: Add months
         * @param m - months to add (can be negative)
         */
        public void addMonths(int m) {
            // YOUR CODE HERE
            // Handle negative result
        }
        
        /**
         * TODO: Subtract days
         */
        public void subtractDays(int d) {
            // YOUR CODE HERE
            // May need to borrow from months
        }
        
        /**
         * TODO: Get total days
         */
        public int getTotalDays() {
            // YOUR CODE HERE
            return months * DAYS_PER_MONTH + days;
        }
        
        /**
         * TODO: Normalize the values
         * Ensures 0 <= days < 30
         */
        private void normalize() {
            // YOUR CODE HERE
            // Convert excess days to months
            // Handle negative days by borrowing months
        }
        
        // Getters
        public int getMonths() { return months; }
        public int getDays() { return days; }
        
        // Setters with validation
        public void setMonths(int months) {
            if (months < 0) throw new IllegalArgumentException("Months cannot be negative");
            this.months = months;
        }
        
        public void setDays(int days) {
            this.days = days;
            normalize();
        }
        
        /**
         * TODO: Compare two MonthsDays objects
         */
        public int compareTo(MonthsDays other) {
            // YOUR CODE HERE
            // Return negative if this < other
            // Return 0 if equal
            // Return positive if this > other
            return this.getTotalDays() - other.getTotalDays();
        }
        
        /**
         * TODO: Add two MonthsDays objects
         */
        public MonthsDays add(MonthsDays other) {
            // YOUR CODE HERE
            return new MonthsDays(0, this.getTotalDays() + other.getTotalDays());
        }
        
        /**
         * TODO: Subtract MonthsDays objects
         */
        public MonthsDays subtract(MonthsDays other) {
            // YOUR CODE HERE
            int diff = this.getTotalDays() - other.getTotalDays();
            if (diff < 0) throw new IllegalArgumentException("Result cannot be negative");
            return new MonthsDays(0, diff);
        }
        
        @Override
        public String toString() {
            return months + " month(s), " + days + " day(s)";
        }
        
        /**
         * TODO: Format as descriptive string
         */
        public String toDescriptiveString() {
            StringBuilder sb = new StringBuilder();
            if (months == 1) sb.append("1 month");
            else if (months > 1) sb.append(months + " months");
            
            if (months > 0 && days > 0) sb.append(" and ");
            
            if (days == 1) sb.append("1 day");
            else if (days > 1) sb.append(days + " days");
            
            if (months == 0 && days == 0) return "0 days";
            return sb.toString();
        }
    }
    
    /**
     * Extended version: YearsMonthsDays
     */
    static class YearsMonthsDays {
        private int years;
        private int months;
        private int days;
        
        private static final int DAYS_PER_MONTH = 30;
        private static final int MONTHS_PER_YEAR = 12;
        
        public YearsMonthsDays(int years, int months, int days) {
            int totalDays = years * MONTHS_PER_YEAR * DAYS_PER_MONTH + 
                           months * DAYS_PER_MONTH + days;
            
            this.years = totalDays / (MONTHS_PER_YEAR * DAYS_PER_MONTH);
            totalDays %= (MONTHS_PER_YEAR * DAYS_PER_MONTH);
            this.months = totalDays / DAYS_PER_MONTH;
            this.days = totalDays % DAYS_PER_MONTH;
        }
        
        public void addDays(int d) {
            int totalDays = getTotalDays() + d;
            this.years = totalDays / (MONTHS_PER_YEAR * DAYS_PER_MONTH);
            totalDays %= (MONTHS_PER_YEAR * DAYS_PER_MONTH);
            this.months = totalDays / DAYS_PER_MONTH;
            this.days = totalDays % DAYS_PER_MONTH;
        }
        
        public int getTotalDays() {
            return years * MONTHS_PER_YEAR * DAYS_PER_MONTH + 
                   months * DAYS_PER_MONTH + days;
        }
        
        @Override
        public String toString() {
            return years + " year(s), " + months + " month(s), " + days + " day(s)";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== MonthsDays Class Demo ===\n");
        
        // Test 1: Basic creation
        MonthsDays md1 = new MonthsDays(2, 15);
        System.out.println("Created: " + md1);
        System.out.println("Total days: " + md1.getTotalDays());
        
        // Test 2: Normalization on creation
        System.out.println("\n--- Normalization ---");
        MonthsDays md2 = new MonthsDays(2, 45);  // Should normalize
        System.out.println("Created (2, 45): " + md2);  // Expected: 3 months, 15 days
        
        MonthsDays md3 = new MonthsDays(0, 75);  // Should normalize
        System.out.println("Created (0, 75): " + md3);  // Expected: 2 months, 15 days
        
        // Test 3: Adding days
        System.out.println("\n--- Adding Days ---");
        MonthsDays md4 = new MonthsDays(2, 25);
        System.out.println("Start: " + md4);
        md4.addDays(10);
        System.out.println("After +10 days: " + md4);  // Expected: 3 months, 5 days
        
        // Test 4: Adding more days
        MonthsDays md5 = new MonthsDays(1, 0);
        md5.addDays(65);
        System.out.println("1 month + 65 days: " + md5);  // Expected: 3 months, 5 days
        
        // Test 5: Subtracting days
        System.out.println("\n--- Subtracting Days ---");
        MonthsDays md6 = new MonthsDays(3, 10);
        System.out.println("Start: " + md6);
        md6.subtractDays(15);
        System.out.println("After -15 days: " + md6);  // Expected: 2 months, 25 days
        
        // Test 6: Comparison
        System.out.println("\n--- Comparison ---");
        MonthsDays a = new MonthsDays(2, 15);
        MonthsDays b = new MonthsDays(1, 45);  // Normalizes to 2, 15
        MonthsDays c = new MonthsDays(3, 0);
        
        System.out.println("a: " + a + " (" + a.getTotalDays() + " days)");
        System.out.println("b: " + b + " (" + b.getTotalDays() + " days)");
        System.out.println("c: " + c + " (" + c.getTotalDays() + " days)");
        System.out.println("a.compareTo(b): " + a.compareTo(b));  // Should be 0
        System.out.println("a.compareTo(c): " + a.compareTo(c));  // Should be negative
        
        // Test 7: Adding MonthsDays objects
        System.out.println("\n--- Adding Objects ---");
        MonthsDays sum = a.add(c);
        System.out.println(a + " + " + c + " = " + sum);
        
        // Test 8: Descriptive string
        System.out.println("\n--- Descriptive Format ---");
        System.out.println(new MonthsDays(1, 1).toDescriptiveString());   // 1 month and 1 day
        System.out.println(new MonthsDays(3, 15).toDescriptiveString());  // 3 months and 15 days
        System.out.println(new MonthsDays(0, 5).toDescriptiveString());   // 5 days
        System.out.println(new MonthsDays(2, 0).toDescriptiveString());   // 2 months
        
        // Test 9: Extended YearsMonthsDays
        System.out.println("\n--- YearsMonthsDays ---");
        YearsMonthsDays ymd = new YearsMonthsDays(1, 15, 45);
        System.out.println("Created (1y, 15m, 45d): " + ymd);
        ymd.addDays(100);
        System.out.println("After +100 days: " + ymd);
        
        /* Expected Output:
         * Created: 2 month(s), 15 day(s)
         * Total days: 75
         * 
         * Created (2, 45): 3 month(s), 15 day(s)
         * Created (0, 75): 2 month(s), 15 day(s)
         * 
         * Start: 2 month(s), 25 day(s)
         * After +10 days: 3 month(s), 5 day(s)
         */
    }
}
