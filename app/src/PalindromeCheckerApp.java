import java.util.*;
/**

         MAIN CLASS - UseCase2PalindromeCheckerApp

    * Use Case 2: Hardcoded Palindrome Validation

* Description:
        * This class demonstrates basic palindrome validation
* using a hardcoded string value.

*

        * At this stage, the application:
        * - Stores a predefined string
* - Compares characters from both ends
* - Determines whether the string is a palindrome
* - Displays the result on the console
*
        * This use case introduces fundamental comparison logic
* before using advanced data structures.
*
        * @author Developer
* @version 2.0
        */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String S1 = "oppo";
        int n = S1.length() - 1;
        boolean p=false;
        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) == S1.charAt(n - i)) {
                p = true;

            }}
            if (p) {
                System.out.println(S1+" is palindrome");
            } else {
                System.out.println(S1+" isnt palindrome");
            }
        }
    }
