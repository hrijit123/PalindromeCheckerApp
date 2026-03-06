import java.util.*;

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


public class PalindromeCheckerApp {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();

                input = input.replaceAll("\\s+", "").toLowerCase();

                int start = 0;
                int end = input.length() - 1;
                boolean palindrome = true;

                while (start < end) {
                    if (input.charAt(start) != input.charAt(end)) {
                        palindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (palindrome) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }
            }
        }