import java.util.Stack;
/**
 * ======================================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ======================================================================
 * * Use Case 5: Stack Based Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * * This maps stack behavior to reversal logic.
 * * @author Developer
 * @version 5.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     * * @param args Command-line arguments
     */

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "level";
        System.out.println(isPalindrome(test));
    }
}