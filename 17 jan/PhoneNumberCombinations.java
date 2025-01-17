import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombinations {
    
   
    private static final String[] PHONE_MAP = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
       
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        
        backtrack(digits, 0, new StringBuilder(), result);
        
        return result;
    }
    
    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
       
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        String letters = PHONE_MAP[digits.charAt(index) - '0'];
        
        for (char letter : letters.toCharArray()) {
            current.append(letter);  // Choose the current letter
            backtrack(digits, index + 1, current, result);  // Recurse for the next digit
            current.deleteCharAt(current.length() - 1);  // Undo the choice (backtrack)
        }
    }
    
    public static void main(String[] args) {
        PhoneNumberCombinations solution = new PhoneNumberCombinations();
        
        // Example usage
        String digits = "23";
        List<String> combinations = solution.letterCombinations(digits);
        
        // Print the combinations
        System.out.println(combinations);
    }
}
