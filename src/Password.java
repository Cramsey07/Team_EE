import java.util.Arrays;
import java.util.Scanner;

public class Password {
    public static void Staff(Scanner scan) {
        int attempts = 0;
        int max = 2;
        boolean keepAsking2 = true;
        while (keepAsking2) {
            System.out.println("Please enter your password");
            String password = scan.nextLine();
            boolean hasDigit = false;
            boolean hasSpecialChar = false;
            String specialCharacters = "!@#$%^&*()_+-=[]{};:'\"\\|,.<>?/";

            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
                if (specialCharacters.indexOf(ch) != -1) {
                    hasSpecialChar = true;
                }
                if (password.length() > 8 && hasDigit && hasSpecialChar) {
                    keepAsking2 = false;
                } else {
                    attempts++;
                    if (attempts < max) {
                        System.out.println();
                        System.out.println("Please try again");
                        System.out.println();
                    } else {
                        System.out.println("You are unauthorized personnel, you will be locked out of this program");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
