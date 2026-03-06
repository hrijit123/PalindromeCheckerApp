
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

public class PalindromeCheckerApphe {

    static boolean arrayMethod(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean stackMethod(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    static boolean dequeMethod(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        long start, end;

        start = System.nanoTime();
        boolean r1 = arrayMethod(input);
        end = System.nanoTime();
        long t1 = end - start;

        start = System.nanoTime();
        boolean r2 = stackMethod(input);
        end = System.nanoTime();
        long t2 = end - start;

        start = System.nanoTime();
        boolean r3 = dequeMethod(input);
        end = System.nanoTime();
        long t3 = end - start;

        System.out.println("Array Method: " + r1 + " Time: " + t1 + " ns");
        System.out.println("Stack Method: " + r2 + " Time: " + t2 + " ns");
        System.out.println("Deque Method: " + r3 + " Time: " + t3 + " ns");
    }
}