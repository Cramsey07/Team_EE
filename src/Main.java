

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Department of Defense: Who is using this program today?");
        System.out.println("1. Civilian");
        System.out.println("2. Staff");
        int choice = scan.nextInt();
        String password = scan.nextLine();
        switch (choice) {
            case 1://Civilian
                Civilian(scan);
                break;
            case 2://Staff
                Staff(scan);
                break;
        }
    }
    public static void Civilian(Scanner scan) {
        boolean keepAsking = true;
        while (keepAsking) {
            System.out.println("What questions do you have today?");
            System.out.println("1. Active Personnel?");
            System.out.println("2. Hours of Operation?");
            System.out.println("3. Internships?");
            int choice2 = scan.nextInt();
            System.out.println("");
            switch (choice2) {
                case 1: //Active Personnel
                    System.out.println("Sorry, we are unable to answer that, please try again");
                    System.out.println("");
                    break;
                case 2: //Hours of Operation
                    System.out.println("Hours");
                    System.out.println("");
                    System.out.println("Anything else we can help you with?");
                    String answer = scan.next();
                    if (!answer.equalsIgnoreCase("yes")) {
                        keepAsking = false;
                    }
                    System.out.println("Have a nice day");
                    break;
                case 3: //Internships
                    System.out.println("Current opportunites: ");
                    String[] opportunities = {"Cybersecuity Defense Intern", "Military Engineering Intern", "Intelligence Analysis Intern"};
                    System.out.println("");
                    System.out.println("- " + opportunities[0]);
                    System.out.println("- " + opportunities[1]);
                    System.out.println("- " + opportunities[2]);
                    System.out.println("");
                    System.out.println("Anything else we can help you with?");
                    String answer2 = scan.next();
                    if (!answer2.equalsIgnoreCase("yes")) {
                        keepAsking = false;
                    }
                    System.out.println("Have a nice day");
                    break;
            }
        }
    }

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


        }
        }
    }