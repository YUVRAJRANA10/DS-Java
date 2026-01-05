/**
 * ============================================================
 * QUESTION: Caesar Cipher Decryption
 * FILE: 5 | QUESTION: 9
 * ============================================================
 * 
 * STATEMENT:
 * Decrypt shifted message.
 * 
 * CLASSIFICATION: String
 * 
 * TEST CASES:
 * Case 1: "RNCP", K=2 → "PLAY" (shift back by 2)
 * 
 * ALGORITHM:
 * Shift characters back with wrap-around.
 * 
 * SIMILAR QUESTIONS:
 * 1. ROT13
 * 2. Vigenere Cipher
 * 3. String Rotation
 * ============================================================
 */

public class File5_Q9_CaesarCipher {
    
    /**
     * TODO: Implement this method
     * Decrypt Caesar cipher (shift characters back)
     * 
     * @param encrypted - encrypted string (uppercase)
     * @param k - shift amount
     * @return - decrypted string
     */
    public static String decrypt(String encrypted, int k) {
        // YOUR CODE HERE
        
        return encrypted;
    }
    
    /**
     * TODO: Implement this method
     * Encrypt using Caesar cipher (shift characters forward)
     * 
     * @param plaintext - original string (uppercase)
     * @param k - shift amount
     * @return - encrypted string
     */
    public static String encrypt(String plaintext, int k) {
        // YOUR CODE HERE
        
        return plaintext;
    }
    
    // ==================== TEST CASES ====================
    public static void main(String[] args) {
        System.out.println("=== File 5 - Q9: Caesar Cipher ===\n");
        
        // Test Case 1 - Decrypt
        String encrypted1 = "RNCP";
        int k1 = 2;
        String expected1 = "PLAN"; // R-2=P, N-2=L, C-2=A, P-2=N
        String result1 = decrypt(encrypted1, k1);
        System.out.println("Test 1 (Decrypt): \"" + encrypted1 + "\", K=" + k1);
        System.out.println("Decrypted: \"" + result1 + "\"");
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Status: " + (result1.equals(expected1) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 2 - Encrypt
        String plain2 = "HELLO";
        int k2 = 3;
        String expected2 = "KHOOR";
        String result2 = encrypt(plain2, k2);
        System.out.println("Test 2 (Encrypt): \"" + plain2 + "\", K=" + k2);
        System.out.println("Encrypted: \"" + result2 + "\"");
        System.out.println("Expected: \"" + expected2 + "\"");
        System.out.println("Status: " + (result2.equals(expected2) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 3 - Wrap around
        String encrypted3 = "ABC";
        int k3 = 3;
        String expected3 = "XYZ";
        String result3 = decrypt(encrypted3, k3);
        System.out.println("Test 3 (Wrap): \"" + encrypted3 + "\", K=" + k3);
        System.out.println("Decrypted: \"" + result3 + "\"");
        System.out.println("Expected: \"" + expected3 + "\"");
        System.out.println("Status: " + (result3.equals(expected3) ? "✓ PASSED" : "✗ FAILED"));
        System.out.println();
        
        // Test Case 4 - Round trip
        String original = "COPILOT";
        int k4 = 7;
        String encrypted = encrypt(original, k4);
        String decrypted = decrypt(encrypted, k4);
        System.out.println("Test 4 (Round trip): \"" + original + "\"");
        System.out.println("Encrypted: \"" + encrypted + "\"");
        System.out.println("Decrypted: \"" + decrypted + "\"");
        System.out.println("Status: " + (original.equals(decrypted) ? "✓ PASSED" : "✗ FAILED"));
    }
}
