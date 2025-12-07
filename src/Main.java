import java.util.Date;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        System.out.println("Current date and time: " + date);
        System.out.println();
        System.out.println("Welcome to the Department of Defense: Who is using this program today?");
        System.out.println("1. Civilian");
        System.out.println("2. Staff");
        System.out.println("Choose 1 for Civilian or 2 for Staff: ");
        int choice = scan.nextInt();
        String password = scan.nextLine();
        switch (choice) {
            case 1://Civilian
                Civilian.Civilian(scan);
                break;
            case 2://Staff
                Staff.Staff(scan);
                break;
            }
        }
    }