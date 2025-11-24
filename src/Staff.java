import java.util.Arrays;
import java.util.Scanner;

public class Staff {
    public static void Staff(Scanner scan) {
        Password.Staff(scan);
        System.out.println();
        System.out.println("Correct");
        System.out.println();
        boolean keepAsking3 = true;
        while (keepAsking3) {
            System.out.println("What would you like to access?");
            System.out.println("1. Staff Info");
            System.out.println("2. My Profile");
            System.out.println("3. Missle Info");
            int choice3 = scan.nextInt();
            switch (choice3) {
                case 1://Staff Info
                    Employee_ID.Employee_ID(scan);
                    System.out.println("Your Info:");
                    System.out.println();
                    String[][] information = {
                            {"CURRENT CASES: 2", "FILES: 1", "[REDACTED"},
                            {"UNREAD EMAILS: 20037590", "CASES COMPLETETED: 2000", "UNABLE TO PROCESS"}
                    };
                    System.out.println(Arrays.deepToString(information));
                    System.out.println();
                    break;
                case 2://My Profile
                    System.out.println("myprofile file: ");
                    System.out.println();
                    String[][] profile = {
                            {"LOGS.pdf", "EMERGENCY_CONTACTS.pdf", "NDA_2025.pdf", "ESCAPE_PLAN.pdf"}
                    };
                    System.out.println(Arrays.deepToString(profile));
                    System.out.println();
                    break;
                case 3: //Missle Info
                    Employee_ID.Employee_ID(scan);
                    System.out.println();
                    System.out.println("Confidential missle files");
                    System.out.println();
                    String[][] missle = {
                            {"TITAN_PROTO.pdf", "LAUNCH_COORDINATES", "[REDACTED]", "ATOMIC_NUKES.docx", "2ND_COLD_WAR.pdf"}
                    };
                    System.out.println(Arrays.deepToString(missle));
                    System.out.println();
                    break;
            }
            System.out.println("Anything else?");
            String answer2 = scan.next();
            if (!answer2.equalsIgnoreCase("yes")) {
                keepAsking3 = false;
                System.out.println("Have a nice day");
            }
        }
    }
}
