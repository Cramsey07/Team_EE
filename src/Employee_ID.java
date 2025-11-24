import java.util.Scanner;

public class Employee_ID {
    public static void Employee_ID(Scanner scan) {
        boolean keepAsking4 = true;
        while (keepAsking4) {
        System.out.println("Enter your employee ID:");
        String ID = scan.next();

        if (ID.length() < 8) {
            System.out.println();
            System.out.println("Invalid ID. Please try again.");
            System.out.println();
        } else {
            keepAsking4 = false;
            return;
            }
        }
    }
}