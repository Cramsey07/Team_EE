import java.util.Arrays;
import java.util.Scanner;

public class Staff {
    public static void Staff(Scanner scan) {
        boolean keepAsking2 = true;
        while (keepAsking2) {
        System.out.println("Please enter your password");
        String password = scan.nextLine();
        if (password.length() < 8) {
            System.out.println("");
            System.out.println("Please try again");
            System.out.println("");
        }
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
            if (hasDigit && hasSpecialChar) {
                keepAsking2 = false;
            }
            }
        }
        System.out.println("Correct");
        System.out.println("");
        boolean keepAsking3 = true;
        while (keepAsking3) {
        System.out.println("What would you like to access?");
        System.out.println("1. Staff Info");
        System.out.println("2. My Profile");
        System.out.println("3. Missle Info");
        int choice3 = scan.nextInt();
        switch (choice3) {
            case 1://Staff Info
                System.out.println("Enter your employee ID:");
                String ID = scan.next();
                    System.out.println("Your Info:");
                    String[][] information = {
                            {"CURRENT CASES: 2", "FILES: 1", "[REDACTED"},
                            {"UNREAD EMAILS: 20037590", "CASES COMPLETETED: 2000", "UNABLE TO PROCESS"}
                    };
                    System.out.println(Arrays.deepToString(information));
                    System.out.println("");
                    System.out.println("Anything else?");
                    String answer3 = scan.next();
                    if (!answer3.equalsIgnoreCase("yes")) {
                        keepAsking2 = false;
                    }
                    System.out.println("Have a nice day");
                    break;
                }
                }

        }
}
