import java.util.Scanner;
/**

        * MAIN CLASS - UseCase2PalindromeCheckerApp

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
    public static void main(String[] args)

    {
                Scanner sc = new Scanner(System.in);
                String original = sc.nextLine();
                String reversed = "";

                for (int i = original.length() - 1; i >= 0; i--) {
                    reversed = reversed + original.charAt(i);
                }

                if (original.equals(reversed)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }

            }
        }

