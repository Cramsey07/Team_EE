import java.util.Scanner;

public class Gianna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your role (Staff/Civilian): ");
        String role = scanner.nextLine().toLowerCase();

        if (role.equals("civilian")) {
            System.out.println("Welcome to the Department of Defense!");

            boolean running = true;
            while (running) {
                System.out.println("What questions do you have today?");
                System.out.println("1. Active Personnel");
                System.out.println("2. Hours of Operation");
                System.out.println("3. Internships");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: // active personnel
                        System.out.println("Sorry, we are unable to answer that.\n");
                        break;

                    case 2: // hours of operation
                        System.out.println("The Department of Defense operates from 9am to 9pm EST.\n");
                        break;

                    case 3: // internships
                        System.out.println("The Department of Defense is offering the following positions:" +
                                "\n- position 1" +
                                "\n- position 2" +
                                "\n- position 3\n");
                        break;

                    case 4: // exit
                        System.out.println("Thank you for using our application!");
                        running = false;
                        break;
                }
            }
        } else if (role.equals("staff")) {
            System.out.println("Welcome to the Department of Defense!" +
                    "\nPlease enter your password:");
            String password = scanner.nextLine();
            // password validator stuff

            boolean running = true;
            while (running) {
                System.out.println("What would you like to access?");
                System.out.println("1. Staff Info");
                System.out.println("2. My Profile");
                System.out.println("3. Missile Info");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: // staff info
                        System.out.println("Enter your employee ID:");
                        int employeeID = scanner.nextInt();
                        // employee id validator stuff
                        System.out.println("Employee Info File:\n");
                        // employee info array stuff
                        break;

                    case 2: // my profile
                        System.out.println("My Profile:\n");
                        // my profile stuff
                        break;

                    case 3: // missile info
                        System.out.println("Enter your employee ID:");
                        employeeID = scanner.nextInt();
                        // more id validator stuff
                        System.out.println("Missile Info (CONFIDENTIAL):\n");
                        // super confidential missile array
                        break;

                    case 4: // exit
                        System.out.println("Thank you for using our application!");
                        running = false;
                        break;
                }
            }
        } else {
            System.out.println("Invalid option.");
        }
    }
}