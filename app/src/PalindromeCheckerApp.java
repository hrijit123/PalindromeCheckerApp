
/**
 * ============================================================
 * MAIN CLASS – UseCase9RecursivePalindrome
 * ============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */


import java.util.*;

public class PalindromeCheckerApp {

    interface PalindromeStrategy {
        boolean check(String s);
    }

    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) stack.push(c);
            for (char c : s.toCharArray()) {
                if (c != stack.pop()) return false;
            }
            return true;
        }
    }

    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String s) {
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : s.toCharArray()) deque.addLast(c);
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PalindromeStrategy strategy;

        int choice = sc.nextInt();

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        if (strategy.check(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}