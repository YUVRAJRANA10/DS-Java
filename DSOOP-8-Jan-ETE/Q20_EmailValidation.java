/**
 * ============================================================
 * Q20: EMAIL VALIDATION CLASS
 * ============================================================
 * 
 * PROBLEM:
 * Create a class with constructor and a function to validate 
 * an email address. Must contain @ and . to be valid.
 * 
 * VALIDATION RULES:
 * - Must contain exactly one '@' symbol
 * - Must contain at least one '.' after '@'
 * - '@' cannot be first character
 * - '.' cannot be last character
 * - No consecutive special characters
 * 
 * EXAMPLES:
 * "john@example.com" → Valid
 * "invalid.email" → Invalid (no @)
 * "test@" → Invalid (no domain)
 * "@test.com" → Invalid (@ at start)
 * ============================================================
 */

public class Q20_EmailValidation {
    
    /**
     * TODO: Implement Email class with validation
     */
    static class Email {
        private String emailAddress;
        private boolean isValid;
        
        // TODO: Constructor that validates on creation
        public Email(String emailAddress) {
            this.emailAddress = emailAddress;
            // YOUR CODE HERE - validate and set isValid
        }
        
        // TODO: Validation method (basic - must have @ and .)
        public static boolean validateBasic(String email) {
            // Must contain @ and .
            // YOUR CODE HERE
            return false;
        }
        
        // TODO: Validation method (advanced)
        public static boolean validateAdvanced(String email) {
            // 1. Must contain exactly one @
            // 2. Must contain . after @
            // 3. @ not at start
            // 4. . not at end
            // 5. Has text before @ and after .
            // YOUR CODE HERE
            return false;
        }
        
        // Getters
        public String getEmailAddress() {
            return emailAddress;
        }
        
        public boolean isValid() {
            return isValid;
        }
        
        @Override
        public String toString() {
            return emailAddress + " - " + (isValid ? "Valid" : "Invalid");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Email Validation ===\n");
        
        String[] testEmails = {
            "john@example.com",
            "alice.smith@company.org",
            "invalid.email",
            "test@",
            "@test.com",
            "no@dot",
            "user@domain.co.in",
            "user.name+tag@example.com",
            "a@b.c",
            "",
            "double@@at.com",
            "ending.with.dot@test."
        };
        
        System.out.println("--- Basic Validation (@ and .) ---");
        for (String email : testEmails) {
            boolean valid = Email.validateBasic(email);
            System.out.println("\"" + email + "\" → " + (valid ? "Valid" : "Invalid"));
        }
        
        System.out.println("\n--- Advanced Validation ---");
        for (String email : testEmails) {
            boolean valid = Email.validateAdvanced(email);
            System.out.println("\"" + email + "\" → " + (valid ? "Valid" : "Invalid"));
        }
        
        System.out.println("\n--- Using Email Object ---");
        Email e1 = new Email("john@example.com");
        Email e2 = new Email("invalid.email");
        System.out.println(e1);
        System.out.println(e2);
        
        /* Expected Output (Basic):
         * "john@example.com" → Valid
         * "invalid.email" → Invalid
         * "test@" → Invalid
         * "@test.com" → Valid (has @ and .)
         * 
         * Expected Output (Advanced):
         * "john@example.com" → Valid
         * "@test.com" → Invalid (@ at start)
         * "ending.with.dot@test." → Invalid (. at end)
         */
    }
}
