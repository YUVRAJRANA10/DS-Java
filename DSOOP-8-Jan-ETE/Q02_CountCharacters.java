 /**
 * ============================================================
 * Q2: COUNT CHARACTERS IN A STRING
 * ============================================================
 * 
 * PROBLEM:
 * Count the number of vowels, consonants, digits, and special 
 * characters in a given string.
 * 
 * EXAMPLES:
 * Input: "Hello World 123!"
 * Output: Vowels=3, Consonants=7, Digits=3, Special=3
 * 
 * HINT:
 * - Vowels: a, e, i, o, u (both cases)
 * - Consonants: Other alphabets
 * - Digits: 0-9
 * - Special: Everything else (including spaces)
 * ============================================================
 */

public class Q02_CountCharacters {
    
    /**
     * TODO: Implement this method
     * @param str - input string
     * @return int array [vowels, consonants, digits, special]
     */
    public static int[] countCharacters(String str) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;
        
        // YOUR CODE HERE


        for(char c : str.toCharArray()){
          if(Character.isAlphabetic(c)){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowels+=1;
            }
            else{
                consonants += 1;

            }
            continue;
        }
            if (Character.isDigit(c)) {
                digits+=1;
            }
            else{
                special += 1;
            }
        


        }
        
        return new int[]{vowels, consonants, digits, special};
    }
    
    public static void main(String[] args) {
        String[] testStrings = {
            "Hello World 123!",
            "Java Programming",
            "A1B2C3!@#",
            "aeiouAEIOU"
        };
        
        System.out.println("=== Count Characters ===\n");
        
        for (String str : testStrings) {
            int[] result = countCharacters(str);
            System.out.println("Input: \"" + str + "\"");
            System.out.println("Vowels=" + result[0] + ", Consonants=" + result[1] + 
                             ", Digits=" + result[2] + ", Special=" + result[3]);
            System.out.println();
        }
        
        /* Expected Output:
         * "Hello World 123!" → Vowels=3, Consonants=7, Digits=3, Special=3
         * "Java Programming" → Vowels=5, Consonants=10, Digits=0, Special=1
         * "A1B2C3!@#" → Vowels=1, Consonants=2, Digits=3, Special=3
         * "aeiouAEIOU" → Vowels=10, Consonants=0, Digits=0, Special=0
         */
    }
}
