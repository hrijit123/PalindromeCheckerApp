
import java.util.*;
/*
  ============================================================
  MAIN CLASS – UseCase7PalindromeCheckerApp
  ============================================================

  Use Case 7: Deque Based Optimized Palindrome Checker

  Description:
  This class validates a palindrome using a Deque
  (Double Ended Queue).

  Characters are inserted into the deque and then
  compared by removing elements from both ends:

  - removeFirst()
  - removeLast()

  This avoids reversing the string and provides an
  efficient front-to-back comparison approach.

  This use case demonstrates optimal bidirectional
  traversal using Deque.

  @author Developer
 * @version 7.0
 */
/*
      Application entry point for UC7.

      @param args Command-line arguments
 */

    public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            Deque<Character> deque = new ArrayDeque<>();

            for (char c : input.toCharArray()) {
                deque.addLast(c);
            }

            boolean palindrome = true;

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    palindrome = false;
                    break;
                }
            }

            if (palindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }