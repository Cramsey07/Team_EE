import java.util.Scanner;

public class Civilian {
    public static void Civilian(Scanner scan) {
        boolean keepAsking = true;
        while (keepAsking) {
            System.out.println("What questions do you have today?");
            System.out.println("1. Active Personnel?");
            System.out.println("2. Hours of Operation?");
            System.out.println("3. Internships?");
            int choice2 = scan.nextInt();
            System.out.println();
            switch (choice2) {
                case 1: //Active Personnel
                    System.out.println("Sorry, we are unable to answer that, please try again");
                    System.out.println();
                    break;
                case 2: //Hours of Operation
                    System.out.println("Monday-Friday: 6AM-11:59PM");
                    System.out.println("Saturday-Sunday: 8AM-1AM");
                    System.out.println();
                    break;
                case 3: //Internships
                    System.out.println("Current opportunites: ");
                    String[] opportunities = {"Cybersecuity Defense Intern", "Military Engineering Intern", "Intelligence Analysis Intern"};
                    System.out.println("");
                    System.out.println("- " + opportunities[0]);
                    System.out.println("- " + opportunities[1]);
                    System.out.println("- " + opportunities[2]);
                    System.out.println();
                    break;
            }
            System.out.println("Anything else we can help you with?(type \"yes\" to continue)");
            String answer = scan.next();
            if (!answer.equalsIgnoreCase("yes")) {
                keepAsking = false;
                Have_A_Nice_Day obj2 = new Have_A_Nice_Day("Have a nice day" + ", Thank you.");
            }
        }
    }
}
